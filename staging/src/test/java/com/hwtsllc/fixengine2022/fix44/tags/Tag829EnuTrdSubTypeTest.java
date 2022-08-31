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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.fix44.enums.Enum829TrdSubType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag829EnuTrdSubTypeTest {
    Tag829EnuTrdSubType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum829TrdSubType oneEnum : Enum829TrdSubType.values()) {
            tagData = new Tag829EnuTrdSubType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum829TrdSubType oneEnum : Enum829TrdSubType.values()) {
            tagData = new Tag829EnuTrdSubType(oneEnum);
            assertEquals( "FIX829_ENU_TRD_SUB_TYPE", tagData.toEnumLabelString());
            assertEquals( "829", tagData.toEnumIDString());
            assertEquals( "TRD_SUB_TYPE", tagData.toEnumNameString());
            assertEquals( "TrdSubType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum829TrdSubType oneEnum : Enum829TrdSubType.values()) {
            tagData = new Tag829EnuTrdSubType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  829
         *  TrdSubType
         *  int
         *  <p>    0 - CMTA
         *  <p>    1 - Internal transfer or adjustment
         *  <p>    2 - External transfer or transfer of account
         *  <p>    3 - Reject for submitting side
         *  <p>    4 - Advisory for contra side
         */
        tagData = new Tag829EnuTrdSubType( Enum829TrdSubType.CMTA );
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.INTERNAL_TRANSFER);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.EXTERNAL_TRANSFER);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.REJECT);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.ADVISORY_FOR_CONTRA);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    5 - Offset due to an allocation
         *  <p>    6 - Onset due to an allocation
         *  <p>    7 - Differential spread
         *  <p>    8 - Implied spread leg executed against an outright
         *  <p>    9 - Transaction from exercise
         */
        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.OFFSET_DUE_TO_ALLOCATION);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.ONSET_DUE_TO_ALLOCATION);
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.DIFFERENTIAL_SPREAD);
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.IMPLIED_SPREAD_LEG);
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.TRANSACTION_FROM_EXERCISE);
        assertEquals( "9", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    10 - Transaction from assignment
         *  <p>    11 - ACATS
         */
        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.TRANSACTION_FROM_ASSIGNMENT);
        assertEquals( "10", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.ACATS);
        assertEquals( "11", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    MiFID Values
         *  <p>    14 - AI (Automated input facility disabled in response to an exchange request.)
         */
        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.AI);
        assertEquals( "14", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    MiFID Values
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
         */
        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.B);
        assertEquals( "15", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.K);
        assertEquals( "16", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.LC);
        assertEquals( "17", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.M);
        assertEquals( "18", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.N);
        assertEquals( "19", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    MiFID Values
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
         */
        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.NM);
        assertEquals( "20", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.NR);
        assertEquals( "21", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.P);
        assertEquals( "22", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.PA);
        assertEquals( "23", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.PC);
        assertEquals( "24", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    MiFID Values
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
         */
        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.PN);
        assertEquals( "25", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.R);
        assertEquals( "26", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.RO);
        assertEquals( "27", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.RT);
        assertEquals( "28", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.SW);
        assertEquals( "29", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    MiFID Values
         *  <p>    30 - T (If reporting a single protected transaction)
         *  <p>    31 - WN (Worked principal notification for a single order book security)
         *  <p>    32 - WT (Worked principal transaction (other than a portfolio transaction))
         */
        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.T);
        assertEquals( "30", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.WN);
        assertEquals( "31", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.WT);
        assertEquals( "32", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum829TrdSubType oneEnum : Enum829TrdSubType.values()) {
            tagData = new Tag829EnuTrdSubType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum829TrdSubType oneEnum : Enum829TrdSubType.values()) {
            tagData = new Tag829EnuTrdSubType(oneEnum);
            assertEquals( "Tag829EnuTrdSubType\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}