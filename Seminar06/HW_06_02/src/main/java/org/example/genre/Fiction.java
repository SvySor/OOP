package org.example.genre;

public class Fiction extends Genre{
    private String subGenre;

    public Fiction() {
    }

    public Fiction(String genreType, String subGenre) {
        super(genreType);
        this.subGenre = subGenre;
    }
}
