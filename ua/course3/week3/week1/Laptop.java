package ua.course3.week3.week1;

public class Laptop {

    private String id, model, video;

    public Laptop(String id, String model, String video) {
        this.id = id;
        this.model = model;
        this.video = video;
    }


    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getVideo() {
        return video;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id='" + id + '\'' +
                ", model='" + model + '\'' +
                ", video='" + video + '\'' +
                '}';
    }
}
