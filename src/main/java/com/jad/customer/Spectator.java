package com.jad.customer;

import com.jad.show.*;

public class Spectator implements ISpectator {
    private final String firstName;
    private final String lastName;

    public Spectator(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public void watch(final IShow show) {
        show.comeToSeeYou(this);

    }

    @Override
    public void watch(MovieShow show) {
        System.out.println("J'ai assisté au film " + show.getName() + " de " + show.getDirector() + " sorti en " + show.getYearOfRelease());
        System.out.println();
    }

    @Override
    public void watch(ConcertShow show) {
        System.out.println("J'ai assisté au concert " + show.getName() + " de " + show.getArtist() + ".");
        System.out.println();
    }

    @Override
    public void watch(StreetShow show) {
        System.out.println("J'ai assisté au spectacle de rue " + show.getName() + ".");
        System.out.print("Il y avait : ");
        for (String performer : show.getPerformers()) {
            System.out.print(performer + ", ");
        }
        System.out.println();
        System.out.println();
    }

    @Override
    public void watch(TheaterShow show) {
        System.out.println("J'ai assisté à la pièce de théâtre " + show.getName() + " de " + show.getDirector() + ".");
        System.out.print("Il y avait : ");
        for (String actor : show.getActors()) {
            System.out.print(actor + ", ");
        }
        System.out.println();
        System.out.println();
    }


}
