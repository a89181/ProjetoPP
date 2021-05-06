package Backend.interfaces;

import Backend.Utilizador;

public interface GestorUtilizadores {
    public boolean inserirUtilizador(String username,String password, String email, String nome)  throws Exception;
    public boolean eliminarUtilizador(Utilizador utilizador) throws Exception; 
    
}
