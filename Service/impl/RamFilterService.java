package Service.impl;

import java.util.List;

import Data.impl.Ram;
import Service.Filterable;

public class RamFilterService implements Filterable<Ram>{

    @Override
    public Ram getFilteredPart(List<Ram> arrayList, String filterUniqField) {
        Ram temp = null;

        for (var item : arrayList) {
            if (item.getName().equals(filterUniqField)) {
                temp = item;
            } else if (item.getProducer().equals(filterUniqField)) {
                temp = item;
            } else if (item.getValue().equals(filterUniqField)) {
                temp = item;
            }
        }

    return temp;
    }
    
}
