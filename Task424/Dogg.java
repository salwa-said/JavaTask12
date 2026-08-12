package Task424;

public class Dogg {
    private int age;

    public Dogg() {
        this.age = 0;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age >= 0) {
            this.age = age;
        } else {
            this.age = 0;
            System.out.println("Age cannot be negative.");
        }
    }

}
