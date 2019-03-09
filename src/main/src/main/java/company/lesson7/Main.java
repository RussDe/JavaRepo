package company.lesson7;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;

public class Main {
  public static void main(String[] args) throws Exception {
    // A a = new A();

    Class<A> aClass = A.class;
//    A a = aClass.newInstance();
    Constructor<A> declaredConstructor = aClass.getDeclaredConstructor();
    declaredConstructor.setAccessible(true);
    A a1 = declaredConstructor.newInstance();
    Field field = aClass.getDeclaredField("password");
    field.setAccessible(true);
    System.out.println(field.get(a1));

    Method printNoParams = aClass.getDeclaredMethod("print");
    printNoParams.setAccessible(true);
    printNoParams.invoke(a1);

    Method printWithParams = aClass.getDeclaredMethod("print", String.class);
    printWithParams.setAccessible(true);
    printWithParams.invoke(a1, "sampe");

    Method printWith2Params = aClass.getDeclaredMethod("print", String.class, Integer.TYPE); //Integer.TYPE or int.class
    printWith2Params.setAccessible(true);
    printWith2Params.invoke(a1, "in cycle", 2);

    //
    Constructor<A> declaredConstructor1 = aClass.getDeclaredConstructor(String.class);
    declaredConstructor1.setAccessible(true);
    A a2 = declaredConstructor1.newInstance("new message");
    System.out.println(field.get(a2));

//    aClass.getDeclaredMethod("print", );
    //


  }
}
