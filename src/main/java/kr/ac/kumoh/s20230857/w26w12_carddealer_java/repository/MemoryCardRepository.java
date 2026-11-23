package kr.ac.kumoh.s20230857.w26w12_carddealer_java.repository;

import kr.ac.kumoh.s20230857.w26w12_carddealer_java.model.Card;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemoryCardRepository implements CardRepository {
    private final List<Card> cards = new ArrayList<>();

    @Override
    public List<Card> getCards() {
        return List.copyOf(cards);
    }

    @Override
    public void save(Card card) {
        cards.add(card);
    }

    @Override
    public void deleteAll() {
        cards.clear();
    }
}
