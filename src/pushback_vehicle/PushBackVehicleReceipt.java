package pushback_vehicle;

public class PushBackVehicleReceipt {
    private String uuid;
    private String pushBackVehicleID;
    private Gate gate;

    public PushBackVehicleReceipt(String uuid, String pushBackVehicleID, Gate gate) {
        this.uuid = uuid;
        this.pushBackVehicleID = pushBackVehicleID;
        this.Gate = gate;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getPushBackVehicleID() {
        return pushBackVehicleID;
    }

    public void setPushBackVehicleID(String pushBackVehicleID) {
        this.pushBackVehicleID = pushBackVehicleID;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }
}
