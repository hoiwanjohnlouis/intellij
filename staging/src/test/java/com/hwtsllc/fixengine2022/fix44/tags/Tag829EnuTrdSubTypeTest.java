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

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.fix44.enums.Enum829TrdSubType;
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
class Tag829EnuTrdSubTypeTest {
    @Test
    void FIX0829Test() {
        FIX44 fixData = FIX44.FIX829_ENU_TRD_SUB_TYPE;
        assertEquals( "829", fixData.toFIXIDString());
        assertEquals( "TRD_SUB_TYPE", fixData.toFIXNameString());
        assertEquals( "TrdSubType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0829Test() {
        Tag829EnuTrdSubType tagData;

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.CMTA);
        assertEquals( Enum829TrdSubType.CMTA.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.INTERNAL_TRANSFER);
        assertEquals( Enum829TrdSubType.INTERNAL_TRANSFER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.EXTERNAL_TRANSFER);
        assertEquals( Enum829TrdSubType.EXTERNAL_TRANSFER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.REJECT);
        assertEquals( Enum829TrdSubType.REJECT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.ADVISORY_FOR_CONTRA);
        assertEquals( Enum829TrdSubType.ADVISORY_FOR_CONTRA.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.OFFSET_DUE_TO_ALLOCATION);
        assertEquals( Enum829TrdSubType.OFFSET_DUE_TO_ALLOCATION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.ONSET_DUE_TO_ALLOCATION);
        assertEquals( Enum829TrdSubType.ONSET_DUE_TO_ALLOCATION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.DIFFERENTIAL_SPREAD);
        assertEquals( Enum829TrdSubType.DIFFERENTIAL_SPREAD.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.IMPLIED_SPREAD_LEG);
        assertEquals( Enum829TrdSubType.IMPLIED_SPREAD_LEG.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.TRANSACTION_FROM_EXERCISE);
        assertEquals( Enum829TrdSubType.TRANSACTION_FROM_EXERCISE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.TRANSACTION_FROM_ASSIGNMENT);
        assertEquals( Enum829TrdSubType.TRANSACTION_FROM_ASSIGNMENT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.ACATS);
        assertEquals( Enum829TrdSubType.ACATS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());



        /*
         *  MiFID Values
         */
        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.AI);
        assertEquals( Enum829TrdSubType.AI.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.B);
        assertEquals( Enum829TrdSubType.B.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.K);
        assertEquals( Enum829TrdSubType.K.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.LC);
        assertEquals( Enum829TrdSubType.LC.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.M);
        assertEquals( Enum829TrdSubType.M.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.N);
        assertEquals( Enum829TrdSubType.N.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.NM);
        assertEquals( Enum829TrdSubType.NM.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.NR);
        assertEquals( Enum829TrdSubType.NR.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.P);
        assertEquals( Enum829TrdSubType.P.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.PA);
        assertEquals( Enum829TrdSubType.PA.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.PC);
        assertEquals( Enum829TrdSubType.PC.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.PN);
        assertEquals( Enum829TrdSubType.PN.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.R);
        assertEquals( Enum829TrdSubType.R.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.RO);
        assertEquals( Enum829TrdSubType.RO.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.RT);
        assertEquals( Enum829TrdSubType.RT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.SW);
        assertEquals( Enum829TrdSubType.SW.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.T);
        assertEquals( Enum829TrdSubType.T.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.WN);
        assertEquals( Enum829TrdSubType.WN.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag829EnuTrdSubType(Enum829TrdSubType.WT);
        assertEquals( Enum829TrdSubType.WT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag829EnuTrdSubType tagData;

        // loop around the ENUM and process
        for ( Enum829TrdSubType oneEnum : Enum829TrdSubType.values()) {
            tagData = new Tag829EnuTrdSubType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag829EnuTrdSubType tagData;

        // loop around the ENUM and process
        for (Enum829TrdSubType oneEnum : Enum829TrdSubType.values()) {
            tagData = new Tag829EnuTrdSubType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag829EnuTrdSubType tagData;

        // loop around the ENUM and process
        for (Enum829TrdSubType oneEnum : Enum829TrdSubType.values()) {
            tagData = new Tag829EnuTrdSubType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag829EnuTrdSubType tagData;

        // loop around the ENUM and process
        for (Enum829TrdSubType oneEnum : Enum829TrdSubType.values()) {
            tagData = new Tag829EnuTrdSubType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag829EnuTrdSubType tagData;

        // loop around the ENUM and process
        for (Enum829TrdSubType oneEnum : Enum829TrdSubType.values()) {
            tagData = new Tag829EnuTrdSubType(oneEnum);
            assertEquals( "Tag829EnuTrdSubType\n" +
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}