package org.training.wk.webservice.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;



@WebService
public interface ExRateService {
	@WebMethod
	@GET
	@Path("/{curr}")
	@Produces("application/json")
	public String getExRate(@PathParam("curr") @WebParam(name="currency")String currency) throws GenericException;
}
