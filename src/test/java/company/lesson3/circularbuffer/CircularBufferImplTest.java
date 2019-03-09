package company.lesson3.circularbuffer;

import org.junit.Before;
//import org.junit.Rule;
import org.junit.Test;
//import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * Created by on 10/28/18.
 */
public class CircularBufferImplTest {

  private CircularBufferImpl<Integer> circularBuffer;
  private int limit = 3; //  Set buffer size.

//  @Rule
//  public ExpectedException exceptionRule = ExpectedException.none();

  @Before
  public void createBufferInstance() {
    circularBuffer = new CircularBufferImpl<>(limit, Integer.class);
  }

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
//    exceptionRule.expect(RuntimeException.class);
//    exceptionRule.expectMessage("Buffer is full!");
    while (limit > 0) {
      circularBuffer.put(1);
      limit--;
    }
    assertThatThrownBy(() -> circularBuffer.put(2))
            .isInstanceOf(RuntimeException.class)
            .hasMessage("Buffer is full!");
//    circularBuffer.put(2); // Put extra value.
  }

  // 4. Get exception for getting a value when buffer is empty.
  //TODO. Remove @rule exception and recode.
  //DONE
  @Test
  public void shouldExceptionBeThrownIfEmpty() {
//    exceptionRule.expect(RuntimeException.class);
//    exceptionRule.expectMessage("Buffer is empty!");
    assertThatThrownBy(() -> circularBuffer.get())
            .isInstanceOf(RuntimeException.class)
            .hasMessage("Buffer is empty!");
  }

//  // 5. Check if the head position is changed to the next one after putting a value.
//  //  NOT NEEDED
//  @Test1
//  public void shouldHeadBeNext() {
//    int previousHeadPosition = circularBuffer.getHead();
//    circularBuffer.put(1);
//    int currentHeadPosition = circularBuffer.getHead();
//    assertThat(currentHeadPosition > previousHeadPosition).isTrue();
//  }

//// 6. Check if the head position is next to the tail one after putting a value.
//  //  NOT NEEDED
//  @Test1
//  public void shouldHeadBeNextToTail() {
//    int tailPosition = circularBuffer.getTail();
//    int headPosition = circularBuffer.getHead();
//    assertThat(headPosition == tailPosition).isTrue(); // Head is equal to tail.
//    circularBuffer.put(1);
//    tailPosition = circularBuffer.getTail();
//    headPosition = circularBuffer.getHead();
//    assertThat(headPosition > tailPosition).isTrue(); // Head is greater than tail.
//  }

//// 7. Test1 how pitting and getting change head and tail positions.
//  //  NOT NEEDED
//  @Test1
//  public void justTestPositions() {
//    circularBuffer.put(1);       //+1 Head = 1, Tail = 0
//    circularBuffer.put(2);       //+2 Head = 2, Tail = 0
//    circularBuffer.get();           //-1 Head = 2, Tail = 1
//    circularBuffer.put(3);       //+3 Head = 0, Tail = 1
//    circularBuffer.get();           //-2 Head = 0, Tail = 2
//    assertThat(circularBuffer.getHead()).isEqualTo(0);
//    assertThat(circularBuffer.getTail()).isEqualTo(2);
//  }

//  //8. Check buffer size after operations.
//  @Test1
//  public void shouldSizeBeMatched() {
//    int value = 1;
//    circularBuffer.put(value++);
//    circularBuffer.get();
//    circularBuffer.put(value++);
//    circularBuffer.get();
//    circularBuffer.put(value++);
//    circularBuffer.put(value++);
//    circularBuffer.get();
//    circularBuffer.put(value);
//    assertThat(circularBuffer.toArray()).hasSize(limit - 1);
////    assertThat(circularBuffer.getCounter()).isEqualTo(limit - 1);
//  }

  // 9. Check Object size is equal to buffer size.
  @Test
  //TODO. Write a test as Should return object array - check array size & array elements.
  //DONE
  public void shouldReturnObjectArray() {
    int size = limit;
    while (size > 0) {
      circularBuffer.put(1);
      size--;
    }
    Object[] tempObject = circularBuffer.toObjectArray();
    assertThat(tempObject).hasSize(size);

    Arrays.stream(tempObject).forEach(
            element -> assertThat(element).isEqualTo(1)
    );
  }

  // 10. Check if the first Object element is the tail.
  //TODO. Recode using already implemented methods!!! (no extra code to only test)
  //DONE
  @Test
  public void shouldObjectFirstElementBeEqualToBufferTail() {
    circularBuffer.put(1);
    circularBuffer.put(2);
    circularBuffer.get(); // Tail = 1, Value = 2.
    Object[] tempObject = circularBuffer.toObjectArray();
    assertThat(tempObject[0]).isEqualTo(2);
  }

  // 11. Check type T array size is equal to buffer size.
  //TODO. See above.
  //DONE
  @Test
  public void shouldTypeTArraySizeBeEqualToBufferSize() {
    circularBuffer.put(1);
    circularBuffer.put(2);
    circularBuffer.put(0);
    circularBuffer.get(); // Size = 2
    Integer[] tempArray = circularBuffer.toArray();
    assertThat(tempArray.length).isEqualTo(2);
  }

  // 12. Check if the first element of type T Array is the tail.
  //DONE
  @Test
  public void shouldTypeTArrayFirstElementBeEqualToBufferTail() {
    circularBuffer.put(1);
    circularBuffer.put(2);
    Integer[] tempObject = circularBuffer.toArray();
    assertThat(tempObject[0]).isEqualTo(1);
  }

