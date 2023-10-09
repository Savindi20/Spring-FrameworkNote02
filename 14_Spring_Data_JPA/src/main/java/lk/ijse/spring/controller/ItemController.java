package lk.ijse.spring.controller;

import lk.ijse.spring.repo.ItemDAO;
import lk.ijse.spring.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    ItemDAO itemDAO;

    @PostMapping
    public void addItem(Item item){
        itemDAO.save(item);
    }
}
