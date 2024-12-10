package org.example;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.Scanner;

@Path("/hello")
public class Main {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Simplified Application!";
    }

    public static void main(String[] args) {
        System.out.println("Simplified Application Started.");
        System.out.println("Type 'exit' to stop the application.");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (System.console() == null) {
                System.out.println("Running in non-interactive mode. Skipping input.");
                return; // Or proceed with default behavior
            }

            System.out.println("Enter input:");
            String input = scanner.nextLine();
        }
    }
}