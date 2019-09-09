package staff;

public abstract class Employee {

   private String name;
   private String nationalInsuranceNumber;
   private double salary;

   public Employee(String name, String nationalInsuranceNumber, double salary){
       this.name = name;
       this.nationalInsuranceNumber = nationalInsuranceNumber;
       this.salary = salary;
   }
    public String getName() {
        return name;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double amount){
       if(amount < 0)
           throw new IllegalArgumentException("Salary must be a positive value");
       this.salary += amount;
    }

    public double payBonus(){
       return this.salary * 0.01;
    }
}
