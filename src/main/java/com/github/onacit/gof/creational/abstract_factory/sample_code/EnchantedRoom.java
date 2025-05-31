package com.github.onacit.gof.creational.abstract_factory.sample_code;

import com.github.onacit.gof.creational.Room;

import java.util.Objects;

public class EnchantedRoom extends Room {

    public EnchantedRoom(final int roomNo, final CastSpell spell) {
        super(roomNo);
        this.spell = Objects.requireNonNull(spell, "spell is null");
    }

    // ----------------------------------------------------------------------------------------------------------- spell
    public CastSpell getSpell() {
        return spell;
    }

    // -----------------------------------------------------------------------------------------------------------------
    private final CastSpell spell;
}
