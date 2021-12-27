package designpattern.creationaldesignpattern.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount.BankAccountBuilder("John Doe","67820932")
                .withEmail("john@gmail.com")
                .withNotification(true)
                .withAddress("202 Park Ave #5C, NYC,NY-10003")
                .build();

        System.out.println(bankAccount.getName()+ " "+bankAccount.getAccountNumber()+ " "+bankAccount.isNotification()+
                " "+bankAccount.getAddress());
    }
}
