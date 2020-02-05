package com.company;

public class Triangle extends Figure {
    int a;
    int b;
    int c;

    public Triangle(String name, int a, int b, int c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculatePerimeter(){
        return a+b+c;
    }

    @Override
    public String draw() {
        return "⚫" ;
    }
}
