package org.example;

public class Formatter {
    private Book book;

    public Formatter(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void format(FormatType format) {
        switch (format) {
            case JSON:
                System.out.println("Заглушка для JSON");
                break;
            case XML:
                System.out.println("Заглушка для XML");
                break;
            case NONE:
                System.out.println("Заглушка без форматирования");
                break;
            default:
                throw new IllegalArgumentException();
        }
    }
}