//  // 13. Check if all elements are added to the buffer.
//  @Test1
//  public void shouldAllElementsBeAddedToBuffer() {
//    int limitList = 2;
//    List<Integer> listToAddFrom = new ArrayList<>(limitList);
//    listToAddFrom.add(10);
//    listToAddFrom.add(100);
//    circularBuffer.put(1);
//    int sizePrevious = circularBuffer.getCounter();
//    circularBuffer.addAll(listToAddFrom);
//    int sizeLast = circularBuffer.getCounter();
//    assertThat(sizeLast).isEqualTo(sizePrevious + limitList);
//  }

//  // 14. Check for the exception thrown if add more than buffer size.
//  @Test1
//  public void shouldExceptionBeThrownIfExceedSize() {
////    exceptionRule.expect(RuntimeException.class);
////    exceptionRule.expectMessage("Buffer is full!");
//    int limitList = 3;
//    List<Integer> listToAddFrom = new ArrayList<>(limitList);
//    listToAddFrom.add(10);
//    listToAddFrom.add(100);
//    circularBuffer.put(1);
//    circularBuffer.put(2);
//    int sizePrevious = circularBuffer.getCounter();
//    circularBuffer.addAll(listToAddFrom);
//  }

  // ******************************************************
  // Test1 to add:
  //1. наполнение буфера элементами
  //2. размер буфера

  // New 15. Check if element can be added to buffer.
  @Test
  public void shouldElementsBeAdded() {
    circularBuffer.put(1);
    assertThat(circularBuffer.toArray()[0]).isEqualTo(1);
  }

  // New 16. Check if buffer size is correct after adding/removing ops.
  @Test
  public void shouldReturnArrayGenericType() {
    int size = 2;
    while (size > 0) {
      circularBuffer.put(1);
      size--;
    }
    assertThat(circularBuffer.toArray().length).isEqualTo(2);
  }

  // New 17. Check if element can be pulled from buffer.
  @Test
  public void shouldBePulled() {
    int size = 2;
    while (size > 0) {
      circularBuffer.put(1);
      size--;
    }
    int element = circularBuffer.get();
    assertThat(element).isEqualTo(1);
  }

  // New 18. Check if Object Array can be created.
  @Test
  public void shouldCreateObjectArray() {
    int size = 2;
    while (size > 0) {
      circularBuffer.put(1);
      size--;
    }
    Object[] tempObject = circularBuffer.toObjectArray();
    assertThat(tempObject).isNotEmpty();
  }

  // New 19. Check if <T> Array can be created.
  @Test
  public void shouldCreateTArray() {
    int size = 2;
    while (size > 0) {
      circularBuffer.put(1);
      size--;
    }
    Integer[] tempArray = circularBuffer.toArray();
    assertThat(tempArray).isNotEmpty();
  }

  // New 20. Check if a <T> List can be created.
  @Test
  public void shouldCreateTList() {
    int size = 2;
    while (size > 0) {
      circularBuffer.put(1);
      size--;
    }
    List<Integer> tempList = circularBuffer.asList();
    assertThat(tempList).isNotEmpty();
  }

  // New 21. Check if all elements can be added.
  @Test
  public void shouldAddAllElements() {
    List<Integer> tempList = new ArrayList<>();
    tempList.add(1);
    tempList.add(2);
    circularBuffer.addAll(tempList);
    assertThat(circularBuffer.toArray().length).isEqualTo(2);
  }
}