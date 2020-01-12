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
        for (User user : userSet) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
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
                int srcAccIndex = users.get(srcUser).indexOf(srcAccount);
                int destAccIndex = users.get(destUser).indexOf(destAccount);
                users.get(srcUser).set(srcAccIndex, srcAccount);
                users.get(destUser).set(destAccIndex, destAccount);
                rsl = true;
            }
        }
        return rsl;
    }

    private Account findAccountByRequisite(User user, String requisite) {
        List<Account> accounts = users.get(user);
        for (Account account : accounts) {
            if (account.getRequisite().equals(requisite)) {
                return account;
            }
        }
        return null;
    }
}