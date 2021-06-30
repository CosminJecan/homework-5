public class ArrayOfStrings {
    public static void main(String[] args) {

        String[] nume = new String[4];
        nume[0] = "Sorin";
        nume[1] = "Maria";
        nume[2] = "Alin";
        nume[3] = "Ioana";

        for (String i: nume) {
            System.out.println("Salut, " + i + "!");
        }
    }
}
