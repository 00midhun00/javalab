import java.util.Scanner;
class publisher{
    String pname;
    publisher(String pname){
        this.pname=pname;
    }
}

class book extends publisher{
    String title;
    String author;
    book(String pname,String title,String author){
        super(pname);
        this.title=title;
        this.author=author;
    }
}

class literature extends book{
    literature(String pname,String title,String author){
        super(pname,title,author);
    }
    void display(){
        System.out.println("category:literature");
        System.out.println("title:"+title);
        System.out.println("auther:"+author);
        System.out.println("pname:"+pname);
    }
}
class fiction extends book{
    fiction(String pname,String title,String author){
        super(pname,title,author);
    }
    void display(){
        System.out.println("category:fiction");
        System.out.println("title:"+title);
        System.out.println("auther:"+author);
        System.out.println("pname:"+pname);
    }
}

class prgrm13{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of literature books:");
        int n=sc.nextInt();
        sc.nextLine();
        literature l[]=new literature[n];
        for(int i=0;i<n;i++){
            System.out.println("the literature book "+(i+1));
            System.out.println("enter the pname:");
            String pname=sc.nextLine();
            System.out.println("enter the author:");
            String author=sc.nextLine();
            System.out.println("enter the title:");
            String title=sc.nextLine();
            l[i]=new literature(pname,title,author);
        }


        System.out.println("enter the no of fiction books:");
        n=sc.nextInt();
        sc.nextLine();
        fiction f[]=new fiction[n];

        for(int i=0;i<n;i++){
            System.out.println("the literature book "+(i+1));
            System.out.println("enter the pname:");
            String pname=sc.nextLine();
            System.out.println("enter the author:");
            String author=sc.nextLine();
            System.out.println("enter the title:");
            String title=sc.nextLine();
            f[i]=new fiction(pname,title,author);
        }

        for(literature book: l ){
            book.display();
        }

        for(fiction book: f ){
            book.display();
        }
    }
}