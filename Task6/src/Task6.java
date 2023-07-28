import entity.Account;
import entity.Client;

import java.util.ArrayList;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        Client client1 = new Client("Ivan", new ArrayList<>());
        Client client2 = new Client("Petr", new ArrayList<>());
        Account account1 = new Account(1, client1);
        Account account2 = new Account(2, client1);
        Account account3 = new Account(3, client2);

        System.out.println(getAccounts(client1));
        System.out.println(findClient(account3));
    }

    static List<Account> getAccounts(Client client) {
        return client.getAccounts();
    }

    static Client findClient(Account account) {
        return account.getClient();
    }
}
