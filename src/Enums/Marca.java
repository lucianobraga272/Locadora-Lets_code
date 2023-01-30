package Enums;

public enum Marca {
     ALFA_ROMEO("Alfa Romeo"), AUDI("Audi"), BMW("BMW"), CAOA_CHERY("Caoa Chery"), CHEVROLET("Chevrolet"), 
     CITROEN("Citroen"), FIAT("Fiat"), FORD("Ford"), HONDA("Honda"), HYUNDAI("Hyundai"), JAC("JAC"), 
     JEEP("JEEP"), MERCEDES_BENZ("Mercedes Benz"), MITSUBISHI("Mitsubishi"), NISSAN("Nissan"), PEUGEOT("Peugeout"), 
     RENAULT("Renault"), SUZUKI("Suzuki"), TOYOTA("Toyota"), VOLSKWAGEM("Volkswagen"), VOLVO("Volvo"), YAMAHA("Yamaha");

     public final String marca;

     private Marca(String marca){
        this.marca = marca;
     }
}
