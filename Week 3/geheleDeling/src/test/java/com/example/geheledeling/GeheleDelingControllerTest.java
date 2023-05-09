package com.example.geheledeling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeheleDelingControllerTest {

    // deze functie gaat niet werken -> null pointer exception
    // dit komt omdat de UI niet gelinkt is dus de textvelden zijn niet gekoppeld
    @Test
    void bereken_X10Y2_Result5() {
        //Arrange
        GeheleDelingController controller = new GeheleDelingController();
        controller.txtX.setText("10");
        controller.txtY.setText("2");

        //Act
        controller.bereken();

        //Assert
        assertEquals("5", controller.txtResult.getText());
    }
}