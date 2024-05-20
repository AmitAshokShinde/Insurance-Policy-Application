/*
 * in the controller java its contain all the varible,Repository object,java class,page link etc.
 */
package com.example.demo.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.model.Policy;
import com.example.demo.model.User;
import com.example.demo.repository.PolicyRepository;
import com.example.demo.repository.UserRepository;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@Controller
@SessionAttributes({ "id", "password", "name", "address", "email", "mobileNo" }) // session.setAttribute("id",id)
public class UserController {

	@Autowired // UserRepository userRepository = new UserRepository()
	private UserRepository userRepository;

	@Autowired // PolicyRepository policyRepository = new PolicyRepository()
	private PolicyRepository policyRepository;
	
	
	@GetMapping("showIndex")//this method for showing index info in index.jsp which contain login and sign up page
	public String showIndex() {
		System.out.println("Inside showIndex");
		return "index1";
	}

	@GetMapping("showLogin")
	public String showLogin() {
		System.out.println("Inside showLogin");
		return "login";
	}

	@GetMapping("showSignUp")
	public String showSignUp() {
		System.out.println("Inside showSignUp");
		return "signup";
	}

	@PostMapping("showDashboard")
	public String showDashboard(@RequestParam("id") String id,
			@RequestParam("password") String password) {
		System.out.println("Inside showDashboard");

		if (id.equals("1") && password.equals("0408")) {
			return "dashboard";
		} else if (id.equals("1") && password != ("0408")) {
			return "loginmsg";
		} else if (id != ("1") && password != ("0408")) {
			System.out.println("Please sign up first!");
			return "index1";
		}
		return "dashboard";

	}
	
	@GetMapping("showpolicy")
	public String showpolicy() {
		System.out.println("Inside showpolicy");
		return "policyinfo";
	}
	@GetMapping("showportfolio")
	public String showportfolio() {
		System.out.println("Inside Show Portfolio");
		return "portfolio";
	}

	@GetMapping("showDeleteForm")
	public String showDeleteForm() {
		System.out.println("Inside showDeleteForm");
		return "deletePolicy";
	}
	
	@PostMapping("submitdeleteinfo")
	public String submitdeleteinfo() {
		
		return "deletemsg";
	}
	
	@PostMapping("showportfoliotable")
	public String showportfoliotable(@RequestParam("protid") String protid, @ModelAttribute Policy objpolicy, Model model) {
		System.out.println("Inside portfolio table");
		Optional<Policy> proOpt = policyRepository.findById(Integer.parseInt(protid));
		Policy policy = proOpt.get();
		System.out.println(policy.getUid() + policy.getPolicyname() + policy.getYears() + policy.getAmount() + policy.getSum());
		
		int tid=policy.getUid();
		String tname=policy.getPolicyname();
		int tyear=policy.getYears();
		int tamount=policy.getAmount();
		int tsum= policy.getSum();
		
		model.addAttribute("tid", tid);
		model.addAttribute("tname", tname);
		model.addAttribute("tyear", tyear);
		model.addAttribute("tamount", tamount);
		model.addAttribute("tsum", tsum);
		return "portfoliotable";
		}
	
	@PostMapping("policyform")
	public String policyform(@RequestParam("policyname") String policyname,@RequestParam("uid") String uid, @RequestParam("years") String years,
			@RequestParam("amount") String amount,@RequestParam("sum") String sum , @ModelAttribute Policy policy,Model model) {
		System.out.println(policyname);
		System.out.println(uid);
		System.out.println(years);
		System.out.println(amount);
		System.out.println(sum);
		//Saves policy object to Table policy
		policyRepository.save(policy);//Generates all JDBC Code like"Insert/Update/Delete/SQL
		return "message";
	}


	@PostMapping("submitData")
	public String submitData(@RequestParam("id") String id, @RequestParam("password") String password,
			@RequestParam("name") String name, @RequestParam("address") String address, @RequestParam("email") String email,
			@RequestParam("mobileNo") String mobileNo, @ModelAttribute User userobj, Model model) {
		System.out.println(userobj.getId());
		System.out.println(userobj.getPassword());
		System.out.println(userobj.getName());
		System.out.println(userobj.getAddress());
		System.out.println(userobj.getEmail());
		System.out.println(userobj.getMobileNo());
		userRepository.save(userobj);
		return "message";
	}
	
	
}
