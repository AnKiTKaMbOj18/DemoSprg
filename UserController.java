package kamboj.ankit;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/users")
public class UserController {

	private Map<Long, User> userDataBase = new HashMap<>();
	
	@GetMapping("/{id}")
	public User getUser(@PathVariable(name="id")Long id) {
		return userDataBase.get(id);
	}
	
	@PostMapping
	public Long createUser(@RequestBody User user) {
		userDataBase.put(user.getId(), user);
		return user.getId();
	}
	
	@PutMapping
	public String updateUSer(@RequestBody User user) {
		userDataBase.put(user.getId(), user);
		return "OK";
	}
	
	@DeleteMapping(path="{id}")
	public String deleteUSer(@PathVariable(name="id")Long id) {
		userDataBase.remove(id);
		return "Ok";
	}
	
}