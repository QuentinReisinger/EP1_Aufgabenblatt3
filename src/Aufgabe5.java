/*
    Aufgabe 5) Rekursion
*/
public class Aufgabe5 {

    private static String orderCharGroups(String text) {
        if (text.isEmpty()) {
            return "";
        }

        char first = text.charAt(0);
        String leftoverText = text.substring(1);

        if(leftoverText.isEmpty()) {
            return "" + first;
        }

        String sorted = orderCharGroups(leftoverText);

        if(first == sorted.charAt(0)) {
            return first + sorted;
        }else{
            return sorted + first;
        }
    }

    public static void main(String[] args) {

        System.out.println(orderCharGroups(""));
        System.out.println(orderCharGroups("1"));
        System.out.println(orderCharGroups("12"));
        System.out.println(orderCharGroups("1212"));
        System.out.println(orderCharGroups("abbaaababbaa"));
        System.out.println(orderCharGroups("ABBA"));
        System.out.println(orderCharGroups("11221122"));
        System.out.println(orderCharGroups("AAAAAA"));
        System.out.println();

    }
}
