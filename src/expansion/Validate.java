package expansion;

public class Validate {

    private static AppLanguage word = new AppLanguage(AppLanguage.langChoice);

    public static boolean name(String name) { // Esse metodo valida se a entrada não está vazia 
        boolean status;
        if (!name.isEmpty()) {
            status = true;    
        } else {
            status = false; 
            System.out.println(AppLanguage.textView[9]);  
        }

        return status;
    }
    public static boolean doubleNumber(double number) {
        boolean status;
        if (number != 0.0)  {
            status = true;    
        } else {
            status = false; 
            System.out.println(AppLanguage.textView[9]);  
        }
        return status;
    }
    public static boolean twoOptions(int option1, int option2, int given) {
        boolean status;
        if (given == option1 || given == option2 )  {
            status = true;    
        } else {
            status = false; 
            System.out.println(AppLanguage.textView[9]);  
        }
        return status;
    }
    public static boolean options(int startInterval, int endInterval, int given) {
        boolean status;
        if (given >= startInterval && given <= endInterval)  {
            status = true;    
        } else {
            status = false;  
            System.out.println(AppLanguage.textView[9]); 
        }
        return status;
    }

}