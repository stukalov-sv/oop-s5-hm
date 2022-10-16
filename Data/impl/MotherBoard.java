package Data.impl;

import Data.Parts;

public class MotherBoard extends Parts{
    private String year;

    public MotherBoard(String name, String producer, String year) {
        super(name, producer);
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    
    @Override
    public String toString() {
        return String.format("Motherboard{%s, %s, %s}", getProducer(), getName(), getYear());
    }
    
}
