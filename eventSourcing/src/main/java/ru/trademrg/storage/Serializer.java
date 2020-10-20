package ru.trademrg.storage;

import ru.trademrg.events.CreatedTradeEvent;

public interface Serializer {
    String serializeEvent(CreatedTradeEvent event);
    CreatedTradeEvent deserializeEvent(String eventAsString);
}
