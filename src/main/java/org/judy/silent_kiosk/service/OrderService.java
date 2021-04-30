package org.judy.silent_kiosk.service;

import org.judy.silent_kiosk.dto.OrderDTO;
import org.judy.silent_kiosk.entity.TestOrder;

public interface OrderService {

    void insert(OrderDTO dto);

    default TestOrder dtoToEntity(OrderDTO dto){

       return TestOrder.builder()
                .sno(dto.getSno())
                .menu(dto.getMenu())
                .price(dto.getPrice())
                .qty(dto.getQty())
                .build();

    }


}
