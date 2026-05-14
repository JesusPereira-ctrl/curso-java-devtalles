package proyectoFinal;

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Fiat", "Duna", 2023, CarType.SEDAN);
        Vehicle myElectricCar = new ElectricCar("Tesla", "Model 3", 2222, CarType.SPORTS, 80);

        myCar.start();
        myElectricCar.start();

        ((ElectricCar) myElectricCar).chargeBattery();
        
        System.out.println(myElectricCar);
        System.out.println(myCar);
    }
}
