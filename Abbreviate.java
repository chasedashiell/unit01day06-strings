// great, except again:
// TODO: you have to actually make a new String
public class Abbreviate {
    public static void main(String[] args) {
        String a = args[0];
        if (a.length() < 8){
            System.out.println(a);
        }else {
            String firstTwo = a.substring(0, 2);
            String lastTwo = a.substring(a.length() - 2, a.length());
            System.out.println(firstTwo + "..." + lastTwo);
        }
    }
}
