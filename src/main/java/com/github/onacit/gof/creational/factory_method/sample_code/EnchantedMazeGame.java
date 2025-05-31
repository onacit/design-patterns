package com.github.onacit.gof.creational.factory_method.sample_code;

import com.github.onacit.gof.creational.Door;
import com.github.onacit.gof.creational.MazeGame;
import com.github.onacit.gof.creational.Room;
import com.github.onacit.gof.creational.abstract_factory.sample_code.CastSpell;
import com.github.onacit.gof.creational.abstract_factory.sample_code.DoorNeedingSpell;
import com.github.onacit.gof.creational.abstract_factory.sample_code.EnchantedRoom;

class EnchantedMazeGame extends MazeGame {

    @Override
    protected Room makeRoom(final int roomNo) {
        return new EnchantedRoom(roomNo, new CastSpell());
    }

    @Override
    protected Door makeDoor(final Room r1, final Room r2) {
        return new DoorNeedingSpell(r1, r2);
    }
}
