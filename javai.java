import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;  // Import the InvocationTargetException

class MyClass {
    private String name;

    public MyClass(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello " + name);
    }
}

public class javai {

    // Declare that the main method can throw the necessary exceptions
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        // Create an instance of MyClass
        MyClass obj = new MyClass("Dato");

        // Get the Class object for MyClass at runtime
        Class<?> clazz = obj.getClass();

        // Get the method "sayHello" from MyClass dynamically (Reflection)
        Method method = clazz.getMethod("sayHello");

        // Print the method object (it will print the method signature)
        System.out.println(method);  // Prints: public void MyClass.sayHello()

        // Invoke the method dynamically
        method.invoke(obj);  // Output: Hello Dato
    }
}
