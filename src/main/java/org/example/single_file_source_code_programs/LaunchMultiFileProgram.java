package org.example.single_file_source_code_programs;
import model.Person;
import service.PersonService;


public class LaunchMultiFileProgram {
    public static void main(String[] args) {
        PersonService service = new PersonService();
        Person person = service.createNewPerson();
        IO.println(person.printName() + " has been created");
    }
}
