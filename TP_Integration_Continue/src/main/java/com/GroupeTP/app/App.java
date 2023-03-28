package com.GroupeTP.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    private static string calculer_retrait(int valeur)
    {
        int nb_100eu = 0;
        int nb_50eu = 0;
        int nb_20eu = 0;
        int nb_10eu = 0;
        int total_retrait = valeur;
        string message_retrait;

        if( (valeur/100) != 0){
            while (valeur > 100) {
                nb_100eu= nb_100eu + 1;
                valeur = valeur - 100;
            }
        }

        if( (valeur/50) != 0){
            while (valeur > 50) {
                nb_100eu= nb_50eu + 1;
                valeur = valeur - 50;
            }
        }

        if( (valeur/20) != 0){
            while (valeur > 100) {
                nb_20eu= nb_20eu + 1;
                valeur = valeur - 20;
            }
        }

        if( (valeur/10) != 0){
            while (valeur > 10) {
                nb_10eu= nb_10eu + 1;
                valeur = valeur - 10;
            }
        }
        message_retrait = "Vos retraits correspond au nombres de coupures suivantes :/n" +
                "Coupures de 100 euros : " + Integer.valueOf(nb_100eu) + "/n"+
                "Coupures de 50 euros : " + Integer.valueOf(nb_50eu) + "/n"+
                "Coupures de 20 euros : " + Integer.valueOf(nb_20eu) + "/n"+
                "Coupures de 10 euros : " + Integer.valueOf(nb_10eu) + "/n"+
                "Pour un total de " + Integer.valueOf(total_retrait) + "euros /n";




        return message_retrait;
    }
}
