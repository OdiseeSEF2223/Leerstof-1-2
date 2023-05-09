package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WasmachineTest {

    @Test
    public void ctor_IsAanIsFalse(){
        //Arrange

        //Act
        WasMachine m = new WasMachine();

        //Assert
        assertFalse(m.isAan());
    }

    @Test
    public void zetAan_AfterCtor_isAanIsTrue(){
        //Arrange
        WasMachine m = new WasMachine();

        //Act
        m.zetAan();

        //Assert
        assertTrue(m.isAan());
    }

    @Test
    public void zetUit_AlsAanstaat_isAanIsFalse(){
        //Arrange
        WasMachine m = new WasMachine();

        //Act
        m.zetUit();

        //Assert
        assertFalse(m.isAan());
    }

    @Test
    public void start_AlsUitstaat_isAanEnIsGestartIsFalse(){
        //Arrange
        WasMachine m = new WasMachine();

        //Act
        m.start(Programma.SNEL);

        //Assert
        assertFalse(m.isAan());
        assertFalse(m.isGestart());
    }


    @Test
    public void start_AlsAanstaat_isGestartIsTrueEnProgrammaMatches(){
        //Arrange
        WasMachine m = new WasMachine();
        m.zetAan();

        //Act
        m.start(Programma.SNEL);

        //Assert
        assertTrue(m.isGestart());
        assertEquals(Programma.SNEL, m.getProgramma());
    }

    @Test
    public void start_AlsReedsGestart_isGestartIsTrueEnProgrammaUnchanged(){
        //Arrange
        WasMachine m = new WasMachine();
        m.zetAan();
        m.start(Programma.KATOEN);

        //Act
        m.start(Programma.SNEL);

        //Assert
        assertTrue(m.isGestart());
        assertEquals(Programma.KATOEN, m.getProgramma());
    }
}
