package Data.impl;

import Data.Parts;

public class Ram extends Parts {
    private String value;

    public Ram(String name, String producer, String value) {
        super(name, producer);
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return String.format("RAM{%s, %s, %s}", getProducer(), getName(), getValue());
    }
}
