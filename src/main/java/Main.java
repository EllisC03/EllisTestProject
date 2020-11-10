import java.util.Random;

class Main {
    public static void main(String[] args) {

        String[] Suit = new String[]{"Clubs","Spades","Diamonds","Hearts"};
        String[] Numbers = new String[]{"K","Q","J","10","9","8","7","6","5","4","3","2","A"};
        String[][] cardNumbers = new String[4][13];
        String[] hand = new String[5];
        for (int row = 0; row < Suit.length; row++) {
            for (int col = 0; col < Numbers.length; col++) {
                cardNumbers[row][col] = Suit[row] + Numbers[col];
            }
        }

        Random rand = new Random();
        String[] placeHolder1 = new String[4];
        String[] placeHolder2 = new String[13];

        for(int i = 0; i < hand.length; i++) {
            int randomCard = rand.nextInt(placeHolder1.length);
            int randomCard2 = rand.nextInt(placeHolder2.length);
            hand[i] = cardNumbers[randomCard][randomCard2];
            System.out.println(hand[i]);
        }
        System.out.println("These are your cards");
    }
}