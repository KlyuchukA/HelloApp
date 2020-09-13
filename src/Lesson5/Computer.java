package Lesson5;

public class Computer {
    private Cpu cpu;
    private Monitor monitor;
    private RAM ram;
    private Storage storage;
    private Videocard videocard;

    public void turnOn() {
        this.cpu = new Cpu("2", 4, "345", "1Gb", "Intel", "Intel");
        this.monitor = new Monitor(24, "LG");
        this.ram = new RAM("HPE", "2400MHz", "2400", "DDR4");
        this.storage = new Storage("KINGSTONE", "2x8Gb", "", "123");
        this.videocard = new Videocard("GIGABATY", "568", "6Gb", "1233");
    }

    public void working() {
        cpu.returnCpu();
        monitor.returnMonitor();
        ram.returnRam();
        storage.returnStorage();
        this.videocard.returnVideocard();
    }
}

