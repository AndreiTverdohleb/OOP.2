package oop2;

public class ServiceStation {

    public void check(Car car){
        if (car != null) {
            internalCheck(car);
            car.checkEngine();
        }
    }

    public void check(Bicycle bicycle){
        if (bicycle != null) {
            internalCheck(bicycle);
        }
    }

    public void check(Truck truck){
        if (truck != null) {
            internalCheck(truck);
            truck.checkEngine();
            truck.checkTrailer();
        }

    }
    private void internalCheck (Parental parental){
        System.out.println("Обслуживаем " + parental.getModelName());
        for (int i = 0; i < parental.getWheelsCount(); i++) {
            parental.updateTyre();
        }

    }

}