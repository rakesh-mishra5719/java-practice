class employee{
    //instance variables
    String emp_name;
    int emp_id;
    double emp_salary;
    
}




public class Emp{
    public static void main(String[] args) {
        employee ram = new employee();
        ram.emp_name = "rakesh";
        ram.emp_id = 13133;
        ram.emp_salary = 242442.22;
        System.out.println("name" + ram.emp_name);
        System.out.println("id" + ram.emp_id);
        System.out.println("id" + ram.salary);

    }
}