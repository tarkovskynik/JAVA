package ua.javaCourseYoutube.les60Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        // для получения доступа к классу для обработки и получения доступа (класс лежит например в библиотеке)
        // Рефлексия позволяет получить доступ ко всем полям методам (заглянуть внутрь класса)

        SomeClass someClass = new SomeClass();
        Class clss = someClass.getClass();
        Class clss2 = SomeClass.class;
        Class clss3 = Class.forName("ua.javaCourseYoutube.les60Reflection.SomeClass");
        SomeClass someClass1 = (SomeClass)clss.newInstance();

        Constructor[] constructors = clss.getDeclaredConstructors();

        for (Constructor constructor : constructors){
            System.out.println(constructor.getName());
          //  Parameter[] parameters = constructor.getParameters();
        }

         Method[] methods = clss.getDeclaredMethods();

        for (Method method : methods){
            System.out.println(method.getName());
        }
    }
}

class SomeClass {

    private static transient int i;
    String s;

    public SomeClass() {
    }

    SomeClass(String s){
        this.s = s;
    }

    public String someMethod(String s) {
        System.out.println("this is" + s);
        return s;
    }

}
