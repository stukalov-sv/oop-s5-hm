package Controller;

import java.util.ArrayList;
import java.util.List;

import Data.impl.Cpu;
import Data.impl.MotherBoard;
import Data.impl.Ram;

public class Storehouse {
    public List<MotherBoard> mbStore = new ArrayList<MotherBoard>(); 
    public List<Cpu> cpuStore = new ArrayList<Cpu>(); 
    public List<Ram> ramStore = new ArrayList<Ram>(); 

    public Storehouse() {
        mbStore.add(new MotherBoard("Strix B560-A", "Asus", "2021"));
        mbStore.add(new MotherBoard("Z490", "ASRock", "2020"));
        mbStore.add(new MotherBoard("Z590", "MSI", "2022"));
        cpuStore.add(new Cpu("Xeon 8380", "Intel", "2300"));
        cpuStore.add(new Cpu("EPYC 7702", "AMD", "2000"));
        ramStore.add(new Ram("Venegance led", "Corsair", "32"));
        ramStore.add(new Ram("Trident Z", "G.Skill", "16"));
        ramStore.add(new Ram("Hyperx predator", "Kingston", "8"));
    }

    @Override
    public String toString() {
        return String.format("Storehouse: %s, %s, %s", mbStore.toString(), cpuStore.toString(), ramStore.toString());
    }
}
