package TASK_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class cafe {
    private ArrayList<String> coffeeMenu;

//constructor
    cafe(ArrayList<String> coffeeMenu) {
        this.coffeeMenu = coffeeMenu;
    }

    public ArrayList <String> getMenu() {
        return coffeeMenu;

    }

    public void loadMenuData() {


        try {
            File file = new File("coffees.txt");
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                coffeeMenu.add(scan.nextLine());

            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found:" + e.getMessage());

        }

    }
}
