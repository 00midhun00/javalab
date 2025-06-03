class Person{
    String name;
    String gender;
    String address;
    int age;

    Person(String name,String gender,String address,int age){
        this.name=name;
        this.gender=gender;
        this.address=address;
        this.age=age;
    }
}

class Employee extends Person{
    int empid;
    String companyname;
    String qualification;
    double salary;

    Employee(String name,String gender,String address,int age,int empid,String companyname,String qualification,double salary){
        super(name,gender,address,age);
        this.empid=empid;
        this.companyname=companyname;
        this.qualification=qualification;
        this.salary=salary;
    }
}

class Teacher extends Employee{
    String sub;
    String dept;
    int tid;

    Teacher(String name,String gender,String address,int age,int empid,String companyname,String qualification,double salary,String sub,String dept,int tid){
        super(name,gender,address,age,empid,companyname,qualification,salary);
        this.sub=sub;
        this.dept=dept;
        this.tid=tid;

    }

    void display(){
        System.out.println("name:"+name);
        System.out.println("gender:"+gender);
        System.out.println("address:"+address);
        System.out.println("age:"+age);
        System.out.println("empid:"+empid);
        System.out.println("companyname:"+companyname);
        System.out.println("qualification:"+qualification);
        System.out.println("salary:"+salary);
        System.out.println("sub:"+sub);
        System.out.println("dept:"+dept);
        System.out.println("tid"+tid);
    }
}

class prgrm12{
    public static void main(String args[]){
        Teacher t[]=new Teacher[2];

        t[0]=new Teacher("midhun","male","vatoli",30,123,"dark","social",17218,"math","cs",21212);
        t[1]=new Teacher("midh","male","vatoli",30,123,"dark","social",17218,"math","cs",21212);

        t[0].display();
        t[1].display();

    }
}