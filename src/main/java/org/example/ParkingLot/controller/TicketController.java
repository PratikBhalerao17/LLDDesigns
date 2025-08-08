package org.example.ParkingLot.controller;

import org.example.ParkingLot.Exceptions.InvalidGateIDException;
import org.example.ParkingLot.Service.TicketService;
import org.example.ParkingLot.dtos.IssueTicketRequestDTO;
import org.example.ParkingLot.dtos.IssueTicketResponseDTO;
import org.example.ParkingLot.dtos.ResponseStatus;
import org.example.ParkingLot.models.Ticket;

public class TicketController {

    private TicketService ticketService;


    public IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO issueTicketRequestDTO){
        IssueTicketResponseDTO issueTicketResponseDTO = new IssueTicketResponseDTO();
        try {
            Ticket ticket = ticketService.issueTicket(issueTicketRequestDTO.getGateId(),
                                      issueTicketRequestDTO.getOperatorId(),
                                      issueTicketRequestDTO.getVehicleNumber());

            issueTicketResponseDTO.setTicket(ticket);
            issueTicketResponseDTO.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (InvalidGateIDException e) {
           issueTicketResponseDTO.setResponseStatus(ResponseStatus.FAILURE);
        }
        return issueTicketResponseDTO;
    }

}
