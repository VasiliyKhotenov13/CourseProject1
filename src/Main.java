public class Main {
    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();

        System.out.println(employeeBook.getListEmployee()[4].toString());
        System.out.println(employeeBook.getListEmployee()[6].toString());
        System.out.println(employeeBook.getListEmployee()[2].toString());

        System.out.println();

        employeeBook.getTotalSalary();

        System.out.println();

        employeeBook.getMinSalary();

        System.out.println();

        employeeBook.getMaxSalary();

        System.out.println();

        employeeBook.getAverageSalary();

        System.out.println();

        System.out.println("ВЫВОД ВСЕХ СОТРУДНИКОВ НА ЭКРАН!");
        System.out.println("==========================================================================================");
        employeeBook.getAllEmployee();

        employeeBook.getSalaryIndexing();

        System.out.println("==========================================================================================");

        employeeBook.getMinSalaryInDepartment();

        System.out.println("==========================================================================================");

        employeeBook.getMaxSalaryInDepartment();

        System.out.println("==========================================================================================");

        employeeBook.getTotalSalaryInDepartment();

        System.out.println("==========================================================================================");

        employeeBook.getAverageSalaryInDepartment();

        System.out.println("==========================================================================================");


        employeeBook.getDepartmentEmployees();

        System.out.println("==========================================================================================");

        employeeBook.getMinSalaryEmployee();

        System.out.println("==========================================================================================");

        employeeBook.getMaxSalaryEmployee();

        System.out.println("==========================================================================================");

        employeeBook.getSalaryIndexingInDepartment();

        System.out.println("==========================================================================================");

        Employee newEmployee = new Employee("Тест1", 1, 123_123f);
        employeeBook.addEmployee(newEmployee);
        employeeBook.getAllEmployee();

        System.out.println("==========================================================================================");

        employeeBook.deleteEmployee(11);
        employeeBook.getAllEmployee();

        System.out.println("==========================================================================================");

        employeeBook.changeSalary("Михалкова Ольга Петровна", 163000f);
        employeeBook.getAllEmployee();

        System.out.println("==========================================================================================");

        employeeBook.changeDepartment("Михалкова Ольга Петровна", 3);
        employeeBook.getAllEmployee();

        employeeBook.listOfDepartments(3);
    }


}
