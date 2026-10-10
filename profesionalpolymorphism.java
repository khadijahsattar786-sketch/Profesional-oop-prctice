class employee{

    public void calculateSalary(){
        System.out.println("Calclate Eployee Salary");
    }

}
class fulltimeempemployee extends employee{

    public void calculateSalary(){
        System.out.println("Full Time Salary :Rs. 80000");
          }
}
class parttimeemployee extends employee{

    public void calculateSalary(){
         System.out.println("Part Time Salary :Rs. 50000");

    }
}
class contractemployee extends employee{

    public void calculateSalary(){
         System.out.println("Contract Time Salary :Rs. 90000");
    }
}
public class profesionalpolymorphism{
public static void main(String[]args){
    employee e=new employee();
    e=new fulltimeempemployee();
    e.calculateSalary();
    e=new parttimeemployee();
    e.calculateSalary();
    e =new contractemployee();
    e.calculateSalary();


    
}
}