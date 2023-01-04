package ru.geekbrains;

import org.hibernate.Session;
import org.springframework.stereotype.Component;
import ru.geekbrains.client.ClientDao;
import ru.geekbrains.product.Product;
import ru.geekbrains.product.ProductDao;

import java.util.List;

@Component
public class ProductService {

    // @Autowired - по идеии так
    private ProductDao productDao;
    private ClientDao clientDao;

    public void ProductService(ProductDao productDao) {
        this.productDao = productDao;
    }

    public Product findByIdListClient(Long id) {
        return productDao.findByIdListClient(id);
    }

    /*public  findById(Long id) {
        try (Session session = sessionFactoryUtils.getSession()) {
            session.beginTransaction();
            User user = session.get(User.class, id);
            session.getTransaction().commit();
            return user;
        }
    }*/

}
