import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Airport airport = new Airport();

        //TODO Вывод всех аэропортов в удобочитаемом формате
        //airport.printMapAllAirports();

        /**
         * Ввод названия аэропорта
         * и получение списка всех вылетов
         * из него
         */

        System.out.print("Введите название аэропорта, чтобы\nполучить список вылетов из него: ");
        String nameAirport = new Scanner(System.in).nextLine();
        airport.getListAllDepartureFlightsFromSelectedUserAirport(nameAirport);

    }
}
