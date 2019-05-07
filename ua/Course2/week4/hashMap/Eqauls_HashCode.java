package ua.Course2.week4.hashMap;

public class Eqauls_HashCode {

    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

        String a = "100";
        String b = "100";

        System.out.println(a.equals(b));

        Eqauls_HashCode eqauls_hashCode = new Eqauls_HashCode();
        Eqauls_HashCode eqauls_hashCode1 = new Eqauls_HashCode();

        eqauls_hashCode.setAge(100);
        eqauls_hashCode1.setAge(100);

        a.hashCode();

        System.out.println(a.hashCode());

    }
}