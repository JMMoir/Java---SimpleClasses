public class Printer {

    private int numberOfSheetsLeft;
    private int toner;

    public Printer(int numberOfSheetsLeft, int toner){
        this.numberOfSheetsLeft = numberOfSheetsLeft;
        this.toner = toner;
    }

    public int hasPaper(){
        return this.numberOfSheetsLeft;
    }

    public int getToner(){
        return this.toner;
    }

    public void print(int pages, int copies){
        if(this.numberOfSheetsLeft >= (pages * copies)){
            this.numberOfSheetsLeft -= (pages * copies);
            this.toner -= (pages * copies);
        }
    }
}
