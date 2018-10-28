package company.lesson3;

public class GenericContainer<T extends Number> {
  private Object[] container;
  private int index = 0;

  public GenericContainer(int size) {
    this.container = new Object[size];
  }

  public void add(T obj) {
    this.container[index] = obj;
    index++;
  }

  public T getLast() {
    T tempObj = (T) container[index];
    container[index] = null;
    index--;
    return tempObj;
  }

  public double average() {
    double sum = 0;
    for (int i = 0; i < index; i++) {
      sum += ((T) container[i]).doubleValue();
    }
    return sum / (index);
  }
}
