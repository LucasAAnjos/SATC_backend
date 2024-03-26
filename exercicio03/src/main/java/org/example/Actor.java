package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Actor implements IndicationCheck {
    private String name;
    private String nationality;

    private Boolean able;

    private int indicationNumber = 0;

    public Actor(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAble(Boolean able) { this.able = able; }

    @Override
    public void incrementIndicationNumber() { this.indicationNumber += 1; }

    @Override
    public Boolean getAble() { return this.able; }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }


}
