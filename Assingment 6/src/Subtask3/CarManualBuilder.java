package Subtask3;

public class CarManualBuilder implements Builder{

    private Manual manual;

    @Override
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setSeats(int number) {
        manual.seats = number;
    }

    @Override
    public void setEngine(Engine engine) {
        manual.engine = engine;
    }

    @Override
    public void setTripComputer(boolean b) {
        manual.tripComputer = b;
    }

    @Override
    public void setGPS(boolean b) {
        manual.GPS = b;
    }

    public Manual getProduct() {
        Manual product = manual;
        reset();
        return product;
    }
}
