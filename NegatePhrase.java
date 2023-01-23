public class NegatePhrase {
    public static void main(String[] args) {
        String a = args[0];
        String first3 = "aaa";
        String first4 = "aaaa";
        if (a.length() > 3){
            first4 = a.substring(0, 4);
            first3 = a.substring(0, 3);
        }

        if(first3.indexOf("not") == -1 || first4.indexOf("not") == -1){
            System.out.println("not " + a);
        } else {
            System.out.println(a);
        }


    }
}
