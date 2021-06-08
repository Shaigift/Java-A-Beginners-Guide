package MemberAccessAndInheritance;
// A subclass of TwoDShape for triangles.
public class Triangle extends TwoDShape {
    String style;

//    double area() {
//        return width * height / 2; // Error! can't access
//    }
double area() {
    return getWidth() * getHeight() / 2;
}

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
