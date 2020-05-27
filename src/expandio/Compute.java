package expandio;

import java.lang.Math;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Compute {

    private static AppLanguage word = new AppLanguage(AppLanguage.langChoice);
    static Scanner calcInput = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("0.000");
    static double result = 0, size = 0, temp = 0, temp2 = 0, pow = 0;
    static int i = 0, typeOfExpansion = 0;


    /**
     * Este metodo recolhera informacoes adicionais para efetuar o calculo da dilatacao
     */
    public static void getInfo() {
        String unit = "", nameunit = "";

        try {
            
        
            do {
                word.show(10); typeOfExpansion = calcInput.nextInt();
            } while (!Validate.options(1,3,typeOfExpansion)); System.out.println("\n");
        
            switch (typeOfExpansion) {
                case 1: nameunit = word.getText(12); unit = word.getText(17); break;
                case 2: nameunit = word.getText(13); unit = word.getText(18); break;
                case 3: nameunit = word.getText(14); unit = word.getText(19); break;
                default: break;
            }

            Data.list();
            
            do {
                word.show(11);   
                i = calcInput.nextInt(); 

            } while (!Validate.options(1,Data.howManyMaterialsAre(),i));


            do {
                System.out.print(nameunit);   size = calcInput.nextDouble();
            } while (!Validate.doubleNumber(size));
        

            word.show(15);   
            temp = calcInput.nextDouble();
            word.show(16);   
            temp2 = calcInput.nextDouble();

        
            calc(typeOfExpansion);

            if (AppLanguage.langChoice == 1) {
                System.out.println("\nThe "+Data.names[i-1]+", originally measuring "+size+unit+", expands "+result+unit+" at a temperature variation of "+(temp2-temp)+"°C\nThus, it measures now "+(result+size)+unit);

            } else {
                System.out.println("\n@ "+Data.names[i-1]+", inicialmente medindo "+size+unit+", dilata "+df.format(result)+unit+" numa variacao de temperatura de "+(temp2-temp)+"°C\nPortanto, el@ mede agora "+df.format((result+size))+unit);
                
            }

            
        

        } catch (InputMismatchException e) {
            word.show(5);
        }
    }


    /**
     * O metodo realiza o calculo 
     * @param typeOfExpansion E o tipo de dilatacao a ser usada
     * @return o resultado do calculo
     */
    public static double calc(int typeOfExpansion) {

        String coefString = Data.coefs[i-1].replace(",", ".");
        double coeficient = Double.parseDouble(coefString);
        pow = Math.pow(10,-6);
        result = (typeOfExpansion*coeficient*pow)*size*(temp2-temp);
        return result;
    }

}
