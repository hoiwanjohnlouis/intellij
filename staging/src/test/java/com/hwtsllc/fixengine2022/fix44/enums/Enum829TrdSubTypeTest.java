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

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
 *  <p></p>
 *  <p>    19 - N (Non-protected portfolio transaction or a fully disclosed portfolio transaction)
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
 *  <p></p>
 *  <p>    24 - PC (Contra trade for transaction which took place on a previous day
 *  <p>                and which was automatically executed on the Exchange trading system)
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
 *  <p></p>
 *  <p>    29 - SW (Transactions resulting from stock swap or a stock switch
 *  <p>                (one report is required for each line of stock) )
 *  <p>    30 - T (If reporting a single protected transaction)
 *  <p>    31 - WN (Worked principal notification for a single order book security)
 *  <p>    32 - WT (Worked principal transaction (other than a portfolio transaction))
 */
class Enum829TrdSubTypeTest {
    @Test
    void EnumTest() {
        Enum829TrdSubType enumType;

        enumType = Enum829TrdSubType.CMTA;
        assertEquals("0", enumType.toEnumIDString());
        assertEquals("CMTA", enumType.toEnumNameString());
        assertEquals("0 - CMTA", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum829TrdSubType.INTERNAL_TRANSFER;
        assertEquals("1", enumType.toEnumIDString());
        assertEquals("INTERNAL_TRANSFER", enumType.toEnumNameString());
        assertEquals("1 - Internal transfer or adjustment", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum829TrdSubType.EXTERNAL_TRANSFER;
        assertEquals("2", enumType.toEnumIDString());
        assertEquals("EXTERNAL_TRANSFER", enumType.toEnumNameString());
        assertEquals("2 - External transfer or transfer of account", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum829TrdSubType.REJECT;
        assertEquals("3", enumType.toEnumIDString());
        assertEquals("REJECT", enumType.toEnumNameString());
        assertEquals("3 - Reject for submitting side", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum829TrdSubType.ADVISORY_FOR_CONTRA;
        assertEquals("4", enumType.toEnumIDString());
        assertEquals("ADVISORY_FOR_CONTRA", enumType.toEnumNameString());
        assertEquals("4 - Advisory for contra side", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum829TrdSubType.OFFSET_DUE_TO_ALLOCATION;
        assertEquals("5", enumType.toEnumIDString());
        assertEquals("OFFSET_DUE_TO_ALLOCATION", enumType.toEnumNameString());
        assertEquals("5 - Offset due to an allocation", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum829TrdSubType.ONSET_DUE_TO_ALLOCATION;
        assertEquals("6", enumType.toEnumIDString());
        assertEquals("ONSET_DUE_TO_ALLOCATION", enumType.toEnumNameString());
        assertEquals("6 - Onset due to an allocation", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum829TrdSubType.DIFFERENTIAL_SPREAD;
        assertEquals("7", enumType.toEnumIDString());
        assertEquals("DIFFERENTIAL_SPREAD", enumType.toEnumNameString());
        assertEquals("7 - Differential spread", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum829TrdSubType.IMPLIED_SPREAD_LEG;
        assertEquals("8", enumType.toEnumIDString());
        assertEquals("IMPLIED_SPREAD_LEG", enumType.toEnumNameString());
        assertEquals("8 - Implied spread leg executed against an outright", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum829TrdSubType.TRANSACTION_FROM_EXERCISE;
        assertEquals("9", enumType.toEnumIDString());
        assertEquals("TRANSACTION_FROM_EXERCISE", enumType.toEnumNameString());
        assertEquals("9 - Transaction from exercise", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum829TrdSubType.TRANSACTION_FROM_ASSIGNMENT;
        assertEquals("10", enumType.toEnumIDString());
        assertEquals("TRANSACTION_FROM_ASSIGNMENT", enumType.toEnumNameString());
        assertEquals("10 - Transaction from assignment", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum829TrdSubType.ACATS;
        assertEquals("11", enumType.toEnumIDString());
        assertEquals("ACATS", enumType.toEnumNameString());
        assertEquals("11 - ACATS", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());



        /*
         *  MiFID Values
         */
        enumType = Enum829TrdSubType.AI;
        assertEquals("14", enumType.toEnumIDString());
        assertEquals("AI", enumType.toEnumNameString());
        assertEquals("14 - AI (Automated input facility disabled in response to an exchange request.)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum829TrdSubType.B;
        assertEquals("15", enumType.toEnumIDString());
        assertEquals("B", enumType.toEnumNameString());
        assertEquals("15 - B (Transaction between two member firms where neither member firm " +
                            "is registered as a market maker in the security in question and neither " +
                            "is a designated fund manager. Also used by broker dealers when dealing " +
                            "with another broker which is not a member firm. Non-order book securities only.)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum829TrdSubType.K;
        assertEquals("16", enumType.toEnumIDString());
        assertEquals("K", enumType.toEnumNameString());
        assertEquals("16 - K (Transaction using block trade facility.)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum829TrdSubType.LC;
        assertEquals("17", enumType.toEnumIDString());
        assertEquals("LC", enumType.toEnumNameString());
        assertEquals("17 - LC (Correction submitted more than three days " +
                        "after publication of the original trade report.)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum829TrdSubType.M;
        assertEquals("18", enumType.toEnumIDString());
        assertEquals("M", enumType.toEnumNameString());
        assertEquals("18 - M (Transaction, other than a transaction resulting from a stock swap " +
                        "or stock switch, between two market makers registered in that " +
                        "security including IDB or a public display system trades. " +
                        "Non-order book securities only.)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum829TrdSubType.N;
        assertEquals("19", enumType.toEnumIDString());
        assertEquals("N", enumType.toEnumNameString());
        assertEquals("19 - N (Non-protected portfolio transaction or a fully disclosed portfolio transaction)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum829TrdSubType.NM;
        assertEquals("20", enumType.toEnumIDString());
        assertEquals("NM", enumType.toEnumNameString());
        assertEquals("20 - NM (  " +
                        "i) transaction where Exchange has granted permission for non-publication.  " +
                        "ii) IDB is reporting as seller.  " +
                        "iii) submitting a transaction report to the Exchange, " +
                        "where the transaction report is not also a trade report.)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum829TrdSubType.NR;
        assertEquals("21", enumType.toEnumIDString());
        assertEquals("NR", enumType.toEnumNameString());
        assertEquals("21 - NR (Non-risk transaction in a SEATS security other than an AIM security)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum829TrdSubType.P;
        assertEquals("22", enumType.toEnumIDString());
        assertEquals("P", enumType.toEnumNameString());
        assertEquals("22 - P (Protected portfolio transaction or a worked principal agreement " +
                    "to effect a portfolio transaction which includes order book securities)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum829TrdSubType.PA;
        assertEquals("23", enumType.toEnumIDString());
        assertEquals("PA", enumType.toEnumNameString());
        assertEquals("23 - PA (Protected transaction notification)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum829TrdSubType.PC;
        assertEquals("24", enumType.toEnumIDString());
        assertEquals("PC", enumType.toEnumNameString());
        assertEquals("24 - PC (Contra trade for transaction which took place on a previous day " +
                        "and which was automatically executed on the Exchange trading system)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum829TrdSubType.PN;
        assertEquals("25", enumType.toEnumIDString());
        assertEquals("PN", enumType.toEnumNameString());
        assertEquals("25 - PN (Worked principal notification for a portfolio " +
                        "transaction which includes order book securities)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum829TrdSubType.R;
        assertEquals("26", enumType.toEnumIDString());
        assertEquals("R", enumType.toEnumNameString());
        assertEquals("26 - R (  " +
                "i) riskless principal transaction between non-members where the buying and selling " +
                        "transactions are executed at different prices or on different terms " +
                        "(requires a trade report with trade type indicator R for each transaction).  " +
                "ii) market maker is reporting all the legs of a riskless principal transaction where " +
                        "the buying and selling transactions are executed at different prices " +
                        "(requires a trade report with trade type indicator R for each transaction).  " +
                "or  " +
                "iii) market maker is reporting the onward leg of a riskless principal transaction " +
                        "where the legs are executed at different prices, and another market maker has submitted " +
                        "a trade report using trade type indicator M for the first leg (this requires a single " +
                        "trade report with trade type indicator R).)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum829TrdSubType.RO;
        assertEquals("27", enumType.toEnumIDString());
        assertEquals("RO", enumType.toEnumNameString());
        assertEquals("27 - RO (Transaction which resulted from the exercise of a traditional option " +
                "or a stock-settled covered warrant)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum829TrdSubType.RT;
        assertEquals("28", enumType.toEnumIDString());
        assertEquals("RT", enumType.toEnumNameString());
        assertEquals("28 - RT (Risk transaction in a SEATS security, (excluding AIM security) " +
                "reported by a market maker registered in that security)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum829TrdSubType.SW;
        assertEquals("29", enumType.toEnumIDString());
        assertEquals("SW", enumType.toEnumNameString());
        assertEquals("29 - SW (Transactions resulting from stock swap or a stock switch " +
                "(one report is required for each line of stock)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum829TrdSubType.T;
        assertEquals("30", enumType.toEnumIDString());
        assertEquals("T", enumType.toEnumNameString());
        assertEquals("30 - T (If reporting a single protected transaction)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum829TrdSubType.WN;
        assertEquals("31", enumType.toEnumIDString());
        assertEquals("WN", enumType.toEnumNameString());
        assertEquals("31 - WN (Worked principal notification for a single order book security)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum829TrdSubType.WT;
        assertEquals("32", enumType.toEnumIDString());
        assertEquals("WT", enumType.toEnumNameString());
        assertEquals("32 - WT (Worked principal transaction (other than a portfolio transaction))",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}