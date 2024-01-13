package experiment.e7;

public class my_7_1 {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setAge(-10);
        } catch (MyException e) {
            System.out.println("发生了自定义异常：" + e.getMessage());
        }
        System.out.println("年龄为：" + person.getAge());
    }
}

