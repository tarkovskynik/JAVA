package ua.Course2.week3.week3IPhone;

public class IPhone {

    private final String model;
    private final String id;
    private String color;
    private Display display;

    public IPhone(String model, String id, String color, Display display) {
        this.model = model;
        this.id = id;
        this.color = color;
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public String getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public final String hello(){
       return "Hello IPhone";
    }
}
