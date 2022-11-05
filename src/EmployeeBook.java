public class EmployeeBook {
    private Employee[] listEmployee;

    public EmployeeBook() {
        createEmployeeList();
    }

    private void createEmployeeList() {

        listEmployee = new Employee[15];
        listEmployee[0] = new Employee("Иванов Иван Иванович", 2, 32_000f);
        listEmployee[1] = new Employee("Петров Пётр Петрович", 5, 39_000f);
        listEmployee[2] = new Employee("Семёнов Семён Семёнович", 2, 33_000f);
        listEmployee[3] = new Employee("Сидоров Игорь Артёмович", 4, 75_000f);
        listEmployee[4] = new Employee("Смирнов Альберт Генадьевич", 5, 99_000f);
        listEmployee[5] = new Employee("Распутин Владимир Владимирович", 1, 160_000f);
        listEmployee[6] = new Employee("Туркин Иван Павлович", 3, 55_000f);
        listEmployee[7] = new Employee("Буркова Наталья Ивановна", 4, 63_000f);
        listEmployee[8] = new Employee("Михалкова Ольга Петровна", 1, 130_000f);
        listEmployee[9] = new Employee("Рубенштерн Антон Григорьевич", 2, 100_000f);
    }

    public Employee[] getListEmployee() {
        return listEmployee;
    }

    public void getMaxSalaryEmployee(float maxSalaryEmployee) {
        for (Employee item : listEmployee) {
            if (item != null) {
                if (item.salary >= maxSalaryEmployee) {
                    System.out.println("Зарплата сотрудника " + item.fio + " больше (равна) " + maxSalaryEmployee + "рублей, и составляет " + item.salary + " рублей!");
                }
            }
        }
    }

    public void getMinSalaryEmployee(float minSalaryEmployee) {
        for (Employee item : listEmployee) {
            if (item != null) {
                if (item.salary < minSalaryEmployee) {
                    System.out.println("Зарплата сотрудника " + item.fio + " меньше " + minSalaryEmployee + "рублей, и составляет " + item.salary + " рублей!");
                }
            }
        }
    }

    public void getDepartmentEmployees(int numberDepartment) {
        System.out.println("Отдел №" + numberDepartment);
        for (Employee item : listEmployee) {
            if (item != null) {
                if (item.department == numberDepartment) {
                    System.out.println("Сотрудник: " + item.fio + " | Зароботная плата: " + item.salary + " | id: " + item.id);
                }
            }
        }
    }

    public void getSalaryIndexingInDepartment(int salaryIndexingInDepartment) {
        int numberDepartment = 2;
        System.out.println("Индексация отдела №" + numberDepartment);
        for (Employee item : listEmployee) {
            if (item != null) {
                if (item.department == numberDepartment) {
                    item.salary += item.salary / 100 * salaryIndexingInDepartment;
                    System.out.println("Зарплата сотрудника " + item.fio + " проиндексированна на " + salaryIndexingInDepartment + "% и составляет " + item.salary + " рублей!");

                }
            }

        }
    }

    public void getAverageSalaryInDepartment(int numberDepartment) {
        float totalSalaryInDepartment = 0;
        float averageSalaryInDepartment = 0;
        int counter = 0;
        for (Employee item : listEmployee) {
            if (item != null) {
                if (item.department == numberDepartment) {
                    totalSalaryInDepartment = totalSalaryInDepartment + item.salary;
                    counter++;
                }
            }
            averageSalaryInDepartment = totalSalaryInDepartment / counter;
        }
        System.out.println("В отделе №" + numberDepartment + " средняя зарплата работника составляет " + averageSalaryInDepartment + " рублей!");
    }

    public void getTotalSalaryInDepartment(int numberDepartment) {
        float totalSalaryInDepartment = 0;
        for (Employee item : listEmployee) {
            if (item != null) {
                if (item.department == numberDepartment) {
                    totalSalaryInDepartment = totalSalaryInDepartment + item.salary;
                }
            }
        }
        System.out.println("В отделе №" + numberDepartment + " общая сумма зарплат в месяц составляет " + totalSalaryInDepartment + "рублей!");
    }

    public void getMaxSalaryInDepartment(int numberDepartment) {
        float maxSalary = 0;
        int item = 0;
        for (; item < listEmployee.length; item++) {
            if (listEmployee[item] != null && numberDepartment == listEmployee[item].getDepartment()) {
                maxSalary = listEmployee[item].getSalary();
                break;
            }

        }
        for (; item < listEmployee.length; item++) {
            if (listEmployee[item] != null && numberDepartment == listEmployee[item].getDepartment() &&
                    maxSalary < listEmployee[item].getSalary()) {
                maxSalary = listEmployee[item].getSalary();
            }
        }
        System.out.println("В отделе №" + numberDepartment +
                "Максимальная зарплата, по всем сотрудникам, составляет: " + maxSalary);
    }

    public void getMinSalaryInDepartment(int numberDepartment) {
        float minSalary = 0;
        int item = 0;
        for (; item < listEmployee.length; item++) {
            if (listEmployee[item] != null && numberDepartment == listEmployee[item].getDepartment()) {
                minSalary = listEmployee[item].getSalary();
                break;
            }

        }
        for (; item < listEmployee.length; item++) {
            if (listEmployee[item] != null && numberDepartment == listEmployee[item].getDepartment() &&
                    minSalary > listEmployee[item].getSalary()) {
                minSalary = listEmployee[item].getSalary();
            }
        }
        System.out.println("В отделе №" + numberDepartment +
                "Минимальная зарплата, по всем сотрудникам, составляет: " + minSalary);
    }


    public void getSalaryIndexing(int salaryIndexing) {
        for (Employee item : listEmployee) {
            if (item != null) {
                item.salary += item.salary / 100 * salaryIndexing;
                System.out.println("После индексации в " + salaryIndexing + "% " + " зарплата сотрудника " + item.fio + " составила " + item.salary + "рублей");
            }
        }
    }

    public void getAverageSalary() {
        int counter = 0;
        float averageSalary;
        float totalSalary = 0f;
        for (Employee item : listEmployee) {
            if (item != null) {
                totalSalary = totalSalary + item.salary;
                counter++;
            }
        }
        averageSalary = totalSalary / counter;
        System.out.println("Средняя зарплата по всем отделам: " + averageSalary);
    }

    public void getMaxSalary() {
        float maxSalary = 0f;
        for (Employee item : listEmployee) {
            if (item != null) {
                if (maxSalary == 0f) {
                    maxSalary = item.salary;
                } else if (maxSalary < item.salary) {
                    maxSalary = item.salary;
                }
            }
        }
        System.out.println("Максимальная зарплата работника: " + maxSalary);
    }

    public void getMinSalary() {
        float minSalary = 0f;
        for (Employee item : listEmployee) {
            if (item != null) {
                if (minSalary == 0f) {
                    minSalary = item.salary;
                } else if (minSalary > item.salary) {
                    minSalary = item.salary;

                }
            }
        }

        System.out.println("Минимальная зарплата работника: " + minSalary);
    }

    public void getAllEmployee() {
        for (Employee item : listEmployee) {
            if (item != null) {
                System.out.println(item);
                System.out.println("==========================================================================================");
            }
        }
    }

    public void getTotalSalary() {
        float totalSalary = 0;
        for (Employee item : listEmployee) {
            if (item != null) {
                totalSalary = totalSalary + item.salary;
            }
        }
        System.out.println("Общая сумма затрат на зарплаты за месяц составляет: " + totalSalary);
    }

    public void addEmployee(Employee employee) {
        for (int i = 0; i < listEmployee.length; i++) {
            if (listEmployee[i] == null) {
                listEmployee[i] = employee;
                break;
            }
        }
    }

    public void deleteEmployee(int id) {
        for (Employee item :
                listEmployee) {
            if (item != null && item.id == id) {
                listEmployee[id - 1] = null;
                break;
            }
        }
    }

    public void changeSalary(String fio, float newSalary) {
        for (Employee item :
                listEmployee) {
            if (item.fio.equals(fio)) {
                Employee tempEmployee = new Employee(item.fio, item.department, newSalary);
                tempEmployee.id = item.id;
                listEmployee[item.id - 1] = tempEmployee;
                break;
            }
        }
    }

    public void changeDepartment(String fio, int newDepartment) {
        for (Employee item :
                listEmployee) {
            if (item.fio.equals(fio)) {
                Employee tempEmployee = new Employee(item.fio, newDepartment, item.salary);
                tempEmployee.id = item.id;
                listEmployee[item.id - 1] = tempEmployee;
                break;
            }
        }
    }

    public void listOfDepartments(int department) {
        for (Employee item :
                listEmployee) {
            if (item != null && item.department == department) {
                System.out.println("Сотрудник отдела №" + item.department + " ФИО:" + item.fio);
            }
        }
    }
}
