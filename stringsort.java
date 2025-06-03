import java.util.Arrays;
import java.util.Scanner;
class stringsort{
    
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of strings:");
        n=sc.nextInt();
        String[] strings=new String[n];
        for(int i=0;i<n;i++){
            strings[i]=sc.next();
        }

        Arrays.sort(strings);

        System.out.println("sorted String is ...");
        for(String str : strings){
            System.out.println(str);
        }
      sc.close();
    }
}