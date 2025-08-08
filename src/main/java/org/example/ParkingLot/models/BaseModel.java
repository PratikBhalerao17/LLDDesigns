package org.example.ParkingLot.models;

import java.util.Date;

public class BaseModel {
    private double id;
    private Date createdAt;

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
