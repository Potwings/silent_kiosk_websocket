package org.judy.silent_kiosk.controller;

import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.hibernate.criterion.Order;
import org.judy.silent_kiosk.dto.OrderDTO;
import org.judy.silent_kiosk.model.ChatMessage;
import org.judy.silent_kiosk.service.OrderService;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
public class OrderController {

    private final SimpMessagingTemplate simpMessagingTemplate;

    private final OrderService orderService;

    @PostMapping("/getOrder")
    public Long testOrder(@RequestBody OrderDTO orderDTO){

        log.info(orderDTO);

        Long sno = orderDTO.getSno();

        Gson gson = new Gson();

        String dto = gson.toJson(orderDTO);

        String destination = "/topic/public/"+sno;

        ChatMessage chatMessage = ChatMessage.builder().sno(sno).sender("사장님").content(dto).build();
        simpMessagingTemplate.convertAndSend(destination, chatMessage);

        orderService.insert(orderDTO);

        Long ordernum = 120L;

        return ordernum;
   }


}
