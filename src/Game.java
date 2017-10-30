/**
 * Created by k1456646 on 30/10/17.
 */
import java.util.Scanner;

public class Game {

    Scanner input = new Scanner(System.in);

    Creature creature;
    boolean userQuits = false;

    public void run() {
        statTutorial();
        while (!userQuits) {
            this.interact();
            System.out.println(this.creature.checkStatus());
        }
    }

    private void statTutorial() {
        System.out.println("Hi, there! Welcome to JavaGotchi.");
        System.out.println("What's the name of your creature?");

        String name = input.nextLine();

        this.creature = new Creature(name);

        System.out.println("Great, you can meet " + this.creature.getName() + "!");
    }

    private void interact() {
        System.out.println("What would you like to do?");
        System.out.println("1, Play.");
        System.out.println("2, Eat.");
        System.out.println("3, Sleep.");
        System.out.println("4, Quit.");

        int choice = input.nextInt();

        switch(choice) {
            case 1:
                this.creature.play();
                break;
            case 2:
                this.creature.eat();
                break;
            case 3:
                this.creature.sleep();
                break;
            case 4:
                userQuits = true;
                break;
            default:
                System.out.println("Whoops, pick a number between 1 and 4.");
                break;
        }
    }
}
