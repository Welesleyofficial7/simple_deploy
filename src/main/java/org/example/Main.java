package org.example;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class Main {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Simplified Application!";
    }

    public static void main(String[] args) {
        System.out.println("Simplified Application Started.");
        System.out.println("Type 'exit' to stop the application (not applicable in non-interactive mode)!!");


        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Application interrupted. Exiting...");
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}