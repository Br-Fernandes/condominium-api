package io.github.brfernandes.apiacesso.core.domain;

import java.time.LocalDateTime;

public class Visit {

    private Long id;
    private LocalDateTime dateTime;
    private Long idResident;
    private Long idVisitor;

    public Visit() {

    }

    public Visit(Long id, LocalDateTime dateTime, Long idResident, Long idVisitor) {
        this.id = id;
        this.dateTime = dateTime;
        this.idResident = idResident;
        this.idVisitor = idVisitor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Long getIdResident() {
        return idResident;
    }

    public void setIdResident(Long idResident) {
        this.idResident = idResident;
    }

    public Long getIdVisitor() {
        return idVisitor;
    }

    public void setIdVisitor(Long idVisitor) {
        this.idVisitor = idVisitor;
    }
}
