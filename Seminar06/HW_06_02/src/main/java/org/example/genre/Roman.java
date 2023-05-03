package org.example.genre;

public class Roman extends Fiction{
    private String romanType;

    public Roman() {
    }

    public Roman(String genreType, String subGenre, String romanType) {
        super(genreType, subGenre);
        this.romanType = romanType;
    }
}
