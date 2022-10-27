public class Employee {

    private String fio;
    private int department;
    private float salary;
    private final int id;
    private static int counter;

    private Employee(String fio, int department, float salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        this.id = ++counter;
    }

    public String getFio() {
        return this.fio = fio;
    }

    public int getDepartment() {
        return this.department = department;
    }

    public float getSalary() {
        return this.salary = salary;
    }

    public int getId() {
        return this.id;
    }

    public void setDepartment(int d) {
        this.department = d;
    }

    public void setSalary(float s) {
        this.salary = s;
    }

    @Override
    public String toString() {
        return "Сотрудник: " + this.fio + " / Отдел: " + this.department + " / Зароботная плата: " +this.salary+ " / id: " +this.id;
    }

    



    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович", 1, 45513f);
        employees[1] = new Employee("Петров Пётр Петрович", 2, 39034f);
        employees[2] = new Employee("Семёнов Семён Семёнович", 3, 33021f);
        employees[3] = new Employee("Сидоров Игорь Артёмович", 4, 55123f);
        employees[4] = new Employee("Смирнов Альберт Генадьевич", 5, 99199f);

        System.out.println(employees[1].toString());



    }


}
