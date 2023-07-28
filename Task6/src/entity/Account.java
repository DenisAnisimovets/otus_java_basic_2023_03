package entity;

public class Account {
    int number;
    Client client;

    public Account(int number, Client client) {
        this.number = number;
        this.client = client;
        client.addAccount(this);
    }

    public Client getClient() {
        return client;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", client=" + client +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if(number != account.number) return false;
        return client.equals(account.client);
    }

    @Override
    public int hashCode() {
        int result = number;
        result = 31 * result + client.hashCode();
        return result;
    }
}
