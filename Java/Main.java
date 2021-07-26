package Java;

class Main  {
    public static void main(String[] args) {
        System.out.println("Hola mundo");

        //Creacion de primer constructor 
        Car car = new Car( "AMQ123", new Account("Javier Ramirez", "10234135","@gmail.com","123"));
        car.passenger = 4;
        car.printDataCar();
        //car.license = "AMQ123";
        //car.driver = "Javier Ramirez";
       

        //Creacion de segundo constructor
        Car car2 = new Car("ARJ450", new Account("Andrea Ramirez", "10234135","@gmail.com","123"));
        
        //car2.license = "ARJ450";
        //car2.driver = "Andrea Rodriguez";
        car2.passenger = 3;
        car2.printDataCar();
        //System.out.println("Car License: " + car2.license);

        User user = new User("Pepe", "1234", "gmail.com", "password");
        user.printDataAccount();


        
    
    }

    
}

