package kamboj.ankit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

	List<Student> students = new ArrayList<>(Arrays.asList(new Student()));
	
	@RequestMapping("/")
	public List<Student> getAllStudents(){
		return students;
	}

	@GetMapping("/{id}")
	public Student getStudent(@PathVariable int id) {
		return students.get(id);
	}

	@PostMapping
	public int createStudent(@RequestBody Student student) {
		students.add(student.getId(), student);
		return student.getId();
	}
	@PutMapping("/{id}")
	public String updateStudent(@RequestBody Student student,@PathVariable int id) {
		students.add(student.getId(), student);
		return "updated";
	}
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable int id) {
		students.remove(id);
		return "deleted";
	}
}
