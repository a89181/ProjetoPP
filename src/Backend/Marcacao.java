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

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    
    
}
