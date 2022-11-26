package onboarding.problem1;

import java.util.List;

public class Validator {

    public static boolean validatePages(List<Integer> pages) {
        return validateLength(pages) && validateContinuity(pages) && validatePageNumber(pages);
    }

    private static boolean validateLength(List<Integer> pages) {
        return pages.size() == 2;
    }

    private static boolean validateContinuity(List<Integer> pages) {
        return pages.get(PagesInfo.RIGHT_PAGE.getIndex()) - pages.get(PagesInfo.LEFT_PAGE.getIndex()) == 1;
    }

    private static boolean validatePageNumber(List<Integer> pages) {
        return pages.get(PagesInfo.RIGHT_PAGE.getIndex()) % 2 == 0
                && pages.get(PagesInfo.LEFT_PAGE.getIndex()) % 2 != 0;
    }

    public static boolean validateBook(List<Integer> pages) {
        return pages.get(PagesInfo.RIGHT_PAGE.getIndex()) <= BookInfo.MAX_PAGE.getPageNumber()
                && pages.get(PagesInfo.LEFT_PAGE.getIndex()) >= BookInfo.MIN_PAGE.getPageNumber();
    }
}
