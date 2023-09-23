/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relclassExcer01.entities;

/**
 *
 * @author blue_
 */
public class Person {
    
    private String _name;
    private String _lastName;
    private Dog _pet;

    public Person() {
    }

    public Person(String _name, String _lastName, Dog _pet) {
        this._name = _name;
        this._lastName = _lastName;
        this._pet = _pet;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public void setLastName(String _lastName) {
        this._lastName = _lastName;
    }

    public void setPet(Dog _pet) {
        this._pet = _pet;
    }

    public String getName() {
        return _name;
    }

    public String getLastName() {
        return _lastName;
    }

    public Dog getPet() {
        return _pet;
    }

    @Override
    public String toString() {
        return "Person{" + "_name=" + _name + ", _lastName=" + _lastName + ", _pet=" + _pet + '}';
    }
    
    
    
}
