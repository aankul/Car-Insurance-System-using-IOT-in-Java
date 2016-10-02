/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.util.ArrayList;

/**
 *
 * @author amuly
 */
public class PersonDirectory {
    
    private ArrayList<Person> personList;
    
    public PersonDirectory()
    {
        personList = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
        public Person createPerson(String name,String address,String phone){
        Person person = new Person();
        person.setName(name);
        person.setAddress(address);
        person.setPhoneNo(phone);
        personList.add(person);
        return person;
        }   
}
