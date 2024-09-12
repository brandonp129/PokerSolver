import java.util.Arrays;
import java.util.List;



public class PlayerCards {

    private int card1;
    private int card2;
    private double weight;
    private int relativeProbability;
    private List<Integer> cardVector;
    private int hashCode;
    private long boardLong;

    public PlayerCards() {
    }

    public PrivateCards(int card1, int card2, float weight) {
            this.card1 = card1;
            this.card2 = card2;
            this.weight = weight;
            this.relativeProb = 0;
            this.cardVec = Arrays.asList(this.card1, this.card2);

            if (card1 > card2) {
                this.hashCode = card1 * 52 + card2;
            } else {
                this.hashCode = card2 * 52 + card1;
            }

            this.boardLong = Card.boardIntsToLong(this.cardVec);
        }

    public long toBoardLong() {
        return this.boardLong;
        // return Card.boardIntsToLong(this.cardVec);
    }

    @Override
    public int hashCode() {
        return this.hashCode;
    }

    @Override
    public String toString() {
        if (card1 > card2) {
            return Card.intCardToString(card1) + Card.intCardToString(card2);
        } else {
            return Card.intCardToString(card2) + Card.intCardToString(card1);
        }
    }

    public List<Integer> getHands() {
        return this.cardVec;
    }

}
