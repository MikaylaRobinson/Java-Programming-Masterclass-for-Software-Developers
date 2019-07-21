public class Planet extends HeavenlyBody {

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, 2);
    }

    @Override
    public boolean addSatellites(HeavenlyBody moon) {
        if (moon.getBodyType() == 1) {
            return super.addSatellites(moon);
        } else {
            return false;
        }
    }
}
