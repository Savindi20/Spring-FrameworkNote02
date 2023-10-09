package lk.ijse.spring.service.impl;

import lk.ijse.spring.service.CustomerBO;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional // manage all the transactions
public class CustomerBOImpl implements CustomerBO {
}
