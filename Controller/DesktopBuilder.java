package Controller;

import java.util.List;

import Data.Desktop;
import Data.impl.Cpu;
import Data.impl.MotherBoard;
import Data.impl.Ram;
import Service.impl.CpuFilterService;
import Service.impl.MotherboardFilterService;
import Service.impl.RamFilterService;

public class DesktopBuilder {
    private Desktop pc = new Desktop(null, null, null);

    MotherboardFilterService ms = new MotherboardFilterService();
    CpuFilterService cs = new CpuFilterService();
    RamFilterService rs = new RamFilterService();

    public DesktopBuilder() {
    }

    public void setMotherBoard(List<MotherBoard> arrayList, String findWord) {
        pc.setMotherBoard(ms.getFilteredPart(arrayList, findWord));
    }
    public void setProcessor(List<Cpu> arrayList, String findWord) {
        pc.setProcessor(cs.getFilteredPart(arrayList, findWord));
    }
    public void setMemory(List<Ram> arrayList, String findWord) {
        pc.setMemory(rs.getFilteredPart(arrayList, findWord));
    }

    @Override
    public String toString() {
        return String.format("Your personal computer is: %s, %s, %s", pc.getMotherBoard().toString(), pc.getProcessor().toString(), pc.getMemory().toString());
    }
    
}
