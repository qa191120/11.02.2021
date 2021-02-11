package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Circle c = new Circle();
        c.m_is3D = true;
        c.draw();
        System.out.println(String.format("is 3d? %s", c.m_is3D));

        Rectangle r = new Rectangle();
        r.draw();
        System.out.println(String.format("is 3d? %s", r.m_is3D));

        Circle[] circles = new Circle[2];
        circles[0] = new Circle();
        circles[1] = new Circle();

        Rectangle[] rectangles = new Rectangle[2];
        rectangles[0] = new Rectangle();
        rectangles[1] = new Rectangle();

        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        drawRShape(shapes[0]);
        drawRShape(shapes[1]);

        BigCircle bc = new BigCircle();
        Circle just_circle = new Circle();
        printRadius(bc);
        printRadius(just_circle);
        //printRadius(r);
    }
    static void printRadius(Circle c)
    {
        System.out.println(c.getM_radius());
    }
    static void drawRectangle(Rectangle r)
    {
        r.draw();
    }
    static void drawRCircle(Circle c)
    {
        c.draw();
        System.out.println(c.getM_radius());
    }
    static void drawRShape(Shape s)
    {
        s.draw();
        if (s.m_is3D) {

        }
        //System.out.println(s.getM_radius());
    }

}
