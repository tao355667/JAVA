/*
1. ���������ڿ���һ��ϵͳʱ��Ҫ��Ա�����н�ģ��Ա������3�����ԣ������������Լ����ʡ�
����Ҳ��Ա�������˺���Ա���������⣬���⻹��һ���������ԡ�
��ʹ�ü̳е�˼����Ƴ�Ա����;����ࡣҪ�������ṩ��Ҫ�ķ����������Է��ʡ�
*/
package experiment;

class Stuff {//Ա����
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

class Manager extends Stuff {//������
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
