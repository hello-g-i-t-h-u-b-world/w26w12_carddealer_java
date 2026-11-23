package kr.ac.kumoh.s20230857.w26w12_carddealer_java.repository;

import kr.ac.kumoh.s20230857.w26w12_carddealer_java.model.Card;

import java.util.List;

public interface CardRepository {
    List<Card> getCards();
    void save(Card card);
    void deleteAll();
}
