package org.example;

import org.example.genre.Genre;

public class ElectronBook extends Book implements Searchable{
    private EbookFormat format;
    private Integer size;

    public ElectronBook() {
    }

    public ElectronBook(Genre genre, String title, String author, EbookFormat format, Integer size) {
        super(genre, title, author);
        this.format = format;
        this.size = size;
    }

    public EbookFormat getFormat() {
        return format;
    }

    public void setFormat(EbookFormat format) {
        this.format = format;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public boolean checkAuthor(String author) {
        return getAuthor().equals(author);
    }
}
