package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Shape> listShape = new ArrayList<>();

        PlaneShape.Triangle tr = new PlaneShape.Triangle(new Vertex(1, 1), 2, 8, 3, 5);
        PlaneShape.Rectangle r = new PlaneShape.Rectangle(new Vertex(1, 1), 5, 4);
        PlaneShape.Circle c = new PlaneShape.Circle(new Vertex(0, 1), 5);
        SpaceShape.Cuboid cub = new SpaceShape.Cuboid(new Vertex_3D(1, 1, 1), 4, 5, 8);
        SpaceShape.Sphere s = new SpaceShape.Sphere(new Vertex_3D(1, 1, 1), 12);
        SpaceShape.SquarePyramid sp = new SpaceShape.SquarePyramid(new Vertex_3D(1, 1, 1), 5, 8);
        listShape.add(tr);
        listShape.add(r);
        listShape.add(c);
        listShape.add(cub);
        listShape.add(s);
        listShape.add(sp);
        for (Shape i : listShape) {
            System.out.println(i + "\n");
        }
    }
}
