import java.security.CodeSource;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException{
        Scanner scanner = new Scanner(System.in);
        Product product1 = new Product("Fruit", "Apple", 100, 2, LocalDate.of(2023, 4, 5), false);
        Product product2 = new Product("Vegetable", "Cucumber", 90, 3, LocalDate.of(2023, 1, 9), false);
        Product product3 = new Product("Drink", "Wine", 9080, 1, LocalDate.of(2022, 4, 9), true);
        Product product4 = new Product("Drink", "Milk", 87, 1, LocalDate.of(2023, 5, 19), false);
        Product product5 = new Product("Sweet", "Candy", 220, 2, LocalDate.of(2023, 5, 1), false);
        Product product6 = new Product("Bread", "Baguette", 60, 3, LocalDate.of(2023, 5, 19), false);
        Product[] products1 = {product1, product2};
        Product[] products2 = {product3, product4};
        Product[] products3 = {product5, product6};
        Product[]products={product1,product2,product3,product4,product5,product6};

        Costumer costumer1 = new Costumer("Akylai", new Passport(LocalDate.of(2001, 6, 18),
                "Kyrgyzstan", 'F'),
                products1, new Bank("Akylai", 6521, 2000));

        Costumer costumer2 = new Costumer("Aziza", new Passport(LocalDate.of(2001, 12, 19),
                "Kyrgyzstan", 'F'), products2, new Bank("Aziza", 4512, 3000));

        Costumer costumer3 = new Costumer("Azamat", new Passport(LocalDate.of(1996, 10, 28),
                "USA", 'M'), products3, new Bank("Azamat", 3621, 6000));

        Costumer[] costumers = {costumer1, costumer2, costumer3};
        System.out.println("""
                Choose an operation:
                1: get customer's all products 
                2: delete product by name
                3: add a new product
                4: update a customer's name
                5: pay for the products 
                6: get a credit if you need it 
                7: check a customer's age,if he has an alcohol
                8: check a product for freshness
                """);
        while (true) {
            switch (scanner.nextInt()) {
                case 1: {
                    Costumer costumer = new Costumer();
                    System.out.println(Arrays.toString(costumer.getAllCostumerProducts(costumers, "Aziza")));
                    break;
                }
                case 2:{
                    Product product=new Product();
                    product.deleteProductByName("Drink", products2);
                    break;
                }
                case 3:{
                    Product product=new Product();
                    product.addProduct("Banana",products2);
                    break;
                }
                case 4: {
                    System.out.println("Update a costumer's name");
                    Costumer costumer=new Costumer();
                    costumer.updateCustomerName(costumers,"Aziza","Malika");
                    break;
                }
                case 5:
                {
                    Bank bank =new Bank();
                    bank.payment(costumer2.getName(), bank.getPassword(), costumer2.getBank().getTotalMoney(),products2);
                    break;
                }
                case 6:
                {
                    Bank bank=new Bank();
                    bank.credit(costumer2.getBank().getPassword(), 100);
                    break;
                }
                case 7:{
                    Product product = new Product();
                    product.checkProduct(costumer2.getName(),costumer2.getPassport().getDateOfBirth(), products2);
                    break;
                }
                case 8: {
                    Product product=new Product();
                    product.checkDateOfMadeProducts(product1.getMadeinDate(),products);
                    break;
                }
            }
        }
        }
    }

