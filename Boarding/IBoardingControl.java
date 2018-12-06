package boarding_control;

import boarding_control.BoardingControlReceipt;

public interface IBoardingControl {

    public boolean inspect(Passport passport);
    public boolean scan(BoardingPass boarding pass);
    public void print(PassengerList passengerList);
    public void notifyGroundOperations(BoardingControlReceipt boardingControlReceipt);

}
