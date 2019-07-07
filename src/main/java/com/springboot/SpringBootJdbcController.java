package com.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Customer;
import com.springboot.model.CustomerRowMapper;

@CrossOrigin(origins = "http://localhost:4200")

@RestController
public class SpringBootJdbcController {
	@Autowired
	JdbcTemplate template;

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public int index(@RequestBody Customer user)
	{
		return template.update("insert into customer(name, email, commodity, weight, weight_desc, rupees, purchase_date ) " +  "values(?, ?, ?, ?, ?, ?, ?)",
		new Object[]{
				user.getName(), user.getEmail(), user.getCommodity(), user.getWeight(), user.getWeight_desc(), user.getRupees(), user.getPurchase_date()
        });

	}

	@RequestMapping(value = "/getUsers", method = RequestMethod.GET)
	public List<Customer> getCustomersData() {
		List<Customer> list = template.query("select * from customer", new CustomerRowMapper());
		System.out.println("Employees List::"+list);
		return list;
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public void deleteCustomer(@PathVariable Long id){
		System.out.println("employeeId:: "+id);
		String sql = "DELETE FROM customer WHERE id=?";
		template.update(sql, id);

	}
	@RequestMapping(value = "/updateUser", method=RequestMethod.PUT)
	public void updateCustomer(@RequestBody Customer user){
		System.out.println("updateCustomer id::: "+user.getId());
	    String sql = "UPDATE customer SET name=?, email=? WHERE id=?";
	    template.update(sql, user.getName(), user.getEmail(), user.getId());

	}

}
