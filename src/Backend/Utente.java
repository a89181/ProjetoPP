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

    public Utente(int numeroUtente, String nomeUtente, String localidadeUtente, String moradaUtente, String telefoneUtente, String emailUtente, LocalDate dataNascimento, String username, String password) {
        super(username, password);
        this.numeroUtente = numeroUtente;
        this.localidadeUtente = localidadeUtente;
        this.moradaUtente = moradaUtente;
        this.telefoneUtente = telefoneUtente;
        this.dataNascimento = dataNascimento;
        this.emailUtente = emailUtente;
        
    }
    
    
    public int getNumeroUtente(){
        return numeroUtente;
    }
  
    public String getLocalidadeUtente(){
        return localidadeUtente;
    }
    public String getTelefoneUtente(){
        return telefoneUtente;
    }

    public String getMoradaUtente() {
        return moradaUtente;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setNumeroUtente(int numeroUtente) {
        this.numeroUtente = numeroUtente;
    }

    public void setNomeUtente(String nomeUtente) {
        this.nomeUtente = nomeUtente;
    }

    public void setLocalidadeUtente(String localidadeUtente) {
        this.localidadeUtente = localidadeUtente;
    }

    public void setMoradaUtente(String moradaUtente) {
        this.moradaUtente = moradaUtente;
    }

    public void setTelefoneUtente(String telefoneUtente) {
        this.telefoneUtente = telefoneUtente;
    }

    public void setEmailUtente(String emailUtente) {
        this.emailUtente = emailUtente;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    @Override
    public String toString() {
        return "Utente{" + "numeroUtente=" + numeroUtente + ", nomeUtente=" + nomeUtente + ", localidadeUtente=" + localidadeUtente + ", moradaUtente=" + moradaUtente + ", telefoneUtente=" + telefoneUtente + ", emailUtente=" + emailUtente + ", dataNascimento=" + dataNascimento + ", username=" + getUsername() + ", password=" + getPassword() + '}';
    }
    

    
    
}
