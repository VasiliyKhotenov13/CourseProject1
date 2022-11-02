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

        employeeBook.getSalaryIndexing(10);

        System.out.println("==========================================================================================");

        employeeBook.getMinSalaryInDepartment(2);

        System.out.println("==========================================================================================");

        employeeBook.getMaxSalaryInDepartment(2);

        System.out.println("==========================================================================================");

        employeeBook.getTotalSalaryInDepartment(2);

        System.out.println("==========================================================================================");

        employeeBook.getAverageSalaryInDepartment(2);

        System.out.println("==========================================================================================");


        employeeBook.getDepartmentEmployees(4);

        System.out.println("==========================================================================================");

        employeeBook.getMinSalaryEmployee(56500);

        System.out.println("==========================================================================================");

        employeeBook.getMaxSalaryEmployee(75000);

        System.out.println("==========================================================================================");

        employeeBook.getSalaryIndexingInDepartment(10);

        System.out.println("==========================================================================================");

        Employee newEmployee = new Employee("Тест1", 1, 123123);
        employeeBook.addEmployee(newEmployee);
        employeeBook.getAllEmployee();

        System.out.println("==========================================================================================");

        employeeBook.deleteEmployee(11);
        employeeBook.getAllEmployee();

        System.out.println("==========================================================================================");

        employeeBook.changeSalary("Михалкова Ольга Петровна", 163000);
        employeeBook.getAllEmployee();

        System.out.println("==========================================================================================");

        employeeBook.changeDepartment("Михалкова Ольга Петровна", 3);
        employeeBook.getAllEmployee();

        employeeBook.listOfDepartments(3);
    }


}
