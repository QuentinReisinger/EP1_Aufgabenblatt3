/*
    Aufgabe 1) Codeanalyse, Codingstyle und Methoden
*/
public class Aufgabe1 {
    //TODO zu Punkt a): Beschreiben Sie hier in 1-2 Sätzen was der Spaghetticode macht
    //Das Programm gibt ein Pattern aus. Das Pattern hat an unterschiedlichen Positionen andere Zeichen.
    //Der Code funktioniert eigentlich so, dass die erste und letzt Zeile extra behandelt wird, dann eine Schleife bis zur Mitte,
    //Mitte wieder einzeln und für die untere Hälfte wieder eine Schleife.

    //TODO zu Punkt b): Beschreiben Sie in 1-2 Sätzen was Sie ändern würden und warum
    //Um die Lesbarkeit zu verbessern mehr Einrückungen und die Schleifen nicht in einer Zeile.
    //
    //


    //TODO zu Punkt c und d): Implementieren Sie hier die Methoden Ihrer Lösung

    private static void printFirstLast(int width){
        System.out.print("#");
        for(int i = 1; i <= width - 2; i++){
            System.out.print("+");
        }
        System.out.println("#");
    }

    private static void printMiddle(int width){
        System.out.print("#|");
        for(int i = 1; i <= width - 4; i++){
            System.out.print(" ");
        }
        System.out.println("|#");
    }

    private static void printUpper(int width){
        for(int i = 1; i < width / 2; i++){
            System.out.print("#");
            for(int j = 2; j <= ((width - 2) / 2 - i + 1); j++){
                System.out.print(".");
            }
            System.out.print("/");

            for(int j = 1; j <= 2 * (i - 1); j++){
                System.out.print(" ");
            }
            System.out.print("\\");
            for(int j = 2; j <= ((width - 2) / 2 - i + 1); j++){
                System.out.print(".");
            }
            System.out.println("#");
        }

    }

    private static void printLower(int width){
        for(int i = 1; i < (width / 2); i++){
            System.out.print("#");
            for(int j = 2; j <= i; j++){
                System.out.print(".");
            }
            System.out.print("\\");
            for(int j = 1; j <= ((width - 2) - 2 * i); j++){
                System.out.print(" ");
            }
            System.out.print("/");
            for(int j = 2; j <= i; j++){
                System.out.print(".");
            }
            System.out.println("#");
        }

    }

    public static void main(String args[]) {
        //********************************************************
        //TODO zu Punkt c,d und e): Implementieren Sie hier Ihre Lösung für die Angabe

        System.out.println("Ihre Ausgabe:");

        int width = 10;

        printFirstLast(width);

        printUpper(width);

        printMiddle(width);

        printLower(width);

        printFirstLast(width);

        //********************************************************

        System.out.println();
        System.out.println("Ausgabe Spaghetticode:");

        System.out.print("#");
        for (int i = 1; i <= 8; i++) {System.out.print("+");}
        System.out.println("#");

        for (int i = 1; i < 5; i++) {
        System.out.print("#");
        for (int j = 2; j <= (8 / 2 - i + 1); j++) {System.out.print(".");
        }
        System.out.print("/");
        for (int j = 1; j <= 2 * (i - 1); j++) {
            System.out.print(" ");
        }
            System.out.print("\\");
            for (int j = 2; j <= (8 / 2 - i + 1); j++) {
            System.out.print(".");
            }System.out.print("#");System.out.println();
        }

        System.out.println("#|      |#");
        for (int i = 1; i < 5; i++) {
        System.out.print("#");
        for (int j = 2; j <= i; j++) {
            System.out.print(".");
        }
            System.out.print("\\");
for (int j = 1; j <= (8 - 2 * i); j++) {
    System.out.print(" ");
}
            System.out.print("/");
            for (int j = 2; j <= i; j++) {
                System.out.print(".");
}
            System.out.print("#");
            System.out.println();
}

        System.out.print("#");
        for (int i = 1; i <= 8; i++) {
        System.out.print("+");}
        System.out.println("#");
    }
}


