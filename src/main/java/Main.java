import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        Bot bot = new Bot();
        telegramBotsApi.registerBot(bot);


        Airport airport = new Airport();

        //TODO Вывод всех аэропортов в удобочитаемом формате
        airport.getListAllAirports();

        /*
        TODO
         Ввод названия аэропорта
         и получение списка
         всех вылетов из него
         */
        System.out.println(
                "\nВведите название аэропорта,\n" +
                        "чтобы получить список\n" +
                        "всех вылетов из него:");
        String nameAirportForDeparture = new Scanner(System.in).nextLine();
        System.out.println(airport.getListAllDepartureFlightsFromSelectedUserAirport(nameAirportForDeparture));

        /*
        TODO
         Ввод названия аэропорта
         и получение списка
         всех прилётов из него
         */
        System.out.println(
                "\nВведите название аэропорта,\n" +
                        "чтобы получить список\n" +
                        "всех прилётов из него:");
        String nameAirportForArrival = new Scanner(System.in).nextLine();
        System.out.println(airport.getListAllArrivalFlightsFromSelectedUserAirport(nameAirportForArrival));

        //TODO Ввод названия аэропорта, с кот-го осуществляется вылет:
        System.out.println("\nВведите название аэропорта, с кот-го планируете вылететь:");
        String nameAirportForDepartureInPlace = new Scanner(System.in).nextLine();

        //TODO Ввод названия аэропорта, в кот-й хотите прилететь
        System.out.println("\nВведите название аэропорта, в кот-й хотите прилететь:");
        String nameAirportForArrivalInPlace = new Scanner(System.in).nextLine();

        System.out.println(airport.getFirstArrivalFlight(nameAirportForDepartureInPlace, nameAirportForArrivalInPlace));
    }
}