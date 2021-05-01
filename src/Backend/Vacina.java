package Backend;

/*
 Cada vacina tem um nome, código, fabricante, indicação da dose individual em ml, eventuais
restrições associadas à sua administração (por nível etário, por exemplo &gt; 30 e &lt; 65, ou doença
pré-existente), indicação se é de toma única ou múltipla, com um determinado limite mínimo e
máximo de dias entre doses, e lista de efeitos secundários possíveis.
 */
public class Vacina {
   private String nomeVacina;
    private String tipoVacina;
    private String codigoVacina;
    private String fabricante;
    private int numTomas;
    
    
    public String getNomeVacina(){
        return nomeVacina;
    }
    public String getTipoVacina(){
        return tipoVacina;
    } 

    public String getCodigoVacina() {
        return codigoVacina;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getNumTomas() {
        return numTomas;
    }
    
    
}
