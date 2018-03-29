package com.kylemcnee;

import java.util.Arrays;

public class Block {

    private String[] transactions;
    private int lastHash;
    private int currentHash;

    public Block(String[] transactions, int lastHash) {
        this.transactions = transactions;
        this.lastHash = lastHash;

        Object[] data = {Arrays.hashCode(transactions), lastHash};
        this.currentHash = Arrays.hashCode(data);
    }

    public String[] getTransactions() {
        return transactions;
    }

    public int getLastHash() {
        return lastHash;
    }

    public int getCurrentHash() {
        return currentHash;
    }
}
