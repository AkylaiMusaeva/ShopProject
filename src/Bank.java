import java.math.BigDecimal;
import java.util.Scanner;

public class Bank implements BankInterface {
    private String userName;
    private int password;
    private int totalMoney;

    public Bank(String userName, int password, int totalMoney) throws MyException{
        this.userName = userName;
        this.password = password;
        this.totalMoney = totalMoney;
    }
    public Bank(){

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    @Override
    public String payment(String name, int password, int sum,Product[]products){
        int counter = 0;
        if (getPassword() == password) {
            for (Product c : products) {
                counter += c.getPrice();
                try{
                    if (counter > sum) {
                        throw  new MyException("У Вас не хватает средств для оплаты всей суммы. На Вашем счету "+ sum+" сом.\nНажмите -6- если желаете получить кредит" );
                    }
                }catch(MyException e){
                    System.err.println(e.getMessage());
                }
                   break;
            }
            System.out.printf("\nИтоговая сумма к оплате составил %s сом\n", counter);
            System.err.printf("Остаток на карте %s сом.",(sum-counter));
        }
        else {
            System.out.println("Неверный пароль карты. Не можете произвести оплату ");
        }return null;
        }
    @Override
    public void credit(int password, int sum) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Введите пароль карты ");
        try {int password1 = scanner.nextInt();

                if (password1 == password) {
                    System.out.println("~~~~~~Добро пожаловать~~~~~~");
                    System.out.println(("Укажите в параметрах какую сумму кредита желаете получить:"));
                    System.out.printf("Вы успешно получили %s сом в кредит\n", sum);
                    throw new MyException("-------------------------");
                }else {
                    System.out.println("Неверно введен пароль");
                }
            }catch (MyException e){
                System.out.println(e.getMessage());
            }
    }
    @Override
    public String toString() {
        return "\nBank{" +
                "userName='" + userName + '\'' +
                ", password=" + password +
                ", totalMoney=" + totalMoney +
                '}';
    }
}
