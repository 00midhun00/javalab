import java.util.Scanner;
class employee{
    int eno;
    String ename;
    int esalary;
    Scanner sc=new Scanner(System.in);
    public void get(){
        System.out.println("enter the eno:");
        this.eno=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the ename:");
        this.ename=sc.nextLine();
        System.out.println("enter the esalary:");
        this.esalary=sc.nextInt();
    }

    public void display(){
        System.out.println("eno="+this.eno);
        System.out.println("ename="+this.ename);
        System.out.println("esalary="+this.esalary);
    }

    public static void main(String args[]){
        int n,i,no;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of employee:");
        n=sc.nextInt();
        employee emp[]=new employee[n];

        for(i=0;i<n;i++){
            emp[i]=new employee();
            emp[i].get();
        }

        System.out.println("search:");
        while(true){
            System.out.println("enter the id -1 for exit");
            no=sc.nextInt();
            if(no==-1) break;
            boolean fount=false;
            for(i=0;i<n;i++){
                if(emp[i].eno == no){
                    emp[i].display();
                    fount=true;
                    break;
                }
            }
            if(!fount){
                System.out.println("emp no fount!");
                break;
            }


        }
    }
}