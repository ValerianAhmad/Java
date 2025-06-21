package PossibleSolution;

public class Card {
    String suit;
    String name;
    int points; 

    public Card(int n1, int n2) {
        this.suit = getSuit(n1);
        this.name = getName(n2);
        this.points = getPoints(this.name);
    }

    @Override
    public String toString() {
        return "The " + name + " of " + suit;
    }

    public String getName (int i) {
        switch (i) {
            case 1 : return "Ace";
            case 2 : return "Two";
            case 3 : return "Three";
            case 4 : return "Four";
            case 5 : return "Five";
            case 6 : return "Six";
            case 7 : return "Seven";
            case 8 : return "Eight";
            case 9 : return "Nine";
            case 10 : return "Ten";
            case 11 : return "Jack";
            case 12 : return "Queen";
            case 13 : return "King";
            default : return "error";
        }
    }

    public int getPoints(String n) {
        if (n.equals("Jack") || n.equals("Queen") || n.equals("King") || n.equals("Ten")) {
            return 10;
        }
        switch (n) {
        case "Two" : return 2;
        case "Three" : return 3;
        case "Four" : return 4;
        case "Five" : return 5;
        case "Six" : return 6;
        case "Seven" : return 7;
        case "Eight" : return 8;
        case "Nine" : return 9;
        case "Ace" : return 11;
        default : return -1;
        }
    }

    public String getSuit(int i) {
        switch (i) {
        case 1 : return "Diamonds";
        case 2 : return "Clubs";
        case 3 : return "Spades";
        case 4 : return "Hearts";
        default : return "error";
        }
    }
}
