import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Der Benutzer wählt eine Hauptspeise aus (1 = Pizza, 2 = Burger, 3 = Salat)");
        int Hauptspeise = scanner.nextInt();

        System.out.println("Der Benutzer wählt ein Getränk aus (1 = Wasser, 2 = Cola, 3 = Saft)");
        int Getränk = scanner.nextInt();

        System.out.println("Der Benutzer gibt an, ob er ein Dessert möchte (true oder false)");
        boolean Dessert = scanner.nextBoolean();

        System.out.println("Der Benutzer gibt an, ob er Student ist (true oder false)");
        boolean Student = scanner.nextBoolean();

        double Preis = berechnePreis(Hauptspeise, Getränk, Dessert, Student);

        System.out.printf("Der Preis für diese Besellung ist: %.2f €%n ", Preis); 
        /* printf = Ausgabe-Text formatiert darzustellen.
        %.2f Das die Zahl mit 2 Dezimalstellen formatiert wird (z.b. 12.3 wird zu 12.30)
        %n für ein Zeilenumbruch
        */ 
        
        
        
        scanner.close();
    }

    public static double berechnePreis(int Hauptspeise, int Getränk, boolean Dessert, boolean Student)  {
        double grundpreis = 0.0;
        double zuschläge = 0.0;
        
        
        switch (Hauptspeise) {
            case 1:
                grundpreis += 8.0;
                break;
            case 2:
                grundpreis += 7.0;
                break;
            case 3:
                grundpreis += 6.0;
                break;         
            default:
                System.out.println("Ungültige Hauptspeise ");
                break;
        }

        switch (Getränk) {
            case 1:
                grundpreis += 1.0;
                break;
            case 2:
                grundpreis += 2.0;
                break;
            case 3:
                grundpreis += 3.0;
                break;
            default:
                System.out.println("Ungültiges Getränk");
                break;
        }

        if ( Dessert) {
            grundpreis += 2.0;
        }

        if ( Student) {
            grundpreis *= 0.90; 
        } 
        return grundpreis;
    }
}