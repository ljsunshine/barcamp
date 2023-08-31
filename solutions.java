// AbstractProduct: Represents the CPU
interface CPU {
    String getDetails();
}

// ConcreteProducts: CPU of Brand A
class CPU_A implements CPU {
    @Override
    public String getDetails() {
        return "CPU of Brand A";
    }
}

// ConcreteProducts: CPU of Brand B
class CPU_B implements CPU {
    @Override
    public String getDetails() {
        return "CPU of Brand B";
    }
}

// AbstractProduct: Represents the Monitor
interface Monitor {
    String getDetails();
}

// ConcreteProducts: Monitor of Brand A
class Monitor_A implements Monitor {
    @Override
    public String getDetails() {
        return "Monitor of Brand A";
    }
}

// ConcreteProducts: Monitor of Brand B
class Monitor_B implements Monitor {
    @Override
    public String getDetails() {
        return "Monitor of Brand B";
    }
}

// AbstractFactory: Interface for creating CPUs and Monitors
interface ComputerFactory {
    CPU createCPU();
    Monitor createMonitor();
}

// ConcreteFactory: Creates CPUs and Monitors of Brand A
class ComputerFactoryA implements ComputerFactory {
    @Override
    public CPU createCPU() {
        return new CPU_A();
    }

    @Override
    public Monitor createMonitor() {
        return new Monitor_A();
    }
}

// ConcreteFactory: Creates CPUs and Monitors of Brand B
class ComputerFactoryB implements ComputerFactory {
    @Override
    public CPU createCPU() {
        return new CPU_B();
    }

    @Override
    public Monitor createMonitor() {
        return new Monitor_B();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a computer factory of Brand A
        ComputerFactory factoryA = new ComputerFactoryA();
        CPU cpuA = factoryA.createCPU();
        Monitor monitorA = factoryA.createMonitor();
        System.out.println("Brand A: " + cpuA.getDetails() + ", " + monitorA.getDetails());

        // Create a computer factory of Brand B
        ComputerFactory factoryB = new ComputerFactoryB();
        CPU cpuB = factoryB.createCPU();
        Monitor monitorB = factoryB.createMonitor();
        System.out.println("Brand B: " + cpuB.getDetails() + ", " + monitorB.getDetails());
    }
}

