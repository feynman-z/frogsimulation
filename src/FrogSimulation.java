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
        return -goalDistance + (int)(Math.random()*((1)));
    }
    public boolean simulate() {

        return false;
    }
    public double runSimulations(int num) {

    }
}
