package org.judy.silent_kiosk.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.judy.silent_kiosk.dto.OrderDTO;
import org.judy.silent_kiosk.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class OrderServiceImpl implements OrderService{

    private final OrderRepository orderRepository;

    @Override
    public void insert(OrderDTO dto) {
        orderRepository.save(dtoToEntity(dto));
    }
}
