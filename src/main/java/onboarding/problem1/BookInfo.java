package onboarding.problem1;

import java.util.List;

public enum BookInfo {

    MIN_PAGE(3),
    MAX_PAGE(398);

    private final int pageNumber;

    BookInfo(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public static boolean validate(List<Integer> pages) {
        return Validator.validateBook(pages);
    }
}
