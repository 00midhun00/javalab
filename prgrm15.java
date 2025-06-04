import java.util.Scanner;
interface shape{
    double area();
    double perimeter();
}

class circle implements shape{
    double r;
    circle(double r){
        this.r=r;
    }

   public double area(){
        return Math.PI*r*r;
    }

   public double perimeter(){
        return 2*Math.PI*r;
    }
}


class rect implements shape{
    double l,w;
    rect(double l,double w){
        this.l=l;
        this.w=w;
    }

  public  double area(){
        return l*w;
    }
  public  double perimeter(){
        return 2*(l+w);
    }
}

class prgrm15{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int cho;

        while(true){
            System.out.println("enter the option:");
            System.out.println("1)calc area peri of circ \n2)calc area and peri of rect \n3)exit");
            cho=s.nextInt();

            switch(cho){
                case 1: 
              
                System.out.println("enter the r:");
                double r=s.nextDouble();
                circle c=new circle(r);
                System.out.println("area of cir:"+c.area());
                System.out.println("peri of circle:"+c.perimeter());
                break;

                case 2:
                
                System.out.println("enter the l:");
                double l=s.nextDouble();
                System.out.println("enter the w:");
                double w=s.nextDouble();
                rect re=new rect(l,w);
                System.out.println("area of rect"+re.area());
                System.out.println("peri of rect:"+re.perimeter());
                break;
                case 3:
                    System.out.println("exiting..........");
                    return;
                default:
                    System.out.println("invalid option!");
            }
        }

    }
}