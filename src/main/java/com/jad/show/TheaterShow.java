package com.jad.show;

import com.jad.customer.Spectator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TheaterShow extends Show {
    private final String director;
    private final ArrayList<String> actors = new ArrayList<>();

    public TheaterShow(final String name, final String description, final String director, final String... actors) {
        super(name, description, ShowType.THEATER);
        this.director = director;
        this.actors.addAll(Arrays.asList(actors));
    }

    public String getDirector() {
        return this.director;
    }

    public List<String> getActors() {
        return Collections.unmodifiableList(this.actors);
    }


    @Override
    public void comeToSeeYou(Spectator spectator) {
        spectator.watch(this);
    }
}
