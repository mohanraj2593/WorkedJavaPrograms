package OOP3;
class Employee{ //Base Class
    private String Name;
    private double Salary;
    Employee(String n,double s){
        Name=n;
        Salary=s;
    }
    Employee(){
        Name="";
        Salary=0.0;
    }
    String getName(){
        return Name;
    }
    void setName(String n){
        Name=n;
    }
    double getSalary(){
        return Salary;
    }
    void setSalary(double S){
        Salary=S;

    }
    void raiseSalary(double percent){//Overriding
        Salary+=Salary*percent/100;

    }

}
class Manager extends Employee{ //Child Class
    double Bonus;
    Manager(String n,double s,double b){
        super(n,s);
        //Name=n;
       //Salary=s;
        Bonus=b;
    }
    void setBonus(double b){
        Bonus=b;

    }
    double getSalary(){
        return super.getSalary()+Bonus;

    }

}









public class prg24Inheritance {

    public static void main(String[] args) {
        Employee e1 = new Employee("vicky",35000);
        System.out.println("current Salary:"+e1.getSalary());
        e1.raiseSalary(10);
        System.out.println("Raised Salary:"+e1.getSalary());
        Manager m1 = new Manager("dhamo",65000.0,0.0);
        m1.setBonus(20000);
        System.out.println("m1 Salary:"+m1.getSalary());
        Employee e2=new Manager("Harish",68000.0,0.0);//polimorphism-parent and base class access,but act manger to aceess manager salary
                           //Is-A RelationShip
                             //Parent Class inside Child Class
        //Manager are Employee but,All Employee not Manager
//        Manager m2=new Employee("surya",10000.0,0.0);
        //int[] arr=new int[10];
        Employee[] employees = new Employee[4];
        employees[0]=new Employee("ram",35000);
        employees[1]=new Employee("Harish",37000);
        employees[2]=new Employee("Sriram",39000);
        employees[3]=m1;
        employees[3].setSalary(75000);
//        employees[3].setBonus(1000.0);
        for(Employee e:employees){
            System.out.println(e.getName()+" "+e.getSalary());

        }

    }
}
