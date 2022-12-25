public class Tester {
    public  static void main(String[] args) {
        //create an aaray of object
        Employee employees [] = new Employee[3];

        employees[0] = new Hourlyemployee(1 , "Hitesh", "Surve",45 , 19.95 );
        employees[1] = new salariedemployee(2, "Om" , "Ingale" , 7000);
        employees[2] = new comissionEmployee(3 , "Ram" , " Raut" , 0.5 , 1500, 100000);


        //now we call the tostring to display the details 
        for( int i=0; i<employees.length; i++){
            System.out.println(employees[i]);
            System.out.println("\n");
        }
    }
    
}
