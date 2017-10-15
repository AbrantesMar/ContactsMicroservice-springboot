package com.marcioabrantes.ContactsMicroservice.application.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.marcioabrantes.ContactsMicroservice.application.request.PeopleRequest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "Api Manager of contacts the people")
public interface ResourceBase<Req, Res> {
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK"),
							@ApiResponse(code = 400, message = "Bad Request"), 
							@ApiResponse(code = 404, message = "Not Found"),
							@ApiResponse(code = 500, message = "Internal Server Error") 
	})
	@ApiOperation(value = "create Entity.")
	@PostMapping(value="/create", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<?> create(@Valid @RequestBody Req entity);
	
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK"),
							@ApiResponse(code = 400, message = "Bad Request"), 
							@ApiResponse(code = 404, message = "Not Found"),
							@ApiResponse(code = 500, message = "Internal Server Error") 
	})
	@ApiOperation(value = "get entity by Id.")
	@PostMapping(value="/getById", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Res> getById(long id);
	
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK"),
							@ApiResponse(code = 400, message = "Bad Request"), 
							@ApiResponse(code = 404, message = "Not Found"),
							@ApiResponse(code = 500, message = "Internal Server Error") 
	})
	@ApiOperation(value = "update in entity.")
	@PostMapping(value="/update", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Res> update(Req entity);
	
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK"),
							@ApiResponse(code = 400, message = "Bad Request"), 
							@ApiResponse(code = 404, message = "Not Found"),
							@ApiResponse(code = 500, message = "Internal Server Error") 
	})
	@ApiOperation(value = "deleted entity.")
	@GetMapping(value="/deleted", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<?> deleted(long id);
	
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK"),
							@ApiResponse(code = 400, message = "Bad Request"),
							@ApiResponse(code = 404, message = "Not Found"),
							@ApiResponse(code = 500, message = "Internal Server Error") 
	})
	@ApiOperation(value = "get alls entitys.")
	@GetMapping(value="/getAlls", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<Res>> getList();

}
