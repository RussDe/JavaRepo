package company.lesson13;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.stream.Stream;

// 1. Use comments.
// 2. Groups
// 3. No wild cards in imports 


public class MyArrayList<E> implements MyList<E> {
  private int currentSize;
  private static final int DEFAULT_SIZE = 10;
  private Object elements[];

  public MyArrayList() {
    elements = new Object[DEFAULT_SIZE];
  }

  /**
   *
   */
  private void increaseCapacity() {
    int increasedCapacity = elements.length * 2;
    elements = Arrays.copyOf(elements, increasedCapacity);
  }

  public boolean isEmpty() {
    return currentSize == 0;
  }

  public E get(int index) {
    checkIndex(index);
    return (E) elements[index];
  }

  public void set(int index, E element) {
    checkIndex(index);
    elements[index] = element;
  }

  public void add(E element) {
    if (currentSize == elements.length) {
      increaseCapacity();
    }
    elements[currentSize++] = element;
  }

  public void remove(int index) {
    checkIndex(index);
    if (index == currentSize - 1) {
      elements[--currentSize] = null;
    } else {
      if (index == 0) {
        elements = Arrays.copyOfRange(elements, 1, currentSize--);
      } else {
        elements = Stream.of(Arrays.copyOfRange(elements, 0, index), Arrays.copyOfRange(elements, index + 1, currentSize)).flatMap(Stream::of).toArray();
        currentSize--;
      }
    }
  }

  public void clear() {
    elements = new Object[DEFAULT_SIZE];
    currentSize = 0;
  }

  public int length() {
    return currentSize;
  }

  public void checkIndex(int index) {
    if (index >= currentSize || index < 0) {
      throw new IndexOutOfBoundsException("Asking index = " + index + ", current size = " + currentSize);
    }
  }

  @Override
  public boolean add(int index, E element) {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean addAll(Collection<? extends E> c) {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean removeAll(Collection<? extends E> c) {
    throw new UnsupportedOperationException();
  }

  @Override
  public Iterator<E> iterator() {
    throw new UnsupportedOperationException();
  }

  @Override
  public void sort(Comparator<? super E> c) {
    throw new UnsupportedOperationException();
  }

  @Override
  public E remove(Object o) {
    throw new UnsupportedOperationException();
  }
}
