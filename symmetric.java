import java.util.Scanner;
class Sym{
    int r,c;
    int flag=0;
    int[][] arr=new int[10][10];
    Scanner sc=new Scanner(System.in);
    void get(){
        System.out.println("enter the o of rows:");
        this.r=sc.nextInt();
        System.out.println("enter the o of colums:");
        this.c=sc.nextInt();
        System.out.println("enter the matrix:");
        for(int i=0;i<this.r;i++){
            for(int j=0;j<this.c;j++){
                this.arr[i][j]=sc.nextInt();
            }
        }

    }

    void isSym(){
        for(int i=0;i<this.r;i++){
            for(int j=0;j<this.c;j++){
                if(this.arr[i][j] != this.arr[j][i]){
                    flag=1;
                    break;
                }
            }
            if(flag==1){
            break;
        }
        }
        if(flag==1){
            System.out.println("not syametric");
        }else{
            System.out.println(" syametric");

        }
    }
}

class symmetric{
    public static void main(String args[]){
      Sym s1=new Sym();
      s1.get();
      s1.isSym();

    }
}