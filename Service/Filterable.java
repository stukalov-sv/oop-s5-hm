package Service;

import java.util.List;

import Data.Parts;

public interface Filterable<T extends Parts> {
    public T getFilteredPart(List<T> arrayList, String filterUniqField);
}
