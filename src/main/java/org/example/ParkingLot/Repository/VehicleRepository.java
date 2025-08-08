package org.example.ParkingLot.Repository;

import org.example.ParkingLot.models.Gate;
import org.example.ParkingLot.models.Vehicle;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class VehicleRepository {
    private Map<String, Vehicle> map = new HashMap<>();
    public Optional<Vehicle> findByVehicleNumber(String vehicleNumber) {
        return Optional.of(map.get(vehicleNumber));
    }

    public Vehicle save(Vehicle vehicle){
        return vehicle;
    }

}
