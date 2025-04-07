package BubbleSort;

public class Sale {
    /*private ArrayList<SalesRepresentative> sales;
    public Sale() {
        this.sales = new ArrayList<SalesRepresentative>();
    }
    public ArrayList<SalesRepresentative> getSales() {
        return this.sales;
    }
    */

    public SalesRepresentative[] sort(SalesRepresentative[] rep){
        int n = rep.length;
        boolean swapped;

        for (int i = 0; i < n-1; i++) {

            swapped = false;

            for (int j = 0; j < n-i-1; j++) {
                if (rep[j].getSalary() < rep[j+1].getSalary()) {
                    SalesRepresentative temp = rep[j];
                    rep[j] = rep[j + 1];
                    rep[j + 1] = temp;

                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return rep;
    }
}
