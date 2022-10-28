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
        return "Сотрудник: " + this.fio + " / Отдел: " + this.department + " / Зароботная плата: " + this.salary + " / id: " + this.id;
    }


    public static void main(String[] args) {
        Employee[] listEmployee = new Employee[10];
        listEmployee[0] = new Employee("Иванов Иван Иванович", 1, 45513f);
        listEmployee[1] = new Employee("Петров Пётр Петрович", 2, 39034f);
        listEmployee[2] = new Employee("Семёнов Семён Семёнович", 3, 33021f);
        listEmployee[3] = new Employee("Сидоров Игорь Артёмович", 4, 55123f);
        listEmployee[4] = new Employee("Смирнов Альберт Генадьевич", 5, 99199f);
        listEmployee[5] = new Employee("Распутин Владимир Владимирович", 1, 164000.9f);
        listEmployee[6] = new Employee("Туркин Иван Павлович", 3, 32432.5f);
        listEmployee[7] = new Employee("Буркова Наталья Ивановна", 4, 112333.9f);
        listEmployee[8] = new Employee("Михалкова Ольга Петровна", 1, 132000.3f);
        listEmployee[9] = new Employee("Рубенштерн Антон Григорьевич", 2, 78000.8f);

        System.out.println(listEmployee[4].toString());
        System.out.println(listEmployee[6].toString());
        System.out.println(listEmployee[2].toString());

        System.out.println();

        getTotalSalary(listEmployee);

        System.out.println();

        getMinSalary(listEmployee);

        System.out.println();

        getMaxSalary(listEmployee);

        System.out.println();

        getAverageSalary(listEmployee);

        System.out.println();

        System.out.println("ВЫВОД ВСЕХ СОТРУДНИКОВ НА ЭКРАН!");
        System.out.println("==========================================================================================");
        getAllEmployee(listEmployee);


    }

    private static void getAverageSalary(Employee[] listEmployee) {
        float i=0f;
        float averageSalary;
        float totalSalary = 0f;
        for (Employee item : listEmployee) {
            totalSalary = totalSalary + item.salary;
            i++;
        }
        averageSalary = totalSalary / i;
        System.out.println("Средняя зарплата по всем отделам: " +averageSalary);
    }

    private static void getMaxSalary(Employee[] listEmployee) {
        float maxSalary = 0f;
        for (Employee item : listEmployee) {
            if (maxSalary == 0f) {
                maxSalary = item.salary;
            } else if (maxSalary < item.salary) {
                maxSalary = item.salary;
            }
        }
        System.out.println("Максимальная зарплата работника: " + maxSalary);
    }

    private static void getMinSalary(Employee[] listEmployee) {
        float minSalary = 0f;
        for (Employee item : listEmployee) {
            if (minSalary == 0f) {
                minSalary = item.salary;
            } else if (minSalary > item.salary) {
                minSalary = item.salary;
            }
        }
        System.out.println("Минимальная зарплата работника: " + minSalary);
    }

    private static void getAllEmployee(Employee[] listEmployee) {
        for (Employee item : listEmployee) {
            System.out.println(item);
            System.out.println("==========================================================================================");
        }
    }

    private static void getTotalSalary(Employee[] listEmployee) {
        float totalSalary = 0;
        for (Employee item : listEmployee) {
            totalSalary = totalSalary + item.salary;
        }
        System.out.println("Общая сумма затрат на зарплаты за месяц составляет: " + totalSalary);
    }


}
