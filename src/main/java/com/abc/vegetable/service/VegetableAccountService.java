package com.abc.vegetable.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.abc.vegetable.entity.VegetableAccount;
import com.abc.vegetable.exceptions.InvalidUserException;


@Service

public interface VegetableAccountService 
{
	
	public List<VegetableAccount> getAllvegetable();
	public List<VegetableAccount> filterByCostHtoL();
	public List<VegetableAccount> filterByCostLtoH();	
	public boolean insertvegetable(VegetableAccount p);
	public VegetableAccount searchvegetable(int pizzaId);
	 
}