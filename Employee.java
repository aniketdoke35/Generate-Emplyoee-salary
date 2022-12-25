public abstract class Employee{
    // fileds
    
    private int employeeId;
    private String firstName;
    private String lastName;

    //Default controctor 
    public Employee(){

    }

 /**
  * parameter controctor
  * @param employeeId
  * @param firstName
  * @param lastName
  */

    public Employee(int employeeId, String firstName , String lastName){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        
    }

    //getter method 
    public int getEmployeeId(){
        return employeeId;
    }

    public String getfirstName(){
          return firstName;
    }
    public String getlastName(){
        return lastName;
    }

    //setter methods
    
    public void setEmployeeId(int id){
        this.employeeId = id;
    }

    public void setfirstName(String name){
        this.firstName = name;
    }

    public void setlastName(String name){
        this.lastName = name;
    }
    //abstrct method
    /**
     * function to calculate  salary  of  an  employee  all the child class 
     * must override this function 
     * @return salary 
     */
     
    public abstract double calculateSalary(); 
  
    @Override
    public String toString() {
        return String.format("%-20s %d%n", "Emplyoee ID:" , employeeId) + 
        String.format("%-20s %s%n" , "Emplyoee Name: " , firstName + " " + lastName);
          
    }

}

