package com.github.onacit.gof.behavioral.command.sample_code;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Slf4j
class Application {

    Application() {
        super();
        documents = new ArrayList<>();
    }

    // ------------------------------------------------------------------------------------------------------- documents
    boolean add(final Document document) {
        log.debug("adding {}", document);
        return documents.add(document);
    }

    Optional<Document> currentDocument() {
        return documents.stream().reduce((f, s) -> s);
    }

    // -----------------------------------------------------------------------------------------------------------------
    private final List<Document> documents;
}
