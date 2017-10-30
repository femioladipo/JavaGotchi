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
    }

        public void sleep() {
            if (energy >= 12){
                System.out.println("Whoops"+ getName() + " is not that sleepy");
            } else {
                fullness += 8;
                happiness -= 6;
                energy -= 4;
            }
            if (happiness > 15) {happiness = 15;}
            System.out.println("Yawn, that was a good nap!");
        }

    public void play() {
            fullness -= 4;
            happiness += 8;
            energy -= 8;
    }

    public String getName() {
        return name;
    }

    public void checkStatus() {
        String status = "";

        if (fullness <= 6) {
            status += "Oh, " + getName() + " is feeling sad!\n";
        }
        if (happiness <= 6) {
            status += "Hmm, " + getName() + " is really tired!\n";
        }
        if (energy <= 6) {
            status += "Whoops, " + getName() + " is really hungry!";
        }

        System.out.println(status);
    }
}
