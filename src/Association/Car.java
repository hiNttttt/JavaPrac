package Association;

class Car {
    private int carCounter = 0;
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

    @Override
    public String toString() {
        return "Машина{Серийный номер=" + serialNumber + ", размер педалей=" + engine.getPedalSize() + "}";
    }
}
//Содержит уникальный serialNumber и объект Engine.
//Конструктор создает новый объект Engine.
