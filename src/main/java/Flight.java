import java.time.LocalDateTime;

public class Flight implements Comparable<Flight>{
    private TypeFlight typeFlight;
    private String nameAirline;
    private String numberFlight;
    private String placeForArrival;
    private LocalDateTime timeDeparture;
    private String durationFlight;
    private LocalDateTime timeArrival;
    private String daysForDeparture;

    public Flight(
            TypeFlight typeFlight, String nameAirline,
            String numberFlight, String placeForArrival,
            LocalDateTime timeDeparture, String durationFlight,
            LocalDateTime timeArrival, String daysForDeparture) {
        this.typeFlight = typeFlight;
        this.nameAirline = nameAirline;
        this.numberFlight = numberFlight;
        this.placeForArrival = placeForArrival;
        this.timeDeparture = timeDeparture;
        this.durationFlight = durationFlight;
        this.timeArrival = timeArrival;
        this.daysForDeparture = daysForDeparture;
    }

    public TypeFlight getTypeFlight() {
        return typeFlight;
    }

    public String getNameAirline() {
        return nameAirline;
    }

    public String getNumberFlight() {
        return numberFlight;
    }

    public String getPlaceForArrival() {
        return placeForArrival;
    }

    public LocalDateTime getTimeDeparture() {
        return timeDeparture;
    }

    public String getDurationFlight() {
        return durationFlight;
    }

    public LocalDateTime getTimeArrival() {
        return timeArrival;
    }

    public String getDaysForDeparture() {
        return daysForDeparture;
    }

    @Override
    public String toString() {
        return "\"\uD83C\uDF89\"Flight{" +
                "typeFlight=" + typeFlight +
                ", nameAirline='" + nameAirline + '\'' +
                ", numberFlight='" + numberFlight + '\'' +
                ", placeForArrival='" + placeForArrival + '\'' +
                ", timeDeparture=" + timeDeparture +
                ", durationFlight='" + durationFlight + '\'' +
                ", timeArrival=" + timeArrival +
                ", daysForDeparture='" + daysForDeparture + '\'' +
                "}\"\uD83C\uDF89\"\n";
    }

    @Override
    public int compareTo(Flight o) {
        return this.getTimeArrival().compareTo(o.getTimeArrival());
    }

    public enum TypeFlight {
        DEPARTURE,
        ARRIVAL
    }
}