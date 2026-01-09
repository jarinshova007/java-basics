// different operations with string builder
public class StringBuilders {
    public static void main(String[] args) {
        // declaration
        StringBuilder sb = new StringBuilder("Popy");
        System.out.println("String builder: " + sb); // Popy

        // get character
        char ch = sb.charAt(0);
        System.out.println("get char: " + ch); // P

        // set character
        sb.setCharAt(0, 'T');
        System.out.println("set char: " + sb); // Topy

        // insert character / String
        sb.insert(2, 'p');
        System.out.println("insert: " + sb); // Toppy

        // delete character
        sb.delete(3, 5);
        System.out.println("delete char: " + sb); // Top

        // deleteCharAt(idx);
        sb.deleteCharAt(1);
        System.out.println("deleteCharAt: " + sb); //Tp
        sb.insert(1, 'o'); // again adding the 'o', sothat sb becomes Top

        // Append char / String (to add something at the end)
        sb.append('p');
        System.out.println("append char: " + sb); // Topp
        System.out.println("append string: " + sb.append("er")); // Topper

        // print length
        System.out.println("length: " + sb.length()); // 6

        // append with empty StringBuilder
        StringBuilder sb1 = new StringBuilder(); // empty SB, there's no String
        sb1.append("Jarin");
        sb1.append(" ");
        sb1.append("Shova");
        System.out.println("append with empty StringBuilder: " + sb1);

        // find index without traverse
        int idx = sb1.indexOf("v"); // 9
        if (idx >= 0 && idx < sb1.length()) {
            System.out.println("found at idx: " + idx);
        } else {
            System.out.println("not found!");
        }

        // reverse
        System.out.println("after reverse: " + sb1.reverse());
    }
}
