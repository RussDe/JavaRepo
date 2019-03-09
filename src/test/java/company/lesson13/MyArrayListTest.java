package company.lesson13;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

//@Ignore
public class MyArrayListTest {
  private MyArrayList<Integer> myArrayList;
  private MyArrayList<Integer> myArrayListMocked = mock(MyArrayList.class);

  @BeforeTest
  void setup() {
    myArrayList = new MyArrayList();
  }

  @Test (groups = "brokenTests")
  public void testIsEmpty() {
    assertNotNull(myArrayList);
    assertEquals(myArrayList.length(), 0);
  }

  @Test (groups = "checkingTests")
  public void testGet() {
    myArrayList.add(1);
    myArrayList.add(2);
    myArrayList.add(3);
    assertEquals(myArrayList.get(1), (Integer) 2);
  }

  @Test (groups = "checkingTests")
  public void testSet() {
    myArrayList.add(1);
    myArrayList.add(2);
    myArrayList.add(3);
    myArrayList.set(0, 11);
    assertEquals(myArrayList.get(0), (Integer) 11);
//    assertEquals(myArrayList.length(), 3); //check if the element was replaced and the list size was not changed.
  }

  @Test (groups = "checkingTests")
  public void testAdd() {
    myArrayList.add(1);
    myArrayList.add(2);
    assertTrue(myArrayList.length() == 2);
    assertTrue(myArrayList.get(myArrayList.length() - 1) == 2); //check if the element was added to the end of the list.
  }

  @Ignore
  @Test (groups = "brokenTests")
  public void testRemove() {
    myArrayList.add(1);
    myArrayList.add(2);
    myArrayList.add(3);
    myArrayList.add(4);
    myArrayList.add(5);
    int removedItem2 = myArrayList.get(2);
    myArrayList.remove(2);
    assertEquals(myArrayList.length(), 4); //check if one element is removed.
//    assertNotEquals(myArrayList.get(2), 2); //check element at specified index was removed.
  }
  @Test(groups = "brokenTests", expectedExceptions = IndexOutOfBoundsException.class)
  public void testRemoveIllegal() {
    myArrayList.add(1);
    myArrayList.add(2);
    myArrayList.add(3);
    myArrayList.add(4);
    myArrayList.add(5);
    myArrayList.remove(6);
//    myArrayList.remove(-1);
  }

  @Test (groups = "checkingTests")
  public void testClear() {
    myArrayList.add(1);
    myArrayList.clear();
    assertTrue(myArrayList.isEmpty());
  }

  @Test (groups = "brokenTests")
  public void testLength() {
    //    assertEquals(myArrayList.length(), 0);
    myArrayList.add(1);
    assertEquals(myArrayList.length(), 1);
  }
  @Test(groups = "brokenTests", expectedExceptions = Exception.class, enabled = true)
  public void testCheckIndexIllegal() {
    myArrayList.checkIndex(0);
  }

  @Test (groups = "checkingTests")
  public void testCheckIndexLegal() {
    myArrayList.add(1);
    myArrayList.checkIndex(0);
    //check if exception is not thrown - HOW?
  }

  @Test (groups = "checkingTests")
  public void testGetMocked() {
    when(myArrayListMocked.get(1)).thenReturn(5);
    assertEquals((Integer) (5), myArrayListMocked.get(1));
  }
}