import java.util.Scanner;
class addmatrix{
    int r,c;
    Scanner sc=new Scanner(System.in);
    int[][] arr=new int[10][10];
    public void get(){
       System.out.println("enter the no of rows");
       this.r=sc.nextInt();
       System.out.println("enter the no of colums");
       this.c=sc.nextInt();
       System.out.println("enter the matrix");
       for(int i=0;i<this.r;i++){
        for(int j=0;j<this.c;j++){
            arr[i][j]=sc.nextInt();
        }
       }

    }

    public static addmatrix sum(addmatrix m1,addmatrix m2){
        addmatrix tmp=new addmatrix();

        if(m1.c == m1.c && m1.r == m2.r){
            tmp.r=m1.r;
            tmp.c=m1.c;
            for(int i=0;i<m1.r;i++){
                for(int j=0;j<m1.c;j++){
                    tmp.arr[i][j]=m1.arr[i][j]+m2.arr[i][j];
                }
            }
        }else{
            System.out.println("addition is not possible");
        }
        return tmp;
    }

    void display(){
        System.out.println("matrix");
        for(int i=0;i<this.r;i++){
        for(int j=0;j<this.c;j++){
            System.out.print(this.arr[i][j]+" ");
        }
        System.out.println("");
       }
    }

    public static void main(String args[]){
        addmatrix m1=new addmatrix();
        addmatrix m2=new addmatrix();
        addmatrix re=sum(m1,m2);
        m1.get();
        m2.get();
        re=sum(m1,m2);
        re.display();

    }
}