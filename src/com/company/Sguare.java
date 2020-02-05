package com.company;

public class Sguare extends Figure {
    int a;

    public Sguare(String name, int a) {
        super(name);
        this.a = a;
    }

    public double calculatePerimeter(){
        return 4*a;
    }


    @Override
    public String draw() {
        return "⚫" ;
    }
}
