package lk.ijse.spring.repo;

import lk.ijse.spring.config.WebRootConfig;
import lk.ijse.spring.entity.Item;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;

@WebAppConfiguration // create testing context
@ContextConfiguration(classes = {WebRootConfig.class}) //load configurations which wanted for test context
@ExtendWith(SpringExtension.class)
@Transactional // will not save data on db
class ItemRepoTest {

    @Autowired
    ItemRepo itemRepo;

    @Test
    public void testAddItem(){
        Item item = new Item("I002","Lux",100,new BigDecimal(100.00));
        itemRepo.save(item);
    }
    @Test
    public void testGetAllItems(){
        List<Item> all = itemRepo.findAll();
        for (Item item : all) {
            System.out.println(item.toString());
        }
    }

}