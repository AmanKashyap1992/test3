package test3;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import test3.service.TestService;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
//@CrossOrigin(origins="http://192.168.43.232:8080/app",allowedHeaders = "*") 
//@CrossOrigin(origins="http://localhost:4200",allowedHeaders = "*") 
@CrossOrigin(origins="http://localhost:3000",allowedHeaders = "*")
@RequestMapping(value="/api")  
public class TestController {
	
	@Autowired
	private TestService service;
	 @RequestMapping("running")  
	    public String  application() {  
	     return "App is running..........................";       
	    }
	 @RequestMapping("data")
	 public List<String> getData(){
		 List<String> strlist = new ArrayList<String>();
		 strlist.add("Ram");
		 strlist.add("Sita");
		 strlist.add("Laxman");
		 return strlist;
	 }
	 @PostMapping("saveData")
	 //public String saveData(@RequestBody Map<String,String> mapObj)throws ParseException{
	 public String saveData(@RequestBody User user)throws ParseException{
		 System.out.println(user.getFirstName());
		 String data = user.getFirstName()+ " "+user.getEmail();
		 //return service.saveData(user);
		 return "Success with " +data;
	 }
//	 @PostMapping("pdfDta")
//	 public String saveLoanData(@RequestBody Map<String,String> loanMapObj)  {  
//		 Map<String,String> hasmap = new HashMap<String,String>();
//		 System.out.println(loanMapObj);
//	        return null;  
//	    } 
}
