import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class Product implements ProductInterface {
    private String productName;
    private String description;
    private int price;
    private int count;
    private LocalDate madeinDate;
    private boolean isAlcoholic;

    public Product(String productName, String description, int price, int count, LocalDate madeinDate, boolean isAlcoholic) {
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.count = count;
        this.madeinDate = madeinDate;
        this.isAlcoholic = isAlcoholic;
    }

    public Product() {

    }

    public Product(String name, String productName) {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public LocalDate getMadeinDate() {
        return madeinDate;
    }

    public void setMadeinDate(LocalDate madeinDate) {
        this.madeinDate = madeinDate;
    }

    public boolean isAlcoholic() {
        return isAlcoholic;
    }

    public void setAlcoholic(boolean alcoholic) {
        isAlcoholic = alcoholic;
    }

    @Override
    public void deleteProductByName(String productName, Product[] products) {
        String[] newProducts = new String[products.length];
        for (int i=0;i<products.length;i++) {
            if (!products[i].getProductName().equals(productName)) {
                newProducts[i]=products[i].getProductName();
            }
        }
            System.out.println("Мы успешно удалили продукт " + productName );
            System.out.println("Новый массив после удаления: "+Arrays.toString(newProducts));
        }
    @Override
    public void addProduct(String productName,Product[]products) {
       String[] newProducts = new String[products.length + 1];
        for(int i=0;i< products.length;i++) {
            newProducts[i]=products[i].getProductName();
            newProducts[products.length] = productName;
        }
        System.out.println(Arrays.toString(newProducts));
    }
    @Override
    public String checkProduct(String costumersName,LocalDate dateOfBirth,Product [] products) {
        double totalAmount=0;
        int age=Period.between(dateOfBirth,LocalDate.now()).getYears();
        System.out.println(costumersName+" "+age+" лет.");
        for(Product p:products){
        if(!p.isAlcoholic()) {
            if (age<18){
                System.out.println("You are not allowed to drink alcohol");
                break;
            }else {
                System.out.println(Arrays.toString(products));
               totalAmount+=p.getPrice();
            }
        }else{
            System.out.println("This costumer doesn't have any alcohol ");
            totalAmount+=p.getPrice();

        }
        }
        System.out.printf("Итого %s сом. ",totalAmount);
        return null;
    }

    @Override
    public void checkDateOfMadeProducts(LocalDate dateOfMadeProducts,Product []products) {
        int date = Period.between(dateOfMadeProducts, LocalDate.now()).getDays();
        for(Product p:products) {
            if (date >= 10) {
                System.out.println("Продукт просрочен на "+date+" дней" + p.toString());
                System.out.println("Скидка 30%");
                break;
            } else {
                System.out.println("Нет просроченных продуктов ");
            }
        }
    }
    @Override
    public String toString() {
        return
                "\nproductName='" + productName + '\'' +
                        ", description='" + description + '\'' +
                        ", price=" + price +
                        ", count=" + count +
                        ", madeinDate=" + madeinDate +
                        ", isAlcoholic=" + isAlcoholic +
                        '}';
    }
}

