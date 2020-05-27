package expansion;

public class Validate {

    private static AppLanguage word = new AppLanguage(AppLanguage.langChoice);


    /**
     * Esse metodo valida se a entrada não está vazia
     * @param name a String que se deseja validar
     * @return retorna true se cheia, false se vazia
     */
    public static boolean name(String name) { 
        boolean status;
        if (!name.isEmpty()) {
            status = true;    
        } else {
            status = false; 
            word.show(9);  
        }

        return status;
    }

    /**
     * Esse metodo valida se a entrada é diferente de 0
     * @param number a entrada a ser validada
     * @return true se for diferente de 0, false se nao for
     */
    public static boolean doubleNumber(double number) {
        boolean status;
        if (number != 0.0)  {
            status = true;    
        } else {
            status = false; 
            word.show(9);   
        }
        return status;
    }

    /**
     * Analisa se entrada corresponde a uma das opcoes
     * @param option1 chave 1 da opcao
     * @param option2 chave 2 da opcao
     * @param given entrada a ser analisada
     * @return true se corresponde a uma das opcoes, false se nao
     */
    public static boolean twoOptions(int option1, int option2, int given) {
        boolean status;
        if (given == option1 || given == option2 )  {
            status = true;    
        } else {
            status = false; 
            word.show(9);   
        }
        return status;
    }

    /**
     * Analisa se entrada corresponde ao intervalo de opcoes
     * @param startInterval inicio do intervalo de opcoes
     * @param endInterval final do intervalo de opcoes
     * @param given entrada a ser analisada
     * @return true se corresponder ao intervalo, false se nao
     */
    public static boolean options(int startInterval, int endInterval, int given) {
        boolean status;
        if (given >= startInterval && given <= endInterval)  {
            status = true;    
        } else {
            status = false;  
            word.show(9);  
        }
        return status;
    }

}