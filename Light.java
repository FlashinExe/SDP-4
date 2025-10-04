public class Light implements Device {
    private boolean on = false;
    private int brightness = 50;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("Light is ON");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("Light is OFF");
    }

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void setVolume(int percent) {
        brightness = percent;
        System.out.println("Light brightness set to " + brightness);
    }

    @Override
    public int getVolume() {
        return brightness;
    }
}
