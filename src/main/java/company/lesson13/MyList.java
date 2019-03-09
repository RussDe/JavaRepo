package company.lesson13;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

public interface MyList<E> {
  boolean isEmpty();

  E get(int index);

  void set(int index, E element);

  void add(E element);

  void remove(int index);

  void clear();

  int length();

  void checkIndex(int index);

  boolean add(int index, E element);

  boolean addAll(Collection<? extends E> c);

  boolean removeAll(Collection<? extends E> c);

  Iterator<E> iterator();

  void sort(Comparator<? super E> c);

  E remove(Object o);
}
