package br.com.work.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.work.entity.People;
import br.com.work.service.PeopleService;

@RestController
@RequestMapping("/Way")
public class PeopleController {

	@Autowired
	private PeopleService service;

	@GetMapping("/Take")
	public ResponseEntity<People> Getting() {
		People person = service.buscarr();
		return ResponseEntity.ok(person);
	}
	
	@GetMapping("/Take1")
	public ResponseEntity<People> Getting1() {
		People person = service.buscarr1();
		return ResponseEntity.ok(person);
	}
	
	@GetMapping("/Take2")
	public ResponseEntity<People> Getting2() {
		People person = service.buscarr2();
		return ResponseEntity.ok(person);
	}
	
	@GetMapping("/Take3")
	public ResponseEntity<People> Getting3() {
		People person = service.buscarr3();
		return ResponseEntity.ok(person);
	}
	
	@GetMapping("/TakePerson")
	public ResponseEntity<People> GettingPerson() {
		People person = service.buscarPersonagem();
		return ResponseEntity.ok(person);
	}
	
	@GetMapping("/TakePerson1")
	public ResponseEntity<People> GettingPerson1() {
		People person = service.buscarPersonagem1();
		return ResponseEntity.ok(person);
	}
	
	@GetMapping("/TakePerson2")
	public ResponseEntity<People> GettingPerson2() {
		People person = service.buscarPersonagem2();
		return ResponseEntity.ok(person);
	}
	
	@GetMapping("/TakePerson3")
	public ResponseEntity<People> GettingPerson3() {
		People person = service.buscarPersonagem3();
		return ResponseEntity.ok(person);
	}
	
	@GetMapping("/TakePerson4")
	public ResponseEntity<People> GettingPerson4() {
		People person = service.buscarPersonagem4();
		return ResponseEntity.ok(person);
	}
	
	@GetMapping("/TakePerson6")
	public ResponseEntity<People> GettingPerson6() {
		People person = service.buscarPersonagem6();
		return ResponseEntity.ok(person);
	}
	
	@GetMapping("/TakePerson7")
	public ResponseEntity<People> GettingPerson7() {
		People person = service.buscarPersonagem7();
		return ResponseEntity.ok(person);
	}
	
	@GetMapping("/TakePerson8")
	public ResponseEntity<People> GettingPerson8() {
		People person = service.buscarPersonagem8();
		return ResponseEntity.ok(person);
	}
	
	@GetMapping("/TakePerson9")
	public ResponseEntity<People> GettingPerson9() {
		People person = service.buscarPersonagem9();
		return ResponseEntity.ok(person);
	}
	
	@GetMapping("/TakePerson10")
	public ResponseEntity<People> GettingPerson10() {
		People person = service.buscarPersonagem10();
		return ResponseEntity.ok(person);
	}

}
