public interface BankInterface {
    String payment (String name,int password,int sum,Product[]products);
    void credit(int password,int sum);
}
