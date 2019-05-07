package ua.course1.oopExample;

//4erteg
public class Bear{
    private String name;
    private int age;


    //constructors
    public Bear(String nameIncome, int ageIncome) {
        this.name = nameIncome;
        this.age = ageIncome;
    }
    //methods aka function
    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

}
