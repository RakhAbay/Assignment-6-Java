package Subtask3;

public interface Builder {
    void reset();
    void setSeats(int number);
    void setEngine(Engine engine); //created an engine class to set an engine
    void setTripComputer(boolean a);
    void setGPS(boolean a);
}
