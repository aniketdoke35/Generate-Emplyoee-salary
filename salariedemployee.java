public class salariedemployee extends Employee{


    private double baseSalary;
    public salariedemployee(){
    super();

    } 
/**
 * intilaize salaried Employee from given  parameters.
 * @param employeeId
 * @param firstName
 * @param lastName
 * @param salary
 */
    public salariedemployee(int employeeId, String firstName , String lastName , double salary){
        super(employeeId , firstName , lastName);
        baseSalary = salary;
    }


    public void setBaseSalary(double salary){
        this.baseSalary = salary; 
    }
        /**
     * function to calculate  salary  of  an  employee  all the child class 
     * must override this function 
     * @return salary 
     */

public double calculateSalary(){
    return baseSalary;
}
  
    @Override
    public String toString() {
        return super.toString()+ 
        String.format("%-20s %.2f%n", "salary:",calculateSalary());
          
    }
}
