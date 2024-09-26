package org.launchcode;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {
    @Override
    public int compare(Cone o1, Cone o2) {
//        return o1.getName().compareTo(o2.getName());
        if (o1.getCost() - o2.getCost() < 0) {
            return -1;
        } else if (o1.getCost() - o2.getCost() > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
