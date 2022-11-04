package CurseWork;

public class Main {
    public static void main(String[] args) {
        Employee[] workers = new Employee[10];
        workers[0] = new Employee("Анисимов Тимофей Арсентьевич", 15000, "1");
        workers[1] = new Employee("Кузина Елизавета Владиславовна", 20000, "1");
        workers[2] = new Employee("Семенова Ульяна Святославовна", 25000, "2");
        workers[3] = new Employee("Цветков Илья Дмитриевич", 30000, "2");
        workers[4] = new Employee("Архипов Евгений Маркович", 35000, "3");
        workers[5] = new Employee("Малышев Андрей Ильич", 37500, "3");
        workers[6] = new Employee("Смирнов Кирилл Даниилович", 40000, "4");
        workers[7] = new Employee("Киселев Адам Артёмович", 42500, "4");
        workers[8] = new Employee("Кононова Василиса Артёмовна", 45000, "5");
        workers[9] = new Employee("Серов Роман Ильич", 50000, "5");

        for (int i = 0; i < workers.length; i++) {
            System.out.println(workers[i]);
        }
        System.out.println("\nСумма всех зарплат сотрудников за месяц:" + sumSalary(workers) + " ₽");
        System.out.println("Сотрудник с минимальной зарплатой: " + workerWitgMinSalary(workers));
        System.out.println("Сотрудник с максимальной зарплатой: " + workerWithMaxSalary(workers));
        System.out.println("Средняя зарплата сотрудников за месяц составляет: " + sumSalary(workers) / workers.length + " ₽\n");
        printNamesEmployee(workers);
    }

    public static int sumSalary(Employee[] workers) {
        int sum = 0;
        for (Employee worker : workers) {
            if (worker != null) {
                sum += worker.getSalary();
            }
        }
        return sum;
    }

    public static Employee workerWitgMinSalary(Employee[] workers) {
        Employee workerMin = workers[0];
        for (Employee worker : workers) {
            if (worker != null) {
                if (worker.getSalary() < workerMin.getSalary()) {
                    workerMin = worker;
                }
            }
        }
        return workerMin;
    }

    public static Employee workerWithMaxSalary(Employee[] workers) {
        Employee workerMin = workers[0];
        for (Employee worker : workers) {
            if (worker != null) {
                if (worker.getSalary() > workerMin.getSalary()) {
                    workerMin = worker;
                }
            }
        }
        return workerMin;
    }

    public static void printNamesEmployee(Employee[] workers) {
        for (Employee worker : workers) {
            if (worker != null) {
                System.out.println(worker.getFullName());
            }
        }
    }
}




