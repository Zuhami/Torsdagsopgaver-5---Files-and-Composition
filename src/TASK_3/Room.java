package TASK_3;

public class Room {
private int numberOfLamps;
private int numberOfWindows;

    Room(int numberOfLamps, int numberOfWindows) {

        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;


    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    public void setNumberOfLamps(int numberOfLamps) {
        this.numberOfLamps = numberOfLamps;
    }






}
