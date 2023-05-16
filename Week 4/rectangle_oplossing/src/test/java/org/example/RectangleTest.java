package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @Test
    public void getArea_LengteAanpas_AreaMeeAanpast(){
        //Arrange
        Rectangle r = new Rectangle(10, 5);
        r.setLength(5);

        //Act
        double area = r.getArea();

        //Assert
        assertEquals(25, area);
    }

}