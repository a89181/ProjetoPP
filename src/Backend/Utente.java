package Backend;

import java.time.LocalDate;

/*
Os utentes têm um nº de utente do Serviço Nacional de Saúde, deverá ser registado o seu
nome, morada e localidade, data de nascimento, contacto telefónico, email, centro de
vacinação ao qual são alocados, indicação se já foi administrada a vacina e qual a vacina
administrada, as datas da administração da vacina se for o caso.
 */
public class Utente extends Utilizador{
  private int numeroUtente;
    private String nomeUtente;
    private String localidadeUtente;
    private String moradaUtente;
    private String telefoneUtente;
    private String emailUtente;
    private LocalDate dataNascimento;

    public Utente(int numeroUtente, String nomeUtente, String localidadeUtente, String moradaUtente, String telefoneUtente, String emailUtente, LocalDate dataNascimento) {
        this.numeroUtente = numeroUtente;
        this.nomeUtente = nomeUtente;
        this.localidadeUtente = localidadeUtente;
        this.moradaUtente = moradaUtente;
        this.telefoneUtente = telefoneUtente;
        this.emailUtente = emailUtente;
        this.dataNascimento = dataNascimento;
    }
      
  
      
      
    public int getNumeroUtente(){
        return numeroUtente;
    }
    public String getNomeUtente(){
        return nomeUtente;
    }
    public String getLocalidadeUtente(){
        return localidadeUtente;
    }
    public String getTelefoneUtente(){
        return telefoneUtente;
    }
    public String getEmailUtente(){
        return emailUtente;
    }  

    public String getMoradaUtente() {
        return moradaUtente;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public String toString() {
        return "Utente{" + "numeroUtente=" + numeroUtente + ", nomeUtente=" + nomeUtente + ", localidadeUtente=" + localidadeUtente + ", moradaUtente=" + moradaUtente + ", telefoneUtente=" + telefoneUtente + ", emailUtente=" + emailUtente + ", dataNascimento=" + dataNascimento + '}';
    }
    
    
}
