

public class CompositionTest{
    public static void main(String[] args){


        // create four element Employee array
        Employee[] employees = new Employee[2];

        // initialise array with Employees


        employees[0] = new CommissionEmployee(
                "Sue", "Jones", "333-33-3333", 10000.0f, .06f);
        employees[1] = new BasePlusCommissionEmployee(
                "Bob", "Lewis", "444-44-4444", 5000.0f, .04f, 300.0f);


        System.out.println("Employees processed polymorphically:\n");

        for(Employee currentEmployee : employees){
            System.out.println(currentEmployee);

            // determine whether element is a BasePlusCommissionEmployee
            if(currentEmployee instanceof BasePlusCommissionEmployee){
                // downcase Employee reference to
                // BasePlusCommissionEmployee reference
                BasePlusCommissionEmployee employee =
                        (BasePlusCommissionEmployee) currentEmployee;

                employee.setBaseSalary(1.10f * employee.getBaseSalary());

                System.out.printf("new base salary with 10%% increase is: $%,.2f\n",
                        employee.getBaseSalary());


            }

        }

        // get type name of each object in employee array
        for(int j=0; j<employees.length; j++){
            System.out.printf("Employee %d is a %s\n",
                    j, employees[j].getClass().getName());
        }
    }
}