package Service.impl;

import java.util.List;

import Data.impl.Cpu;
import Service.Filterable;

public class CpuFilterService implements Filterable<Cpu> {

    @Override
    public Cpu getFilteredPart(List<Cpu> arrayList, String filterUniqField) {
        Cpu temp = null;

        for (var item : arrayList) {
            if (item.getName().equals(filterUniqField)) {
                temp = item;
            } else if (item.getProducer().equals(filterUniqField)) {
                temp = item;
            } else if (item.getFrequency().equals(filterUniqField)) {
                temp = item;
            }
        }

    return temp;
    }
}
