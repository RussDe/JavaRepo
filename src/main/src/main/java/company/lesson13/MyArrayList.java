package company.lesson13;

import java.util.Arrays;
import java.util.stream.Stream;

public class MyArrayList<E> {
  private int currentSize = 0;
  private static final int DEFAULT_SIZE = 10;
  private Object elements[];

  public MyArrayList() {
    elements = new Object[DEFAULT_SIZE];
  }

  //Increases a list capacity.
  private void increaseCapacity() {
    int increasedCapacity = elements.length * 2;
    elements = Arrays.copyOf(elements, increasedCapacity);
  }

  //Verifies if list is empty.
  public boolean isEmpty() {
    return currentSize == 0;
  }

  //Returns the element at the specified position in this list.
  public E get(int index) {
    checkIndex(index);
    return (E) elements[index];
  }

  //Replaces the element at the specified position in this list with the specified element.
  public void set(int index, E element) {
    checkIndex(index);
    elements[index] = element;
  }

  //Appends the specified element to the end of this list.
  public void add(E element) {
    if (currentSize == elements.length) {
      increaseCapacity();
    }
    elements[currentSize++] = element;
  }

  //Removes the element at the specified position in this list.
  public void remove(int index) {
    checkIndex(index);
    //if last element requested.
    if (index == currentSize - 1) {
      elements[--currentSize] = null;
    } else {
      //if first element requested.
      if (index == 0) {
        elements = Arrays.copyOfRange(elements, 1, currentSize--);
      } else {
        elements = Stream.of(Arrays.copyOfRange(elements, 0, index), Arrays.copyOfRange(elements, index + 1, currentSize)).flatMap(Stream::of).toArray();
        currentSize--;
      }
    }
  }

  //Removes all of the elements from this list.
  public void clear() {
    elements = new Object[DEFAULT_SIZE];
    currentSize = 0;
  }

  //Returns list size.
  public int length() {
    return currentSize;
  }

  //Checks list for IndexOutOfBoundsException.
  public void checkIndex(int index) {
    if (index >= currentSize || index < 0) {
      throw new IndexOutOfBoundsException("Asking index = " + index + ", current size = " + currentSize);
    }
  }

//  //Inserts the specified element at the specified position in this list
//  private boolean add(int index, E element) {
//  }

//  //Appends all of the elements in the specified collection to the end of this list
//  private boolean addAll(Collection<? extends E> c) {
//  }

//  //Removes from this list all of its elements that are contained in the specified collection.
//  private boolean removeAll(Collection<? extends E> c) {
//  }

//  //Returns an iterator over the elements in this list in proper sequence.
//  private Iterator<E> iterator() {
//  }

//  //Sorts this list according to the order induced by the specified Comparator.
//  private void sort(Comparator<? super E> c) {
//  }

//  //Removes the first occurrence of the specified element from this list, if it is present.
//  private E remove(Object o) {
//  }
}
