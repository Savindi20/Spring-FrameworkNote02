package lk.ijse.spring.dao;

import lk.ijse.spring.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemDAO extends JpaRepository<Item,String> {
}
