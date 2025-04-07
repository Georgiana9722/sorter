package BubbleSort;

public class SalesRepresentative {

    private String name;
    private int numberofsale;
    private double quota;

    public SalesRepresentative( int numberofsale, double quota) {
        this.numberofsale = numberofsale;
        this.quota = quota;
    }

    public int getNumberofSale() {
        return numberofsale;
    }

    public double getQuota() {
        return quota;
    }

    public double getSalary() {
        return numberofsale * quota;
    }

    public static SalesRepresentative getInstance(int numberofsale, double quota) {
        return new SalesRepresentative(numberofsale, quota);
    }
}
