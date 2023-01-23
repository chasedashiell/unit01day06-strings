public class ShortLongShort {
    public static void main(String[] args) {
        
        String a = args[0];
        String b = args[1];
        String small;
        String big;
        String sol;
        if (a.length() > b.length()){
            big = a; small = b;
        } else {
            big = b; small = a;
        }
        sol = small + big + small;
        System.out.println(sol);
    }
}
