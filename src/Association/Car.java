package Association;

class Car {
    private static int carCounter = 0;
    private int serialNumber;
    private Engine engine;

    public Car(int pedalSize) {
        this.engine = new Engine(pedalSize);
        this.serialNumber = ++carCounter;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public int getEnginePedalSize() {
        return engine.getPedalSize();
    }
}

