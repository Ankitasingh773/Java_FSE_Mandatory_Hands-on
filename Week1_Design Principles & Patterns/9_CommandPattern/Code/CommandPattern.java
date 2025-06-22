public interface Command {
    void execute();
}
public class LightOnCommand implements Command{
    private Light light;
    public LightOnCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.turnOn();
    }
}
public class LightOffCommand implements Command{
    private Light light;
    public LightOffCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.turnOff();
    }
}
public class Light {
    public void turnOn() {
        System.out.println(" Light is turned ON");
    }
    public void turnOff() {
        System.out.println(" Light is turned OFF");
    }
}
public class RemoteControl {
    private Command command;
    public void setCommand(Command command) {
        this.command = command;
    }
    public void pressButton() {
        if (command != null) {
            command.execute();
        } else {
            System.out.println(" No command set.");
        }
    }
}
ublic class Main {
    public static void main(String[] args) {
        Light RoomLit = new Light();
        Command lightOn = new LightOnCommand(RoomLit);
        Command lightOff = new LightOffCommand(RoomLit);
        RemoteControl remote = new RemoteControl();
        remote.setCommand(lightOn);
        remote.pressButton();
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}
