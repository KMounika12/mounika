package com.text.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.text.entity.customer;

import com.text.service.customerservice;
@RestController
@RequestMapping("/cst")

public class customercontroller
{
	
	
		@Autowired
		private customerservice cstserv;
		@PostMapping("/creates")
		public customer create(@RequestBody customer cst)
		{
			return cstserv.create(cst);
	
		}
		@GetMapping("/get")
		public List<customer>getcustomer()
		{
			return cstserv.getcustomer(); 
		}
@PutMapping("/update/{id}")
		public customer update(@PathVariable int id,@RequestBody customer cst)
		{
			return cstserv.update(id,cst);
		}
@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id)
	{
		cstserv.delete(id);
	}

	}

