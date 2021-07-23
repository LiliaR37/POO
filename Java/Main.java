package Java;

class Main  {
    public static void main(String[] args) {
        System.out.println("Hola mundo");

        //Creacion de primer constructor 
        Car car = new Car( "AMQ123", new Account("Javier Ramirez", "AND123"));
        car.passenger = 4;
        car.printDataCar();
        //car.license = "AMQ123";
        //car.driver = "Javier Ramirez";
       

        //Creacion de segundo constructor
        Car car2 = new Car("ARJ450", new Account("Andrea Rodriguez","AND450"));
        
        //car2.license = "ARJ450";
        //car2.driver = "Andrea Rodriguez";
        car2.passenger = 3;
        car2.printDataCar();
        //System.out.println("Car License: " + car2.license);



        
    
    }

    
}

