class Automobile {
    private String drive() {
        return "Driving vehicle";
    }
}

class Car extends Automobile {
    protected String drive() {
        return "Driving car";
    }
}

class ElectricCar extends Car {

    @Override
    public final String drive() {
        return "Driving electric car";
    }

    public static void main(String[] wheels) {
        final Car car = new ElectricCar();
        System.out.print(car.drive());
    }
}

   // A. Driving vehicle
   // B. Driving electric car
   // C. Driving car
   // D. The code does not compile

/* --->> if we make default class to ElectricCar class , like a super class(Automobile class) and child class (Car class)
         then the code will be give the output: - B.  Driving electric car <<---*/
