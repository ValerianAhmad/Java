package PossibleSolution;

public class Hand {
    Card[] cardArray = new Card[5];
    int numCards = 0;

    Hand(Card c1, Card c2) {
        cardArray[0] = c1;
        cardArray[1] = c2;
        numCards = 2;
    }
    
    public int getPoints() {
        int points = 0;
        for (int i = 0; i < numCards; i++) {
            points += cardArray[i].points;
        }
            if (points > 21) {
            points = 0;
            boolean aceFound = false;
            for (int i = 0; i < numCards; i++) {
                if (!aceFound) {
                    String a = "Ace";
                    if (a.equals(cardArray[i].name) && cardArray[i].points == 11) {
                        cardArray[i].points = 1;
                        aceFound = true;
                    }
                }
            }
            for (int i = 0; i < numCards; i++) {
                points += cardArray[i].points;
            }
        }
    return points;
    }

    public void display() {
        for (int i = 0; i < numCards; i ++) {
            System.out.println(cardArray[i]);
        }
    }

    public void hit (Card c) {
        if (numCards >= 5)  {
        System.out.println("Maximum number of cards is 5.");
        return;
        }
        cardArray[numCards] = c;
        numCards++;
    }
}
