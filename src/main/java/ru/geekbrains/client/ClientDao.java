package ru.geekbrains.client;

import org.springframework.stereotype.Component;
import ru.geekbrains.SessionFactoryUtils;

@Component
public class ClientDao {
    private SessionFactoryUtils sessionFactoryUtils;

    public ClientDao(SessionFactoryUtils sessionFactoryUtils) {
        this.sessionFactoryUtils = sessionFactoryUtils;
    }

}
