package com.github.onacit.gof.creational.abstract_factory.sample_code;

import com.github.onacit.gof.creational.Door;
import com.github.onacit.gof.creational.Room;

class EnchantedMazeFactory extends MazeFactory {

    @Override
    Room makeRoom(final int roomNo) {
        return new EnchantedRoom(roomNo, new CastSpell());
    }

    @Override
    Door makeDoor(final Room r1, final Room r2) {
        return new DoorNeedingSpell(r1, r2);
    }
}
