public class FourWheelerPartFactory implements VehiclePartFactory {
    @Override
    public Engine createEngine() {
        return new FourWheelerEngine();
    }

    @Override
    public Body createBody() {
        return new FourWheelerBody();
    }
}