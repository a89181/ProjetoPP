package Backend;

import Backend.interfaces.GestorUtilizadores;

public class Sistema implements GestorUtilizadores{
    
    /**
     * retorna true se inserido com sucesso ou false caso contrario
     *throw Exception para enviar mensagem de erro 
     */
    @Override
    public boolean inserirUtilizador(String username, String password, String email, String nome) throws Exception {
        throw new Exception ("Utilizador já inserido");
    }

    @Override
    public boolean eliminarUtilizador(Utilizador utilizador) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
