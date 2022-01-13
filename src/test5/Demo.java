package test5;

public class Demo {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setName("gouguo");
        s1.setAge(21);
        Student s2 = new Student();
        s2.setName("gouguo");
        s2.setAge(21);

        System.out.println(s1 == s2);

        System.out.println(s1.equals(s2));

    }
}
