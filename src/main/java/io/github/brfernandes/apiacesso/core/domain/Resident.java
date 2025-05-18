package io.github.brfernandes.apiacesso.core.domain;

public class Resident {

    private Long id;
    private String cpf;
    private String adress;
    private String phone;
    private Person person;

    public Resident() {

    }

    public Resident(Long id, String cpf, String adress, String phone, Person person) {
        this.id = id;
        this.cpf = cpf;
        this.adress = adress;
        this.phone = phone;
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
