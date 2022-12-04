public class Room {
    private String type;
    private double area;

    public Room(String type, double area) {
        this.type = type;
        if (area == 0) this.area = 0;
        this.area = area;
    }

    public Room(Room other) {
        this.area = other.getArea();
        this.type = other.getType();
    }

    public String getType() {
        return type;
    }

    public double getArea() {
        return area;
    }

    public void setType(String name) {
        this.type = name;
    }

    public String toString() {
        return "Room type: " + getType() + ", Area: " + getArea() ;
    }
}
