package Subtask3;

public class Application {

    public static void  main(String[] args){
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();

        director.constructSportsCar(carBuilder);
        Car car1 = carBuilder.getProduct();

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual manual1 = manualBuilder.getProduct();


        director.constructSUV(carBuilder);
        Car car2 = carBuilder.getProduct();
        director.constructSUV(manualBuilder);
        Manual manual2 = manualBuilder.getProduct();

        System.out.println("SportsCar:");
        System.out.println("Number of seats: "+car1.seats+", Engine type: "+car1.engine+", GPS: "+car1.GPS+", TripComputer: "+car1.tripComputer);
        System.out.println("(Manual)Number of seats: "+manual1.seats+", Engine type: "+manual1.engine+", GPS: "+manual1.GPS+", TripComputer: "+manual1.tripComputer);

        System.out.println("SUV:");
        System.out.println("Number of seats: "+car2.seats+", Engine type: "+car2.engine+", GPS: "+car2.GPS+", TripComputer: "+car2.tripComputer);
        System.out.println("(Manual)Number of seats: "+manual2.seats+", Engine type: "+manual2.engine+", GPS: "+manual2.GPS+", TripComputer: "+manual2.tripComputer);

    }
}
