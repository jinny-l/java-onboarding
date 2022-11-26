package onboarding.problem1;

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
}
