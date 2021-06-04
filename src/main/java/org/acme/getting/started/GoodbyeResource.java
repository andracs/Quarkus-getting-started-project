/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 04/06/2021
 */
package org.acme.getting.started;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/calc")
public class GoodbyeResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@Context UriInfo info) {
        int a = Integer.parseInt(info.getQueryParameters().getFirst("a"));
        int b = Integer.parseInt(info.getQueryParameters().getFirst("b"));
        return "A er " + a + " og B er " + b + " og summen af disse er " + add(a, b);
    }

    private int add(int a, int b ) {
        return a+b;
    }
}
