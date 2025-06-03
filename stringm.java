public class stringm{
    public static void main(String args[]){
        String str="hello world";
        int l=str.length();
        System.out.println("lenght="+l);
        //TO UPPERCASE
        String upper=str.toUpperCase();
        System.out.println("uppercase="+upper);
        String lower=str.toLowerCase();
        System.out.println("lower case="+lower);
        String replaced=str.replace("o","x");
        System.out.println("replaced="+replaced);
        String sub=str.substring(7,11);
        System.out.println("substring="+sub);
        boolean stwith=str.startsWith("hello");
        boolean enwith=str.endsWith("world");
        System.out.println("satrt with="+stwith);
        System.out.println("end with="+enwith);
        String trimmed=" hello world ".trim();
        System.out.println("trimmed="+trimmed);
    }
}