package experiment.e7;

public class my_7_1 {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setAge(-10);
        } catch (MyException e) {
            System.out.println("�������Զ����쳣��" + e.getMessage());
        }
        System.out.println("����Ϊ��" + person.getAge());
    }
}

