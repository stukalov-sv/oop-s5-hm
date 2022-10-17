package Service.impl;

import java.util.List;

import Data.impl.MotherBoard;
import Service.Filterable;

public class MotherboardFilterService implements Filterable<MotherBoard> {

    @Override
    public MotherBoard getFilteredPart(List<MotherBoard> arrayList, String filterUniqField) {
        MotherBoard temp = null;

        for (var item : arrayList) {
            if (item.getName().equals(filterUniqField)) {
                temp = item;
            } else if (item.getProducer().equals(filterUniqField)) {
                temp = item;
            } else if (item.getYear().equals(filterUniqField)) {
                temp = item;
            }
        }
        return temp;
    }
    
}
