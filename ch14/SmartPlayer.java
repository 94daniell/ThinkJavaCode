public class SmartPlayer extends Player {


    public SmartPlayer(String name) {
        super(name);
    }

    public Card play(Eights eights, Card prev) {
        Card card = searchForBetterMatch(prev);
        if (card == null) {
            card = drawForMatch(eights, prev);
        }
        return card;
    }

    public Card searchForBetterMatch(Card prev) {
        int bestMatch = -1;
        for (int i = 0; i < getHand().size(); i++) {
            Card card = getHand().getCard(i);
            if (card.getRank() == 8) {
                return getHand().popCard(i);
            }
            if (cardMatches(card, prev)) {
                if (bestMatch == -1 || card.getRank() > getHand().getCard(bestMatch).getRank()) {
                    bestMatch = i;
                }
            }
        }
        if (bestMatch > -1) {
            return getHand().popCard(bestMatch);
        }
        return null;
    }

}