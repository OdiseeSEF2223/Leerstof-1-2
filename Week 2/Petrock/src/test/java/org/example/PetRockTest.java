package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class PetRockTest {

    @org.junit.jupiter.api.Test
    void getName() {
        PetRock rocky = new PetRock("Rocky");

        assertEquals("Rocky", rocky.getName());
    }

    @Test
    void isHappy_AtStart_ReturnsFalse(){
        PetRock rocky = new PetRock("Rocky");

        assertFalse(rocky.isHappy());
    }

    @Test
    void isHappy_AfterPlay_ReturnsTrue() {
        // Arrange or Given
        PetRock rocky = new PetRock("Rocky");

        // Act or When
        rocky.play();

        // Assert or Then
        assertFalse(rocky.isHappy());
    }
}