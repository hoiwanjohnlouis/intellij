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

import com.hwtsllc.fixengine2022.fix27.enums.Enum18ExecInst;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag18EnuExecInstTest {
    Tag18EnuExecInst tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum18ExecInst oneEnum : Enum18ExecInst.values()) {
            tagData = new Tag18EnuExecInst(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum18ExecInst oneEnum : Enum18ExecInst.values()) {
            tagData = new Tag18EnuExecInst(oneEnum);
            assertEquals( "FIX18_ENU_EXEC_INST", tagData.toFIXLabelString());
            assertEquals( "EXEC_INST", tagData.toFIXNameString());
            assertEquals( "18", tagData.toFIXIDString());
            assertEquals( "ExecInst", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum18ExecInst oneEnum : Enum18ExecInst.values()) {
            tagData = new Tag18EnuExecInst(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  18
         *  <p>    0 - Stay on offer side
         *  <p>    1 - Not held
         *  <p>    2 - Work
         *  <p>    3 - Go along
         *  <p>    4 - Over the day
         */
        tagData = new Tag18EnuExecInst(Enum18ExecInst.STAY_ON_OFFER_SIDE);
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.NOT_HELD);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.WORK);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.GO_ALONG);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.OVER_THE_DAY);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    5 - Held
         *  <p>    6 - Participant don't initiate
         *  <p>    7 - Strict scale
         *  <p>    8 - Try to scale
         *  <p>    9 - Stay on bid side
         */
        tagData = new Tag18EnuExecInst(Enum18ExecInst.HELD);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.PARTICIPANT_DONT_INITIATE);
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.STRICT_SCALE);
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.TRY_TO_SCALE);
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.STAY_ON_BID_SIDE);
        assertEquals( "9", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    A - No cross (cross is forbidden)
         *  <p>    B - OK to cross
         *  <p>    C - Call first
         *  <p>    D - Percent of volume
         *          (indicates that the sender does not want
         *          all the volume on the floor vs. a specific percentage)
         *  <p>    E - Do not increase - DNI
         */
        tagData = new Tag18EnuExecInst(Enum18ExecInst.NO_CROSS);
        assertEquals( "A", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.OKAY_TO_CROSS);
        assertEquals( "B", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.CALL_FIRST);
        assertEquals( "C", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.PERCENT_OF_VOLUME);
        assertEquals( "D", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.DO_NOT_INCREASE);
        assertEquals( "E", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    F - Do not reduce - DNR
         *  <p>    G - All or none - AON
         *  <p>    H - Reinstate on system failue (mutually exclusive with Q)
         *  <p>    I - Institutions only
         *  <p>    J - Reinstate on Trading Halt (mutually exclusive with K)
         */
        tagData = new Tag18EnuExecInst(Enum18ExecInst.DO_NOT_REDUCE);
        assertEquals( "F", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.ALL_OR_NONE);
        assertEquals( "G", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.REINSTATE_ON_SYSTEM_FAILURE);
        assertEquals( "H", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.INSTITUTION_ONLY);
        assertEquals( "I", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.REINSTATE_ON_TRADING_HALTED);
        assertEquals( "J", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    K - Cancel on Trading Halt (mutually exclusive with J)
         *  <p>    L - Last peg (last sale)
         *  <p>    M - Mid-price peg (midprice of inside quote)
         *  <p>    N - Non-negotiable
         *  <p>    O - Opening peg
         */
        tagData = new Tag18EnuExecInst(Enum18ExecInst.CANCEL_ON_TRADING_HALTED);
        assertEquals( "K", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.LAST_PEG);
        assertEquals( "L", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.MID_PRICE_PEG);
        assertEquals( "M", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.NON_NEGOTIABLE);
        assertEquals( "N", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.OPENING_PEG);
        assertEquals( "O", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    P - Market peg
         *  <p>    Q - Cancel on system failure (mutually exclusive with H)
         *  <p>    R - Primary peg (primary market - buy at bid/sell at offer)
         *  <p>    S - Suspend
         *  <p>    T - Fixed Peg to Local best bid or offer at time of order
         */
        tagData = new Tag18EnuExecInst(Enum18ExecInst.MARKET_PEG);
        assertEquals( "P", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.CANCEL_ON_SYSTEM_FAILURE);
        assertEquals( "Q", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.PRIMARY_PEG);
        assertEquals( "R", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.SUSPENDED);
        assertEquals( "S", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.FIXED_PEG_TO_LOCAL_BEST);
        assertEquals( "T", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    U - Customer Display Instruction (Rule 11Ac1-1/4)
         *  <p>    V - Netting (for Forex)
         *  <p>    W - Peg to VWAP
         *  <p>    X - Trade Along
         *  <p>    Y - Try To Stop
         */
        tagData = new Tag18EnuExecInst(Enum18ExecInst.CUSTOMER_DISPLAY_INSTRUCTION);
        assertEquals( "U", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.NETTING);
        assertEquals( "V", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.PEG_TO_VWAP);
        assertEquals( "W", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.TRADE_ALONG);
        assertEquals( "X", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.TRY_TO_STOP);
        assertEquals( "Y", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    Z - Cancel if not best
         */
        tagData = new Tag18EnuExecInst(Enum18ExecInst.CANCEL_IF_NOT_BEST);
        assertEquals( "Z", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    a - Trailing Stop Peg
         *  <p>    b - Strict Limit (No price improvement)
         *  <p>    c - Ignore Price Validity Checks
         *  <p>    d - Peg to Limit Price
         *  <p>    e - Work to Target Strategy
         */
        tagData = new Tag18EnuExecInst(Enum18ExecInst.TRAILING_STOP_PEG);
        assertEquals( "a", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.STRICT_LIMIT);
        assertEquals( "b", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.IGNORE_PRICE_VALIDITY_CHECKS);
        assertEquals( "c", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.PEG_TO_LIMIT_PRICE);
        assertEquals( "d", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.WORK_TO_TARGET_STRATEGY);
        assertEquals( "e", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    f - Intermarket Sweep
         *  <p>    g - External Routing Allowed
         *  <p>    h - External Routing Not Allowed
         *  <p>    i - Imbalance Only
         *  <p>    j - Single execution requested for block trade
         */
        tagData = new Tag18EnuExecInst(Enum18ExecInst.INTERMARKET_SWEEP);
        assertEquals( "f", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.EXTERNAL_ROUTING_ALLOWED);
        assertEquals( "g", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.EXTERNAL_ROUTING_NOT_ALLOWED);
        assertEquals( "h", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.IMBALANCE_ONLY);
        assertEquals( "i", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.SINGLE_EXECUTION_REQUESTED);
        assertEquals( "j", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    k - Best Execution
         */
        tagData = new Tag18EnuExecInst(Enum18ExecInst.BEST_EXECUTION);
        assertEquals( "k", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (Enum18ExecInst oneEnum : Enum18ExecInst.values()) {
            tagData = new Tag18EnuExecInst(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum18ExecInst oneEnum : Enum18ExecInst.values()) {
            tagData = new Tag18EnuExecInst(oneEnum);
            assertEquals( "Tag18EnuExecInst\n" +
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