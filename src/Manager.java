public class Manager extends Employee{

    private double bonus = 0;
    public Manager(String name, int salary)
    {
        super(name, salary);
    }

    public Manager(String name, int salary, int year, int month, int day)
    {
        super(name, salary, year, month, day);
    }

    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }

    public double getBonus()
    {
        return this.bonus;
    }

    @Override
    public String toString()
    {
        return "Employee[name=" + super.getName() + ",salary=" + super.getSalary() + ",hireDay=" + super.getHireDay() + "]";
    }
}
