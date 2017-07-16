package com.smartelligynt.client.api;


import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.smartelligynt.client.api.model.BaseResponse;
import com.smartelligynt.client.api.model.Device;
import com.smartelligynt.client.api.model.Event;
import com.smartelligynt.client.api.model.User;


@Path ("/api/")
public interface EventReciever {

	@GET
    public String home();
	
	@POST
	@Path("events")
    public String events1(Event body) ;
    
    
	@POST
	@Path("/users/{userId}/devices/{deviceId}")
    public BaseResponse devices(@PathParam("userId") String userId, @PathParam("deviceId") String deviceId, Device device) ;

    
	@GET
	@Path("/users/{userId}/devices/{deviceId}")
    public Device getDevices(@PathParam("userId") String userId, @PathParam("deviceId") String deviceId) ;
    
	@POST
	@Path("/users")
	public BaseResponse users(User user);
    
    @POST
	@Path("/users/{userId}")
    public BaseResponse users(@PathParam("userId") String userId,   User user) ;
    

    @GET
   	@Path("/users/{userId}")
    public User getUsers(@PathParam("userId") String userId) ;
    
    @POST
    @Path("/users/{userId}/devices/{deviceId}/events")
    public BaseResponse events(@PathParam("userId") String userId, @PathParam("deviceId") String deviceId,  Event event);
 
    
}
