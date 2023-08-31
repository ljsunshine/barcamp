// AbstractProduct: Represents the CPU
interface CPU {
    String getDetails();
}

// ConcreteProducts: CPU of Brand A
class IntelCPU implements CPU {
    @Override
    public String getDetails() {
        return "CPU of Brand Intel";
    }
}

// ConcreteProducts: CPU of Brand B
class AMDCPU implements CPU {
    @Override
    public String getDetails() {
        return "CPU of Brand AMD";
    }
}

// AbstractProduct: Represents the Monitor
interface Monitor {
    String getDetails();
}

// ConcreteProducts: Monitor of Brand A
class IntelMonitor implements Monitor {
    @Override
    public String getDetails() {
        return "Monitor of Brand Intel";
    }
}

// ConcreteProducts: Monitor of Brand B
class AMDMonitor implements Monitor {
    @Override
    public String getDetails() {
        return "Monitor of Brand AMD";
    }
}

// AbstractFactory: Interface for creating CPUs and Monitors
interface ComputerPartsFactory {
    CPU createCPU();
    Monitor createMonitor();
}

// ConcreteFactory: Creates CPUs and Monitors of Brand Intel
class IntelComputerPartsFactory implements ComputerPartsFactory {
    @Override
    public CPU createCPU() {
        return new IntelCPU();
    }

    @Override
    public Monitor createMonitor() {
        return new IntelMonitor();
    }
}

// ConcreteFactory: Creates CPUs and Monitors of Brand AMD
class AMDComputerPartsFactory implements ComputerPartsFactory {
    @Override
    public CPU createCPU() {
        return new AMDCPU();
    }

    @Override
    public Monitor createMonitor() {
        return new AMDMonitor();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a computer factory of Brand Intel
        ComputerPartsFactory intelFactory = new IntelComputerPartsFactory();
        CPU intelCPU = intelFactory.createCPU();
        Monitor intelMonitor = intelFactory.createMonitor();
        System.out.println("Intel: " + intelCPU.getDetails() + ", " + intelMonitor.getDetails());

        // Create a computer factory of Brand AMD
        ComputerPartsFactory amdFactory = new AMDComputerPartsFactory();
        CPU amdCPU = amdFactory.createCPU();
        Monitor amdMonitor = amdFactory.createMonitor();
        System.out.println("AMD: " + amdCPU.getDetails() + ", " + amdMonitor.getDetails());
    }
}

