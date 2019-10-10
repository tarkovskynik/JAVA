package ua.course3.design_patterns.builder;

public class TestBuilder {

    public static void main(String[] args) {
        ComplexObject.ComplexObjectBuilder builder = new ComplexObject.ComplexObjectBuilder();
        // вот в чем красота патерна билдер что можно через точку вызывать новый метод и добавлять из-за того что мы возвращаем this !

        // builder - гнучке створення обьекту ( когда ты не знаешь всей информации и членый команды добавляют по частям)

        ComplexObject complexObject = builder.appendAge(34).
                appendLocation("Kiev")
                .appendName("Oleg")
                .appendSalary(233.23)
                .build();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("a").append(" ").append("Nik").toString(); // Джавовский Билдер
    }
}
