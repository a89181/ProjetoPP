package Backend;

import java.time.LocalDate;
import java.time.LocalTime;

public class Marcacao {
  private LocalDate data;
    private Utente utente;
    private LocalTime hora;
    
    public LocalDate getData(){
        return data;
    }
    public Utente getUtente(){
        return utente;
    }
    public LocalTime getHora(){
        return hora;
    }  
}
