package ex3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner obiect = new Scanner(System.in);

        System.out.print("Dati primul sir:");
        String sir1 = obiect.nextLine();
        System.out.print("Dati al doilea sir:");
        String sir2 = obiect.nextLine();

        System.out.print("Dati pozitia unde doriti sa inserati primul sir in al doilea:");
        int index = obiect.nextInt();

        sir1 = sir1.substring(0, index-1) + sir2 + sir1.substring(index-1);

        System.out.print(sir1 + "\n");

        System.out.print("Dati pozitia de pe care doriti sa stergeti:");
        int index2 = obiect.nextInt();
        System.out.print("Dati numarul de caractere care doriti a fi sters:");
        int numar = obiect.nextInt();

        String sir3 = sir1.substring(index2-1,index2-1+numar);
        sir1 = sir1.replace(sir3,"");



        System.out.print(sir1);

    }
}

