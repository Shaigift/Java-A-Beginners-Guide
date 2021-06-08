package Annotations;
// An example that uses @Deprecated.

// Deprecate a class.
@Deprecated
public class MyClass {
    private String msg;

    MyClass(String m) {
        msg = m;
    }

    // Deprecate a method within a class.
    @Deprecated
    String getMsg() {
        return msg;
    }

    // ...
}