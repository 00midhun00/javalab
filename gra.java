import Graphics.area;

public class gra{
    public static void main(String args[]){
        area a=new area();
        System.out.println("area of rectangle:"+a.rect(5,6));
        System.out.println("area of triangle:"+a.tri(6.0,5.0));
        System.out.println("area of square:"+a.sqr(7));
        System.out.println("area of circle:"+a.cir(6.0));
    }
}