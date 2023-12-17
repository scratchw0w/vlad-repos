package project.model;

public enum BookGenre {
    FANTASY("fantasy"),
    HORROR("horror"),
    ACTION("action"),
    SHORT_STORY("short story"),
    ANTIUTHOPHY("antiuthophy"),
    HISTORIC("historic"),
    NOVEL("novel");

    private final String prettyPrint;

    private BookGenre(String prettyPrint) {
        this.prettyPrint = prettyPrint;
    }

    public String prettyPrint() {
        return this.prettyPrint;
    }
}
