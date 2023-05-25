import java.time.LocalDate;

public interface ProductInterface {
    void deleteProductByName(String description,Product[]products);
    void addProduct(String description,Product[]products );
    String checkProduct(String costumersName,LocalDate dateOfBirth,Product [] products);
    void checkDateOfMadeProducts(LocalDate dateOfMadeProducts,Product []products);
    //Нужно проверить есть ли алкоголь и возраст покупателя и просроченный товар


}
