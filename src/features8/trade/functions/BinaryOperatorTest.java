/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package features8.trade.functions;

import java.util.function.BinaryOperator;

import features8.trade.Trade;

/**
 *
 * @author mkonda
 */
public class BinaryOperatorTest {

    BinaryOperator<String> bi = (s1, s2) -> s1 + s2;
    
    BinaryOperator<Trade> tradeMerger = (t1, t2) -> {
        Trade mergedTrade = new Trade();
//        mergedTrade.merge(t1,t2);
        return mergedTrade;
    };
    

    private void testOperator() {
        String result = bi.apply("Just ", "Java 8");
        System.out.println(">" + result);
    }

    public static void main(String[] args) {
        BinaryOperatorTest test = new BinaryOperatorTest();
        test.testOperator();
    }

}
