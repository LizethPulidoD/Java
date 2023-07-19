package com.epam.rd.autocode.startegy.cards;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TexasHoldemCardDealingStrategy implements CardDealingStrategy{

    @Override
    public Map<String, List<Card>> dealStacks(Deck deck, int players) {
        Map<String, List<Card>> texasHoldemCardStrategy = new HashMap<String, List<Card>>();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < players; j++) {
                List<Card> playerCards = texasHoldemCardStrategy.getOrDefault("Player "+(j+1), new ArrayList<>());
                playerCards.add(deck.dealCard());
                texasHoldemCardStrategy.put("Player " + (j + 1), playerCards);
            }
        }

        ArrayList<Card> communityCards = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            communityCards.add(deck.dealCard());
            texasHoldemCardStrategy.put("Community", communityCards);
        }
        texasHoldemCardStrategy.put("Remaining", deck.restCards());
        return texasHoldemCardStrategy;
    }
}
