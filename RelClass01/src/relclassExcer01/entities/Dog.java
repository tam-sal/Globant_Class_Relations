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
public class Dog {
    
    private String _name;
    private String _breed;
    private int _age;
    private String _size;

    public Dog() {
    }

    public Dog(String _name, String _breed, int _age, String _size) {
        this._name = _name;
        this._breed = _breed;
        this._age = _age;
        this._size = _size;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public void setBreed(String _breed) {
        this._breed = _breed;
    }

    public void setAge(int _age) {
        this._age = _age;
    }

    public void setSize(String _size) {
        this._size = _size;
    }

    public String getName() {
        return _name;
    }

    public String getBreed() {
        return _breed;
    }

    public int getAge() {
        return _age;
    }

    public String getSize() {
        return _size;
    }

    @Override
    public String toString() {
        return "Dog{" + "_name=" + _name + ", _breed=" + _breed + ", _age=" + _age + ", _size=" + _size + '}';
    }
    
    
    
}
