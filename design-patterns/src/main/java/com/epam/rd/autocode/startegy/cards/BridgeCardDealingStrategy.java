package com.epam.rd.autocode.startegy.cards;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BridgeCardDealingStrategy implements CardDealingStrategy{
    @Override
    public Map<String, List<Card>> dealStacks(Deck deck, int players){
        Map<String, List<Card>> bridgeCardStrategy = new HashMap<String, List<Card>>();
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < players; j++) {
                List<Card> playerCards = bridgeCardStrategy.getOrDefault("Player "+(j+1), new ArrayList<>());
                playerCards.add(deck.dealCard());
                bridgeCardStrategy.put("Player " + (j + 1), playerCards);
            }
        }
        return bridgeCardStrategy;
    }
}
