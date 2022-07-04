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

/**
 *  18
 *  ExecInst
 *  MultipleCharValue
 *  <p></p>
 *  Instructions for order handling on exchange trading floor.
 *  <p></p>
 *  If more than one instruction is applicable to an order,
 *  this field can contain multiple instructions separated by space.
 *  <p></p>
 *  *** SOME VALUES HAVE BEEN REPLACED ***
 *  *** See Replaced Features and Supported Approach ***
 *  <p></p>
 *  (see Volume : "Glossary" for value definitions)
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Stay on offer side
 *  <p>    1 - Not held
 *  <p>    2 - Work
 *  <p>    3 - Go along
 *  <p>    4 - Over the day
 *  <p></p>
 *  <p>    5 - Held
 *  <p>    6 - Participant don't initiate
 *  <p>    7 - Strict scale
 *  <p>    8 - Try to scale
 *  <p>    9 - Stay on bid side
 *  <p></p>
 *  <p>    A - No cross (cross is forbidden)
 *  <p>    B - OK to cross
 *  <p>    C - Call first
 *  <p>    D - Percent of volume
 *          (indicates that the sender does not want
 *          all the volume on the floor vs. a specific percentage)
 *  <p>    E - Do not increase - DNI
 *  <p></p>
 *  <p>    F - Do not reduce - DNR
 *  <p>    G - All or none - AON
 *  <p>    H - Reinstate on system failue (mutually exclusive with Q)
 *  <p>    I - Institutions only
 *  <p>    J - Reinstate on Trading Halt (mutually exclusive with K)
 *  <p></p>
 *  <p>    K - Cancel on Trading Halt (mutually exclusive with J)
 *  <p>    L - Last peg (last sale)
 *  <p>    M - Mid-price peg (midprice of inside quote)
 *  <p>    N - Non-negotiable
 *  <p>    O - Opening peg
 *  <p></p>
 *  <p>    P - Market peg
 *  <p>    Q - Cancel on system failure (mutually exclusive with H)
 *  <p>    R - Primary peg (primary market - buy at bid/sell at offer)
 *  <p>    S - Suspend
 *  <p>    T - Fixed Peg to Local best bid or offer at time of order
 *  <p></p>
 *  <p>    U - Customer Display Instruction (Rule 11Ac1-1/4)
 *  <p>    V - Netting (for Forex)
 *  <p>    W - Peg to VWAP
 *  <p>    X - Trade Along
 *  <p>    Y - Try To Stop
 *  <p></p>
 *  <p>    Z - Cancel if not best
 *  <p></p>
 *  <p>    a - Trailing Stop Peg
 *  <p>    b - Strict Limit (No price improvement)
 *  <p>    c - Ignore Price Validity Checks
 *  <p>    d - Peg to Limit Price
 *  <p>    e - Work to Target Strategy
 *  <p></p>
 *  <p>    f - Intermarket Sweep
 *  <p>    g - External Routing Allowed
 *  <p>    h - External Routing Not Allowed
 *  <p>    i - Imbalance Only
 *  <p>    j - Single execution requested for block trade
 *  <p></p>
 *  <p>    k - Best Execution
 */
