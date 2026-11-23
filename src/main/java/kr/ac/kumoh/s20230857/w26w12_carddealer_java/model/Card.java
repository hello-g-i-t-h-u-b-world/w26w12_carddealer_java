package kr.ac.kumoh.s20230857.w26w12_carddealer_java.model;

public record Card(
        String rank,
        String suit
) {
    public String imageName() {
        return rank + "_of_" + suit + ".png";
    }
}
