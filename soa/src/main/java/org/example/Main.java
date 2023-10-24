package org.example;

import org.example.Service.BanqueService;

import javax.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {

        Endpoint.publish("http://localhost:8099/", new BanqueService());
        System.out.println();
        System.out.println("SOA run successfully ");
        System.out.println();
    }
}