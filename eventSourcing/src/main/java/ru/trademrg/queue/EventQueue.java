package ru.trademrg.queue;


import ru.trademrg.events.CreatedTradeEvent;

public interface EventQueue {
    void putEvent(CreatedTradeEvent event);

    CreatedTradeEvent getEvent();

    int size();
}
