public class Apartment {
    private String family;
    private int flat;
    private Room firstRoom, secondRoom, thirdRoom;
    private int numOfRooms;

    public Apartment(String name, int flat) {
        this.family = name;
        if (flat < 0) this.flat = 0;
        this.flat = flat;

        Room firstRoom = new Room(null),
                secondRoom = new Room(null),
                thirdRoom = new Room(null);
        this.numOfRooms = 0;
    }

    public String getFamily() {
        return family;
    }

    public int getFlat() {
        return flat;
    }
  /*public Room getRoomByType(String type){
         Room r1= new Room(type , r1.getArea());
      return  Room r1.setType("null");
    }*/

    public int getNumOfRooms() {
        return numOfRooms;
    }

      public void setRoom (Room r){
    r = new Room(r);  }
    public double getTotalArea() {
        return firstRoom.getArea() + secondRoom.getArea() + thirdRoom.getArea();
    }

    public String toString() {
        return getFamily() + "'s apartment , flat " + getFlat() + "has" + getNumOfRooms() + "rooms" + "\n";
    }

}
