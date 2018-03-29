package com.kylemcnee;

public class Main {

    public static void main(String[] args) {

        String[] genesisTransactions = {"Rob sent Frank 1.093 Dogecoin","Frank sent Rob .082 Monero"};
        Block genesisBlock = new Block(genesisTransactions,0);

        String[] block2Transactions = {"Elon sent 50 bitcoin to Satoshi", "Satoshi sent Elon 10 bitcoin"};
        Block block2 = new Block(block2Transactions, genesisBlock.getCurrentHash());

        System.out.println("-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-");
        System.out.println("This is the hash of the Genesis Block,");
        System.out.println("the very first block in our Blockchain:");
        System.out.println(genesisBlock.getCurrentHash());

        System.out.println("Here is the hash of our second block:");
        System.out.println(block2.getCurrentHash());

        System.out.println("-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-");

        System.out.println("Checking the hash allows us to be certain that");
        System.out.println("the data in each block has not been tampered with.");
        System.out.println("Try writing down the hash of both blocks and then changing a string slightly,");
        System.out.println("then run the program again and see how the Hashes are affected.");
    }
}
