import java.util.Date;
import java.util.GregorianCalendar;

public class Employee implements Cloneable{
    private String name;
    private double salary;
    private Date hireDay;
    public Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
        hireDay = new Date();
    }

    public Employee(String name, double salary, int year, int month, int day)
    {
        this(name, salary);
        setHireDay(year, month, day);
    }

    public Employee clone() throws CloneNotSupportedException
    {
        Employee cloned = (Employee) super.clone();
        cloned.hireDay = (Date) hireDay.clone();
        return cloned;
    }

    public void setHireDay(int year, int month, int day)
    {
        Date newHireDay = new GregorianCalendar(year, month-1, day).getTime();
        hireDay.setTime(newHireDay.getTime());
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public String getName()
    {
        return this.name;
    }

    public double getSalary()
    {
        return this.salary;
    }

    public Date getHireDay()
    {
        return this.getHireDay();
    }

    @Override
    public String toString()
    {
        return "Employee[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";
    }

    public static void main(String[] args) {
        Employee a = new Employee("hh",1);
        a.setHireDay(2022,12,8);
        System.out.println(a);
    }
}
