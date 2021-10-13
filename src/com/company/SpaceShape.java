package com.company;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {
    protected Vertex ver;

    public SpaceShape(Vertex ver) {
        super(ver);

    }

    public static class Sphere extends SpaceShape {
        Vertex ver;
        double radius;

        public Sphere(Vertex ver, double radius) {
            super(ver);
            this.radius = radius;
        }

        @Override
        public double getArea() {
            return 4 * Math.PI * Math.pow(radius, 2);
        }

        @Override
        public double getVolume() {
            return 4 * Math.PI * Math.pow(radius, 3) / 3;
        }

        public String toString() {
            return "Sphere: " +
                    "\nArea: " + getArea() +
                    "\nVolume: " + getVolume();
        }
    }

    public static class Cuboid extends SpaceShape {
        private final double width;
        private final double height;
        private final double depth;

        public Cuboid(Vertex ver, double width, double height, double depth) {
            super(ver);
            this.width = width;
            this.height = height;
            this.depth = depth;
        }

        @Override
        public double getArea() {
            return 2 * (width * height + height * depth + width * depth);
        }

        @Override
        public double getVolume() {
            return width * height * depth;
        }

        public String toString() {
            return "Cuboid: " +
                    "\nArea: " + getArea() +
                    "\nVolume: " + getVolume();
        }
    }

    public static class SquarePyramid<sidearea> extends SpaceShape {
        private final double bazewidth;
        private final double height;

        public SquarePyramid(Vertex ver, double bazewidth, double height) {
            super(ver);
            this.bazewidth = bazewidth;
            this.height = height;
        }

        //double bazearea;
        double sidearea;

        // double apofema;
        public double getbazearea() {
            return Math.pow(bazewidth, 2);
        }

        public double getApofema() {
            return Math.sqrt(Math.pow(height, 2) + Math.pow(bazewidth / 2, 2));
        }


        public double getsidearea() {
            return sidearea = (4 * bazewidth * getApofema()) / 2;
        }

        @Override
        public double getArea() {
            return getbazearea() + getsidearea();
        }

        @Override
        public double getVolume() {
            return (getbazearea() * height) / 3;
        }

        public String toString() {
            return "SquarePyramid: " +
                    "\nArea: " + getArea() +
                    "\nVolume: " + getVolume();
        }
    }

}
