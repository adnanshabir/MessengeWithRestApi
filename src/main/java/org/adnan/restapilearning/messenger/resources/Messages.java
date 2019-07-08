package org.adnan.restapilearning.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.adnan.restapilearning.messenger.model.Message;
import org.adnan.restapilearning.messenger.service.MessageService;

@Path("/messages")
public class Messages {

	MessageService messageService = new MessageService();

	@GET
	// @Produces(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessage() {

		return messageService.getAllMessages();

	}

	@GET
	@Path("/test")
	@Produces(MediaType.TEXT_PLAIN)
	public String test() {

		return "test";

	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMessage(Message message) {

		return messageService.addMessage(message);

	}
	
	@PUT
	@Path("/{messageId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message updateMessage(@PathParam("messageId") long messageId,Message message) {
		message.setId(messageId);
		return messageService.updateMessage(message);

	}
	
	//Delete api should go here
	
	
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON) 
	public Message testVar(@PathParam("messageId") long messageId) {
		return messageService.getMessages(messageId);
		// return "testVar" + messageId;

	}
}
