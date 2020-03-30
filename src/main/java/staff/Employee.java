package staff;

public class Employee {

    private String name;
    private String niMNumber;
    private double salary;

    public Employee(String name, String niMNumber, double salary){
        this.name = name;
        this.niMNumber = niMNumber;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getNiMNumber() {
        return niMNumber;
    }

//    public void setNiMNumber(String niMNumber) {
//        this.niMNumber = niMNumber;
//    }

    public double getSalary() {
        return salary;
    }

//    public void setSalary(double salary) {
//        this.salary = salary;
//    }

    public void raiseSalary(double raiseAmount){
        this.salary += raiseAmount;
      }

      public double payBonus(){
        return this.salary * 1 /100;
      }

}
