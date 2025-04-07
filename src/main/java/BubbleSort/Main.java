package BubbleSort;

import java.util.Scanner;

public class Main {
    SalesRepresentative[] rep={
            new SalesRepresentative(12,399),
            new SalesRepresentative(4,500),
            new SalesRepresentative(20,700)
    };

    Sale sorter = new Sale();
    SalesRepresentative[] sortt = sorter.sort(rep);

   for(SalesRepresentative representative : sortt){
        System.out.println(representative);
    }
}