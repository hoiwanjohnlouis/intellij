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

package com.hwtsllc.fix.enums.fix44;

import com.hwtsllc.fix.interfaces.LogFIXString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  829
 *  TrdSubType
 *  int
 *  <p></p>
 *  Further qualification to the trade type
 *  <p></p>
 *  Valid values:
 *  <p>    0 - CMTA
 *  <p>    1 - Internal transfer or adjustment
 *  <p>    2 - External transfer or transfer of account
 *  <p>    3 - Reject for submitting side
 *  <p>    4 - Advisory for contra side
 *  <p></p>
 *  <p>    5 - Offset due to an allocation
 *  <p>    6 - Onset due to an allocation
 *  <p>    7 - Differential spread
 *  <p>    8 - Implied spread leg executed against an outright
 *  <p>    9 - Transaction from exercise
 *  <p></p>
 *  <p>    10 - Transaction from assignment
 *  <p>    11 - ACATS
 *  <p></p>
 *  <p>    MiFID Values
 *  <p>    14 - AI (Automated input facility disabled in response to an exchange request.)
 *  <p></p>
 *  <p>    15 - B (Transaction between two member firms where neither member firm is
 *  <p>                registered as a market maker in the security in
 *  <p>                question and neither is a designated fund manager.
 *  <p>                Also used by broker dealers when dealing with
 *  <p>                another broker which is not a member firm.
 *  <p>                Non-order book securities only.)
 *  <p>    16 - K (Transaction using block trade facility.)
 *  <p>    17 - LC (Correction submitted more than three days after
 *  <p>                publication of the original trade report.)
 *  <p>    18 - M (Transaction, other than a transaction resulting
 *  <p>                from a stock swap or stock switch, between
 *  <p>                two market makers registered in that security
 *  <p>                including IDB or a public display system trades.
 *  <p>                Non-order book securities only.)
 *  <p>    19 - N (Non-protected portfolio transaction or a fully disclosed portfolio transaction)
 *  <p></p>
 *  <p>    20 - NM (
 *  <p>                  i) transaction where Exchange has granted permission for non-publication.
 *  <p>                 ii) IDB is reporting as seller.
 *  <p>                iii) submitting a transaction report to the Exchange,
 *  <p>                     where the transaction report is not also a trade report.
 *  <p>            )
 *  <p>    21 - NR (Non-risk transaction in a SEATS security other than an AIM security)
 *  <p>    22 - P (Protected portfolio transaction or a worked principal agreement to
 *  <p>                effect a portfolio transaction which includes order book securities)
 *  <p>    23 - PA (Protected transaction notification)
 *  <p>    24 - PC (Contra trade for transaction which took place on a previous day
 *  <p>                and which was automatically executed on the Exchange trading system)
 *  <p></p>
 *  <p>    25 - PN (Worked principal notification for a portfolio transaction
 *  <p>                which includes order book securities)
 *  <p>    26 - R (
 *  <p>                  i) riskless principal transaction between non-members
 *  <p>                        where the buying and selling transactions are
 *  <p>                        executed at different prices or on different terms
 *  <p>                        (requires a trade report with trade type indicator
 *  <p>                         R for each transaction).
 *  <p>                 ii) market maker is reporting all the legs of a riskless principal
 *  <p>                        transaction where the buying and selling transactions
 *  <p>                        are executed at different prices
 *  <p>                        (requires a trade report with trade type indicator R for each transaction).
 *  <p>                iii) market maker is reporting the onward leg of a riskless principal
 *  <p>                        transaction where the legs are executed at different prices,
 *  <p>                        and another market maker has submitted a trade report using
 *  <p>                        trade type indicator M for the first leg
 *  <p>                        (this requires a single trade report with trade type indicator R).
 *  <p>            )
 *  <p>    27 - RO (Transaction which resulted from the exercise of a traditional option
 *  <p>                or a stock-settled covered warrant)
 *  <p>    28 - RT (Risk transaction in a SEATS security, (excluding AIM security)
 *  <p>                reported by a market maker registered in that security)
 *  <p>    29 - SW (Transactions resulting from stock swap or a stock switch
 *  <p>                (one report is required for each line of stock) )
 *  <p></p>
 *  <p>    30 - T (If reporting a single protected transaction)
 *  <p>    31 - WN (Worked principal notification for a single order book security)
 *  <p>    32 - WT (Worked principal transaction (other than a portfolio transaction))
 */
public enum Enum829TrdSubType implements LogFIXString, LogVerboseString {
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

    /*
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
    N( "19", "N", "19 - N " +
                    "(Non-protected portfolio transaction or a fully disclosed portfolio transaction)" ),

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
                    "the buying and selling transactions are executed at different prices or on different terms " +
                    "(requires a trade report with trade type indicator R for each transaction).  " +
                    "ii) market maker is reporting all the legs of a riskless principal transaction where " +
                    "the buying and selling transactions are executed at different prices " +
                    "(requires a trade report with trade type indicator R for each transaction).  " +
                    "or  iii) market maker is reporting the onward leg of a riskless principal transaction " +
                    "where the legs are executed at different prices, and another market maker has submitted " +
                    "a trade report using trade type indicator M for the first leg (this requires a single " +
                    "trade report with trade type indicator R).)" ),
    RO( "27", "RO", "27 - RO (Transaction which resulted from the exercise of a " +
                    "traditional option or a stock-settled covered warrant)" ),
    RT( "28", "RT", "28 - RT (Risk transaction in a SEATS security, " +
                    "(excluding AIM security) reported by a market maker registered in that security)" ),
    SW( "29", "SW", "29 - SW (Transactions resulting from stock swap or a stock switch " +
                    "(one report is required for each line of stock)" ),

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
    public String toFIXLabelString() {
        return this.name();
    }
    /**
     * standard wrapper to retrieve the specific fix action code for this enum. eg: the first field
     */
    @Override
    public String toFIXIDString() {
        return id;
    }
    /**
     * standard wrapper to retrieve the specific fix name for this enum. eg: the second field
     */
    @Override
    public String toFIXNameString() {
        return name;
    }
    /**
     * standard wrapper to retrieve the specific fix description for this enum. eg: the third field
     */
    @Override
    public String toFIXDescriptionString() {
        return description;
    }
    /**
     * standard wrapper to format a detailed string describing this enum
     */
    @Override
    public String toVerboseString() {
        return this.getClass().getSimpleName()
                .concat("\n\tEnumName[")
                .concat( toFIXLabelString())
                .concat("]")
                .concat("\n\tAction[")
                .concat( toFIXIDString())
                .concat("]")
                .concat("\n\tName[")
                .concat( toFIXNameString())
                .concat("]")
                .concat("\n\tDescription[")
                .concat( toFIXDescriptionString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing this enum
     */
    @Override
    public String toString() {
        return id;
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
            System.out.println(oneEnum.toVerboseString());
        }
    }
}
