package expansion;

import java.io.File; 
import java.io.FileReader; 
import java.io.FileWriter; 
import java.io.IOException; 
import java.util.Scanner;

public class Data {

    static String names[] = new String[999]; static double coefs[] = new double[999], crecep = 0;
    static String nFile = ""; static String cFile = "";
    static Scanner dataInput = new Scanner(System.in);
    static String nrecep = "";
    private static AppLanguage word = new AppLanguage(AppLanguage.langChoice);


    /**
     * Esse metodo ira ler os arquivos na memoria em txt
     */
    public static void readData() {
        
        try {
            File Namefile = new File("src/expansion/names.txt"); nFile = Namefile.getCanonicalPath();
            File Coeffile = new File("src/expansion/coefs.txt"); cFile = Coeffile.getCanonicalPath();
            Scanner nReader = new Scanner(new FileReader(nFile));
            Scanner cReader = new Scanner(new FileReader(cFile));
            for (int i = 0; nReader.hasNextLine() && cReader.hasNextDouble(); i++) {
                names[i] = nReader.nextLine(); coefs[i] = cReader.nextDouble();
           }    
        } catch (IOException e) {
            word.show(5);
        }
        
    }

    /**
     * Esse metodo ira listar os materiais na memoria
     */
    public static void list() { readData();
        for (int i = 0; names[i] != null; i++) {
            System.out.println("Nº"+(i+1)+": "+names[i].toUpperCase()+" - Linear coef. (x10^−6) = "+coefs[i]);            
        } 

    }

    /**
     * Esse metodo ira adicionar materiais na memoria em txt
     */
    public static void add() {

        readData();
               
        int saved = howManyMaterialsAre();

        do {
            word.show(6);; nrecep = dataInput.nextLine();
        } while (!Validate.name(nrecep));

        do {
            word.show(7); crecep = dataInput.nextDouble();
        } while (!Validate.doubleNumber(crecep));

        names[saved] = nrecep; coefs[saved] = crecep;

        try {
                FileWriter nAdd = new FileWriter(nFile);
                FileWriter cAdd = new FileWriter(cFile);
            for (int i = 0; names[i] != null; i++) { 
                nAdd.write(names[i]+"\n"); cAdd.write(""+coefs[i]+"\n");
            }
            nAdd.close(); cAdd.close();
        } catch (IOException e) { 
            word.show(5);
        }
    }


    /**
     * Esse metodo ira deletar materiais na memoria em txt
     */
    public static void del() { list();

        int i = 0;

        do {
            word.show(8);  i = dataInput.nextInt(); 
            } while (!Validate.options(1,howManyMaterialsAre(),i));
            i--;

            names[i] = null; coefs[i] = 0;

            while (names[i+1] != null && coefs[i+1] != 0) { 
                names[i] = names[i+1]; coefs[i] = coefs[i+1]; i++; 
            }

            try { 
                FileWriter nAdd = new FileWriter(nFile);
                FileWriter cAdd = new FileWriter(cFile);
                for (int j = 0; names[j] != null; j++) { 
                    nAdd.write(names[j]+"\n"); cAdd.write(""+coefs[j]+"\n");}
                nAdd.close(); cAdd.close();

            } 
            catch (IOException e) { word.show(5);
            }

    } 


    /**
     * Esse metodo ira quantificar os materiais na memoria em txt
     */
    public static int howManyMaterialsAre(){
        int quantity = 0;
        while (names[quantity] != null) {quantity++;}
        return quantity;
    }


    
}