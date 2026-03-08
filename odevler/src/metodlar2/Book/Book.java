package metodlar2.Book;

public class Book {

  public String title;
  public String author;
  public int pages;
  public double price;
  public boolean isHardcover;
  public char language;







  public void read(){
      System.out.println("Reading the book.");
  }public void closeBook(){
        System.out.println("Book closed.");
    }public void printBookInfo(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", isHardcover=" + isHardcover +
                ", language=" + language +
                '}';
    }
}
