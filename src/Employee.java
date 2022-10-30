public class Employee {

    public String fio;
    public int department;
    public float salary;
    public int id;
    public static int counter = 1;

    public Employee(String fio, int department, float salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        this.id = counter;
        ++counter;
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

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Сотрудник: " + this.fio + " / Отдел: " + this.department + " / Зароботная плата: " + this.salary + " / id: " + this.id;
    }


}
