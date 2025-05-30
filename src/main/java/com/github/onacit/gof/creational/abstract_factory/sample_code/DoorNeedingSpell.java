package com.github.onacit.gof.creational.abstract_factory.sample_code;

import com.github.onacit.gof.creational.Door;
import com.github.onacit.gof.creational.Room;

class DoorNeedingSpell extends Door {

    DoorNeedingSpell(final Room room1, final Room room2) {
        super(room1, room2);
    }
}
