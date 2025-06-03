import java.util.*;
import java.io.*;

interface sports{
   public  void s_get();
   public  void s_disp();
}

class student{
    String name;
    int roll;
    int mark;

    student(String name,int roll,int mark){
        this.name=name;
        this.roll=roll;
        this.mark=mark;
    }

    void display(){
        System.out.println("name:"+name);
        System.out.println("roll:"+roll);
        System.out.println("mark:"+mark);
    }
}

class result extends student implements sports{
    int score;
    Scanner sc=new Scanner(System.in);
    result(String name,int roll,int mark){
        super(name,roll,mark);
    }

    public void s_get(){
        System.out.println("enter the sport score:");
        score=sc.nextInt();

    }
    public void s_disp(){
        System.out.println("sport score:"+score);
    }
}

class prgrm14{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the name:");
        String name=s.nextLine();
        System.out.println("enter the roll:");
        int roll=s.nextInt();
        System.out.println("enter the mark:");
        int mark=s.nextInt();

        result re=new result(name,roll,mark);
        re.s_get();
        re.display();
        re.s_disp();
    } 
}