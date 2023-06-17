package ru.netology.competition;

public class NotRegisteredException extends RuntimeException {
    public NotRegisteredException(String msg) {
        super(msg);
    }
}
