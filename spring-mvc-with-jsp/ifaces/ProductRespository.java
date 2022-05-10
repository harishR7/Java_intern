package com.example.demo.ifaces;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Product;
@Repository
public class ProductRespository implements CrudRespostory<Product> {

	private JdbcTemplate template;
	
	
@Autowired
	public ProductRespository(JdbcTemplate template) {
		super();
		this.template = template;
	}

	@Override
	public int add(Product pro) {
		String sql="insert into harish_product values(?,?,?)";
		return  template.update(sql,pro.getProductId(),pro.getProductName(),pro.getPrice());
		
	}

	@Override
	public List<Product> findAll() {
		
		try {
			String findAll="select * from harish_product ";
			return template.query(findAll,BeanPropertyRowMapper.newInstance(Product.class));
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int delete(int id) {
		try {
			String delete="delete from harish_product where product_id=?";
			return template.update(delete,id);
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			System.err.println("not deleted");
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Product findbyId(int id) {
		try {
			String findById="select * from harish_product where product_id=?";
			return template.queryForObject(findById, BeanPropertyRowMapper.newInstance(Product.class),id);
		} catch (DataAccessException e) {
			System.err.println("Id is not present");
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int update(Product pro) {
		try {
			String update="update harish_product set price=? where product_id =?";
			return template.update(update,pro.getPrice(),pro.getProductId());
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			System.err.println("Not updated");
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Optional<Product> findByIdUsingOptional(int id) {
		Optional<Product> optional=Optional.empty();
		
		try {
			
			String findById="select * from harish_product where product_id=?";
			Product found=template.queryForObject(findById, BeanPropertyRowMapper.newInstance(Product.class),id);
			optional=Optional.of(found);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			
		
		}
		return optional;
		
	}

	

}
