package expandio;

public class AppLanguage {

    public String textView[] = new String[20];
    public static int langChoice = 0;
    public static String dataBackup = "Steel\nAluminium\nLead\nCopper\nIron\nConcrete\nBrass\nGold\nSilver\nCommon Glass\nTungsten\nWater\nPVC\nDiamond\nNickel\nPlatinum\n";
    public static String dataBackup2 = "11.0\n23.1\n29.0\n17.0\n11.8\n12.0\n19.0\n14.0\n18.0\n8.5\n4.5\n69.0\n43.2\n1.0\n13.0\n9.0\n";

    public AppLanguage(int option){

        switch (option) {

            case 1:
                textView[0] = "\nWelcome to ExpandIO! This is the thermal expansion calculator menu.\nChoose one of the options below:\n";
                textView[1] = "-- Add new materials (digit 1)\n-- Delete materials (digit 2)\n-- List materials (digit 3)\n-- Calculate thermal expansion (digit 4)\n";
                textView[2] = "\nInvalid option! Please type a number related to one of the options listed.\n";
                textView[3] = "\nPress 1 to get back to menu. Press 0 to exit the app.\n";
                textView[4] = "\nExiting...";
                textView[5] = "\nAn error occured! Please make sure you are typing the correct piece of information.\n Commas are not allowed!";
                textView[6] = "\nInsert here the name of the material: ";
                textView[7] = "\nInsert the linear coeficient of the material in the 10-⁶ standard: ";
                textView[8] = "\nChoose which material to delete by typing its number:";
                textView[9] = "Invalid input! Repeating...";
                textView[10] = "\n1-Linear / 2-Superficial / 3-Volumetric\nChoose which expansion the material will suffer: ";
                textView[11] = "\nChoose from the list the material you want to use by typing its number: ";
                textView[12] = "\nPlease insert the original lenght (m) of the material: ";
                textView[13] = "\nPlease insert the original area (m²) of the material: ";
                textView[14] = "\nPlease insert the original volume (m³) of the material: ";
                textView[15] = "\nPlease insert at what temperature (°C) the material is: ";
                textView[16] = "\nPlease insert what temperature (°C) the material may reach: ";
                textView[17] = "m";
                textView[18] = "m²";
                textView[19] = "m³";
                break;

            case 0:

                textView[0] = "\nBem-vindo ao ExpandIO! Este e o menu do calculo de dilatacao termica .\nEscolha uma das opcoes abaixo:\n";
                textView[1] = "-- Adicionar novos materiais (digite 1)\n-- Deletar materiais (digite 2)\n-- Listar materiais (digite 3)\n-- Calcular dilatacao termica (digite 4)\n";
                textView[2] = "\nOpcao invalida! Por favor, digite um numero relacionado a uma das opcoes .\n";
                textView[3] = "\nPressione 1 para voltar ao menu. Pressione 0 para fechar o aplicativo.\n";
                textView[4] = "\nSaindo...";
                textView[5] = "\nUm erro ocorreu! Por favor, certifique-se de estar digitando informacoes pertinentes.\n Virgulas nao sao recomendadas!";
                textView[6] = "\nInsira aqui o tipo de material: ";
                textView[7] = "\nInsira o coeficiente linear do material no padrao 10-⁶ : ";
                textView[8] = "\nEscolha que material excluir digitando o numero dele:";
                textView[9] = "Entrada invalida! Repetindo...";
                textView[10] = "\n1-Linear / 2-Superficial / 3-Volumetrica \nEscolha que tipo de dilatacao o material sofrera: ";
                textView[11] = "\nEscolha que material sera utilizado digitando o numero dele: ";
                textView[12] = "\nPor favor, insira o comprimento original (m) do material: ";
                textView[13] = "\nPor favor, insira a area original (m²) do material: ";
                textView[14] = "\nPor favor, insira o volume original (m³) do material: ";
                textView[15] = "\nPor favor, insira a qual temperatura (°C) o material esta: ";
                textView[16] = "\nPor favor, insira qual temperatura (°C) o material chegara: ";
                textView[17] = "m";
                textView[18] = "m²";
                textView[19] = "m³";
                break;

            default:
                break;
            }

        }

    /**
     * Esse metodo mostrara uma frase desejada 
     * @param index e o indice da frase 
     */
    public void show(int index) {
        System.out.println(textView[index]);

    }

    /**
     * Esse metodo retorna a frase desejada
     * @param index e o indice da frase 
     * @return
     */
    public String getText(int index) {
        return textView[index];
    }
}