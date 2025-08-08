package org.example.ParkingLot.models;

import java.util.List;

public class ParkingFloor extends BaseModel{
    private double parkingFloorNumber;
    private List<ParkingSpot> parkingSpots;
    private ParkingFloorStatus parkingFloorStatus;

    public double getParkingFloorNumber() {
        return parkingFloorNumber;
    }

    public void setParkingFloorNumber(double parkingFloorNumber) {
        this.parkingFloorNumber = parkingFloorNumber;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public ParkingFloorStatus getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }
}
