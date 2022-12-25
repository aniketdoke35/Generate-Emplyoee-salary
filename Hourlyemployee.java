public class Hourlyemployee extends Employee {

  private double hoursWorked;
  private double hourlyRate;



  public Hourlyemployee(){
    super();
  }

  /**
   * parameter constructor to instantiate HourlyEmplyoee object 
   * @param employeeId
   * @param firstName
   * @param lastName
   * @param hoursWorked
   * @param hourlyRate
   */

  public Hourlyemployee(int employeeId, String firstName, String lastName, double hoursWorked, double hourlyRate){
    super(employeeId, firstName,lastName);
    this.hoursWorked = hoursWorked;
    this.hourlyRate = hourlyRate ;
  }
  
  
  //getter method fot local variable for this class 
  public double getHoursWorked(){return hoursWorked;}
  public double getHourlyRate(){return hourlyRate;}

  //setter function 
  public void setHoursWorked(double hours) {this.hoursWorked = hours;}
  public void setHourlyRate(double rate) {this.hourlyRate = rate;}

    /**
     * function to calculate  salary  of  an  employee  all the child class 
     * must override this function 
     * @return salary 
     */

public double calculateSalary(){


    double salary = 0;
    double overtime = 0;
    if(hoursWorked > 40){
        double hours =  hoursWorked -40;
        hoursWorked =40;
        overtime = hours * (hourlyRate =1.5);
    }

    salary = hoursWorked * hourlyRate;
    salary += overtime;
     
    return salary;
}
  
    @Override
    public String toString() {
        return super.toString() + 
        String.format("%-20s %.2f%n", "salary:",calculateSalary());
          
    }
}
