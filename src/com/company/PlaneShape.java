package com.company;


public abstract class PlaneShape extends Shape
        implements PerimeterMeasurable, AreaMeasurable {
    protected Vertex ver;

    public PlaneShape(Vertex ver) {
        super(ver);
    }

    public PlaneShape() {
        super();
    }


    public static class Triangle extends PlaneShape {

        Vertex ver;
        double x1, y1, x2, y2, x3, y3;

        public Triangle(Vertex ver, double x2, double y2, double x3, double y3) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.x3 = x3;
            this.y3 = y3;
        }


        public double getX1() {
            return x1;
        }

        public double getY1() {
            return y1;
        }

        public double getX2() {
            return x2;
        }

        public double getY2() {
            return y2;
        }

        public double getX3() {
            return x3;
        }

        public double getY3() {
            return y3;
        }

        public double lengthofside_triangle(double x1, double y1, double x2, double y2) {
            double diffX = Math.pow((x1 - x2), 2);
            double diffY = Math.pow((y1 - y2), 2);
            return Math.sqrt(diffX + diffY);
        }


        public double getArea() {

            double area = (getX2() - getX1()) * (getY3() - getY1()) - (getX3() - getX1()) * (getY2() - getY1());
            if (area > 0) {
                return area;
            } else return area * (-1);
        }

        @Override
        public double getPerimeter() {
            double triangleSide1 = lengthofside_triangle(getX1(), getY1(), getX2(), getY2());
            double triangleSide2 = lengthofside_triangle(getX2(), getY2(), getX3(), getY3());
            double triangleSide3 = lengthofside_triangle(getX3(), getY3(), getX1(), getY1());
            return triangleSide1 + triangleSide2 + triangleSide3;
        }

        @Override
        public String toString() {
            return "Triangle: " +
                    "\nArea: " + getArea() +
                    "\nPerimeter: " + getPerimeter();
        }
    }

    public static class Rectangle extends PlaneShape {
        Vertex ver;
        double width, height;

        public Rectangle(Vertex ver, double width, double height) {
            super(ver);
            this.width = width;
            this.height = height;
        }


        public double getWidth() {
            return width;
        }

        public double getHeight() {
            return height;
        }


        @Override
        public double getArea() {
            return width * height;
        }

        @Override
        public double getPerimeter() {
            return (width + height) * 2;
        }

        @Override
        public String toString() {
            return "Rectangle: " +
                    "\nArea: " + getArea() +
                    "\nPerimeter: " + getPerimeter();
        }
    }

    static class Circle extends PlaneShape {
        Vertex ver;
        double radius;

        public Circle(Vertex ver, double radius) {
            super(ver);
            this.radius = radius;
        }


        private double getRadius() {
            radius = this.radius;
            return radius;
        }


        @Override
        public double getArea() {
            return Math.PI * (Math.pow(getRadius(), 2));
        }

        @Override
        public double getPerimeter() {
            return (2 * Math.PI * getRadius());
        }

        @Override
        public String toString() {
            return "Circle: " +
                    "\nArea: " + getArea() +
                    "\nPerimeter: " + getPerimeter();
        }
    }
}


