import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți numărul de persoane (n): ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Persoana[] persoane = new Persoana[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Introduceți datele pentru persoana: " + (i + 1));
            System.out.print("Nume: ");
            String nume = scanner.nextLine();

            String cnp;
            boolean cnpValid = false;

            do {
                System.out.print("CNP: ");
                cnp = scanner.nextLine();
                //cnpValid = isValidCNP(cnp);

                if (!cnpValid) {
                    System.out.println("CNP-ul introdus este invalid. Reintroduceți.");
                }
            } while (!cnpValid);

            persoane[i] = new Persoana(nume, cnp);
        }

        System.out.println("\nInformațiile introduse pentru persoane:");

        for (Persoana persoana : persoane) {
            System.out.println(persoana);
        }

/*
        public static boolean isValidCNP (String cnp){
            if (cnp.length() != 13) {
                return false;
            }


            String primacifra = cnp.substring(0, 1);
            if (!"1256".contains(primacifra)) {
                return false;
            }
*/
    }
}


