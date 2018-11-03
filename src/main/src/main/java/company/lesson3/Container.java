package company.lesson3;

public class Container {
  private Object[] container;
  private int index = 0;

  public Container(int size) {
    this.container = new Object[size];
  }

  public void add(Object obj) {
    this.container[index] = obj;
    index++;
  }

  public Object getLast() {
    Object tempObj = container[index];
    container[index] = null;
    index--;
    return tempObj;
  }
}
