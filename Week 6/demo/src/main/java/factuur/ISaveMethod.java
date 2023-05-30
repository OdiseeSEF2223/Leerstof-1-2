package factuur;

import java.time.LocalDate;

public interface ISaveMethod {
    public void save(int nummer);
    public void save(LocalDate date);

    public void save(Factuur factuur);
}
