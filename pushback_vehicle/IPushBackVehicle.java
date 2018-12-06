public interface IPushBackVehicle {
    public void connect(airplane Airplane);
    public void disconnectAirplane();
    public void execute(airplane Airplane,taxiway TaxiWay);
    public void forward(int speedInMPH);
    public void backward(int speedInMPH);
    public void turnLeft(int degree);
    public void turnRight(int degree);
    public void stop();
    public void up();
    public void down();
    public void setFlashingLightOn();
    public void setFlashingLightOff();
    public void setSteeringPin();
    public void removeSteeringPin();
    public void notifyGroundOperations(pushBackVehicleReceipt PushBackVehicleReceipt);

}
