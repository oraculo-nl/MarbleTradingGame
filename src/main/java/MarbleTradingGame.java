import java.util.Random;

/**
 * bag with 10 marbles: 4 black 6 blue
 * if you draw blue you get your wager
 * if you draw black you lose your wager
 * chance of blue = 60%
 * chance of black = 40%
 * expectancy = (wager * 0.6) - (wager * 0.4)
 * with wager = 200, expectancy = (200 * 0.6) - (200 * 0.4) = 40, so average +40 per trage
 * 100 trades = average 100 x 40 = 4000
 */
public class MarbleTradingGame {
    public static void main(String[] args) {
        var random = new Random();
        var capital = 20_000d;
        var wager = 200d;

        String[] bag = {"black", "black", "black", "black", "blue", "blue", "blue", "blue", "blue", "blue"};

        for (var x = 0; x < 20;x++){
            for (var i = 0; i < 100; i++) {
                var choice = random.nextInt(10);
//            System.out.println("Marble="+bag[choice]);
                if (bag[choice].equalsIgnoreCase("blue")) {
                    capital += wager;
                } else {
                    capital -= wager;
                }
            }

            System.out.println("Endcapital=" + capital);
            capital = 20_000d;
        }
    }
}
