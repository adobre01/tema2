package ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) throws FileNotFoundException {

        Vers[] vector = new Vers[600];

        int i = 0;

        File f1 = new File("cantec_in.txt");
        Scanner obiect = new Scanner(f1);
        System.out.print("Dati gruparea de litere:");
        Scanner obiect2 = new Scanner(System.in);

        String sir = obiect2.nextLine();

        String steluta = " ";

        while(obiect.hasNextLine())
        {
            String s = obiect.nextLine();
            vector[i] = new Vers(s);
            i++;

            PrintStream scriere = new PrintStream("cantec_out.txt");

            for(int j=0;j < i ; j++) {

                if(vector[j].verificare(sir)) {

                    steluta = "*";
                }else
                {
                    steluta = " ";
                }

                double x = vector[j].random_number();
                if(x  >= 0.1)
                {
                    scriere.print(vector[j].Afisare() + "  " + vector[j].numar_cuvinte() + "   " +   "   " +  vector[j].numar_vocale() + "    " + x  + " " + steluta +  "\n");
                }
                else
                {
                    scriere.print(vector[j].Afisare().toUpperCase() + "  " + vector[j].numar_cuvinte() + "   " +   "   " +  vector[j].numar_vocale() + "    "  + x + " " + steluta + "\n");
                }
            }
        }



    }
}
