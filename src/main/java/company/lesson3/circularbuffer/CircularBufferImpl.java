package company.lesson3.circularbuffer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * Conversation
 * Implement a generic circular buffer (https://en.wikipedia.org/wiki/Circular_buffer) based on a simple array with
 * the following methods. The size of the circular buffer is limited, the limit should be provided for the constructor of
 * the class.
 * Methods of CircularBuffer
 * void put(T t);
 * T get();
 * Object[] toObjectArray();
 * T[] toArray();
 * List&lt;T&gt; asList();
 * void addAll(List&lt;? extends T&gt; toAdd);
 * void sort(Comparator&lt;? super T&gt; comparator);
 * boolean isEmpty();
 * Hint: Check AbstractList.toArray() to implement the toArray() method.
 */
public class CircularBufferImpl<T> {
  private Object[] buffer;
  private int counter;
  private int limit;
  private int head;
  private int tail;


  public CircularBufferImpl(int limit) {
    this.limit = limit;
    tail = 0;
    head = 0;
    counter = 0;
    buffer = new Object[this.limit];
  }

  /**
   * This method inserts t into the buffer at the position of the head. After the insertion, the head points to the next
   * index in the buffer.
   * The put method throws RUNTIME exception if the buffer is full. The buffer is full when the head and the tail
   * points to the same index, but the buffer is not empty.
   *
   * @param t
   */
  void put(T t) {
    buffer[head] = t;
    if (head < limit - 1) {
      head++;
    } else {
      head = 0;
    }
    counter++;
    if (isFull()) {
      throw new RuntimeException("Buffer is full!");
    }
  }

  /**
   * This method gets the value at the tail of the buffer. After that, the tail points to the next index in the buffer.
   * The get method throws RUNTIME exception if the buffer is empty. The buffer is empty if the head and the tail
   * points to the same index, and the buffer is not full.
   *
   * @return
   */
  T get() {
    T t = (T) buffer[tail];
    if (tail < limit - 1) {
      tail++;
    } else {
      tail = 0;
    }
    counter--;
    if (isEmpty()) {
      throw new RuntimeException("Buffer is empty!");
    }
    return t;
  }

  /**
   * This method returns the buffer as an Object array. The size of the array should be equal to the current number of
   * actual elements in the buffer. The first element should be the tail.
   *
   * @return
   */
  Object[] toObjectArray() {
    int tempTail = tail;
    Object[] tempArray = new Object[head - tail];
    for (int i = 0; i < (head - tail); i++) tempArray[i] = buffer[tempTail++];
    return tempArray;
  }

  /**
   * This method returns the buffer as a type T array. The size of the array should be equal to the current number of
   * actual elements in the buffer. The first element should be the tail.
   *
   * @return
   */
  T[] toArray(Class<T> classT) {
    int tempTail = tail;
    T[] tempArray = (T[]) Array.newInstance(classT, head - tail);
    for (int i = 0; i < (head - tail); i++) {
      try {
        tempArray[i] = (T) buffer[tempTail++];
      } catch (Exception e) {
        System.out.println("Exception " + e);
      }
    }
    return tempArray;
  }

  /**
   * This method returns the buffer as a list with type T. The size of the list should be equal to the current number of
   * actual elements in the buffer. The first element should be the tail.
   */
  List<T> asList() {
    int tempTail = tail;
    List<T> tempList = new ArrayList<>(head - tail);
    for (int i = 0; i < (head - tail); i++) {
      try {
        tempList.add(i, (T) buffer[tempTail++]);
      } catch (Exception e) {
        System.out.println("Exception " + e);
      }
    }
    return tempList;
  }

  /**
   * This method adds all elements from a given list (which can be type T and T's subclasses) to the buffer. It throws
   * an exception if there is not enough free space in the buffer to add all elements.
   *
   * @param toAdd
   */
  void addAll(List<? extends T> toAdd) {
    Iterator<? extends T> iterator = toAdd.iterator();
    while (iterator.hasNext()) {
      buffer[head] = iterator.next();
      if (head < limit - 1) {
        head++;
      } else {
        head = 0;
      }
      counter++;
      if (isFull()) {
        throw new RuntimeException("Buffer is full!");
      }
    }
  }

  /**
   * This method sorts the buffer with the given comparator. As the order of the elements is changed in the buffer, the
   * positions of the head and the tail should be maintained as well.
   *
   * @param comparator
   */
//  void sort(Comparator<? super T> comparator) {
//  }

  /**
   * This method returns true if the buffer is empty, false otherwise.
   *
   * @return
   */
  boolean isEmpty() {
    return (head == tail && counter == 0);
  }

  /**
   * This method returns true if the buffer is full, false otherwise.
   *
   * @return
   */
  boolean isFull() {
    return (head == tail && counter == limit);
  }

  /**
   * This method prints the buffer items.
   */
  void printBuffer() {
    for (Object obj : buffer
    ) {
      System.out.println(obj);
    }
  }
}
