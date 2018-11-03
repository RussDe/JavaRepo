package company.lesson3.circularbuffer;

import java.util.Comparator;
import java.util.List;

public interface CircularBuffer<T> {
  /**
   * This method inserts t into the buffer at the position of the head. After the insertion, the head points to the next
   * index in the buffer.
   * The put method throws RUNTIME exception if the buffer is full. The buffer is full when the head and the tail
   * points to the same index, but the buffer is not empty.
   *
   * @param t
   */
  void put(T t);

  /**
   * This method gets the value at the tail of the buffer. After that, the tail points to the next index in the buffer.
   * The get method throws RUNTIME exception if the buffer is empty. The buffer is empty if the head and the tail
   * points to the same index, and the buffer is not full.
   *
   * @return
   */
  T get();

  /**
   * This method returns the buffer as an Object array. The size of the array should be equal to the current number of
   * actual elements in the buffer. The first element should be the tail.
   *
   * @return
   */
  Object[] toObjectArray();

  /**
   * This method returns the buffer as a type T array. The size of the array should be equal to the current number of
   * actual elements in the buffer. The first element should be the tail.
   *
   * @return
   */
  T[] toArray();

  /**
   * This method returns the buffer as a list with type T. The size of the list should be equal to the current number of
   * actual elements in the buffer. The first element should be the tail.
   */
  List<T> asList();

  /**
   * This method adds all elements from a given list (which can be type T and T's subclasses) to the buffer. It throws
   * an exception if there is not enough free space in the buffer to add all elements.
   *
   * @param toAdd
   */
  void addAll(List<? extends T> toAdd);

  /**
   * This method sorts the buffer with the given comparator. As the order of the elements is changed in the buffer, the
   * positions of the head and the tail should be maintained as well.
   *
   * @param comparator
   */
  void sort(Comparator<? super T> comparator);

  /**
   * This method returns true if the buffer is empty, false otherwise.
   *
   * @return
   */
  boolean isEmpty();

  /**
   * This method returns true if the buffer is full, false otherwise.
   *
   * @return
   */
  boolean isFull();
}
