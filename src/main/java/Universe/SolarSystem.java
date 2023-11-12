package Universe;

public interface SolarSystem extends Galaxy {

    public void connect();
    public void disconnect();

    @Override
    void nameGalaxy();
}

