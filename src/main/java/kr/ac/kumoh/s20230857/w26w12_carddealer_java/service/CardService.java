package kr.ac.kumoh.s20230857.w26w12_carddealer_java.service;

import kr.ac.kumoh.s20230857.w26w12_carddealer_java.model.Card;
import kr.ac.kumoh.s20230857.w26w12_carddealer_java.repository.CardRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

@Service
public class CardService {
    private final CardRepository repository;

    public CardService(CardRepository repository) {
        this.repository = repository;
    }
    public List<Card> getCards(){
        return repository.getCards();
    }

    public void dealCards(){
        dealCards(5);
    }

    public void dealCards(int count){
        String[] suits = {"spades", "diamonds", "hearts", "clubs"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "jack", "queen", "king", "ace"};

        repository.deleteAll();

        List<Integer> numbers = new ArrayList<>(IntStream.range(0, 52).boxed().toList());
        Collections.shuffle(numbers);

        numbers.stream()
                .limit(count)
                .sorted()
                .forEach(number -> {
                    String suit = suits[number / ranks.length];
                    String rank = ranks[number % ranks.length];
                    repository.save(new Card(rank, suit));
                });
    }
}
