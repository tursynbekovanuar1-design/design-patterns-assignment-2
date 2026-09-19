public class TwoWheelerPartFactory implements VehiclePartFactory {
    @Override
    public Engine createEngine() {
        return new TwoWheelerEngine();
    }

    @Override
    public Body createBody() {
        return new TwoWheelerBody();
    }
}