package com.github.onacit.gof.behavioral.command.sample_code;

import java.util.ArrayList;
import java.util.List;

class MacroCommand extends Command {

    static MacroCommand of(final Command... commands) {
        final var macro = new MacroCommand();
        macro.commands.addAll(List.of(commands));
        return macro;
    }

    // -----------------------------------------------------------------------------------------------------------------
    MacroCommand() {
        super();
        this.commands = new ArrayList<>();
    }

    // -----------------------------------------------------------------------------------------------------------------
    @Override
    void execute() {
        commands.forEach(Command::execute);
    }

    // -------------------------------------------------------------------------------------------------------- commands
    public boolean add(final Command command) {
        return commands.add(command);
    }

    public boolean remove(final Command command) {
        return commands.remove(command);
    }

    // -----------------------------------------------------------------------------------------------------------------
    private final List<Command> commands;
}
