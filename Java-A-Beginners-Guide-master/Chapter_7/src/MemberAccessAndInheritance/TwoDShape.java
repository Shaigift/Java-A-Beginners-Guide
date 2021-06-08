package MemberAccessAndInheritance;
// Private members are not inherited.

// This example will not compile.

// A class for two-dimensional objects.

// Use accessor methods to set and get private members.
public class TwoDShape {
    private double width;  // these are
    private double height; // now private

    // Accessor methods for width and height.
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }

    void showDim() {
        System.out.println("Width and height are " +
                width + " and " + height);
    }
}