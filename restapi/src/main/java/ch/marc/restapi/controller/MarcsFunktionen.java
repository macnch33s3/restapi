package ch.marc.restapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class MarcsFunktionen {

	@Operation(summary 		= "Marcs Funktionen",
			   description 	= "returns the implemented debiX API versions")	

	@RequestMapping(value = "/calculate/addition"
			       ,method = RequestMethod.GET)
	public ResponseEntity<Number> addition(@RequestParam int a, @RequestParam int b) {
		log.info("verwende calculate/addition mit den werten a -> {} und b -> {}",a,b);
		return ResponseEntity.status(HttpStatus.CONFLICT)
							 .body(a + b);
	}
	
	@RequestMapping(value = "/calculate/multiplication"
		       ,method = RequestMethod.GET)
	public ResponseEntity<Number> multiplication(@RequestParam int a, @RequestParam int b) {
		log.warn("verwende calculate/multiplication mit den werten a -> {} und b -> {}",a,b);
		return ResponseEntity.status(HttpStatus.OK)
							 .body(mp(a,b));
		
	} 
	
	private int mp(int a, int b) {
		return a*b;
	}
	
}
