package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.entity.Item;
import lk.ijse.spring.repo.ItemRepo;
import lk.ijse.spring.service.CustomerService;
import lk.ijse.spring.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    ItemService service;

    @PostMapping
    public void addItem(ItemDTO dto){
        service.addItem(dto);
    }

    @DeleteMapping(params = {"code"})
    public void deleteItem(String code){
        service.deleteItem(code);
    }

    @GetMapping
    public List<ItemDTO> getAllItem(){
        return service.getAllItem();
    }

    @GetMapping(params = {"code"})
    public ItemDTO findItem(String code){
        return service.findItem(code);
    }

    @PutMapping
    public void updateItem(@RequestBody ItemDTO i){
        service.updateItem(i);
    }
}
