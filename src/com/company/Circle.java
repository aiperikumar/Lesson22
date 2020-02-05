package com.company;


public class Circle extends Figure {
    int r;
    final double p = 3.14 ;

    public Circle(String name ,int r) {
        super(name);
        this.r = r;
    }

    public double calculatePerimeter(){
        return 2*r*p;
    }

    @Override
    public String draw() {
        return "⚫" ;
    }
}

