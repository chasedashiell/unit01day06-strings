// TODO: this assignment asked you to actually create a new String (i.e. define it in a variable), and not just print a result
public class NegatePhrase {
    public static void main(String[] args) {
        String a = args[0];
        String first3 = "aaa";
        String first4 = "aaaa";
        if (a.length() > 3){
            first4 = a.substring(0, 4);
            first3 = a.substring(0, 3);
        }
        // this method totally works, but the 6 lines above this were unnecessary (aside from a length check) if you use the following in your conditional:
        // !a.substring(0, 4).equals("not")

        if(first3.indexOf("not") == -1 || first4.indexOf("not") == -1){
            System.out.println("not " + a);
        } else {
            System.out.println(a);
        }


    }
}
