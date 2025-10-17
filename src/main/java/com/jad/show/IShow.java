package com.jad.show;

import com.jad.customer.Spectator;

public interface IShow {
    String getName();
    String getDescription();
    ShowType getShowType();

    void comeToSeeYou(Spectator spectator);
}
