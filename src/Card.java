import java.util.Arrays;
import java.util.List;

public class Card {
    private String suit;
    private String faceName;

    public Card(String suit, String faceName) {
        this.suit = suit;
        this.faceName = faceName;
    }

    public String getSuit() {
        return suit;
    }

    public String getFaceName() {
        return faceName;
    }

    public static List<String> getValidSuits() {

        return Arrays.asList("clubs","spades","diamonds","hearts");
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setFaceName(String faceName) {
        this.faceName = faceName;
    }
}
