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

    @Override
    public void addItem(ItemDTO dto) {
        if (itemRepo.existsById(dto.getCode())) {
            throw new RuntimeException(dto.getCode()+" is already available, please insert a new ItemID");
        }

        Item map = mapper.map(dto, Item.class);
        itemRepo.save(map);
    }

    @Override
    public void deleteItem(String code) {
        if (!itemRepo.existsById(code)) {
            throw new RuntimeException(code+ " This Item is not available, please check the ItemID before delete.!");
        }
        itemRepo.deleteById(code);
    }

    @Override
    public List<ItemDTO> getAllItem() {
        List<Item> all = itemRepo.findAll();
        return mapper.map(all, new TypeToken<List<ItemDTO>>() {
        }.getType());
    }

    @Override
    public ItemDTO findItem(String code) {
        if (!itemRepo.existsById(code)) {
            throw new RuntimeException(code+ " This Item is not available, please check the ItemID.!");
        }
        Item item = itemRepo.findById(code).get();
        return mapper.map(item,ItemDTO.class);
    }

    @Override
    public void updateItem(ItemDTO i) {
        if (!itemRepo.existsById(i.getCode())) {
            throw new RuntimeException(i.getCode()+ " This Item is not available, please check the ItemID before update.!");
        }
        Item map = mapper.map(i, Item.class);
        itemRepo.save(map);
    }
}
