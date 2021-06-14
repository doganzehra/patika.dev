public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        double tax = 0;
        if (salary > 1000) {
            tax = this.salary * 0.03;
        }
        return tax;
    }

    public double bonus() {
        double bonus = 0;
        int perHour = 30;
        bonus = this.workHours * 30;
        return bonus;
    }

    public double raiseSalary() {
        double raise = 0;
        int workYear = 2021 - this.hireYear;
        if (workYear < 10) {
            raise = this.salary * 0.05;

        }else if (workYear > 9 && workYear < 20) {
            raise = this.salary * 0.10;
        } else if (workYear > 19) {
            raise = this.salary * 0.15;
        }
        return raise;
    }


    public void toStringInfos() {
        System.out.println("Employee " + "\n" +
                "name='" + name  + "\n" +
                ", salary=" + salary + "\n" +
                ", workHours=" + workHours + "\n" +
                ", hireYear=" + hireYear + "\n" +
                ", tax=" + this.tax() + "\n" +
                ", bonus=" + this.bonus() + "\n" +
                ", raise=" + this.raiseSalary() + "\n" +
                ", salary with tax and bonus=" + (this.salary + this.bonus() - this.tax()) +  "\n" +
                ", total salary=" + (this.salary + this.raiseSalary() + this.bonus() - this.tax()) + "\n"
                );
    }
}


