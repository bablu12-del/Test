package com.springboot.Controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.springboot.Entities.Employee;
import com.springboot.Entities.Student;
import com.springboot.Repository.EmployeeRepository;
import com.springboot.Repository.StudentRepository;
@CrossOrigin("*")
@Controller
public class StudentController {
	
	  @Autowired 
	  private StudentRepository studentRepository;
	  @Autowired 
	  private EmployeeRepository employeeRepository;
	  
	  @PostMapping("/Student") 
	  public List<Student> saveStudent(@RequestBody List<Student> list){
		  for(Student st:list) { 
			  studentRepository.save(st); 
			  }
	  return list; 
	  }
	  
	  @GetMapping("/Student") 
	  public ResponseEntity<List<Student>> getAllStudent(){
	  List<Student> list = studentRepository.findAll();
	  if(list==null) { 
		  return ResponseEntity.status(HttpStatus.NOT_FOUND).build(); 
		  } 
	  return ResponseEntity.of(Optional.of(list));
	  
	 // return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); 
	  
	  }
	  
	  @DeleteMapping("/Student/{id}")
	  public void deleteStudent(@PathVariable Long id){ 
		studentRepository.deleteById(id);
	   //return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); 
	  }
	  
	  @PutMapping("/Student") 
	  public ResponseEntity<List<Student>> updateStudent(@RequestBody List<Student> list){ 
		  for(Student st:list) {
	  studentRepository.save(st);
	  } 
		  return ResponseEntity.ok(list);
	  }
	 
		@GetMapping("/upload")
		public String Upload() {
			System.out.println("file name ===================");
			return "home";
		}

		@PostMapping("/uploadPDF")
		public String UploadPDF(@RequestParam("id") int id,@RequestParam("name") String name,@RequestParam("file") MultipartFile file,Model model,Employee emp) {
	          try {
	            String uploadDir = "D:\\NIC\\";
	            File destFile = new File(uploadDir + file.getOriginalFilename());
	            if(!destFile.exists())
	            destFile.mkdir();
	            file.transferTo(destFile);
	            emp.setId(id);
	            emp.setName(name);
	            emp.setPdfPath(uploadDir);
	            emp.setPdfName(file.getOriginalFilename());
	            employeeRepository.save(emp); 
	            model.addAttribute("emp", emp);
	            return "formSuccessfull";
	        } catch (IOException e) {
	            return "Error uploading file: " + e.getMessage();
	        }
			
		}
	
}
