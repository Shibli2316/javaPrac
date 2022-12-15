package Random.Assignment3.Q4;

public class Resolution {
    private int pixelRow;
    private int getPixelColumn;

    public Resolution(int pixelRow, int getPixelColumn) {
        this.pixelRow = pixelRow;
        this.getPixelColumn = getPixelColumn;
    }

    public int getPixelRow() {
        return pixelRow;
    }

    public void setPixelRow(int pixelRow) {
        this.pixelRow = pixelRow;
    }

    public int getGetPixelColumn() {
        return getPixelColumn;
    }

    public void setGetPixelColumn(int getPixelColumn) {
        this.getPixelColumn = getPixelColumn;
    }

    public void display(){
        System.out.println("There are " + this.pixelRow + " pixel in each row and " + this.getPixelColumn+" pixels in columns");
    }
}
