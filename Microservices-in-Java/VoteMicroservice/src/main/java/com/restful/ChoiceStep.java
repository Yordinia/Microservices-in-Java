package com.restful;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import java.util.List;
@Entity
@DiscriminatorValue("ChoiceStep")
public class ChoiceStep extends Step{
    // @ElementCollection
    // a JPA annotation 2specify collection of instances of basic type or embeddable class
    // creates a separate table 4z collection mapped 2the original entity by a foreign key
    @ElementCollection
    private List<String> choices;
    @Override
    public String execute() {
        String joint_of_choices = String.join(", ", choices);
        return joint_of_choices;
    }

    public List<String> getChoices(){
        return choices;
    }
    public void setChoices(List<String> choice){
        this.choices = choice;
    }

}
