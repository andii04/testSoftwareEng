public interface IBoardingControl {

    public boolean inspect(Passport passport);
    public boolean scan(BoardingPass boardingPass);
    public void print(PassengerList passengerList);
    public void notifyGroundOperations(BoardingControlReceipt boardingControlReceipt);

}
