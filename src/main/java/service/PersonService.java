package service;

import model.Person;

public class PersonService {
    private Person person;

    public Person createNewPerson() {
        return new Person("Robert");
    }
}
