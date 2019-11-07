package com.mycompany.store;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

@Named(value = "client")
@Dependent
public class Client extends User
{
    public Client(int id, String name, String surname, String login, String password, boolean active) {
        super(id, name, surname, login, password, active);
    }  
}