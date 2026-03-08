package metodlar2.Book;

public class BookObjects {
    public static void main(String[] args) {

        Book thinkAndGrowRich=new Book();

        thinkAndGrowRich.title="Think and Grow Rich";
        thinkAndGrowRich.author="Napoleon Hill";
        thinkAndGrowRich.pages=250;
        thinkAndGrowRich.price=20;
        thinkAndGrowRich.isHardcover=false;
        thinkAndGrowRich.language='E';


        thinkAndGrowRich.read();
        thinkAndGrowRich.closeBook();
        thinkAndGrowRich.printBookInfo();







    }
}
