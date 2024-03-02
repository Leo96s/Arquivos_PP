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
public class PPodDemo {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    File f1 = new File("musica1", "mp3", 140, 134);
    File f2 = new File("musical2", "mp3", 141, 120);
    File f3 = new File("musica3", "mp4", 150, 200);
    File f4 = new File("musica4", "mp3", 139, 100);
    
    PPod pp1 = new PPod();
    
    
    pp1.addFile(f1);
    pp1.addFile(f2);
    pp1.addFile(f3);
    pp1.addFile(f4);
    
    pp1.playTrack(3);
    
    pp1.shufflePlay(TypesEnumTrack.BySize);
    
    System.out.println(pp1.listNameTrack());
    
    System.out.println(pp1.getGlobalAddFileFailures());
   
    
    }
}
