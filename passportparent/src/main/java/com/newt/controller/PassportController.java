package com.newt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.newt.pojo.Response;
import com.newt.pojo.StatusCode;

@RestController
@RequestMapping("/passport")
public class PassportController {
	String message = "Well come to my Passport office...";
	@RequestMapping(value = "/office", method = RequestMethod.GET, produces=javax.ws.rs.core.MediaType.APPLICATION_JSON)

	public ResponseEntity<Response> passport(){
		 
		Response response = new Response();
		if(message != null) {
			response.setContent(message);
			response.setStatus(StatusCode.U200);
			return new ResponseEntity<Response>(response, response.getHttpStatus());
			
		}
		else {
			response.setStatus(StatusCode.E400);
            return new ResponseEntity<Response>(response, HttpStatus.BAD_REQUEST);
			
		}
		
		
	}

}
