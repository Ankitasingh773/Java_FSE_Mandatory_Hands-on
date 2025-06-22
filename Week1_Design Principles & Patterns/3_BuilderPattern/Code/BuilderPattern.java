public class Computer {
    
    private String CPU;
    private String RAM;
  
    private String storage;
    private String PSU;
  
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.PSU = builder.PSU;
    }
    public static class Builder {
        
        private String CPU;
        private String RAM;
      
        private String storage;
        private String PSU;

        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setPSU(String graphicsCard) {
            this.PSU = PSU;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
    public void showSpecs() {
        System.out.println("CPU: " + CPU);
        System.out.println("RAM: " + RAM);
        System.out.println("Storage: " + (storage != null ? storage : "Not specified"));
        System.out.println("POWER SUPPLY UNIT: " + (PSU != null ? PSU : "Not specified"));
    }
}
public class Main {
    public static void main(String[] args) {
        Computer basicComp = new Computer.Builder("Intel i5", "8GB").build();
        Computer gamingComp = new Computer.Builder("Intel i9", "32GB")
                .setStorage("1TB SSD")
                .setPSU("NVIDIA RTX 3080")
                .build();
        System.out.println("Basic Computer Specs:");
        basicComp.showSpecs();
        System.out.println("\nGaming Computer Specs:");
        gamingComp.showSpecs();
    }
}
