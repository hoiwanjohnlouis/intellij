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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.fix27.enums.Enum47Rule80A;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

// @Deprecated
class Tag47EnuRule80ATest {
    Tag47EnuRule80A tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum47Rule80A oneEnum : Enum47Rule80A.values()) {
            tagData = new Tag47EnuRule80A(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum47Rule80A oneEnum : Enum47Rule80A.values()) {
            tagData = new Tag47EnuRule80A(oneEnum);
            assertEquals( "FIX47_ENU_RULE_80_A", tagData.toFIXLabelString());
            assertEquals( "RULE_80_A", tagData.toFIXNameString());
            assertEquals( "47", tagData.toFIXIDString());
            assertEquals( "Rule80A (no longer used)", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum47Rule80A oneEnum : Enum47Rule80A.values()) {
            tagData = new Tag47EnuRule80A(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  47
         *  <p>    A - Agency single order
         *  <p>    B - Short exempt transaction (refer to A type)
         *  <p>    C - Program order, non-index arb, for Member firm/org
         *  <p>    D - Program order, index arb, for Member firm/org
         *  <p>    E - Short Exempt Transaction for Principal
         *          (was incorrectly identified in the FIX spec as "Registered Equity Market Maker trades")
         */
        tagData = new Tag47EnuRule80A(Enum47Rule80A.AGENCY_SINGLE_ORDER);
        assertEquals( "A", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag47EnuRule80A(Enum47Rule80A.SHORT_EXEMPT_A);
        assertEquals( "B", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag47EnuRule80A(Enum47Rule80A.PROGRAM_NON_INDEX_ARB_MEMBER);
        assertEquals( "C", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag47EnuRule80A(Enum47Rule80A.PROGRAM_INDEX_ARB_MEMBER);
        assertEquals( "D", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag47EnuRule80A(Enum47Rule80A.SHORT_EXEMPT_P);
        assertEquals( "E", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    F - Short exempt transaction (refer to W type)
         *  <p>    H - Short exempt transaction (refer to I type)
         *  <p>    I - Individual Investor, single order
         *  <p>    J - Program Order, index arb, for individual customer
         *  <p>    K - Program Order, non-index arb, for individual customer
         */
        tagData = new Tag47EnuRule80A(Enum47Rule80A.SHORT_EXEMPT_W);
        assertEquals( "F", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag47EnuRule80A(Enum47Rule80A.SHORT_EXEMPT_I);
        assertEquals( "H", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag47EnuRule80A(Enum47Rule80A.INDIVIDUAL_INVESTOR_SINGLE_ORDER);
        assertEquals( "I", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag47EnuRule80A(Enum47Rule80A.PROGRAM_INDEX_ARB_INDIVIDUAL);
        assertEquals( "J", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag47EnuRule80A(Enum47Rule80A.PROGRAM_NON_INDEX_ARB_INDIVIDUAL);
        assertEquals( "K", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    L - Short exempt transaction for member competing market-maker affiliated with the firm clearing the trade
         *          (refer to P and O types)
         *  <p>    M - Program Order, index arb, for other member
         *  <p>    N - Program Order, non-index arb, for other member
         *  <p>    O - Proprietary transactions for competing market-maker that is affiliated with the clearing member
         *          (was incorrectly identified in the FIX spec as "Competing dealer trades")
         *  <p>    P - Principal
         */
        tagData = new Tag47EnuRule80A(Enum47Rule80A.SHORT_EXEMPT_MARKET_MAKER_P_O);
        assertEquals( "L", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag47EnuRule80A(Enum47Rule80A.PROGRAM_INDEX_ARB_OTHER_MEMBER);
        assertEquals( "M", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag47EnuRule80A(Enum47Rule80A.PROGRAM_NON_INDEX_ARB_OTHER_MEMBER);
        assertEquals( "N", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag47EnuRule80A(Enum47Rule80A.PROPRIETARY_MARKET_MAKER_CLEARING);
        assertEquals( "O", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag47EnuRule80A(Enum47Rule80A.PRINCIPAL);
        assertEquals( "P", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    R - Transactions for the account of a non-member competing market-maker
         *          (was incorrectly identified in the FIX spec as "Competing dealer trades")
         *  <p>    S - Specialist trades
         *  <p>    T - Transactions for the account of an unaffiliated member's competing market-maker
         *          (was incorrectly identified in the FIX spec as "Competing dealer trades")
         *  <p>    U - Program Order, index arb, for other agency
         *  <p>    W - All other orders as agent for other member
         */
        tagData = new Tag47EnuRule80A(Enum47Rule80A.NON_MEMBER_MARKET_MAKER);
        assertEquals( "R", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag47EnuRule80A(Enum47Rule80A.SPECIALIST_TRADES);
        assertEquals( "S", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag47EnuRule80A(Enum47Rule80A.UNAFFILIATED_MEMBER_MARKET_MAKER);
        assertEquals( "T", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag47EnuRule80A(Enum47Rule80A.PROGRAM_INDEX_ARB_OTHER_AGENCY);
        assertEquals( "U", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag47EnuRule80A(Enum47Rule80A.AGENT_FOR_OTHER_MEMBER);
        assertEquals( "W", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    X - Short exempt transaction for member competing market-maker not affiliated with the firm clearing the trade
         *      (refer to W and T types)
         *  <p>    Y - Program Order, non-index arb, for other agency
         *  <p>    Z - Short exempt transaction for non-member competing market-maker (refer to A and R types)
         */
        tagData = new Tag47EnuRule80A(Enum47Rule80A.SHORT_EXEMPT_MARKET_MAKER_W_T);
        assertEquals( "X", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag47EnuRule80A(Enum47Rule80A.PROGRAM_NON_INDEX_ARB_OTHER_AGENCY);
        assertEquals( "Y", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag47EnuRule80A(Enum47Rule80A.SHORT_EXEMPT_NON_MEMBER_MARKET_MAKER_A_R);
        assertEquals( "Z", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (Enum47Rule80A oneEnum : Enum47Rule80A.values()) {
            tagData = new Tag47EnuRule80A(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum47Rule80A oneEnum : Enum47Rule80A.values()) {
            tagData = new Tag47EnuRule80A(oneEnum);
            assertEquals( "Tag47EnuRule80A\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
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