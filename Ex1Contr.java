package kamboj.ankit;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ex1Contr {

	private static final String template = "hello,%s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping(path="/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "world") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));

	}

}