package Homework_streams;

import java.util.*;
import java.util.stream.Collectors;

public class PuttingIntoPractice {

    public static void main(String... args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Trader> traders = new ArrayList<>();
        traders.add(raoul);
        traders.add(mario);
        traders.add(alan);
        traders.add(brian);

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        //1////////////////////////////////////////////////

        List<Transaction> sortedTransactions = Homework_stream.streamTaskOne(transactions);
        //System.out.println(sortedTransactions.toString());

        //2/////////////////////////////////////////////////

        Homework_stream.streamTaskTwo(traders);

        //3/////////////////////////////////////////////////

        List<Trader> CambrieTraders = Homework_stream.streamTastThree(traders);
        //for(Trader s:CambrieTraders){
        //    System.out.println(s.toString());
        //}

        //4//////////////////////////////////////////////////

        List<String> traderName = Homework_stream.streamTaskFour(traders);
        //for(String s:traderName){
        //    System.out.println(s);
        //}

        //5//////////////////////////////////////////////////

        System.out.println(Homework_stream.streamTaskFive(traders));

        //6//////////////////////////////////////////////////

        Homework_stream.streamTaskSix(traders,transactions);

        //7/////////////////////////////////////////////////

        System.out.println(Homework_stream.streamTaskSeven(transactions));

        //8/////////////////////////////////////////////////

        System.out.println(Homework_stream.streamTaskEight(transactions));

    }



}
