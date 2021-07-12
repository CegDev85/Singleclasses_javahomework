public class Printer {

    private int sheetsOfPaper;

    public Printer(int sheetsOfPaper) {
        this.sheetsOfPaper = sheetsOfPaper;

    }

    public int getPaper() {
        return sheetsOfPaper;
    }

    public static String print(int sheetsOfPaper, int numOfCopies) {
        if (sheetsOfPaper >= numOfCopies) {
             sheetsOfPaper - numOfCopies;
        }
        return ;
    }
}