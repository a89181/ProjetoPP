package Backend;

import java.util.ArrayList;

public class ListaCentrosVacinaçao {
    public class ListaCentrosVacinacao {
    
    private ArrayList<CentroVacinacao> listaCentro;
    
    public ListaCentrosVacinacao() {
        listaCentro = new ArrayList<> ();
    }
    
    public ArrayList<CentroVacinacao> getCentros(){
        return listaCentro;
    }
    
    public void adicionar(CentroVacinacao centro){
        listaCentro.add(centro);
    }
    
    public void remover(CentroVacinacao centro){
        listaCentro.remove(centro);
    }
}

    
}
