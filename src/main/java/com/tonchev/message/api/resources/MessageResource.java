package com.tonchev.message.api.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.tonchev.message.api.dto.Message;

/**
 * @author atonchev
 */
@Component
@Path("/message")
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource {
    @GET
    public Message getMessage() {
        Message message = new Message();
        message.greetings.add("hello world");
        return message;
    }
}
