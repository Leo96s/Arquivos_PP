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
public class PPod implements FileService, TrackService {

    private File[] files;
    private int count = 0;
    private static int actualTrack;
    private static int globalAddFailures = 0;

    public PPod() {
        this.files = new File[20];
    }

    @Override
    public void addFile(File file) {
        try {
            InvalidExtensionExpansion.verificarMemoriaMusica(this.files);
            this.files[this.count++] = file;
            
        } catch (InvalidExtensionExpansion files1) {
            System.out.println("Erro: " + files1.getMessage());
            globalAddFailures++;
        } catch (NullPointerException files2) {
            System.out.println("NullPointerException!");
            globalAddFailures++;
        } catch (ArrayIndexOutOfBoundsException files3) {
            System.out.println("ArrayIndexOutOfBoundsException");
            globalAddFailures++;
        }
    }

    @Override
    public void deleteFile(int index) {

        try {

            for (int i = index; i < this.count; i++) {
                this.files[i] = this.files[i + 1];
            }
            this.count--;
            this.files[this.count] = null;

        } catch (ArrayIndexOutOfBoundsException files3) {
            System.out.println("IndexOutOfBoundsException");
            globalAddFailures++;
        }
    }

    @Override
    public void playTrack(int index) {
        actualTrack = index;
        try {

            System.out.println(files[index].tracktoString());
            InvalidExtensionExpansion.verificarExtensaoMusica(files[index].getExtencao());
            InvalidExtensionExpansion.verificarDuracaoMusica(files[index].getDuracao());

        } catch (InvalidExtensionExpansion file1) {
            System.out.println("Erro: " + file1.getMessage());
            globalAddFailures++;
        } catch (IndexOutOfBoundsException files3) {
            System.out.println("Erro: " + files3.getMessage());
            globalAddFailures++;
        } catch (NullPointerException files4) {
            System.out.println("Erro: " + files4.getMessage());
            globalAddFailures++;
        }

    }

    @Override
    public void nextTrack() {
        try {
            System.out.println(files[++actualTrack].toString());
            InvalidExtensionExpansion.verificarExtensaoMusica(files[++actualTrack].getExtencao());

        } catch (InvalidExtensionExpansion file1) {
            System.out.println("Erro: " + file1.getMessage());
            globalAddFailures++;
        } catch (IndexOutOfBoundsException files2) {
            System.out.println("Erro: " + files2.getMessage());
            globalAddFailures++;
            nextTrack();
        } catch (NullPointerException files3) {
            System.out.println("Erro: " + files3.getMessage());
            globalAddFailures++;
            nextTrack();
        }

    }

    @Override
    public void previousTrack() {
        try {
            System.out.println(files[--actualTrack].toString());
            InvalidExtensionExpansion.verificarExtensaoMusica(files[--actualTrack].getExtencao());

        } catch (InvalidExtensionExpansion file1) {
            System.out.println("Erro: " + file1.getMessage());
            globalAddFailures++;
        } catch (IndexOutOfBoundsException files2) {
            System.out.println("Erro: " + files2.getMessage());
            globalAddFailures++;
            previousTrack();
        } catch (NullPointerException files3) {
            System.out.println("Erro: " + files3.getMessage());
            globalAddFailures++;
            previousTrack();
        }
    }

    private void selectionbyname(File[] files) {
        int n = 0;
        for (File _file : files) {
            if (_file != null) {
                n++;
            }
        }
        for (int i = 0; i < n - 1; i++) {
            int maxindex = i;
            for (int j = i + 1; j < n; j++) {
                if (files[j].getNome().compareTo(files[maxindex].getNome()) < 0) {
                    maxindex = j;
                }
            }
            File tempFile = files[i];
            files[i] = files[maxindex];
            files[maxindex] = tempFile;;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(files[i].tracktoString() + ", ");
        }
    }

    private void selectionbysize(File[] files) {
        int n = 0;
        for (File _file : files) {
            if (_file != null) {
                n++;
            }
        }
        for (int i = 0; i < n - 1; i++) {
            int maxindex = i;
            for (int j = i + 1; j < n; j++) {
                if (files[j].getTamanho() > files[maxindex].getTamanho()) {
                    maxindex = j;
                }
            }
            File tempFile = files[i];
            files[i] = files[maxindex];
            files[maxindex] = tempFile;

        }
        for (int i = 0; i < n; i++) {
            System.out.print(files[i].tracktoString() + ", ");
        }
    }

    private void selectionbyduration(File[] files) {
        int n = 0;
        for (File _file : files) {
            if (_file != null) {
                n++;
            }
        }
        for (int i = 0; i < n - 1; i++) {
            int maxindex = i;
            for (int j = i + 1; j < n; j++) {
                if (files[j].getDuracao() > files[maxindex].getDuracao()) {
                    maxindex = j;
                }
            }
            File tempFile = files[i];
            files[i] = files[maxindex];
            files[maxindex] = tempFile;

        }
        for (int i = 0; i < n; i++) {
            System.out.print(files[i].tracktoString() + ", ");
        }
    }

    public void shufflePlay(TypesEnumTrack enumtrack) {

        if (enumtrack == TypesEnumTrack.ByName) {
            selectionbyname(files);
        } else if (enumtrack == TypesEnumTrack.ByDuration) {
            selectionbyduration(files);
        } else if (enumtrack == TypesEnumTrack.BySize) {
            selectionbysize(files);
        }
    }

    
    private void selectionbyid(File[] files) {
        int n = 0;
        for (File _file : files) {
            if (_file != null) {
                n++;
            }
        }
        for (int i = 0; i < n - 1; i++) {
            int maxindex = i;
            for (int j = i + 1; j < n; j++) {
                if (files[j].getId() < files[maxindex].getId()) {
                    maxindex = j;
                }
            }
            File tempFile = files[i];
            files[i] = files[maxindex];
            files[maxindex] = tempFile;

        }
        for (int i = 0; i < n; i++) {
            System.out.print(files[i].tracktoString() + ", ");
        }
    }
    
    public String listNameTrack() {
        System.out.println("\n");
        String str = "";

        for (File temp : this.files) {
            try {
                InvalidExtensionExpansion.verificarExtensaoMusica(temp.getExtencao());
                    str += "Id: "+ temp.getId() + " " + "Nome: " + temp.getNome() + "\n";
                

            } catch (InvalidExtensionExpansion file1) {
                System.out.println("Erro: " + file1.getMessage());
                globalAddFailures++;
            } catch (NullPointerException files3) {
                System.out.println("Erro: " + files3.getMessage());
                globalAddFailures++;
            }

        }
        return str;

    }

    public int getGlobalAddFileFailures() {
        return globalAddFailures;
    }

}
