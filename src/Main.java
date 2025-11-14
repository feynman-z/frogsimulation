//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FrogSimulation sim = new FrogSimulation(24, 5);

        sim.simulate();
//        sim.runSimulations(400);
        FrogSimulation sim2 = new FrogSimulation(8, 3);
        sim2.simulate();

    }
}