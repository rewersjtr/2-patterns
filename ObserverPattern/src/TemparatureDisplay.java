public class TemparatureDisplay implements Observer {
    private String name;

    public TemparatureDisplay(String name) {
        this.name = name;
    }

    @Override
    public void update(float temperature) {
        System.out.println(name + ": Temperature updated to " + temperature);
    }
}
