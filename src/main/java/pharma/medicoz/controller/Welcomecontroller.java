package pharma.medicoz.controller;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pharma.medicoz.pojo.MedicinePojo;
import pharma.medicoz.pojo.UserLoginPojo;
import pharma.medicoz.service.MedicineService;



@Controller

public class Welcomecontroller {
	@Autowired
	private MedicineService medicozService;
	
	
	
	
	
	
	 @GetMapping("/")
	    String welcomePage()
	    {
	        
	        return "welcome";
	    }
	 
	 @GetMapping("/loginpage")
		    String showlogin(ModelMap model) 
		 {
		       model.addAttribute("medicozLoginPojo", new  UserLoginPojo());
		        return "loginpage";
		 }
	
			
	 
	 @PostMapping(value = "/registeradmin") 
	 public String loginpage(@ModelAttribute("admin") UserLoginPojo n)
	 {
		 if((n.getUsername().equals("admin"))&&(n.getPassword().equals("admin123")))
		 {
			 return "redirect:dashboard";
		 }
		 else
		 {
			 return "loginfail";
		 }
	 }
		 
			
			 
			@GetMapping("/dashboard") 
	 String loginsuccess() {
			  
			  return "dashboard"; }
			 
		 
		
		 @GetMapping("/showaddmedicinepage")
		    String showaddpage(ModelMap model) 
		 {
			  model.addAttribute("medicozPojo", new  MedicinePojo());
		        return "addmedicine";
		 }
		 
			@PostMapping(value = "/addmedicine")
			public String addmedicnes(@ModelAttribute("medicozPojo") MedicinePojo c)
		       {
				medicozService.save(c);
				return "redirect:listmedicine";
			  }
			
			@GetMapping(value = "/listmedicine")
			public String listmed(ModelMap model)
		       {

				List<MedicinePojo> medicozPojoList = medicozService.list();
				model.addAttribute("medicozPojoListObj", medicozPojoList);
				model.addAttribute("medicozPojo", new MedicinePojo());
				
				return "listmed";
			  }
			
			 @GetMapping("/availablestock")
			    String availablestock()
			    {
			        
			        return "redirect:listmedicine";
			    }		
			 @GetMapping(value = "/showEdit")
				public String editdrug(@RequestParam int serialnumber, ModelMap model) 
				{
					MedicinePojo medicozPojo = medicozService.get(serialnumber);
					model.addAttribute("medicozPojo", medicozPojo);
					return "editdrug";
				}
				
				@PostMapping(value = "/editdrug")
				public String editdrug(@ModelAttribute("medicozPojo") MedicinePojo c) 
				{
					medicozService.update(c);
					return "redirect:listmedicine";
				}
				@GetMapping(value = "/deletedrug")
				public String deleteCustomer(@RequestParam int serialnumber) 
				{
					medicozService.delete(serialnumber);

					return "redirect:listmedicine";
				}
				// searchBYCompanyName
				@PostMapping(value = "/searchbymedicineName")
				public String searchBYCompanyName( @Valid @ModelAttribute("medicozPojo") MedicinePojo m,BindingResult br, ModelMap model) {


					List<MedicinePojo> medicinePojoList = medicozService.findByMedName(m.getMedicinename().trim());

					model.addAttribute("medicozPojoListObj", medicinePojoList);

					return "listmed";
				}
}
