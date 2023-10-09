package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.Item;
import lk.ijse.spring.repo.ItemRepo;
import lk.ijse.spring.service.ItemService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional // manage all the transactions here // AOP
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepo itemRepo;

    @Autowired
    ModelMapper mapper;

    public ItemServiceImpl() {
        System.out.println("ItemServiceImpl Instantiated");
    }

    @Override
    public void addItem(ItemDTO item) {
        itemRepo.save(mapper.map(item, Item.class));
    }

    @Override
    public void deleteItem(String code) {
        itemRepo.deleteById(code);
    }

    @Override
    public List<ItemDTO> getAllItem() {
        List<Item> all = itemRepo.findAll();
        return mapper.map(all, new TypeToken<List<ItemDTO>>() {
        }.getType());
        //new TypeToken<>(){}.getType()
        //new TypeToken<List<CustomerDTO>>(){}.getType()
    }

    @Override
    public ItemDTO findItem(String code) {
        Item item = itemRepo.findById(code).get();
        return mapper.map(item,ItemDTO.class);
    }

    @Override
    public void updateItem(ItemDTO i) {
        Item map = mapper.map(i, Item.class);
        itemRepo.save(map);
    }
}
