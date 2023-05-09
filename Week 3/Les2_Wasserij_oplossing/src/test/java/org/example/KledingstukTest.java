package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KledingstukTest {

    @Test
    public void ctor_AllPropertiesSet(){
        //Arrange
        //hier kunnen we niets zetten want de ctor is het eerste dat er moet gebeuren

        //Act
        KledingStuk stuk = new KledingStuk("naam", "type", 0.75);

        //Assert
        assertEquals("naam", stuk.getNaam());
        assertEquals("type", stuk.getType());
        assertEquals(0.75, stuk.getGewicht());
    }

}