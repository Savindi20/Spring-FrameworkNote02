package lk.ijse.spring.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Array;
import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDTO {
    private String id;
    private String name;
    private String address;
    private double salary;
    private String tp;
    private ArrayList<ItemsDTO> items;
}
