package com.example.solid_principles.openClosed.incorrect;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class CalculateArea {

    public void calculate(GeometricalShape geometricalShape){

        if(geometricalShape instanceof Circle){
            System.out.println( 3 * Math.pow(((Circle) geometricalShape).getRadius(),2));
        }
        else if(geometricalShape instanceof Square){
            System.out.println(Math.pow(((Square) geometricalShape).getEdgeLength(), 2));
        }
    }
}
@Getter
@Setter
@AllArgsConstructor
class Circle implements GeometricalShape{
    private int radius;
}

@Getter
@Setter
@AllArgsConstructor
class Square implements GeometricalShape{
    private int edgeLength;
}
