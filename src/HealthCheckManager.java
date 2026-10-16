public class HealthCheckManager implements  IMatchPreparation{
    @Override
    public void prepare() {
        System.out.println("Checking players' health");
    }
}
