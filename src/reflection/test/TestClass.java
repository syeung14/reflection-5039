package reflection.test;
public class TestClass {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("MyClass");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
