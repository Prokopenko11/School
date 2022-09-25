package StudyRooms;

public class Cabinet {

    private String numberOfCabinet; //номер кабинета
    private String numberOfSeats; //количество мест

    public Cabinet(String numberOfCabinet, String numberOfSeats){
        this.numberOfCabinet = numberOfCabinet;
        this.numberOfSeats = numberOfSeats;
    }

    public String getNumberOfCabinet() {
        return numberOfCabinet;
    }

    public void setNumberOfCabinet(String numberOfCabinet) {
        this.numberOfCabinet = numberOfCabinet;
    }

    public String getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(String numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
