/*
1. 假如我们在开发一个系统时需要对员工进行建模，员工包含3个属性：姓名、工号以及工资。
经理也是员工，除了含有员工的属性外，另外还有一个奖金属性。
请使用继承的思想设计出员工类和经理类。要求类中提供必要的方法进行属性访问。
*/
package experiment;

class Stuff {//员工类
    private String name, jobNumber;
    private int salary;

    public Stuff() {
        this.name = "null";
        this.jobNumber = "null";
        this.salary = 0;
    }

    public Stuff(String name, String jobNumber, int salary) {
        this.name = name;
        this.jobNumber = jobNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public int getSalary() {
        return salary;
    }
}

class Manager extends Stuff {//经理类
    private int bonus;

    public Manager() {
        super();
        bonus = 0;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }
}

public class my_5_1 {
}
