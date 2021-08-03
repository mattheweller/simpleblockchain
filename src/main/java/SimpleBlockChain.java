import java.util.ArrayList;
import java.util.Arrays;

public class SimpleBlockChain {
    // Hash = digital signature
    // Each block will have:
    // - List of transaction's Previous Hash
    // - Hash

    public static void main(String[] args) {
        ArrayList<Block> blockchain = new ArrayList<>();

        String[] genesisTransactions = {"Satoshi sent Matt 10 bitcoin", "Matt sent Maki 5 bitcoin"};
        Block genesisBlock = new Block(0, genesisTransactions);
        blockchain.add(genesisBlock);

        String[] block2Transactions = {"Matt sent 5 bitcoin to code school", "Maki sent 5 bitcoin to art school"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);
        blockchain.add(block2);

        String[] block3Transactions = {"code school sent 5 bitcoin to coders", "Art school sent 5 bitcoin to artists"};
        Block block3 = new Block(block2.getBlockHash(), block3Transactions);
        blockchain.add(block3);

        System.out.println("Hash of genesis block");
        System.out.println(genesisBlock.getBlockHash());
        System.out.println("Hash of block 2");
        System.out.println(block2.getBlockHash());
        System.out.println("Hash of block 3");
        System.out.println(block3.getBlockHash());


    }
}
