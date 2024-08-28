package Homework_streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Homework_stream {
    public static List<Transaction> streamTaskOne(List<Transaction> transactionList){
        List<Transaction> transactions = transactionList.stream()
                .filter(list -> list.getYear() == 2011)
                .sorted((trans1, trans2) -> trans1.getYear()-trans2.getYear())
                .toList();
        return transactions;
    }

    public static void streamTaskTwo(List<Trader> traders){
        Set<String> cities = traders.stream()
                .map(trader -> trader.getCity())
                .collect(Collectors.toSet());
        for (String s:cities) {
            System.out.println(s);
        }
    }

    public static List<Trader> streamTastThree(List<Trader> traders){
        List<Trader> CambrieTraders = traders.stream()
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .sorted((o1,o2) -> o1.getName().compareTo(o2.getName()))
                .toList();
        return  CambrieTraders;
    }

    public static List<String> streamTaskFour(List<Trader> traders){
        List<String> tradersName = traders.stream()
                .map(trader -> trader.getName())
                .sorted()
                .toList();
        return  tradersName;
    }

    public static boolean streamTaskFive(List<Trader> traders){
        int count = 0;
        for(Trader trader:traders){
            if (trader.getCity().equals("Milan")) return true;
        }

        return false;
    }

    public static void streamTaskSix(List<Trader> traders, List<Transaction> transactions){
        List<Trader> CambrieTraders = Homework_stream.streamTastThree(traders);
        HashMap<String,Integer> tradersSum = new HashMap<>();
        for(Trader trader:CambrieTraders){
            String name = trader.getName();
            int sum = 0;
            for(Transaction transaction:transactions){
                if(transaction.getTrader().getName().equals(name)) sum+=transaction.getValue();
            }
            tradersSum.put(name,sum);
        }

        for(String s:tradersSum.keySet()){
            String str = s;
            Integer integer= tradersSum.get(str);
            System.out.println(str+"    "+integer);
        }
    }

    public  static Integer streamTaskSeven(List<Transaction> transactions){
        int sum=0;
        for (Transaction transaction:transactions) {
            if (transaction.getValue() > sum) sum = transaction.getValue();
        }
        return sum;
    }

    public  static Integer streamTaskEight(List<Transaction> transactions){
        int sum=100000;
        for (Transaction transaction:transactions) {
            if (transaction.getValue() < sum) sum = transaction.getValue();
        }
        return sum;
    }

}
