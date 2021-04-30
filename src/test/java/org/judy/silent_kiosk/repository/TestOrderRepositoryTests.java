package org.judy.silent_kiosk.repository;

import org.judy.silent_kiosk.entity.TestOrder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestOrderRepositoryTests {

    @Autowired
    OrderRepository orderRepository;

    @Test
    public void testInsert(){

        Long sno = 18L;

        Long price = 7000L;

        Long qty = 3L;

        TestOrder testOrder = TestOrder.builder().sno(sno).menu("치즈돈까스").price(price).qty(qty).build();

        orderRepository.save(testOrder);

    }

}
