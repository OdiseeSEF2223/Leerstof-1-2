package factuur;

import java.time.LocalDate;

public class Factuur {

    private int nummer;
    private LocalDate datum;
    private ISaveMethod ISaveMethod;

    public Factuur(ISaveMethod method){
        this.ISaveMethod = method;
    }

    public void save(){
        ISaveMethod.save(nummer);
        ISaveMethod.save(datum);

        ISaveMethod.save(this);
    }
}
