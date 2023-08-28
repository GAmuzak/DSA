package Phase2.StacksAndQueues;

import java.util.*;

import Utils.Converter;
import Utils.IOHandler;

public class StockSpan {

    public static ArrayList<Integer> findSpans(ArrayList<Integer> price) {
        ArrayList<Integer> sol = new ArrayList<>();
        Stack<StockData> stockData = new Stack<>();
        stockData.push(new StockData(price.get(0), 1));
        sol.add(1);
        for (int i = 1; i < price.size(); i++) {
            int currPrice = price.get(i);
            int prevPrice = stockData.peek().stock;
            if (currPrice < prevPrice) {
                stockData.push(new StockData(currPrice, 1));
                sol.add(1);
            } else {
                int totalSpanCount = 1;
                while (!stockData.isEmpty()) {
                    prevPrice = stockData.peek().stock;
                    if (currPrice >= prevPrice) {
                        int spanCount = stockData.peek().span;
                        stockData.pop();
                        totalSpanCount += spanCount;
                    } else {
                        break;
                    }
                }
                stockData.push(new StockData(currPrice, totalSpanCount));
                sol.add(totalSpanCount);
            }
        }
        return sol;
    }

    public static void main(String[] args) {
        int[] stockPrices = { 100, 80, 60, 70, 60, 75, 85 };
        ArrayList<Integer> stocks = IOHandler.arrayListInit(Converter.toObject(stockPrices));
        ArrayList<Integer> sol = findSpans(stocks);
        IOHandler.printArrayList(sol);
    }
}

class StockData {
    int stock;
    int span;

    StockData(int stock, int span) {
        this.stock = stock;
        this.span = span;
    }
}
