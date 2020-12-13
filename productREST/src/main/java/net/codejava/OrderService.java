package net.codejava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repo;

	public List<Order1> listAll() {
		return repo.findAll();

	}

	public void save(Order1 order) {
		repo.save(order);
	}

	public Order1 get(Integer id) {
		return repo.findById(id).get();

	}
}
