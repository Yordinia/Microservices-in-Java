package com.restful;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "stepType")
public abstract class Step { // bc it has abstract method
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Flow flow;

    public abstract String execute();

    // getters & setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Flow getFlow() {
        return flow;
    }

    public void setFlow(Flow flow) {
        this.flow = flow;
    }
}
