package java8_Prep;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class AggregateAccounts {
    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(new Customer("Alice", Arrays.asList(new Account(AccountType.SAVINGS, new BigDecimal("1500.00")), new Account(AccountType.CHECKING, new BigDecimal("250.75")))), new Customer("Bob", Arrays.asList(new Account(AccountType.SAVINGS, new BigDecimal("2300.50")), new Account(AccountType.LOAN, new BigDecimal("5000.00")))), new Customer("Carol", Arrays.asList(new Account(AccountType.CHECKING, new BigDecimal("125.25")), new Account(AccountType.LOAN, new BigDecimal("750.00")))));

        customers.stream().flatMap(s -> s.getAccounts().stream())
                .collect(Collectors.groupingBy(Account::getType,
                        Collectors.mapping(Account::getBalance, Collectors.reducing
                                (BigDecimal.ZERO, BigDecimal::add))));



        Map<AccountType, Double> totalBalanceByType = customers.stream()
                .flatMap(c -> c.getAccounts().stream()) // Flatten accounts from all customers
                .collect(Collectors.groupingBy(
                        Account::getType,
                        Collectors.summingDouble(a -> a.getBalance().doubleValue())
                ));

        // Aggregate by AccountType
//        customers.stream().flatMap(c -> c.getAccounts().stream()) // Flatten accounts
//                .collect(Collectors.groupingBy(Account::getType,
//                        Collectors.mapping(Account::getBalance,
//                                Collectors.reducing(BigDecimal.ZERO, BigDecimal::add)))).
//                forEach((type, total) -> System.out.println(type + " " + total));

//         Print result
        totalBalanceByType.forEach((type, total) ->
                System.out.println(type + " -> " + total)
        );
    }
}

// Supporting classes
enum AccountType {SAVINGS, CHECKING, LOAN}

class Account {
    private AccountType type;
    private BigDecimal balance;

    public Account(AccountType type, BigDecimal balance) {
        this.type = type;
        this.balance = balance;
    }

    public AccountType getType() {
        return type;
    }

    public BigDecimal getBalance() {
        return balance;
    }
}

class Customer {
    private String name;
    private List<Account> accounts;

    public Customer(String name, List<Account> accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}