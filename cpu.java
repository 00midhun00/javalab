class cpu{
    int price;
    public cpu(int price){
       this.price=price;
    }
    void display(){
        System.out.println("price="+price);
    }

    class processor{
        int core;
        String manu;
        processor(int core,String manu){
            this.core=core;
            this.manu=manu;
        }
        void display(){
            System.out.println("core="+core+"  manu="+manu);
        }
    }

    static class ram{
        int memory;
        String manu;
        ram(int memory,String manu){
            this.memory=memory;
            this.manu=manu;
        }

        void display(){
            System.out.println("memory="+memory+"  manufacturer="+manu);
        }
    }

    public static void main(String args[]){
        cpu intel=new cpu(200);
        cpu.processor p1=intel.new processor(6,"intel ");
        cpu.ram r1=new ram(7323,"nvidia");
        intel.display();
        p1.display();
        r1.display();
    }
}