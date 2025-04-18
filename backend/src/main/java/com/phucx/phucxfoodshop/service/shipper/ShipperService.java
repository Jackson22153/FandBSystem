package com.phucx.phucxfoodshop.service.shipper;

import com.phucx.phucxfoodshop.exceptions.ShipperNotFoundException;
import com.phucx.phucxfoodshop.model.entity.Shipper;

public interface ShipperService {
    public Shipper getShipperByID(Integer shipperID) throws ShipperNotFoundException;
}
