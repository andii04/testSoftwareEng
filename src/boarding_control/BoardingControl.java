package boarding_control;

//sfasfasfasfewwterrfffffffffffffffffffffffffffffffffffffffffffffffff
public class BoardingControl implements IBoardingControl {

    private ReadingDevice readingDevice;
    private ArrayList<BoardPassList> boardingPassList;
    private ISeatManagement seatManagement;

    public BoardingControl() {

    }

    public boolean inspect(Passport passport)
    {
        return true;
    }
    public boolean scan(BoardingPass boardingPass)
    {
        return true;
    }
    public void print(PassengerList passengerList)
    {

    }
    public void notifyGroundOperations(BoardingControlReceipt boardingControlReceipt)
    {

    }


}
