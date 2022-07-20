package com.abc.vegetable.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import com.abc.vegetable.dto.LoginDTO;
import com.abc.vegetable.entity.*;
import com.abc.vegetable.exceptions.InvalidUserException;
import com.abc.vegetable.service.VegetableAccountService;
import com.abc.vegetable.validation.ValidateEntry;

@RestController
@RequestMapping("/vegetable")
@CrossOrigin(origins= {"http://localhost:8080","http://localhost:4200"})
public class VegetableAccountRestController {
	@Autowired
	VegetableAccountService vegetableAccountService;
	
	
	
	@GetMapping("/allvegetable")
	public List<VegetableAccount> doThis()
	{
		return vegetableAccountService.getAllvegetable();
	}
	@GetMapping("/vegetablefromHtoL")
	public List<VegetableAccount> vegetablefromHtoL()
	{
		return vegetableAccountService.filterByCostHtoL();
	}
	@GetMapping("/vegetablefromLtoH")
	public List<VegetableAccount> pizzafromLtoH()
	{
		return vegetableAccountService.filterByCostLtoH();
	}
	
	
	@PostMapping("/add") 
	public String savedAccountFromWeb(@RequestBody VegetableAccount a)
	{
		boolean status =vegetableAccountService.insertvegetable(a);
	
		return status == true?"Vegetable Added ":"Contact to customer Care";
	}
	/*@PutMapping("/admin/update")//localhost:8080/pizza/admin/update?name=chickenpizza&amount=555
	public String updated(@RequestParam String name,@RequestParam int amount) {
		String msg = "Test updated";
		boolean result = pizzaAccountService.updatePizzaAccount(name, amount);
		return msg;
	}*/
	/*@GetMapping("user/{pizzaId}")
	public PizzaAccount getProduct(@PathVariable int pizzaId,HttpServletRequest req) throws InvalidUserException{
		HttpSession session = req.getSession(false);
		if(session!=null) {
		String role = (String)session.getAttribute("role");
		if(role.equalsIgnoreCase("User")) {
			PizzaAccount obj =  pizzaAccountService.searchPizza(pizzaId);
		return obj;
		}
		else {
			String username = (String)session.getAttribute("username");
			String password = (String)session.getAttribute("password");
			throw new InvalidUserException(username,password);
		}
		}
		else {
			throw new InvalidUserException("none","none");
		}
		
	}*/
	

}
