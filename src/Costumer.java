import java.util.Arrays;

public class Costumer implements CostumerInterface {
    private String name;
    private Passport passport;
    private Product[] products;
    private Bank bank;

    public Costumer(String name, Passport passport, Product[] products, Bank bank) {
        this.name = name;
        this.passport = passport;
        this.products = products;
        this.bank = bank;
    }

    public Costumer() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void updateCustomerName(Costumer[]costumers,String oldName,String newName) {
        Costumer costumer = new Costumer();
        for (Costumer name : costumers) {
            if (name.getName().equalsIgnoreCase(oldName)) {
                name.setName(newName);
                costumer=name;
                System.out.println(costumer);
            }
        }
    }
    @Override
    public Product[] getAllCostumerProducts(Costumer[]costumers, String name) {
        for (Costumer c :costumers) {
            if (c.getName().equalsIgnoreCase(name)){
                System.out.println(c.getName()+" "+Arrays.toString(c.products));
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Costumer " +
                "name='" + name + '\'' +
                Arrays.toString(products) +
                '}';
    }
}










