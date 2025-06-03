class complex{
    int r,i;
    complex(int real,int img){
        this.r=real;
        this.i=img;
    }

    public static complex add(complex c1,complex c2){
        complex tmp=new complex(0,0);
        tmp.r=c1.r+c2.r;
        tmp.i=c1.i+c2.i;
        return tmp;
    }

    void display(){
        System.out.println(this.r+"+i"+this.i);
    }

    public static void main(String args[]){
        complex c1=new complex(1,2);
        complex c2=new complex(1,2);
        complex add=add(c1,c2);
        add.display();
    }
}