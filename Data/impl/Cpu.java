package Data.impl;

import Data.Parts;

public class Cpu extends Parts{
    private String frequency;

    public Cpu(String name, String producer, String frequency) {
        super(name, producer);
        this.frequency = frequency;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return String.format("CPU{%s, %s, %s}",getProducer(), getName(), getFrequency());
    }
    
}
