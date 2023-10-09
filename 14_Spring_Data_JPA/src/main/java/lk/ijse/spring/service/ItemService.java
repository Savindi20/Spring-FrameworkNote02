package lk.ijse.spring.service;

import lk.ijse.spring.dto.ItemDTO;

import java.util.List;

public interface ItemService {

    void addItem(ItemDTO item);

    void deleteItem(String code);

    List<ItemDTO> getAllItem();

    ItemDTO findItem(String code);

    void updateItem(ItemDTO i);
}
