package com.example.model;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * These files contain the data structures which the parties using this CorDapp will reach an agreement over. States can
 * support arbitrary complex object graphs. For a more complicated one, see
 *
 * samples/irs-demo/src/kotlin/net/corda/irs/contract/IRS.kt
 *
 * in the main Corda repo (http://github.com/corda/corda).
 *
 * These structures could be embedded within the ContractState. However, for clarity, we have moved them in to a
 * separate file.
 */

/**
 * A simple class representing a purchase order.
 */
public class IRS {


    private int tradeId;
    private Date tradeDate;
    private String notionalCurrency;
    private Double notionalAmount;

    public IRS(int tradeId, Date tradeDate, String notionalCurrency, Double notionalAmount) {
        this.tradeId = tradeId;
        this.tradeDate = tradeDate;
        this.notionalCurrency = notionalCurrency;
        this.notionalAmount = notionalAmount;
    }

    public int getTradeId() {
        return tradeId;
    }

    public Date getTradeDate() {
        return tradeDate;
    }

    public String getNotionalCurrency() {
        return notionalCurrency;
    }

    public Double getNotionalAmount() {
        return notionalAmount;
    }





    // Dummy constructor used by the IRS API endpoint.
    public IRS() {}

    @java.lang.Override
    public java.lang.String toString() {
        return "IRS{" +
                "tradeId=" + tradeId +
                ", tradeDate=" + tradeDate +
                ", notionalCurrency='" + notionalCurrency + '\'' +
                ", notionalAmount=" + notionalAmount +
                '}';
    }


}