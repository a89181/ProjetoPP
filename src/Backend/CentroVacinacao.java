package Backend;

import java.util.ArrayList;
/*
 Cada centro de vacinação tem um código, uma morada, incluindo a localidade, um gestor, um
número de postos de atendimento, stock de cada tipo de vacinas, uma agenda de marcações.
 */
public class CentroVacinacao {
  private String codigoCentroVac;
    private String morada;
    private int numeroPostosAtendimento;
     private StockVacina stock;
    private ArrayList<Utente> ListaUtente;
    private int vacAdministradas;
    
    public String getCodigoCentroVac(){
        return codigoCentroVac;
    }
    public String getMorada(){
        return morada;
    }  
}
