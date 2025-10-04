public interface Device {
    void turnOn();
    void turnOff();
    boolean isEnabled();
    void setVolume(int percent);
    int getVolume();
}
