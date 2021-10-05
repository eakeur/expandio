package expandio;

import java.util.Scanner;

public class Main {

    private static int option = 1;
    private static AppLanguage word;
    private static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        var rep = new Repository();
        try {
            for (var mat : rep.getAll()) {
                System.out.println(mat.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // setLanguage();
         
        // while (option == 1) {

        //     do {
        //         showOptions();
        //         word.show(3);
        //         option = sc.nextInt();
        //     } while (!Validate.twoOptions(1, 0, option));
            
        // }
        //     word.show(4);
        //     sc.close(); Compute.calcInput.close();                             
        
    }

    /**
     * Este metodo ira atribuir a lingua de exibicao do aplicativo, entre portugues e ingles.
     */

    private static void setLanguage(){

        try {

            do {
                System.out.println("\n\nSelecione o idioma de exibicao     //     Choose the app language."+
                                   "\nDigite 1 para ingles // Insert 1 for english."+
                                    "\nDigite 0 para portugues // Insert 0 for portuguese\n");

                AppLanguage.langChoice = sc.nextInt();

            } while (!Validate.twoOptions(1, 0, AppLanguage.langChoice));

            word = new AppLanguage(AppLanguage.langChoice);

        } catch (Exception e) {
            word.show(5);
        }


    }

    /**
     * Este metodo mostrara o menu de opcoes.
     */
    private static void showOptions(){

        try {
            word.show(0);
            word.show(1);

            option = sc.nextInt();
    
            switch (option) {
                
                case 1: Data.add(); break;
                case 2: Data.del(); break;
                case 3: Data.list(); break;
                case 4: Compute.getInfo(); break;

                default: word.show(2); break;
            }

        } catch (Exception e) {
            word.show(5);
        }

    }
}