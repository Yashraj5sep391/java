interface Shape {
    double computeArea();
}
interface GeometricShape extends Shape {
    double computePerimeter();
    double computeVolume();
}
class Rectanglee implements GeometricShape {
    double width;
    double height;

    Rectanglee(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double computeArea() {
        return width * height;
    }

    @Override
    double computePerimeter() {
        return 2 * (width + height);
    }

    @Override
    double computeVolume() {
        return 0;
    }
}
