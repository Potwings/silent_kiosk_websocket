package org.judy.silent_kiosk.repository;

import org.judy.silent_kiosk.entity.TestOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<TestOrder,Long> {


}
