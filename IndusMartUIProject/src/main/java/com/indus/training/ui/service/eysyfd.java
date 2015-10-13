package com.indus.training.ui.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.indus.training.ui.impl.IndusMartPO;

public class eysyfd {

	private IndusMartPO indusMartPO;
	@Before
	public void setUp() throws Exception {
		 indusMartPO = new IndusMartPO();
	}

	@After
	public void tearDown() throws Exception {
		 indusMartPO = null;
	}

	@Test
	public void testGetCustomerTODetails() {
		 indusMartPO.setCustomerId(1);
			System.out.println(indusMartPO.getCustomerTODetails()); 
	}

//	@Test
//	public void testGetOrderMODetails() {
//        indusMartPO.setCustomerId(1);
//		System.out.println(indusMartPO.getOrderMODetails()); 
//	   
//	}

}
