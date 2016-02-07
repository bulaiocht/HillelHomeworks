package hometask.six.reflection;

/**
 * Created by horsey on 25.01.16.
 */
public enum BookGenre {
    SCI_FI(8651), PHYSICS(7530), SCIENCE(3258), PROGRAMMING(1101), MATH(2333), NOVEL(1565), POETRY(3333), NONE(0000);

    private int bookCode;

    BookGenre(int bookCode) {
        this.bookCode = bookCode;
    }

    public int getCode() {
        return bookCode;
    }
}