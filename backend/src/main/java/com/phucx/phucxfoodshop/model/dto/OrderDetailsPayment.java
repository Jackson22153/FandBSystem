package com.phucx.phucxfoodshop.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailsPayment extends OrderDetails{
    private String paymentMethod;
}
