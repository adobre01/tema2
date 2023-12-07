package ex2;

import java.util.Random;

public class Vers {
    private String versul;

    public Vers(String versul)
    {
        this.versul = versul;
    }

    public String Afisare()
    {
        return this.versul;
    }

    public String numar_cuvinte()
    {
        String []s = this.versul.split(" ");

        return String.valueOf(s.length);
    }

    public String numar_vocale()
    {
        int contor = 0;

        for(int i = 0;i < this.versul.length(); i++)
        {
            if(
                    this.versul.charAt(i) == 'a' ||
                            this.versul.charAt(i) == 'e' ||
                            this.versul.charAt(i) == 'i' ||
                            this.versul.charAt(i) == 'o' ||
                            this.versul.charAt(i) == 'u' ||
                            this.versul.charAt(i) == 'A' ||
                            this.versul.charAt(i) == 'E' ||
                            this.versul.charAt(i) == 'I' ||
                            this.versul.charAt(i) == 'O' ||
                            this.versul.charAt(i) == 'U' )
            {
                contor++;
            }
        }

        return String.valueOf(contor);
    }
    //numara vocalele,returnand rezultatul sub forma de sir de caractere

    public double random_number()
    {
        Random rand = new Random();
        double x = rand.nextDouble();

        return x;
    }
//genereaza un nr random intre 0 si 1

    public boolean verificare(String word)
    {
        boolean val = this.versul.endsWith(word);

        return val;
    }
    //

}
