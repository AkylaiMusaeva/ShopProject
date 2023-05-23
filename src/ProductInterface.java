import java.time.LocalDate;

public interface ProductInterface {
    void deleteProductByName(String productName,Product[]products);
    void addProduct(String productName,Product[]products );
    String checkProduct(String costumersName,LocalDate dateOfBirth,Product [] products);
    void checkDateOfMadeProducts(LocalDate dateOfMadeProducts,Product []products);
    //Нужно проверить есть ли алкоголь и возраст покупателя и просроченный товар


}
