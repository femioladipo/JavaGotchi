/**
 * Created by k1456646 on 30/10/17.
 */
public class Creature {
    private int fullness, happiness, energy;
    private String name;

    public Creature (String name) {
        fullness = 15;
        happiness = 15;
        energy = 15;
        this.name = name;
    }

    public void eat() {
        if (fullness >= 12) {
            System.out.println("Whoops" + getName() + " is already full");
        } else {
            fullness += 8;
            happiness -= 6;
            energy -= 4;
        }
        if (fullness > 15) {fullness = 15;}
    }

    public void sleep() {
        if (energy >= 12){
            System.out.println("Whoops"+ getName() + " is not that sleepy");
        } else {
            fullness -= 5;
            happiness -= 5;
            energy += 8;
        }
        if (happiness > 15) {happiness = 15;}
        System.out.println("Yawn, that was a good nap!");
    }

    public void play() {
            fullness -= 4;
            happiness += 8;
            energy -= 6;
        if (happiness > 15) {happiness = 15;}
    }

    public String getName() {
        return name;
    }

    public void checkStatus() {
        String status = null;

        if (fullness <= 0 || happiness <= 0 || energy <= 0) {
            System.out.println("Oh no? " + getName() + " has died. You're a bad owner.");
            System.exit(0);
        }

        if (fullness <= 6) {
            status += "Oh, " + getName() + " is feeling sad!";
        }
        if (happiness <= 6) {
            status += "\n Hmm, " + getName() + " is really tired!";
        }
        if (energy <= 6) {
            status += "\n Whoops, " + getName() + " is really hungry!";
        }
        System.out.println(status);
    }
}