/*
    Aufgabe 2) Überladen von Methoden
*/
public class Aufgabe2 {

    private static void addChar(String text, char character) {
        //TODO: Implementieren Sie hier Ihre Lösung für die Angabe
    }

    private static void addChar(int number, char character) {
        //TODO: Implementieren Sie hier Ihre Lösung für die Angabe
    }

    private static void addChar(String text, String characters) {
        //TODO: Implementieren Sie hier Ihre Lösung für die Angabe
    }

    private static void addChar(String text) {
        //TODO: Implementieren Sie hier Ihre Lösung für die Angabe
    }

    public static void main(String[] args) {
        String text0 = "";
        String text1 = "A";
        String text2 = "CW";
        String text3 = "EP1";
        String text4 = "Index";

        addChar(text0, '&');
        addChar(text1, '+');
        addChar(text2, '*');
        addChar(text3, '-');
        addChar(text4, '#');
        System.out.println();

        addChar(1, '.');
        addChar(42, ':');
        addChar(148, '$');
        addChar(2048, ')');
        addChar(131719, '%');
        System.out.println();

        addChar(text2, "!O(");
        addChar(text4, "T1#+");
        System.out.println();

        addChar(text1);
        addChar(text2);
        addChar(text3);
    }
}
