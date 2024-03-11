import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Practical task 1.6, student Igor Smirnov,RIBO-01-22, variant 1");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите марку машины: ");
        String mark = scan.nextLine();
        Autoservice service = new Autoservice();
        Car car = new Car(mark);
        service.modify(car);
        System.out.println(car.toString());
    }
}