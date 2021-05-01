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

    @Override
    public String toString() {
        return "ListaUtilizador{" + "lista=" + lista + '}';
    }  
}
