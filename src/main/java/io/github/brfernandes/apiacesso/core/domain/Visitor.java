package io.github.brfernandes.apiacesso.core.domain;

public class Visitor {

    private Long id;
    private String rg;
    private Person person;

    public Visitor() {

    }

    public Visitor(Long id, String rg, Person person) {
        this.id = id;
        this.rg = rg;
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person idPerson) {
        this.person = idPerson;
    }
}
