/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Music;

/**
 *
 * @author Leonardo
 */
public class InvalidExtensionExpansion extends Exception {

    public InvalidExtensionExpansion(String s) {
        super(s);
    }

    public static void verificarExtensaoMusica(String s) throws InvalidExtensionExpansion {
        if (!s.equals("mp3")) {
            throw new InvalidExtensionExpansion("Extensão inválida.");
        }
    }

    public static void verificarMemoriaMusica(File[] file) throws InvalidExtensionExpansion {
        int totalsize = 0;
        for (File file_ : file) {
            if (file_ != null) {
                totalsize += file_.getTamanho();
            }
            if (totalsize >= 100000) {
                throw new InvalidExtensionExpansion("Atingido o limite de memoria.");
            }
        }

    }

    public static void verificarDuracaoMusica(int dur) throws InvalidExtensionExpansion {
        if (dur <= 0) {
            throw new InvalidExtensionExpansion("Duracao de musica invalida.");
        }
    }

}
