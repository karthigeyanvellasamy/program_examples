/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package features8.trade.functions;

import java.util.function.Predicate;

import features8.trade.Trade;

/**
 *
 * @author mkonda
 */
public class PredicateTest {
    Predicate<Trade> p = t -> t.getQuantity()>100000;
    
    private void testBigTrade(Trade t) {
        if(p.test(t))
            System.out.println("Big Trade! "+t);
        else
            System.out.println("Nah, not a big Trade! "+t);
    }
    
    public static void main(String[] args) {
        new PredicateTest().testBigTrade(new Trade(1,"XT",20000000,"NEW"));
        new PredicateTest().testBigTrade(new Trade(1,"XT",10000,"NEW"));
    }
}
