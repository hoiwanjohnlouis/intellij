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

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
 *
 *      5 - Offset due to an allocation
 *      6 - Onset due to an allocation
 *      7 - Differential spread
 *      8 - Implied spread leg executed against an outright
 *      9 - Transaction from exercise
 *
 *      10 - Transaction from assignment
 *      11 - ACATS
 *
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
 *
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
 assertEquals("", enumType.getDescription());
 assertEquals("", enumType.getDescription());
 assertEquals("", enumType.getDescription());
 assertEquals("", enumType.getDescription());
 assertEquals("", enumType.getDescription());
 *
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
 assertEquals("", enumType.getDescription());
 assertEquals("", enumType.getDescription());
 assertEquals("", enumType.getDescription());
 assertEquals("", enumType.getDescription());
 assertEquals("", enumType.getDescription());
 *
 *      29 - SW (Transactions resulting from stock swap or a stock switch
 *                  (one report is required for each line of stock) )
 *      30 - T (If reporting a single protected transaction)
 *      31 - WN (Worked principal notification for a single order book security)
 *      32 - WT (Worked principal transaction (other than a portfolio transaction))
 assertEquals("", enumType.getDescription());
 assertEquals("", enumType.getDescription());
 assertEquals("", enumType.getDescription());
 assertEquals("", enumType.getDescription());
 */
class Enum829TrdSubTypeTest {
    @Test
    void EnumTest() {
        Enum829TrdSubType enumType;

        enumType = Enum829TrdSubType.CMTA;
        assertEquals("0", enumType.getID());
        assertEquals("CMTA", enumType.getName());
        assertEquals("0 - CMTA", enumType.getDescription());

        enumType = Enum829TrdSubType.INTERNAL_TRANSFER;
        assertEquals("1 - Internal transfer or adjustment", enumType.getDescription());
        enumType = Enum829TrdSubType.EXTERNAL_TRANSFER;
        assertEquals("2 - External transfer or transfer of account", enumType.getDescription());
        enumType = Enum829TrdSubType.REJECT;
        assertEquals("3 - Reject for submitting side", enumType.getDescription());
        enumType = Enum829TrdSubType.ADVISORY_FOR_CONTRA;
        assertEquals("4 - Advisory for contra side", enumType.getDescription());

        enumType = Enum829TrdSubType.OFFSET_DUE_TO_ALLOCATION;
        assertEquals("5 - Offset due to an allocation", enumType.getDescription());
        enumType = Enum829TrdSubType.ONSET_DUE_TO_ALLOCATION;
        assertEquals("6 - Onset due to an allocation", enumType.getDescription());
        enumType = Enum829TrdSubType.DIFFERENTIAL_SPREAD;
        assertEquals("7 - Differential spread", enumType.getDescription());
        enumType = Enum829TrdSubType.IMPLIED_SPREAD_LEG;
        assertEquals("8 - Implied spread leg executed against an outright", enumType.getDescription());
        enumType = Enum829TrdSubType.TRANSACTION_FROM_EXERCISE;
        assertEquals("9 - Transaction from exercise", enumType.getDescription());

        enumType = Enum829TrdSubType.TRANSACTION_FROM_ASSIGNMENT;
        assertEquals("10 - Transaction from assignment", enumType.getDescription());
        enumType = Enum829TrdSubType.ACATS;
        assertEquals("11 - ACATS", enumType.getDescription());


        /**
         *  MiFID Values
         */
        enumType = Enum829TrdSubType.AI;
        assertEquals("14 - AI (Automated input facility disabled in response to an exchange request.)",
                enumType.getDescription());
        enumType = Enum829TrdSubType.B;
        assertEquals("15 - B (Transaction between two member firms where neither member firm " +
                            "is registered as a market maker in the security in question and neither " +
                            "is a designated fund manager. Also used by broker dealers when dealing " +
                            "with another broker which is not a member firm. Non-order book securities only.)",
                enumType.getDescription());
        enumType = Enum829TrdSubType.K;
        assertEquals("16 - K (Transaction using block trade facility.)",
                enumType.getDescription());
        enumType = Enum829TrdSubType.LC;
        assertEquals("17 - LC (Correction submitted more than three days " +
                            "after publication of the original trade report.)",
                enumType.getDescription());
        enumType = Enum829TrdSubType.M;
        assertEquals("18 - M (Transaction, other than a transaction resulting from a stock swap " +
                            "or stock switch, between two market makers registered in that " +
                            "security including IDB or a public display system trades. " +
                            "Non-order book securities only.)",
                enumType.getDescription());

        enumType = Enum829TrdSubType.N;
        enumType = Enum829TrdSubType.NM;
        enumType = Enum829TrdSubType.NR;
        enumType = Enum829TrdSubType.P;
        enumType = Enum829TrdSubType.PA;

        enumType = Enum829TrdSubType.PC;
        enumType = Enum829TrdSubType.PN;
        enumType = Enum829TrdSubType.R;
        enumType = Enum829TrdSubType.RO;
        enumType = Enum829TrdSubType.RT;

        enumType = Enum829TrdSubType.SW;
        enumType = Enum829TrdSubType.T;
        enumType = Enum829TrdSubType.WN;
        enumType = Enum829TrdSubType.WT;


        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}