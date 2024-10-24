package TASK_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(2, 4);
        Room room2 = new Room(6, 10);
        Room room3 = new Room(3, 5);

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building building1 = new Building(rooms, 3);
        System.out.println("number of lamps: " + countLampsInBuilding(building1));
        System.out.println("number of windows: " + countWindowsInBuilding(building1));
        System.out.println("number of rooms in the building: " + countRoomsInBuilding(building1));
        System.out.println("This building is: " + isNormal(building1));
    }

    public static int countLampsInBuilding(Building building1) {
        int sumOfLamps = 0;


        for (Room room : building1.getRooms()) {
            sumOfLamps += room.getNumberOfLamps();
        }
        return sumOfLamps;
    }
    public static int countWindowsInBuilding(Building building1) {
        int sumOfWindows = 0;


        for (Room room : building1.getRooms() ) {
            sumOfWindows += room.getNumberOfWindows();
        }
        return sumOfWindows;
    }
    public static int countRoomsInBuilding(Building building1) {
        int sumOfRooms = building1.getRooms().size();
        return sumOfRooms;
    }
    public static boolean isNormal(Building building1) {
        if(building1.getNumberOfFloors() >= building1.getRooms().size()) {
        return true;
        } else{
            return false;
        }

    }

}
