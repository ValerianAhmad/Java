package PossibleSolution;

public class Deck {
    Card[] cardArray = new Card[52];
    int nextToDeal = 0;
    
    Deck() {
        int suits = 4;
        int cardType = 13;
        int cardCount = 0;
        for(int i = 1; i <= suits; i++) {
            for(int j = 1; j <= cardType; j++) {
                cardArray[cardCount] = new Card(i,j);
                cardCount++;
            }
        }
    }

    public void print() {
        for (int i = 0; i < cardArray.length; i++) {
            System.out.println(cardArray[i]);
        }   
    }

    public void shuffle() {
        for (int i = cardArray.length - 1; i > 0; i--) {
            int c = (int) (Math.random() * (i + 1));
            Card temp = cardArray[i];
            cardArray[i] = cardArray[c];
            cardArray[c] = temp;
        }
    }

    public Card deal() {
        if (nextToDeal >= cardArray.length) {
            System.out.println("No more cards to deal.");
            return null;
        }
        return cardArray[nextToDeal++];
    }
}
