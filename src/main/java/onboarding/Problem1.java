package onboarding;

import java.util.List;
import onboarding.problem1.BookGame;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        BookGame bookGame = new BookGame(pobi, crong);
        return bookGame.getResult();
    }
}
