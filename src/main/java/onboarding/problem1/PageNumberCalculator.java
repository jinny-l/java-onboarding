package onboarding.problem1;

import java.util.List;

public class PageNumberCalculator {

    public int getMaxOfPageNumbers(List<Integer> pages) {
        int max = 0;
        for (Integer page : pages) {
            int maxOfPageNumber = getMaxOfPageNumber(page);
            if (maxOfPageNumber > max) {
                max = maxOfPageNumber;
            }
        }
        return max;
    }

    private int getMaxOfPageNumber(int page) {
        return Math.max(addPageNumbers(page), multiplyPageNumbers(page));
    }

    private int addPageNumbers(int page) {
        int sum = 0;
        while (page > 0) {
            sum += page % 10;
            page /= 10;
        }
        return sum;
    }

    private int multiplyPageNumbers(int page) {
        int multiplication = 1;
        while (page > 0) {
            multiplication *= page % 10;
            page /= 10;
        }
        return multiplication;
    }

}
