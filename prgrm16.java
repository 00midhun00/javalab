import java.util.*;

interface Bill{
    void calculate();
}

class product implements Bill{
    int pid;
    String pname;
    int quantity;
    float unitprice;
    float total;

    void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the product id:");
        pid=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the product name:");
        pname=sc.nextLine();
        System.out.println("enter the quantity:");
        quantity=sc.nextInt();
        System.out.println("enter unitprice:");
        unitprice=sc.nextFloat();
    
    }    
        public void calculate(){
            total=quantity * unitprice;
        }
        void display(){
            System.out.println(pid+"\t"+pname+"\t"+quantity+"\t"+unitprice+"\t"+total);
        }

        float gtotal(){
            return total;
        }
    
    

}

public class prgrm16{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int netamt=0;
        System.out.println("enter the order no:");
        int orderno=sc.nextInt();
        System.out.println("enter the no of products:");
        int n=sc.nextInt();
        product p[]=new product[n];
        System.out.println("enter the product details!");
        for(int i=0;i<n;i++){
            p[i]=new product();
            p[i].getdata();
            p[i].calculate();
            netamt += p[i].gtotal();
            System.out.println();
        }

        System.out.println("orderno: "+orderno);
        System.out.println("date: "+java.time.LocalDate.now());
        System.out.println("product\tname\tquantity\tunit\tpricetotal");
        for(product pr:p){
            pr.display();
        }

        System.out.println("netamount: "+netamt);

    }
}