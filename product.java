class product{
    int pcode;
    String pname;
    int price;

    product(int pcode,String pname,int price){
        this.pcode=pcode;
        this.pname=pname;
        this.price=price;
    }
    public static void main(String args[]){
        product p1=new product(1,"shoe",6000);
        product p2=new product(2,"laptop",3400);
        product p3=new product(3,"bike",943432);

        if(p1.price < p2.price && p1.price < p3.price){
            System.out.println("lowest price is "+p1.price+" product is "+p1.pname);
        }else if(p2.price < p1.price && p2.price < p3.price){
            System.out.println("lowest price is "+p2.price+" product is " +p2.pname);
    
        }else{
            System.out.println("lowest price is "+p3.price+" product is "+p3.pname);

        }
    }
}