package Backend.utils;

import java.io.File;

public class Serializacao {
     private final File ficheiro;

    public Serializacao(String ficheiro) {
        this.ficheiro = new File(ficheiro);
    }

    public File getFicheiro() {
        return ficheiro;
    }          
}
