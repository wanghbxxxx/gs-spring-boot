package hello.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hello.entity.Customer;
import hello.repository.CustomerDao;

@Service
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;

    public Customer get(Long id) {
        return customerDao.findById(id).get();
    }

}

