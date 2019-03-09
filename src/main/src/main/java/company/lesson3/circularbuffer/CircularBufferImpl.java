package company.lesson3.circularbuffer;

import lombok.Data;

import java.lang.reflect.Array;
import java.util.*;

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
@Data
public class CircularBufferImpl<T> implements CircularBuffer<T> {
  private Object[] buffer;
  private int counter;
  private int limit;
  private int head;
  private int tail;
  private Class<?> classT; // added


  public CircularBufferImpl(int limit, Class classT) {
    this.limit = limit;
    tail = 0;
    head = 0;
    counter = 0;
    buffer = new Object[this.limit];
    this.classT = classT;
  }


  public void put(T t) {
    if (isFull()) {
      throw new RuntimeException("Buffer is full!");
    }
    buffer[head] = t;
    if (head < limit - 1) {
      head++;
    } else {
      head = 0;
    }
    counter++;
  }

  public T get() {
    if (isEmpty()) {
      throw new RuntimeException("Buffer is empty!");
    }
    T t = (T) buffer[tail];
    if (tail < limit - 1) {
      tail++;
    } else {
      tail = 0;
    }
    counter--;
    return t;
  }

  public Object[] toObjectArray() {
    int tempTail = tail;
    Object[] tempArray = new Object[counter]; //a bug was here!!!
    for (int i = 0; i < (counter); i++) {
      tempArray[i] = buffer[tempTail++];
      if (tempTail == counter) {
        tempTail = 0;
      }
    }
   // System.arraycopy();
    return tempArray;
  }

  /**
   * This method returns the buffer as a type T array. The size of the array should be equal to the current number of
   * actual elements in the buffer. The first element should be the tail.
   *
   * @return
   */
  //TODO: To reuse above method.
  public T[] toArray() {
    int tempTail = tail;
    T[] tempArray = (T[]) Array.newInstance(classT, counter);
    for (int i = 0; i < (counter); i++) {
      try {
        tempArray[i] = (T) buffer[tempTail++];
        if (tempTail == counter) {
          tempTail = 0;
        }
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
  public List<T> asList() {
    int tempTail = tail;
    List<T> tempList = new ArrayList<>(counter);
    for (int i = 0; i < (counter); i++) {
      try {
        tempList.add(i, (T) buffer[tempTail++]);
        if (tempTail == counter) {
          tempTail = 0;
        }
      } catch (Exception e) {
        System.out.println("Exception " + e);
      }
    }
    return tempList;
    // return toArray()==null? Collections.emptyList(): Arrays.asList(toArray());
  }

  /**
   * This method adds all elements from a given list (which can be type T and T's subclasses) to the buffer. It throws
   * an exception if there is not enough free space in the buffer to add all elements.
   *
   * @param toAdd
   */
  public void addAll(List<? extends T> toAdd) {
    Iterator<? extends T> iterator = toAdd.iterator();
    while (iterator.hasNext()) {
      buffer[head] = iterator.next();
      if (head < counter) {
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
  public void sort(Comparator<? super T> comparator) {
    //Arrays.sort();
  }

  /**
   * This method returns true if the buffer is empty, false otherwise.
   *
   * @return True or False
   */
  public boolean isEmpty() {
    return (head == tail && counter == 0);
  }

  /**
   * This method returns true if the buffer is full, false otherwise.
   *
   * @return True or False
   */
  public boolean isFull() {
    return (head == tail && counter == limit);
  }
}
