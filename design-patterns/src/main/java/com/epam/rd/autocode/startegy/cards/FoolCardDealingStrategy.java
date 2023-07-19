package com.epam.rd.autocode.startegy.cards;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FoolCardDealingStrategy implements CardDealingStrategy{
    @Override
    public Map<String, List<Card>> dealStacks(Deck deck, int players) {
        Map<String, List<Card>> foolCardStrategy = new HashMap<String, List<Card>>();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < players; j++) {
                List<Card> playerCards = foolCardStrategy.getOrDefault("Player "+(j+1), new ArrayList<>());
                playerCards.add(deck.dealCard());
                foolCardStrategy.put("Player " + (j + 1), playerCards);
            }
        }

        ArrayList<Card> communityCards = new ArrayList<>();
            communityCards.add(deck.dealCard());
            foolCardStrategy.put("Trump card", communityCards);

        foolCardStrategy.put("Remaining", deck.restCards());
        return foolCardStrategy;
    }
}
