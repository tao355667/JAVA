package experiment.e7;

class Person {
    private String name;
    private int age;

    public void setAge(int age) throws MyException {
        if (age <= 0) {
            throw new MyException("����������0");
        }
        this.age += age;
    }

    public int getAge() {
        return age;
    }
}
