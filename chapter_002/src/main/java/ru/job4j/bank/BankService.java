package ru.job4j.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            if (!users.get(user).contains(account)) {
                users.get(user).add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        Set<User> userSet = users.keySet();
        return userSet.stream().filter(e -> e.getPassport().equals(passport))
                .findFirst().orElse(null);
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            return findAccountByRequisite(user, requisite);
        }
        return null;
    }

    public Account findByRequisite(User user, String requisite) {
        if (user != null) {
            return findAccountByRequisite(user, requisite);
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        User srcUser = findByPassport(srcPassport);
        User destUser = findByPassport(destPassport);
        Account srcAccount = findByRequisite(srcUser, srcRequisite);
        Account destAccount = findByRequisite(destUser, destRequisite);
        if (srcUser != null && destUser != null
                && srcAccount != null && destAccount != null) {
            double srcBalance = srcAccount.getBalance();
            double destBalance = destAccount.getBalance();
            if (srcBalance >= amount) {
                srcBalance -= amount;
                destBalance += amount;
                srcAccount.setBalance(srcBalance);
                destAccount.setBalance(destBalance);
                rsl = true;
            }
        }
        return rsl;
    }

    private Account findAccountByRequisite(User user, String requisite) {
        List<Account> accounts = users.get(user);
        return accounts.stream().filter(e -> e.getRequisite().equals(requisite))
                .findFirst().orElse(null);
    }
}