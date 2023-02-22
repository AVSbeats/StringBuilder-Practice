public class StringBuilderPractice {
    public static void main(String[] args) {

        System.out.println(""); // Space
        StringBuilder name = new StringBuilder("Abraham Vallejos");
        System.out.println("Starts with the original name = " + name);

        System.out.println(""); // Space
        int nameCapacity = name.capacity(); // "Abraham Vallejos" = 16 + 16
        System.out.println("The nameCapacity is " + nameCapacity);

        System.out.println(""); // Space

        name.append("Soto");
        System.out.println("Using append() is " + name);

        System.out.println(""); // Space
        name.insert(16, "-");
        System.out.println("Using insert() is " + name);
        System.out.println(""); // Space
    }
}
