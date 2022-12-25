public class comissionEmployee extends Employee {
    private double comissionRate;
    private Double baseSalary;
    private double TotalSales;

    public comissionEmployee(){
         super(); 
    } 

    public comissionEmployee(int employeeId, String firstName, String lastName , double rate , double baseSalary , double TotalSales){
         super(employeeId , firstName , lastName);
         comissionRate = rate;
         this.baseSalary = baseSalary;
         this.TotalSales = TotalSales; 

    }
        //getter method 
        public double getComissionRate(){
            return comissionRate;
        }

        public double getBaseSalary(){
            return this.baseSalary; 
        }

        public double getSales() {
            return TotalSales;
        }

        //setter method 
        public void setcomissionRate(double rate){
            this.comissionRate = rate; 
        }

        public void setBaseSalary(double salary){
            this.baseSalary = salary;
        }
        public void getSales(double Sales){
            this.TotalSales = Sales;
        }

        public double calculatecomission()
        {
             return TotalSales * comissionRate;
        }
        /**
     * function to calculate  salary  of  an  employee  all the child class 
     * must override this function 
     * @return salary 
     */

public double calculateSalary(){
    return calculatecomission() + baseSalary; 
}
  
    @Override
    public String toString() {
        return super.toString() + 
        String.format("%-20s %.2f%n", "salary:",calculateSalary());
          
    }
    
}
