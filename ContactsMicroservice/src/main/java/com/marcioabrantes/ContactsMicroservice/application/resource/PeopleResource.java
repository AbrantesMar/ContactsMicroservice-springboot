package com.marcioabrantes.ContactsMicroservice.application.resource;

import com.marcioabrantes.ContactsMicroservice.application.request.PeopleRequest;
import com.marcioabrantes.ContactsMicroservice.application.response.PeopleResponse;

import io.swagger.annotations.Api;

@Api(tags = "Manager Contacts this People")
public interface PeopleResource extends ResourceBase<PeopleRequest, PeopleResponse>{
	
}
