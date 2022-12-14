package db;

import model.DiscountCard;
import model.Product;

import java.util.List;

public interface DAO {
    public void createProducts(List<Product> products);

    public void createDiscountCards(List<DiscountCard> cardList);

    public Product getProduct(int idProduct);

    public DiscountCard getCard(int cardNumber);

    public List<Product> getProducts();

    public List<DiscountCard> getCards();

}
