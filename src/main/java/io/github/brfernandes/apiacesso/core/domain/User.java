package io.github.brfernandes.apiacesso.core.domain;

public class User {
    private Long id;
    private String email;
    private String password;
    private Boolean admin;
    private Person person;

    public User() {

    }

    public User(Long id, String email, String password, Boolean admin, Person person) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.admin = admin;
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person idPessoa) {
        this.person = idPessoa;
    }
}