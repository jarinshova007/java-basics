public class Compare {
    public static void main(String args[]) {
        String name1 = "Jarin";
        String name2 = "Jarin";
        if (name1.equals(name2)) {
            System.out.println("Same string");
        } else {
            System.out.println("Different strings");
        }
        
        // the heap objects are different
        if (new String("Jarin") == new String("Jarin")) {
            System.out.println("Same string");
        } else {
            System.out.println("Different strings");
        }
    }
}
