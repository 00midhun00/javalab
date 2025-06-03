import java.util.Scanner;
class Emp{
    int empid;
    String ename;
    int salary;
    String address;

    Emp(int empid,String ename,int salary,String address){
        this.empid=empid;
        this.ename=ename;
        this.salary=salary;
        this.address=address;
    }

    void display(){
        System.out.println("empid:"+this.empid);
        System.out.println("ename:"+this.ename);
        System.out.println("slary:"+this.salary);
        System.out.println("address:"+this.address);
    }

}

 class Teacher extends Emp{
        String dept;
        String sub;

        Teacher(int empid,String ename,int salary,String address,String dept,String sub){
            super(empid,ename,salary,address);
            this.dept=dept;
            this.sub=sub;

        }

        void display(){
            super.display();
            System.out.println("dept:"+this.dept);
            System.out.println("sub:"+this.sub);
        }
    }

    


class empin{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.println("enter the no of teachers:");
        n=sc.nextInt();
        Teacher t[]=new Teacher[n];
        for(i=0;i<n;i++){
            System.out.println("enter id");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.println("enter the name:");
            String name=sc.nextLine();
            System.out.println("enter the salary:");
            int sal=sc.nextInt();
            sc.nextLine();
            System.out.println("enter the adress:");
            String addr=sc.nextLine();
            System.out.println("enter the dept:");
            String dept=sc.nextLine();
            System.out.println("enter the sub:");
            String sub=sc.nextLine();

            t[i]=new Teacher(id,name,sal,addr,dept,sub);

        }

        System.out.println("taechers are...........");
        for(i=0;i<n;i++){
            t[i].display();
        }

        
    }
}