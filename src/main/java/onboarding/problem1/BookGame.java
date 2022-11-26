package onboarding.problem1;

import java.util.List;

public class BookGame {

    private static final int POBI_WIN = 1;
    private static final int CRONG_WIN = 2;
    private static final int DRAW = 0;
    private static final int EXCEPTION_STATUS = -1;

    private final List<Integer> pobi;
    private final List<Integer> crong;
    private final PageNumberCalculator pageNumberCalculator = new PageNumberCalculator();

    public BookGame(List<Integer> pobi, List<Integer> crong) {
        this.pobi = pobi;
        this.crong = crong;
    }

    public int getResult() {
        int pobiMax = pageNumberCalculator.getMaxOfPageNumbers(pobi);
        int crongMax = pageNumberCalculator.getMaxOfPageNumbers(crong);
        if (!occursException(pobi) || !occursException(crong)) {
            return EXCEPTION_STATUS;
        }
        if (pobiMax > crongMax) {
            return POBI_WIN;
        }
        if (pobiMax < crongMax) {
            return CRONG_WIN;
        }
        if (pobiMax == crongMax) {
            return DRAW;
        }
        return EXCEPTION_STATUS;
    }

    private boolean occursException(List<Integer> pages) {
        return BookInfo.validate(pages) && PagesInfo.validate(pages);
    }

}
