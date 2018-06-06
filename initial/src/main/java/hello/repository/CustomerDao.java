package hello.repository;

import org.springframework.data.repository.CrudRepository;

import hello.entity.Customer;

public interface CustomerDao extends CrudRepository<Customer, Long> {

    Customer findTopByLastName(String lastName);

}

