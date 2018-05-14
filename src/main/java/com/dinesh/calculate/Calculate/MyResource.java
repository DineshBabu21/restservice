
package com.dinesh.calculate.Calculate;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.dinesh.calculate.Calculate.resource.Calculate;
import com.sun.jersey.api.Responses;

/** Example resource class hosted at the URI path "/myresource"
 */
@Path("/calculate")
public class MyResource {
    
    /** Method processing HTTP GET requests, producing "text/plain" MIME media
     * type.
     * @return String that will be send back as a response of type "text/plain".
     */
	@Path("/add")
    @POST 
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    public Response add(Calculate calculate) {
		Response.ResponseBuilder rBuilder=null;
		Response response=null;
		
		Calculate cl = (Calculate) calculate;
		int result =cl.getOp1()+cl.getOp2();		
		Resp res =  new Resp();
		res.setResult(result);
		System.out.println(res.getResult()+" Op1 "+calculate.getOp1()+"Op2"+calculate.getOp2());
		rBuilder=Response.ok(res).type(MediaType.APPLICATION_XML);
		response = rBuilder.build();
        
		return response;
    }
}
