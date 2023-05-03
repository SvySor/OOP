package org.example.genre;

public class Poems extends Fiction {
    private String poemType;

    public Poems() {
    }

    public Poems(String genreType, String subGenre, String poemType) {
        super(genreType, subGenre);
        this.poemType = poemType;
    }
}
