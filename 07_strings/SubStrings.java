public class SubStrings {
    public static void main(String[] args) {
        String name = "Jarin Shova";
        String sentense = "I really love coding with Java";

        // for Shova
        String p = name.substring(6); // if endIndex = array length (no need to put the endIndex)
        System.out.println(p);

        // for love
        System.out.println(sentense.substring(9, 13));

        // for Java
        System.out.println(sentense.substring(26, sentense.length())); // sentense.length = 30;
    }
}
