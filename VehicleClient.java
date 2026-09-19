public class VehicleClient {
    private Engine engine;
    private Body body;

    public VehicleClient(VehiclePartFactory factory) {
        engine = factory.createEngine();
        body = factory.createBody();
    }

    public void assembleVehicle() {
        engine.assembleEngine();
        body.assembleBody();
    }
}