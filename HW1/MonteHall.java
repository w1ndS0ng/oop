public class MonteHall {
    public static void main(String[] args) {
        double trials = Double.parseDouble(args[0]);
        int wins = 0;

        for(int i = 1; i <= trials; i++) {
            int prize = (int) (3 * Math.random());
            int choice = (int) (3 * Math.random());

            int reveal;
            do {
                reveal = (int) (3 * Math.random());
            } while ((reveal == prize) || (reveal == choice));

            int other = 0 + 1 + 2 - reveal - choice;
            if (other == prize) {
                wins++;
            }
        }

        System.out.println("win rate when change: " + (1.0) * wins / trials);
    }
}
