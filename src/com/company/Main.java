package com.company;

public class Main {

    public static void main(String[] args) {

        Figure[] figures = new Figure[]{new Sguare("Sguare", 2), new Circle("Circle", 3), new Triangle("Triangle", 3,4,3), new Rectangle("Rectangle",5,7)} ;
        for (int i = 0; i <figures.length ; i++) {
            System.out.println(figures[i].getName()+figures[i].draw() + "=" + figures[i].calculatePerimeter());

        }
    }
}
