package com.abc.vegetable.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.text.Normalizer.Form;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

import com.abc.vegetable.entity.*;
import com.abc.vegetable.exceptions.*;
import com.abc.vegetable.repository.*;
import com.abc.vegetable.service.*;


@Service
public class VegetableAccountServiceImpl implements VegetableAccountService{
	
	@Autowired
	VegetableAccountRepository vegetableAccountRepository;

	

	@Override
	public List<VegetableAccount> getAllvegetable() {
		// TODO Auto-generated method stub

	    return vegetableAccountRepository.findAll();
	}
	@Override
	public List<VegetableAccount> filterByCostLtoH(){
		List<VegetableAccount> ls =   vegetableAccountRepository.findAll();
		Collections.sort(ls, new Comparator<VegetableAccount>() {

			@Override
			public int compare(VegetableAccount o1, VegetableAccount o2) {
				
				return o1.getvegetableAmount()-o2.getvegetableAmount();
			}
		});
		return ls;
	
	}
	public List<VegetableAccount> filterByCostHtoL(){
		List<VegetableAccount> ls = vegetableAccountRepository.findAll();
		Collections.sort(ls, Collections.reverseOrder(new Comparator<VegetableAccount>() {

			@Override
			public int compare(VegetableAccount o1, VegetableAccount o2) {
				
				return o1.getvegetableAmount()-o2.getvegetableAmount();
			}
		}));
	
		return ls;
	}
	@Override
	public boolean insertvegetable(VegetableAccount p) {
		VegetableAccount savedObject =   vegetableAccountRepository.save(p);
		
		return savedObject!=null?true:false;
	}
	@Override
	public VegetableAccount searchvegetable(int vegetableId) {
		VegetableAccount obj1 =  vegetableAccountRepository.findById(vegetableId).get();
		return obj1;
	
	}
	
	
	
}
