package org.example.ParkingLot.Repository;

import org.example.ParkingLot.models.Operator;

import javax.swing.plaf.OptionPaneUI;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OperatorRepository {
    private Map<Integer, Operator> map =new HashMap<>();

    public Optional<Operator> fetchbyOperatorID(Long operatorId){
        return Optional.of(map.get(operatorId));
    }
}
