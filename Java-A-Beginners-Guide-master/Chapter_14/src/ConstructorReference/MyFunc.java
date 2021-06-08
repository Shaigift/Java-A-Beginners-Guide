package ConstructorReference;
// Demonstrate a Constructor reference.

// MyFunc is a functional interface whose method returns
// a MyClass reference.
public interface MyFunc {
    MyClass func(String s);
}
