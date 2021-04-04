package me.oktop.programmers;

public class GiftCard {
    public int solution(int[] gift_cards, int[] wants) {
        int length = gift_cards.length;
        int personCount = gift_cards.length;
        for (int i = 0; i < length; i++) {
            for (int k = 0; k < length; k++) {
                if (gift_cards[i] == wants[k]) {
                    wants[k] = wants[i];
                    wants[i] = 0;
                    personCount--;
                    break;
                }
            }

        }

        return personCount;
    }

    public static void main(String[] args) {
        int solution = new GiftCard().solution(
                new int[]{1,1,3},
                new int[]{3,1,2});

        System.out.println(solution);
    }

}
