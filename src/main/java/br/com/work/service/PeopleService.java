package br.com.work.service;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.work.entity.People;

@Service
public class PeopleService {

	public People buscarr() {
		RestTemplate template = new RestTemplate();
		RestTemplateBuilder builder = new RestTemplateBuilder();
		template = builder.build();
		People person = template.getForObject("https://swapi.dev/api/people/13/", People.class);
		return person;
	}

	public People buscarr1() {
		RestTemplate template = new RestTemplate();
		RestTemplateBuilder builder = new RestTemplateBuilder();
		template = builder.build();
		People person = template.getForObject("https://swapi.dev/api/people/14/", People.class);
		return person;
	}

	public People buscarr2() {
		RestTemplate template = new RestTemplate();
		RestTemplateBuilder builder = new RestTemplateBuilder();
		template = builder.build();
		People person = template.getForObject("https://swapi.dev/api/people/25/", People.class);
		return person;
	}

	public People buscarr3() {
		RestTemplate template = new RestTemplate();
		RestTemplateBuilder builder = new RestTemplateBuilder();
		template = builder.build();
		People person = template.getForObject("https://swapi.dev/api/people/31/", People.class);
		return person;
	}

	public People buscarPersonagem() {
		RestTemplate template = new RestTemplate();
		RestTemplateBuilder builder = new RestTemplateBuilder();
		template = builder.build();
		People person = template.getForObject("https://swapi.dev/api/people/1/", People.class);
		return person;
	}

	public People buscarPersonagem1() {
		RestTemplate template = new RestTemplate();
		RestTemplateBuilder builder = new RestTemplateBuilder();
		template = builder.build();
		People person = template.getForObject("https://swapi.dev/api/people/2/", People.class);
		return person;
	}

	public People buscarPersonagem2() {
		RestTemplate template = new RestTemplate();
		RestTemplateBuilder builder = new RestTemplateBuilder();
		template = builder.build();
		People person = template.getForObject("https://swapi.dev/api/people/3/", People.class);
		return person;
	}

	public People buscarPersonagem3() {
		RestTemplate template = new RestTemplate();
		RestTemplateBuilder builder = new RestTemplateBuilder();
		template = builder.build();
		People person = template.getForObject("https://swapi.dev/api/people/4/", People.class);
		return person;
	}

	public People buscarPersonagem4() {
		RestTemplate template = new RestTemplate();
		RestTemplateBuilder builder = new RestTemplateBuilder();
		template = builder.build();
		People person = template.getForObject("https://swapi.dev/api/people/5/", People.class);
		return person;
	}

	public People buscarPersonagem6() {
		RestTemplate template = new RestTemplate();
		RestTemplateBuilder builder = new RestTemplateBuilder();
		template = builder.build();
		People person = template.getForObject("https://swapi.dev/api/people/10/", People.class);
		return person;
	}

	public People buscarPersonagem7() {
		RestTemplate template = new RestTemplate();
		RestTemplateBuilder builder = new RestTemplateBuilder();
		template = builder.build();
		People person = template.getForObject("https://swapi.dev/api/people/13/", People.class);
		return person;
	}

	public People buscarPersonagem8() {
		RestTemplate template = new RestTemplate();
		RestTemplateBuilder builder = new RestTemplateBuilder();
		template = builder.build();
		People person = template.getForObject("https://swapi.dev/api/people/20/", People.class);
		return person;
	}

	public People buscarPersonagem9() {
		RestTemplate template = new RestTemplate();
		RestTemplateBuilder builder = new RestTemplateBuilder();
		template = builder.build();
		People person = template.getForObject("https://swapi.dev/api/people/21/", People.class);
		return person;
	}

	public People buscarPersonagem10() {
		RestTemplate template = new RestTemplate();
		RestTemplateBuilder builder = new RestTemplateBuilder();
		template = builder.build();
		People person = template.getForObject("https://swapi.dev/api/people/11/", People.class);
		return person;
	}

}
