package com.mediasoft.ws.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mediasoft.ws.rest.vo.VOUser;

@Path("/MediaSoft")
public class ServiceLoginMS {

	@POST
	@Path("/validateUser")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public VOUser validateUser(VOUser vo) {
		vo.setValid(false);
		if(vo.getUsername().equals("Admin") && vo.getPassword().equals("Password")) {
			vo.setValid(true);
		}
		vo.setPassword("################");
		return vo;
	}
}
