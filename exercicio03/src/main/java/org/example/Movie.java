package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Movie implements IndicationCheck {
    private String name;
    private String gender;

    public Boolean able;

    private int indicationNumber = 0;

    public Movie(String name, String gender) {
        this.name = name;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}
