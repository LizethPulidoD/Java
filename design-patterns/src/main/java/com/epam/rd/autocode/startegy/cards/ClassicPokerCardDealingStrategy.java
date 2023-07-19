package com.epam.rd.autocode.startegy.cards;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassicPokerCardDealingStrategy extends Throwable implements CardDealingStrategy{
    @Override
    public Map<String, List<Card>> dealStacks(Deck deck, int players){
        Map<String, List<Card>> classicPokerCardStrategy = new HashMap<String, List<Card>>();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < players; j++) {
                List<Card> playerCards = classicPokerCardStrategy.getOrDefault("Player "+(j+1), new ArrayList<>());
                playerCards.add(deck.dealCard());
                classicPokerCardStrategy.put("Player " + (j + 1), playerCards);
            }
        }
        classicPokerCardStrategy.put("Remaining", deck.restCards());
        return classicPokerCardStrategy;
    }
}
