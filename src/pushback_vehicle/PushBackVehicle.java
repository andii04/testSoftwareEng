package pushback_vehicle;

public class PushBackVehicle implements IPushBackVehicle{

    private String uuid;
    private String id;
    private String type;
    private boolean isAirplaneConnected;
    private int speedInMPH;
    private int degree;
    private boolean isUp;
    private boolean isFlashingLightOn;
    private boolean isSteeringPinSet;

    public void connect(Airplane airplane) {
        isAirplaneConnected = true;
    }

    public void disconnectAirplane() {
        isAirplaneConnected = false;
    }

    public void execute(Airplane airplane, Taxiway taxiWay) {

    }

    public void forward(int speedInMPH){
        this.speedInMPH += speedInMPH;
    }

    public void backward(int speedInMPH) {
        this.speedInMPH -= speedInMPH;
    }

    public void turnLeft(int degree) {
        this.degree -= degree;
    }

    public void turnRight(int degree) {
        this.degree += degree;
    }

    public void stop() {

    }

    public void up() {
        isUp = true;
    }

    public void down() {
        isUp = false;
    }

    public void setFlashingLightOn() {
        isFlashingLightOn = true;
    }

    public void setFlashingLightOff() {
        isFlashingLightOn = false;
    }

    public void setSteeringPin() {
        isSteeringPinSet = true;
    }

    public void removeSteeringPin() {
        isSteeringPinSet = false;
    }

    public void notifyGroundOperations(PushBackVehicleReceipt pushBackVehicleReceipt) {

    }




}
