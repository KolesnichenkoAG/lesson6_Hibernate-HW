package ru.geekbrains.product;

import org.springframework.stereotype.Component;
import ru.geekbrains.SessionFactoryUtils;

@Component
public class ProductDao {
    private SessionFactoryUtils sessionFactoryUtils;

    public ProductDao(SessionFactoryUtils sessionFactoryUtils) {
        this.sessionFactoryUtils = sessionFactoryUtils;
    }
}
