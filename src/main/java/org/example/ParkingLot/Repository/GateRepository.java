package org.example.ParkingLot.Repository;

import org.example.ParkingLot.models.Gate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GateRepository {
    private Map<Integer,Gate> map = new HashMap<>();
    public Optional<Gate> findByGateId(Long gateId) {
        return Optional.of(map.get(gateId));
    }




}
