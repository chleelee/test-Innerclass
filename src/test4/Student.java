package test4;

public class Student {
    private String name;
    private int age;

    public Student(){
    }

    public Student(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        System.out.println(
                "看看我执行的命令："
        );
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
