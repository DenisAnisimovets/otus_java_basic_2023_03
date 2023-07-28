package entity;

import java.util.List;

public class Client {
    String name;
    List<Account> accounts;

    public Client(String name, List<Account> accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if(!name.equals(client.name)) return false;
        return accounts != null ? accounts.equals(client.accounts) : client.accounts == null;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (accounts != null ? accounts.hashCode() : 0);
        return result;
    }
}
