import java.util.Scanner;
class search{
    int count,flag=0;
    int[] arr=new int[10];
    Scanner sc=new Scanner(System.in);
    void get(){
        System.out.println("enter the count:");
        count=sc.nextInt();
        System.out.println("enter the array:");
        for(int i=0;i<count;i++){
             this.arr[i]=sc.nextInt();
        }

    }

    void isearch(){
        int n,i;
        System.out.println("enter the item to serach:");
        n=sc.nextInt();
         for(i=0;i<this.count;i++){
            if(this.arr[i] == n){
                flag=1;
                break;
            }
         }

         if(flag==1){
             System.out.println("item fount at "+(i+1));
         }else{
            System.out.println("item not fount");
         }
    }

    public static void main(String args[]){
        search s1=new search();
        s1.get();
        s1.isearch();
    }
}