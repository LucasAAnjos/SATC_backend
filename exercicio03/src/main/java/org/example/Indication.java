package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Indication {
    private IndicationCheck indication;
    private String category;

    private String name;

    public Indication(IndicationCheck indication, String category) {
        this.indication = indication;
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() { return indication.getName(); }

    public Boolean getAble() { return indication.getAble(); }


}
