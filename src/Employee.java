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
        listEmployee[0] = new Employee("Иванов Иван Иванович", 3, 45_513f);
        listEmployee[1] = new Employee("Петров Пётр Петрович", 5, 39_034f);
        listEmployee[2] = new Employee("Семёнов Семён Семёнович", 3, 33_021f);
        listEmployee[3] = new Employee("Сидоров Игорь Артёмович", 4, 75_000f);
        listEmployee[4] = new Employee("Смирнов Альберт Генадьевич", 5, 99_199f);
        listEmployee[5] = new Employee("Распутин Владимир Владимирович", 1, 164_000f);
        listEmployee[6] = new Employee("Туркин Иван Павлович", 4, 32_432f);
        listEmployee[7] = new Employee("Буркова Наталья Ивановна", 4, 63_333f);
        listEmployee[8] = new Employee("Михалкова Ольга Петровна", 2, 130_000f);
        listEmployee[9] = new Employee("Рубенштерн Антон Григорьевич", 2, 100_000f);

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

        getSalaryIndexing(listEmployee);

        System.out.println("==========================================================================================");

        getMinSalaryInDepartment(listEmployee);

        System.out.println("==========================================================================================");

        getMaxSalaryInDepartment(listEmployee);

        System.out.println("==========================================================================================");

        getTotalSalaryInDepartment(listEmployee);

        System.out.println("==========================================================================================");

        getAverageSalaryInDepartment(listEmployee);

        System.out.println("==========================================================================================");


        getDepartmentEmployees(listEmployee);

        System.out.println("==========================================================================================");

        getMinSalaryEmployee(listEmployee);

        System.out.println("==========================================================================================");

        getMaxSalaryEmployee(listEmployee);

        System.out.println("==========================================================================================");

        getSalaryIndexingInDepartment(listEmployee);

        System.out.println("==========================================================================================");

    }

    private static void getMaxSalaryEmployee(Employee[] listEmployee) {
        float maxSalaryEmployee = 75_000f;
        for (Employee item : listEmployee) {
            if (item.salary >= maxSalaryEmployee) {
                System.out.println("Зарплата сотрудника " + item.fio + " больше (равна) " + maxSalaryEmployee + "рублей, и составляет " + item.salary + " рублей!");
            }
        }
    }

    private static void getMinSalaryEmployee(Employee[] listEmployee) {
        float minSalaryEmployee = 56_500f;
        for (Employee item : listEmployee) {
            if (item.salary < minSalaryEmployee) {
                System.out.println("Зарплата сотрудника " + item.fio + " меньше " + minSalaryEmployee + "рублей, и составляет " + item.salary + " рублей!");
            }
        }
    }

    private static void getDepartmentEmployees(Employee[] listEmployee) {
        int numberDepartment = 4;
        System.out.println("Отдел №" + numberDepartment);
        for (Employee item : listEmployee) {
            if (item.department == numberDepartment) {
                System.out.println("Сотрудник: " + item.fio + " | Зароботная плата: " + item.salary + " | id: " + item.id);
            }
        }
    }

    private static void getSalaryIndexingInDepartment(Employee[] listEmployee) {
        int salaryIndexingInDepartment = 10;
        int numberDepartment = 2;
        System.out.println("Индексация отдела №" + numberDepartment);
        for (Employee item : listEmployee) {
            if (item.department == numberDepartment) {
                item.salary += item.salary / 100 * salaryIndexingInDepartment;
                System.out.println("Зарплата сотрудника " + item.fio + " проиндексированна на " + salaryIndexingInDepartment + "% и составляет " + item.salary + " рублей!");

            }

        }
    }

    private static void getAverageSalaryInDepartment(Employee[] listEmployee) {
        int numberDepartment = 2;
        float totalSalaryInDepartment = 0;
        float averageSalaryInDepartment = 0;
        int i = 0;
        for (Employee item : listEmployee) {
            if (item.department == numberDepartment) {
                totalSalaryInDepartment = totalSalaryInDepartment + item.salary;
                i++;
            }
            averageSalaryInDepartment = totalSalaryInDepartment / i;
        }
        System.out.println("В отделе №" + numberDepartment + " средняя зарплата работника составляет " + averageSalaryInDepartment + " рублей!");
    }

    private static void getTotalSalaryInDepartment(Employee[] listEmployee) {
        int numberDepartment = 2;
        float totalSalaryInDepartment = 0;
        for (Employee item : listEmployee) {
            if (item.department == numberDepartment) {
                totalSalaryInDepartment = totalSalaryInDepartment + item.salary;
            }
        }
        System.out.println("В отделе №" + numberDepartment + " общая сумма зарплат в месяц составляет " + totalSalaryInDepartment + "рублей!");
    }


    private static void getMaxSalaryInDepartment(Employee[] listEmployee) {
        int numberDepartment = 3;
        float maxSalaryInDepartment = 0;
        for (Employee item : listEmployee) {
            if (item.department == numberDepartment && maxSalaryInDepartment == 0) {
                maxSalaryInDepartment = item.salary;
            } else if (item.department == numberDepartment && maxSalaryInDepartment < item.salary) {
                maxSalaryInDepartment = item.salary;
            }
        }
        System.out.println("В отделе №" + numberDepartment + " максимальная зарплата, по всем сотрудникам, составляет: " + maxSalaryInDepartment);
    }


    private static void getMinSalaryInDepartment(Employee[] listEmployee) {
        int numberDepartment = 3;
        float minSalaryInDepartment = 0;
        for (Employee item : listEmployee) {
            if (item.department == numberDepartment && minSalaryInDepartment < item.salary) {
                minSalaryInDepartment = item.salary;
            } else if (minSalaryInDepartment > item.salary) {
                minSalaryInDepartment = item.salary;
            }
        }
        System.out.println("В отделе №" + numberDepartment + " минимальная зарплата, по всем сотрудникам, составляет: " + minSalaryInDepartment);
    }

    private static void getSalaryIndexing(Employee[] listEmployee) {
        int salaryIndexing = 10;
        for (Employee item : listEmployee) {
            item.salary += item.salary / 100 * salaryIndexing;
            System.out.println("После индексации в " + salaryIndexing + "% " + " зарплата сотрудника " + item.fio + " составила " + item.salary + "рублей");
        }
    }

    private static void getAverageSalary(Employee[] listEmployee) {
        int i = 0;
        float averageSalary;
        float totalSalary = 0f;
        for (Employee item : listEmployee) {
            totalSalary = totalSalary + item.salary;
            i++;
        }
        averageSalary = totalSalary / i;
        System.out.println("Средняя зарплата по всем отделам: " + averageSalary);
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
