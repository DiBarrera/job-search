package com.platzi.jobsearch;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.ParameterException;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public interface CommanderFunctions {
    static <T> JCommander buildCommanderWithName(
            String cliName, Supplier<T> argumentSupplier
    ) {
        JCommander jCommander = JCommander.newBuilder()
                .addObject(argumentSupplier.get())
                .build();

        jCommander.setProgramName(cliName);
        return jCommander;
    }

    static Optional<List<Objects>> parseArguments(
            JCommander jCommander,
            String[] arguments,
            Consumer<JCommander> onError
    ) {
        try {
            jCommander.parse(arguments);
            return Optional.of(jCommander.getObjects());
        } catch(ParameterException paramEx) {
            onError.accept(jCommander);
        }

        return Optional.empty();
    }
}
