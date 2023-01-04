package ru.geekbrains.client;

import org.springframework.stereotype.Component;
import ru.geekbrains.SessionFactoryUtils;

//@Configuration - возможно так
@Component
public class ClientDao {
    private SessionFactoryUtils sessionFactoryUtils;

    // @Bean
    public ClientDao(SessionFactoryUtils sessionFactoryUtils) {
        this.sessionFactoryUtils = sessionFactoryUtils;
    }

}
