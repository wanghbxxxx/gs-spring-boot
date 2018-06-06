package hello.service;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import hello.entity.Customer;
import hello.repository.CustomerDao;
import hello.service.CustomerService;

@RunWith(MockitoJUnitRunner.class)
public class CustomerServiceTest {

    @InjectMocks
	CustomerService customerService;
	
	@Mock
	CustomerDao customerDao;
	
	@Test
	public void testGet() {
		Customer customer = new Customer();
		Optional<Customer> o = Optional.of(customer);
		Mockito.doReturn(o).when(customerDao).findById(1L);
		
		assertEquals(customer, customerService.get(1L));
	}
	
}
