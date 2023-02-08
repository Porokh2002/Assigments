public class Question7{
    public static void main(String[] args) {
        String str ="Hello, have a good day";
        System.out.println("After deleting "+ str);
        System.out.println("Before deleting "+ str.replace(str, ""));
    }
}