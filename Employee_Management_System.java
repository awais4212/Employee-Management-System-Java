import java.util.Scanner;
class Employe{

    Scanner input = new Scanner(System.in);

    private String E_Name;
    private int Eid;
    private String department;
    private int Salary;
    private int annual_salary;


    public void Employee_Get_Detail(){

        System.out.println("Enter The Name of the Employee");
        E_Name = input.nextLine();

        System.out.println("Enter The Employee ID");
        Eid = input.nextInt();
        input.nextLine();

        System.out.println("Enter The Department OF The Employee");
        department = input.nextLine();


        System.out.println("Enter Your Salary $");
        Salary = input.nextInt();

    }

    public void Annual_salary(){
        annual_salary = Salary*12;
        System.out.println("The Annual Salary of "+ E_Name + " is " + annual_salary + " $");
    }

    public void Update_Salary(int updated_salary){
        Salary += updated_salary;
        System.out.println("Salary Updated of " + E_Name);
    }

    public void Show_Data(){

        System.out.println("-------------------------------------------------");
        System.out.println("   WELCOME TO THE EMPLOYEE MANAGEMENT SYSTEM");
        System.out.println("-------------------------------------------------");

        System.out.println("The Employee Name is: " + E_Name);
        System.out.println("The Employee ID is: " + Eid );
        System.out.println("The Employee Department is: " + department);
        System.out.println("The Employee Salary is " + Salary + " $");
        System.out.println("The Annual Salary of Employee: " + annual_salary + " $");
    }

}




public class Employee_Management_System {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("---------------------------------------------------");
        System.out.println("     Welcome To The Employee Management System     ");
        System.out.println("---------------------------------------------------");
        System.out.println();


        Employe Awais = new Employe();


        int user_choice;
        while (true){

            System.out.println(" -------------------------------------");
            System.out.println("|                 Menu                |");
            System.out.println(" ______________________________________");
            System.out.println("|     1- Input Detail of Employee     |");
            System.out.println("|     2- Calculate Annual Salary      |");
            System.out.println("|     3- Update Salary of An Employee |");
            System.out.println("|     4- Show the Detail of Employee  |");
            System.out.println("|_____________________________________|");

            System.out.println("Press The Number to enter in the Function (Press 0 To Exit)");
            user_choice = input.nextInt();
            input.nextLine();
            if(user_choice == 0){
                System.out.println("Exiting Good Bye!....");
                break;
            }
            switch(user_choice){

                case 1:
                    Awais.Employee_Get_Detail();
                    break;

                case 2:
                    Awais.Annual_salary();
                    break;

                case 3:
                    System.out.println("Enter The Updated Salary");
                    int updated_salary = input.nextInt();
                    input.nextLine();
                    Awais.Update_Salary(updated_salary);
                    break;

                case 4:
                    Awais.Show_Data();
                    break;

            }

        }

    }
}