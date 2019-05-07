package ua.Course2.week3.Comparable;

class House implements Comparable<House> {

    int cost;
    int area;
    String name;
    String room;

    public House(int cost, int area, String name, String room) {
        this.cost = cost;
        this.area = area;
        this.name = name;
        this.room = room;
    }

    @Override
    public String toString() {
        return "House{" +
                "cost=" + cost +
                ", area=" + area +
                ", name='" + name + '\'' +
                ", room='" + room + '\'' +
                '}';
    }

    @Override
    public int compareTo(House anotherHouse) {
        if (this.cost == anotherHouse.cost) {
            return 0;
        } else if (this.cost > anotherHouse.cost) {
            return 1;
        } else {
            return -1;
        }
    }
}
