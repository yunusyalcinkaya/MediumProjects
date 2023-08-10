package com.example.solid_principles.openClosed.correct;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class CalculateArea {

    public void calculate(GeometricalShape geometricalShape){

        geometricalShape.calculateArea();
    }
}

@Getter
@Setter
@AllArgsConstructor
class Circle implements GeometricalShape {

    private int radius;

    public void calculateArea(){
        System.out.println( 3 * Math.pow(radius,2));
    }

}

@Getter
@Setter
@AllArgsConstructor
class Square implements GeometricalShape {

    private int edgeLength;

    public void calculateArea(){
        System.out.println( 3 * Math.pow(edgeLength,2));
    }
}


