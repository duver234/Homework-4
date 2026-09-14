class Textbook{
    private String textbookTitle;
    private String textbookAuthor;
    private String textbookPublisher;

    public Textbook(String title, String author, String publisher) {
        this.textbookTitle = title;
        this.textbookAuthor = author;
        this.textbookPublisher = publisher;
    }

    public void setTextbookTitle(String title) {
        this.textbookTitle = title;
    }

    public void setTextbookAuthor(String author) {
        this.textbookAuthor = author;
    }

    public void setTextbookPublisher(String publisher) {
        this.textbookPublisher = publisher;
    }

    public String getTextbookTitle() {
        return textbookTitle;
    }

    public String getTextbookAuthor() {
        return textbookAuthor;
    }

    public String getTextbookPublisher() {
        return textbookPublisher;
    }
}