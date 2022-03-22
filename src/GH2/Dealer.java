package GH2;

class Car {
    int carPrice;
    String color;
    Car (int carPrice, String color){
        this.carPrice = carPrice;
        this.color = color;
    }
    double calculateSalePrice(){
        return carPrice;
    }
    void display(){
        System.out.println();
    }
}
class Sedan extends Car{
        int length;
    Sedan(int carPrice, String color, int length) {
        super(carPrice, color);
        this.length = length;
    }
    double calculateSalePrice() {
        if (length > 20) {
            return carPrice * 0.95;
        } else {
            return carPrice * 0.9;
        }
    }
    void display(){
        System.out.println("Car make is Mazda, the price is " + calculateSalePrice() + ", the colour is " + color);
    }
}
class Truck extends Car {
    int weight;
    Truck(int carPrice, String color, int weight) {
        super(carPrice, color);
        this.weight = weight;
    }
    @Override
    double calculateSalePrice() {
        if (weight > 2000) {
            return (carPrice * 0.9);
        } else {
            return (carPrice * 0.8);
        }
    }
    void display(){
        System.out.println("Car make is Ford, the price is " + calculateSalePrice() + ", the colour is " + color);
    }
}

public class Dealer {
    public static void main (String[] args){

        Car Mazda = new Sedan(20000, "red", 15);
        Mazda.display();

        Car Ford = new Truck(15000, "grey", 2001);
        Ford.display();
    }
}

