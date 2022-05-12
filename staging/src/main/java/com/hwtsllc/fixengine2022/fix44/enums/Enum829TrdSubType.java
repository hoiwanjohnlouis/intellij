/*
 * Copyright (c) 2022.  HW Tech Services, LLC
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.hwtsllc.fixengine2022.fix44.enums;

import com.hwtsllc.fixengine2022.interfaces.EnumAccessors;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  829
 *  TrdSubType
 *  int
 *  Further qualification to the trade type
 *  Valid values:
 *      0 - CMTA
 *      1 - Internal transfer or adjustment
 *      2 - External transfer or transfer of account
 *      3 - Reject for submitting side
 *      4 - Advisory for contra side
 *      5 - Offset due to an allocation
 *      6 - Onset due to an allocation
 *      7 - Differential spread
 *      8 - Implied spread leg executed against an outright
 *      9 - Transaction from exercise
 *      10 - Transaction from assignment
 *      11 - ACATS
 *
 *      MiFID Values
 *      14 - AI (Automated input facility disabled in response to an exchange request.)
 *      15 - B (Transaction between two member firms where neither member firm is
 *                  registered as a market maker in the security in
 *                  question and neither is a designated fund manager.
 *                  Also used by broker dealers when dealing with
 *                  another broker which is not a member firm.
 *                  Non-order book securities only.)
 *      16 - K (Transaction using block trade facility.)
 *      17 - LC (Correction submitted more than three days after
 *                  publication of the original trade report.)
 *      18 - M (Transaction, other than a transaction resulting
 *                  from a stock swap or stock switch, between
 *                  two market makers registered in that security
 *                  including IDB or a public display system trades.
 *                  Non-order book securities only.)
 *      19 - N (Non-protected portfolio transaction or a fully disclosed portfolio transaction)
 *      20 - NM (
 *                    i) transaction where Exchange has granted permission for non-publication
 *                   ii) IDB is reporting as seller
 *                  iii) submitting a transaction report to the Exchange,
 *                       where the transaction report is not also a trade report.
 *              )
 *      21 - NR (Non-risk transaction in a SEATS security other than an AIM security)
 *      22 - P (Protected portfolio transaction or a worked principal agreement to
 *                  effect a portfolio transaction which includes order book securities)
 *      23 - PA (Protected transaction notification)
 *      24 - PC (Contra trade for transaction which took place on a previous day
 *                  and which was automatically executed on the Exchange trading system)
 *      25 - PN (Worked principal notification for a portfolio transaction
 *                  which includes order book securities)
 *      26 - R (
 *                    i) riskless principal transaction between non-members
 *                          where the buying and selling transactions are
 *                          executed at different prices or on different terms
 *                          (requires a trade report with trade type indicator
 *                           R for each transaction)
 *                   ii) market maker is reporting all the legs of a riskless principal
 *                          transaction where the buying and selling transactions
 *                          are executed at different prices
 *                          (requires a trade report with trade type indicator R for each transaction) or
 *                  iii) market maker is reporting the onward leg of a riskless principal
 *                          transaction where the legs are executed at different prices,
 *                          and another market maker has submitted a trade report using
 *                          trade type indicator M for the first leg
 *                          (this requires a single trade report with trade type indicator R)
 *              )
 *      27 - RO (Transaction which resulted from the exercise of a traditional option
 *                  or a stock-settled covered warrant)
 *      28 - RT (Risk transaction in a SEATS security, (excluding AIM security)
 *                  reported by a market maker registered in that security)
 *      29 - SW (Transactions resulting from stock swap or a stock switch
 *                  (one report is required for each line of stock) )
 *      30 - T (If reporting a single protected transaction)
 *      31 - WN (Worked principal notification for a single order book security)
 *      32 - WT (Worked principal transaction (other than a portfolio transaction))
 */
public enum Enum829TrdSubType implements EnumAccessors, LogVerboseString {
    CMTA( "0", "CMTA", "0 - CMTA" ),
    INTERNAL_TRANSFER( "1", "INTERNAL_TRANSFER", "1 - Internal transfer or adjustment" ),
    EXTERNAL_TRANSFER( "2", "EXTERNAL_TRANSFER", "2 - External transfer or transfer of account" ),
    REJECT( "3", "REJECT", "3 - Reject for submitting side" ),
    ADVISORY_FOR_CONTRA( "4", "ADVISORY_FOR_CONTRA", "4 - Advisory for contra side" ),

    OFFSET_DUE_TO_ALLOCATION( "5", "OFFSET_DUE_TO_ALLOCATION", "5 - Offset due to an allocation" ),
    ONSET_DUE_TO_ALLOCATION( "6", "ONSET_DUE_TO_ALLOCATION", "6 - Onset due to an allocation" ),
    DIFFERENTIAL_SPREAD( "7", "DIFFERENTIAL_SPREAD", "7 - Differential spread" ),
    IMPLIED_SPREAD_LEG( "8", "IMPLIED_SPREAD_LEG", "8 - Implied spread leg executed against an outright" ),
    TRANSACTION_FROM_EXERCISE( "9", "TRANSACTION_FROM_EXERCISE", "9 - Transaction from exercise" ),

