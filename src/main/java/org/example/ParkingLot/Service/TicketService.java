package org.example.ParkingLot.Service;

import org.example.ParkingLot.Exceptions.InvalidGateIDException;
import org.example.ParkingLot.Repository.GateRepository;
import org.example.ParkingLot.Repository.OperatorRepository;
import org.example.ParkingLot.Repository.VehicleRepository;
import org.example.ParkingLot.models.Gate;
import org.example.ParkingLot.models.Operator;
import org.example.ParkingLot.models.Ticket;
import org.example.ParkingLot.models.Vehicle;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private OperatorRepository operatorRepository;

    public Ticket issueTicket(Long gateId, Long operatorId, String vehicleNumber) throws InvalidGateIDException {
        //Need gate object,operator object,vehicle object
        Optional<Gate> Optionalgate = gateRepository.findByGateId(gateId);
        Optional<Vehicle> Optionalvehicle = vehicleRepository.findByVehicleNumber(vehicleNumber);
        Optional<Operator> OptionalOperator = operatorRepository.fetchbyOperatorID(operatorId);

        if(Optionalgate.isEmpty() || OptionalOperator.isEmpty()){
            throw new InvalidGateIDException("Enter the valid gate ID");
        }
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());
        Gate gate = Optionalgate.get();
        Operator operator = OptionalOperator.get();
        ticket.setOperator(operator);
        ticket.setGate(gate);

        //If vehicle is not found means create new vehicle object else get that object from repository

        Vehicle vehicle = null;
        if(Optionalvehicle.isEmpty()){
            //create new vehicle object
//            Vehicle vehicle = new Vehicle();
            vehicle.setVehicleNumber(vehicleNumber);
            vehicle = vehicleRepository.save(vehicle);
        }
        else
            vehicle = Optionalvehicle.get();

        ticket.setVehicle(vehicle);

        return ticket;
    }
}
