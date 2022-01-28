package com.dio.bank.clients;

public class Client implements IClient{
    private String name;
    private String document;

    public Client(String name, String document) {
        this.name = name;
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public String getDocument() {
        return document;
    }
}
