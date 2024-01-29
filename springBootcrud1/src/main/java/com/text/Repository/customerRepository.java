package com.text.Repository;



	import org.springframework.data.jpa.repository.JpaRepository;

	import org.springframework.stereotype.Repository;

import com.text.entity.customer;

	@Repository
	public interface customerRepository extends JpaRepository<customer,Integer>
	{

	}

