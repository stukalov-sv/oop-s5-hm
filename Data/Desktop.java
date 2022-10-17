package Data;

import Data.impl.Cpu;
import Data.impl.MotherBoard;
import Data.impl.Ram;

public class Desktop {
    private MotherBoard motherBoard;
    private Cpu processor;
    private Ram memory;

    public Desktop(MotherBoard motherBoard, Cpu processor, Ram memory) {
        this.motherBoard = motherBoard;
        this.processor = processor;
        this.memory = memory;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }
    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }
    public Cpu getProcessor() {
        return processor;
    }
    public void setProcessor(Cpu processor) {
        this.processor = processor;
    }
    public Ram getMemory() {
        return memory;
    }
    public void setMemory(Ram memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return String.format("Desktop{%s, %s, %s}", motherBoard, processor, memory);
    }
}
