package kr.ac.kumoh.s20230857.w26w12_carddealer_java.model;

public record Card(
        String rank,
        String suit
) {
    public String imageName() {
        if(rank.equals("jack") || rank.equals("queen") || rank.equals("king")) {
            return rank + "_of_" + suit + "2.png";
        }
        else{
            return rank + "_of_" + suit + ".png";
        }
    }
}