    TRANSACTION_FROM_ASSIGNMENT( "10", "TRANSACTION_FROM_ASSIGNMENT", "10 - Transaction from assignment" ),
    ACATS( "11", "ACATS", "11 - ACATS" ),

    /**
     *  MiFID Values
     */
    AI( "14", "AI", "14 - AI (Automated input facility disabled in response to an exchange request.)" ),
    B( "15", "B","15 - B (Transaction between two member firms where neither member firm is " +
                    "registered as a market maker in the security in question and neither is a designated fund " +
                    "manager. Also used by broker dealers when dealing with another broker which is not a " +
                    "member firm. Non-order book securities only.)" ),
    K( "16", "K", "16 - K (Transaction using block trade facility.)" ),
    LC( "17", "LC", "17 - LC (Correction submitted more than three days after publication " +
                    "of the original trade report.)" ),
    M( "18", "M", "18 - M (Transaction, other than a transaction resulting from a " +
                    "stock swap or stock switch, between two market makers registered in that security " +
                    "including IDB or a public display system trades. Non-order book securities only.)" ),

    N( "19", "N", "19 - N (Non-protected portfolio transaction or a fully disclosed " +
            "       portfolio transaction)" ),
    NM( "20", "NM", "20 - NM (  i) transaction where Exchange has granted permission for " +
                    "non-publication.  ii) IDB is reporting as seller.  iii) submitting a transaction report " +
                    "to the Exchange, where the transaction report is not also a trade report.)" ),
    NR( "21", "NR", "21 - NR (Non-risk transaction in a SEATS security other than an AIM security)" ),
    P( "22", "P", "22 - P (Protected portfolio transaction " +
                    "or a worked principal agreement to effect a portfolio transaction " +
                    "which includes order book securities)" ),
    PA( "23", "PA", "23 - PA (Protected transaction notification)" ),

    PC( "24", "PC", "24 - PC (Contra trade for transaction which took place " +
                    "on a previous day and which was automatically executed on the Exchange trading system)" ),
    PN( "25", "PN", "25 - PN (Worked principal notification for a portfolio transaction " +
                    "which includes order book securities)" ),
    R( "26", "R", "26 - R (  i) riskless principal transaction between non-members where " +
                    "the buying and selling transactions are executed at different prices or on different " +
                    "terms (requires a trade report with trade type indicator R for each transaction).  " +
                    "ii) market maker is reporting all the legs of a riskless principal transaction where " +
                    "the buying and selling transactions are executed at different prices " +
                    "(requires a trade report with trade type indicator R for each transaction). " +
                    "or  iii) market maker is reporting the onward leg of a riskless principal transaction " +
                    "where the legs are executed at different prices, and another market maker has submitted " +
                    "a trade report using trade type indicator M for the first leg (this requires a single " +
                    "trade report with trade type indicator R).)" ),
    RO( "27", "RO", "27 - RO (Transaction which resulted from the exercise of a " +
                    "traditional option or a stock-settled covered warrant)" ),
    RT( "28", "RT", "28 - RT (Risk transaction in a SEATS security, " +
                    "(excluding AIM security) reported by a market maker registered in that security)" ),

    SW( "29", "SW", "29 - SW (Transactions resulting from stock swap " +
                    "or a stock switch (one report is required for each line of stock))" ),
    T( "30", "T", "30 - T (If reporting a single protected transaction)" ),
    WN( "31", "WN", "31 - WN (Worked principal notification for a single order book security)" ),
    WT( "32", "WT", "32 - WT (Worked principal transaction (other than a portfolio transaction))" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum829TrdSubType(final String id, final String name, final String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * standard wrapper to retrieve the specific enum name
     */
    @Override
    public String getEnumName() {
        return this.name();
    }
    /**
     * standard wrapper to retrieve the specific fix action code for this enum. eg: the first field
     */
    @Override
    public String getID() {
        return id;
    }
    /**
     * standard wrapper to retrieve the specific fix name for this enum. eg: the second field
     */
    @Override
    public String getName() {
        return name;
    }
    /**
     * standard wrapper to retrieve the specific fix description for this enum. eg: the third field
     */
    @Override
    public String getDescription() {
        return description;
    }
    /**
     * standard wrapper to format a detailed string describing this enum
     */
    @Override
    public String toVerboseString() {
        return this.getClass().getSimpleName()
                .concat("\n\tEnumName[")
                .concat(getEnumName())
                .concat("]")
                .concat("\n\tAction[")
                .concat(getID())
                .concat("]")
                .concat("\n\tName[")
                .concat(getName())
                .concat("]")
                .concat("\n\tDescription[")
                .concat(getDescription())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing this enum
     */
    @Override
    public String toString() {
        return getEnumName()
                .concat("=[")
                .concat(getID())
                .concat(",")
                .concat(getName())
                .concat(",")
                .concat(getDescription())
                .concat("]");
    }

    /**
     *
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values
         */
        for (Enum829TrdSubType oneEnum : Enum829TrdSubType.values()) {
            System.out.println(oneEnum);
        }
    }
}
