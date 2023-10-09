package lk.ijse.spring.service.impl;

import lk.ijse.spring.service.ItemService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional // manage all the transactions here // AOP
public class ItemServiceImpl implements ItemService {
public ItemServiceImpl(){
    System.out.println("ItemServiceImpl Instantiated");
}
}
