package Association;

class Engine {
    private int pedalSize;

    public Engine(int pedalSize) {
        this.pedalSize = pedalSize;
    }

    public int getPedalSize() {
        return pedalSize;
    }
}
//Содержит характеристику pedalSize.
//Связан с Car через композицию.
