package company.lesson3.circularbuffer;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by on 10/28/18.
 */
public class CircularBufferImplTest {

    private CircularBufferImpl<Integer> circularBuffer;
    private int limit = 2; //  Set buffer size.

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Before
    public void createBufferInstance() {
        circularBuffer = new CircularBufferImpl<>(limit, Integer.class);
    }

    // 1. Check if buffer is empty.
    @Test
    public void shouldBeEmpty() {
        assertThat(circularBuffer.isEmpty()).isTrue();
    }

    // 2. Check if buffer is NOT empty.
    @Test
    public void shouldNotBeEmpty() {
        circularBuffer.put(1);
        assertThat(circularBuffer.isEmpty()).isFalse();
    }

    // 3. Get exception for putting a value when buffer is full.
    @Test
    public void shouldExceptionBeThrownIfFull() {
        exceptionRule.expect(RuntimeException.class);
        exceptionRule.expectMessage("Buffer is full!");
        while (limit > 0) {
            circularBuffer.put(1);
            limit--;
        }
        circularBuffer.put(2); // Put extra value.
    }

    // 4. Get exception for getting a value when buffer is empty.
    @Test
    public void shouldExceptionBeThrownIfEmpty() {
        exceptionRule.expect(RuntimeException.class);
        exceptionRule.expectMessage("Buffer is empty!");
        circularBuffer.get();
    }

    // 5. Check if the head position is changed to the next one after putting a value.
    @Test
    public void shouldHeadBeNext() {
        int previousHeadPosition = circularBuffer.getHead();
        circularBuffer.put(1);
        int currentHeadPosition = circularBuffer.getHead();
        assertThat(currentHeadPosition > previousHeadPosition).isTrue();
    }

    // 6. Check if the head position is next to the tail one after putting a value.
    @Test
    public void shouldHeadBeNextToTail() {
        int tailPosition = circularBuffer.getTail();
        int headPosition = circularBuffer.getHead();
        assertThat(headPosition == tailPosition).isTrue(); // Head is equal to tail.
        circularBuffer.put(1);
        tailPosition = circularBuffer.getTail();
        headPosition = circularBuffer.getHead();
        assertThat(headPosition > tailPosition).isTrue(); // Head is greater than tail.
    }

    // 7. Test how pitting and getting change head and tail positions.
    @Test
    public void justTestPositions() {
        circularBuffer.put(1);       //+1 Head = 1, Tail = 0
//        assertThat(circularBuffer.getHead()).isEqualTo(1);
//        assertThat(circularBuffer.getTail()).isEqualTo(0);
        circularBuffer.put(2);       //+2 Head = 0, Tail = 0
//        assertThat(circularBuffer.getHead()).isEqualTo(0);
//        assertThat(circularBuffer.getTail()).isEqualTo(0);
        circularBuffer.get();           //-1 Head = 0, Tail = 1
//        assertThat(circularBuffer.getHead()).isEqualTo(0);
//        assertThat(circularBuffer.getTail()).isEqualTo(1);
        circularBuffer.put(3);       //+3 Head = 1, Tail = 1
//        assertThat(circularBuffer.getHead()).isEqualTo(1);
//        assertThat(circularBuffer.getTail()).isEqualTo(1);
        circularBuffer.get();           //-2 Head = 1, Tail = 0
        assertThat(circularBuffer.getHead()).isEqualTo(1);
        assertThat(circularBuffer.getTail()).isEqualTo(0);
    }

    //8. Check buffer size after operations.
    @Test
    public void shouldSizeBeMatched() {
        int value = 1;
        circularBuffer.put(value++);
        circularBuffer.get();
        circularBuffer.put(value++);
        circularBuffer.get();
        circularBuffer.put(value++);
        circularBuffer.put(value++);
        circularBuffer.get();
        circularBuffer.put(value++);
        assertThat(circularBuffer.getCounter() == limit);
    }

    // 9. Check Object size is equal to buffer size.
    @Test
    public void shouldObjectArraySizeBeEqualToBufferSize() {
        circularBuffer.put(1);
        circularBuffer.put(2);
        Object[] tempObject = circularBuffer.toObjectArray();
        assertThat(tempObject.length).isEqualTo(circularBuffer.getCounter());
    }

    // 10. Check first element of Object is tail.
    @Test
    public void shouldObjectFirstElementBeEqualToBufferTail() {
        circularBuffer.put(1);
        circularBuffer.put(2);
        circularBuffer.get(); // Tail = 1, Value = 2.
        Object[] tempObject = circularBuffer.toObjectArray();
        assertThat(tempObject[0]).isEqualTo(2);
    }

    // 11. Check type T array size is equal to buffer size.
    @Test
    public void shouldTypeTArraySizeBeEqualToBufferSize() {
        circularBuffer.put(1);
        circularBuffer.put(2);
        Integer[] tempArray = circularBuffer.toArray();
        assertThat(tempArray.length).isEqualTo(circularBuffer.getCounter());
    }

    // 12. Check first element of type T rray is tail.
    @Test
    public void shouldTypeTArrayFirstElementBeEqualToBufferTail() {
        circularBuffer.put(1);
        circularBuffer.put(2);
        circularBuffer.get(); // Tail = 1, Value = 2.
        Integer[] tempObject = circularBuffer.toArray();
        assertThat(tempObject[0]).isEqualTo(2);
    }

    // 13. Check all elements are added to buffer.
    @Test
    public void shouldAllElementsBeAddedToBuffer() {


    }

}