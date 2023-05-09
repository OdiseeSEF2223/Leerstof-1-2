package org.example;

public class WasMachine {

    private WasMachineState state = WasMachineState.UIT;
    private Programma programma;

    public boolean isAan(){
        return state!=WasMachineState.UIT;
    }

    public void zetAan() {
        state = WasMachineState.AAN;
    }

    public void zetUit() {
        state = WasMachineState.UIT;
    }

    public void start(Programma programma) {
        if(state == WasMachineState.AAN) {
            state = WasMachineState.GESTART;
            this.programma = programma;
        }
    }

    public boolean isGestart() {
        return state == WasMachineState.GESTART;
    }

    public Programma getProgramma() {
        return programma;
    }
}
