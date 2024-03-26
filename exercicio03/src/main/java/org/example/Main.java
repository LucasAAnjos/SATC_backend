package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        Movie movie1 = context.getBean(Movie.class, "Titanic", "Ação");
        Actor actor1 = context.getBean(Actor.class, "Tião Cruise", "Brasileiro");

        movie1.setAble(Boolean.TRUE);
        actor1.setAble(Boolean.TRUE);

        Indication indication1 = context.getBean(Indication.class, movie1, "Melhor Filme de Romance");
        Indication indication2 = context.getBean(Indication.class, actor1, "Melhor Ator de Terror");

        OscarService oscarService  = context.getBean(OscarService.class);

        oscarService.indicate(indication1);
        oscarService.indicate(indication2);

    }
}
