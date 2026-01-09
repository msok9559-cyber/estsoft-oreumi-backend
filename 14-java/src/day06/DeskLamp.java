package day06;

public class DeskLamp {
    private boolean isOn;
    public DeskLamp(boolean isOn) { this.isOn = isOn; }
    public boolean isOn() { return isOn; }
    public DeskLamp turnOn(){
        isOn = true;
        return this;
    }
    public DeskLamp turnOff(){
        isOn = false;
        return this;
    }

    public void printStatus(){
        System.out.println("Status :" + (isOn ? "ON" : "OFF"));
    }
}
