class areao{
    //CIRCLE
    public double area(double r){
        return Math.PI*r*r;
    }
    //RECT
    public int area(int l,int w){
        return l*w;
    }
    //TRIANGLE
    public double area(double b,double h){
        return 0.5*b*h ;  
        }

    public int area(int s){
        return s*s;
    }

    
}

class areaov{
public static void main(String args[]){

    areao a=new areao();
    System.out.println("area of cir(0.5)="+a.area(0.5));
    System.out.println("area of rect(3,4)="+a.area(3,4));
    System.out.println("area of tri(8,9)="+a.area(8.0,9.0));
    System.out.println("area of cir(5)="+a.area(5));
    
    }
}   