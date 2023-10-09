package lk.ijse.spring.controller;

import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.entity.Item;
import lk.ijse.spring.repo.ItemRepo;
import lk.ijse.spring.service.ItemService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
@CrossOrigin // will support to cors requests
public class ItemController {

    @Autowired
    ItemService service;

    @PostMapping
    public ResponseUtil addItem(ItemDTO dto){
        service.addItem(dto);
        return new ResponseUtil("Ok","Successfully Added",dto);
    }

    @DeleteMapping(params = {"code"})
    public ResponseUtil deleteItem(String code){
        service.deleteItem(code);
        return new ResponseUtil("Ok","Successfully Deleted",code);
    }

    @GetMapping
    public ResponseUtil getAllItem(){
        return new ResponseUtil("Ok","Successfully Loaded",service.getAllItem());
    }

    @GetMapping(params = {"code"})
    public ResponseUtil findItem(String code){
        return new ResponseUtil("Ok","Successful", service.findItem(code));
    }

    @PutMapping
    public ResponseUtil updateItem(@RequestBody ItemDTO i){
        service.updateItem(i);
        return new ResponseUtil("Ok","Successfully Updated",i);
    }
}
