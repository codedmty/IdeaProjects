package com.eddie;

import java.util.Set;

public class Moon extends HeavenlyBody {

    public Moon(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.MOON);
    }

    @Override
    public double getOrbitalPeriod() {
        return super.getOrbitalPeriod();
    }

    @Override
    public Set<HeavenlyBody> getSatellites() {
        return super.getSatellites();
    }
}
