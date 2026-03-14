package week05;

public class WhileLoop {
    public static void main(String[] args) {

        int n=1;
        while (n<=5){
            System.out.println(n);
        n++;
        }
        System.out.println("------------");

        int savings=0;
        int days=0;
        while (savings <=100){
            savings+=10;
        days++;
            System.out.println("Savings $ "+ savings + " on day " + days);
        }
        System.out.println("======================");

        int pagesLeft=10;
while (pagesLeft>0){
    //2 pages every day
    pagesLeft-=2;
    System.out.println("Pages left - "+ pagesLeft);
}
        System.out.println("Book finished!");
// for loop version for above loop
        for (int pages=10; pages>0; pages-=2) {
            System.out.println("Pages left- " + pages);
        }
        System.out.println("Book finished!");
    }
}

/*
2) Create a new class WhileLoop and add a main method:

⏳ Print Numbers from 1 to 5
-Declare an int counter = 1;
-Use a while loop to print numbers 1 to 5

💰Saving Until You Reach $100
-Declare int savings = 0;
-Use a while loop to keep adding $10 until total is at least $100
-Print total after each addition
-Add days variable to show number of days

📖Reading Pages Until Book Ends
-Declare int pagesLeft = 10;
-Each day you read 2 pages
-Use a while loop to simulate daily reading until pages are done
-Print Pages left inside the loop
-Book finished afterward
 */