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
    private int vacAdministrada;
    private ArrayList<StockVacina> listaStock;
    private ArrayList<Utente> listaUtente;

    public CentroVacinacao(String codigoCentroVac, String morada, int numeroPostosAtendimento, int vacAdministrada) {
        this.codigoCentroVac = codigoCentroVac;
        this.morada = morada;
        this.numeroPostosAtendimento = numeroPostosAtendimento;
        this.vacAdministrada = vacAdministrada;
        this.listaStock = new ArrayList<> ();
        this.listaUtente = new ArrayList<> ();
    }
    
    
    public String getCodigoCentroVac(){
        return codigoCentroVac;
    }
   
    public String getMorada(){
        return morada;
    }

    public int getNumetoPostos(){
        return numeroPostosAtendimento;
    }
    
    public int getVacinasAdministradas(){
        return vacAdministrada;
    }

    public int getNumeroPostosAtendimento() {
        return numeroPostosAtendimento;
    }

    public int getVacAdministrada() {
        return vacAdministrada;
    }

    public ArrayList<StockVacina> getListaStock() {
        return listaStock;
    }

    public ArrayList<Utente> getListaUtente() {
        return listaUtente;
    }
    
    

    public void setCodigoCentroVac(String codigoCentroVac) {
        this.codigoCentroVac = codigoCentroVac;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setNumeroPostosAtendimento(int numeroPostosAtendimento) {
        this.numeroPostosAtendimento = numeroPostosAtendimento;
    }

    public void setVacAdministrada(int vacAdministrada) {
        this.vacAdministrada = vacAdministrada;
    }

    public void setListaStock(ArrayList<StockVacina> listaStock) {
        this.listaStock = listaStock;
    }

    public void setListaUtente(ArrayList<Utente> listaUtente) {
        this.listaUtente = listaUtente;
    }
    
    
    public ArrayList<StockVacina> getStock(){
        return listaStock;
    }
    
    public ArrayList<Utente> getUtentes(){
       return listaUtente;
    }
    
    
    
}
