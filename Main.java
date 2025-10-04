public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        RemoteControl remote = new RemoteControl(tv);
        remote.togglePower();
        remote.volumeUp();
        remote.volumeDown();

        System.out.println();

        Device light = new Light();
        AdvancedRemote advancedRemote = new AdvancedRemote(light);
        advancedRemote.togglePower();
        advancedRemote.volumeUp();
        advancedRemote.mute();
    }
}
