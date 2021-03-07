package Subtask3;

public class CarBuilder implements Builder{

    private Car car;

    public CarBuilder(){
        this.reset();
    }


    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int number) {
        car.seats = number;
    }

    @Override
    public void setEngine(Engine engine) {
        car.engine = engine;
    }

    @Override
    public void setTripComputer(boolean b) {
        car.tripComputer = b;
    }

    @Override
    public void setGPS(boolean b) {
        car.GPS = b;
    }

    public Car getProduct(){
        Car product = this.car;
        this.reset();
        return product;
    }
}
