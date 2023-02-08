public class Question4 {
    public static void main(String[] args) {
        String s1 = "Java Course";
        String s2 = "java course";
        String s3 = "Java Course";
        String s4 = new String("java course");
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s2.equals(s4));

    }
}
