package kamboj.ankit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students2")
public class StudentController2 {
	
	private List<Student> students=new ArrayList<>();
	
	@GetMapping("/{id}")
	public Student getStudent(@PathVariable int id) {
		return students.get(id);
	}
	
	@PostMapping
	public int createStudent(@RequestBody Student student) {
		students.add(student);
		return student.getId();
	}
	@PutMapping("/{id}")
	public void updateStudent(@RequestBody Student student,@PathVariable int id) {
		students.add(student);
		return;
	}
	@DeleteMapping("/{id}")
	public void deleteStudent(@PathVariable int id) {
		students.remove(id);
		return;
	}

}
