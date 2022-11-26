package onboarding.problem1;

import java.util.List;

public enum PagesInfo {

    LEFT_PAGE(0),
    RIGHT_PAGE(1);

    private final int index;

    PagesInfo(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public static boolean validate(List<Integer> pages) {
        return Validator.validatePages(pages);
    }

}
