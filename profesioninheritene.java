
class emploee{
    String name;
    int age;
    int salary;

    public void showdetails(){
        System.out.println("Name:"+ name );
        System.out.println("age:" + age);
        System.out.println("Salary:" + salary);
        
    }
}

class manager extends emploee{
    public void showmanager(){
        System.out.println("----Starting the Work----");
    }

}
class develpor extends emploee{

    public void showdevelpor(){
        System.out.println("----Middle the Work----");
    }
}
class head extends emploee{
    public void showhead(){
        System.out.println("----End the Work----");
    }
}
public class profesioninheritene{
    public static void main(String[]args){
        manager m=new manager();
        m.name="awais";
        m.age=25;

        m.salary=50000;
        m.showdetails();
        m.showmanager();

        develpor d=new develpor();
        d.name="khadijah";
        d.age=18;
        d.salary= 50000;
        d.showdetails();
        d.showdevelpor();
        head h=new head();
        h.name="Ahmed";
        h.age=20;
        h.salary=70000;
        h.showdetails();
        h.showhead();
    }
}