class Tag18EnuExecInstTest {
    @Test
    void Tag0018Test() {
        Tag18EnuExecInst tagData;

        /*
         * 0-9 exec inst types
         */
        tagData = new Tag18EnuExecInst(Enum18ExecInst.STAY_ON_OFFER_SIDE);
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.NOT_HELD);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.WORK);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.GO_ALONG);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.OVER_THE_DAY);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag18EnuExecInst(Enum18ExecInst.HELD);
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.PARTICIPANT_DONT_INITIATE);
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.STRICT_SCALE);
        assertEquals( "7", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.TRY_TO_SCALE);
        assertEquals( "8", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.STAY_ON_BID_SIDE);
        assertEquals( "9", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         * A-Z exec inst types
         */
        tagData = new Tag18EnuExecInst(Enum18ExecInst.NO_CROSS);
        assertEquals( "A", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.OKAY_TO_CROSS);
        assertEquals( "B", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.CALL_FIRST);
        assertEquals( "C", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.PERCENT_OF_VOLUME);
        assertEquals( "D", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.DO_NOT_INCREASE);
        assertEquals( "E", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag18EnuExecInst(Enum18ExecInst.DO_NOT_REDUCE);
        assertEquals( "F", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.ALL_OR_NONE);
        assertEquals( "G", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.REINSTATE_ON_SYSTEM_FAILURE);
        assertEquals( "H", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.INSTITUTION_ONLY);
        assertEquals( "I", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.REINSTATE_ON_TRADING_HALTED);
        assertEquals( "J", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag18EnuExecInst(Enum18ExecInst.CANCEL_ON_TRADING_HALTED);
        assertEquals( "K", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.LAST_PEG);
        assertEquals( "L", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.MID_PRICE_PEG);
        assertEquals( "M", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.NON_NEGOTIABLE);
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.OPENING_PEG);
        assertEquals( "O", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag18EnuExecInst(Enum18ExecInst.MARKET_PEG);
        assertEquals( "P", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.CANCEL_ON_SYSTEM_FAILURE);
        assertEquals( "Q", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.PRIMARY_PEG);
        assertEquals( "R", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.SUSPENDED);
        assertEquals( "S", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.FIXED_PEG_TO_LOCAL_BEST);
        assertEquals( "T", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag18EnuExecInst(Enum18ExecInst.CUSTOMER_DISPLAY_INSTRUCTION);
        assertEquals( "U", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.NETTING);
        assertEquals( "V", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.PEG_TO_VWAP);
        assertEquals( "W", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.TRADE_ALONG);
        assertEquals( "X", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.TRY_TO_STOP);
        assertEquals( "Y", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.CANCEL_IF_NOT_BEST);
        assertEquals( "Z", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * a-k exec inst types
         */
        tagData = new Tag18EnuExecInst(Enum18ExecInst.TRAILING_STOP_PEG);
        assertEquals( "a", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.STRICT_LIMIT);
        assertEquals( "b", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.IGNORE_PRICE_VALIDITY_CHECKS);
        assertEquals( "c", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.PEG_TO_LIMIT_PRICE);
        assertEquals( "d", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.WORK_TO_TARGET_STRATEGY);
        assertEquals( "e", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag18EnuExecInst(Enum18ExecInst.INTERMARKET_SWEEP);
        assertEquals( "f", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.EXTERNAL_ROUTING_ALLOWED);
        assertEquals( "g", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.EXTERNAL_ROUTING_NOT_ALLOWED);
        assertEquals( "h", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.IMBALANCE_ONLY);
        assertEquals( "i", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag18EnuExecInst(Enum18ExecInst.SINGLE_EXECUTION_REQUESTED);
        assertEquals( "j", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag18EnuExecInst(Enum18ExecInst.BEST_EXECUTION);
        assertEquals( "k", tagData.getDataValue());
    }
    @Test
    void FIXTest() {
        Tag18EnuExecInst tagData;

        // loop around the ENUM and process
        for (Enum18ExecInst oneEnum : Enum18ExecInst.values()) {
            tagData = new Tag18EnuExecInst(oneEnum);
            assertEquals( "FIX18_ENU_EXEC_INST", tagData.toEnumLabelString());
            assertEquals( "EXEC_INST", tagData.toEnumNameString());
            assertEquals( "18", tagData.toEnumIDString());
            assertEquals( "ExecInst", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void PrintFIXTagTest() {
        Tag18EnuExecInst tagData;

        // loop around the ENUM and process
        for (Enum18ExecInst oneEnum : Enum18ExecInst.values()) {
            tagData = new Tag18EnuExecInst(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag18EnuExecInst tagData;

        // loop around the ENUM and process
        for (Enum18ExecInst oneEnum : Enum18ExecInst.values()) {
            tagData = new Tag18EnuExecInst(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag18EnuExecInst tagData;

        // loop around the ENUM and process
        for (Enum18ExecInst oneEnum : Enum18ExecInst.values()) {
            tagData = new Tag18EnuExecInst(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag18EnuExecInst tagData;

        // loop around the ENUM and process
        for (Enum18ExecInst oneEnum : Enum18ExecInst.values()) {
            tagData = new Tag18EnuExecInst(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag18EnuExecInst tagData;

        // loop around the ENUM and process
        for (Enum18ExecInst oneEnum : Enum18ExecInst.values()) {
            tagData = new Tag18EnuExecInst(oneEnum);
            assertEquals( "Tag18EnuExecInst\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toEnumIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}