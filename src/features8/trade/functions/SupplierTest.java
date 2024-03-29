/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package features8.trade.functions;

import java.util.List;
import java.util.function.Supplier;

import features8.trade.Trade;
import features8.trade.util.TradeUtil;

/**
 *
 * @author mkonda
 */
public class SupplierTest {
    Supplier<List<Trade>> supplier = () -> TradeUtil.createTrades();
    
    private void testSupplier() {
        System.out.println("Supplier Result "+supplier.get());
    }
    
    public static void main(String[] args) {
        new SupplierTest().testSupplier();
        
    }
    
}
