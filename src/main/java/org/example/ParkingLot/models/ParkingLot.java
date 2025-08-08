package org.example.ParkingLot.models;

import java.util.List;

public class ParkingLot extends BaseModel{
    private double parkingkLotNumber;
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
    private ParkingLotStatus parkingLotStatus;
    private List<SupportedVehicles> supportedVehicles;
    private List<Ticket> tickets;

}
