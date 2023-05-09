package com.example.geheledeling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeheleDelingViewmodelTest {

    // Dit gaat wel slagen want de link naar de UI zit in de controller
    // Business logica zit in het viewmodel
    @Test
    void bereken_X10Y2_Result5() {
        //Arrange
        GeheleDelingViewmodel controller = new GeheleDelingViewmodel();

        //Act
        int result = controller.bereken(10,2 );

        //Assert
        assertEquals(5, result);
    }

}