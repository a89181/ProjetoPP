package Backend;


import java.util.ArrayList;

public class ListaUtilizador {
    private ArrayList<Utilizador> lista;
    
    public ListaUtilizador(){
        lista = new ArrayList<> ();
    }

    public ArrayList<Utilizador> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Utilizador> lista) {
        this.lista = lista;
    }
    
    public void adicionar (Utilizador utilizador){
        lista.add(utilizador);
    }
    public void remover (Utilizador utilizador){
        lista.remove(utilizador);
    }
    
    public ArrayList<Utilizador> getListaGestor() {
        ArrayList<Utilizador> gestor = new ArrayList<> ();
        
        for (Utilizador u: lista) {
            if (u instanceof Gestor) {
                gestor.add(u);
            }
        }
        
        return gestor;
    }

    public ArrayList<Utilizador> getListaAdmin() {
        ArrayList<Utilizador> admin = new ArrayList<> ();
        
        for (Utilizador u: lista) {
            if (u instanceof Administrador) {
                admin.add(u);
            }
        }
        
        return admin;
    }
    
    public ArrayList<Utilizador> getListaUtente() {
        ArrayList<Utilizador> utente = new ArrayList<> ();
        
        for (Utilizador u: lista) {
            if (u instanceof Utente) {
                utente.add(u);
            }
        }
        
        return utente;
    }
    @Override
    public String toString() {
        return "ListaUtilizador{" + "lista=" + lista + '}';
    }
    
    
}

