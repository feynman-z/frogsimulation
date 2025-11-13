import java.util.Random;

public class FrogSimulation {
    private int goalDistance;
    private int maxHops;

    public FrogSimulation(int dist, int numHops)
    {
        goalDistance = dist;
        maxHops = numHops;
    }

    private int hopDistance() {
        int a = (int)(Math.random()*(goalDistance) + 1);
        double sign = Math.random();
        if (sign >= 0.5) {
            a *= -1;
        }
        System.out.println("hopdistance " + a);
        return a;
    }
    public boolean simulate() {
        int position = 0;
        for (int i = 1; i<maxHops+1; i++){
            position += hopDistance();
            System.out.println("position " + position);
            if (position >= goalDistance){
                System.out.println("true");
                return true;
            }
            if (position < 0) {
                System.out.println("false");
                return false;
            }
        }
        System.out.println("false");
        return false;
    }
    public double runSimulations(int num) {
        double counter = 0;

        for (int i = 0; i < num; i++) {
            if (simulate()) {
                counter += 1;
            }
        }
        return counter/num;
    }
}
