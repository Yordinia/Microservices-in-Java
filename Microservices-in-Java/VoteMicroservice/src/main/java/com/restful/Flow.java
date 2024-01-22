package com.restful;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Flow {
    @Id
    @GeneratedValue
    private Long id;
    private String name = "Vote Flow";
    @OneToMany(mappedBy = "flow", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Step> steps;

    public Long getId() {
        return id;
    }

    public List<Step> getSteps() {
        return steps;
    }
}
