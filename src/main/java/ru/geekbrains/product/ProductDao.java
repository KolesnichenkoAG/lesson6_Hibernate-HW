package ru.geekbrains.product;

import org.hibernate.Session;
import org.springframework.stereotype.Component;
import ru.geekbrains.SessionFactoryUtils;

@Component
public class ProductDao {
    private SessionFactoryUtils sessionFactoryUtils;

    public ProductDao(SessionFactoryUtils sessionFactoryUtils) {
        this.sessionFactoryUtils = sessionFactoryUtils;
    }

    public  Product findByIdListClient (Long id) {
        try (Session session = sessionFactoryUtils.getSession()) {
            session.beginTransaction();
            Product product = session.get(Product.class, "");
            System.out.println(product);
            System.out.println(product.getClients());
            session.getTransaction().commit();
            return product;
        }
    }
}
