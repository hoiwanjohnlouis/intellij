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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.fix42.enums.Enum378ExecRestatementReason;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag378EnuExecRestatementReasonTest {
    Tag378EnuExecRestatementReason tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum378ExecRestatementReason oneEnum : Enum378ExecRestatementReason.values()) {
            tagData = new Tag378EnuExecRestatementReason(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum378ExecRestatementReason oneEnum : Enum378ExecRestatementReason.values()) {
            tagData = new Tag378EnuExecRestatementReason(oneEnum);
            assertEquals( "FIX378_ENU_EXEC_RESTATEMENT_REASON", tagData.toEnumLabelString());
            assertEquals( "378", tagData.toEnumIDString());
            assertEquals( "EXEC_RESTATEMENT_REASON", tagData.toEnumNameString());
            assertEquals( "ExecRestatementReason", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum378ExecRestatementReason oneEnum : Enum378ExecRestatementReason.values()) {
            tagData = new Tag378EnuExecRestatementReason(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  378
         *  ExecRestatementReason
         *  int
         *  <p>     0 - GT corporate action
         *  <p>     1 - GT renewal / restatement (no corporate action)
         *  <p>     2 - Verbal change
         *  <p>     3 - Repricing of order
         *  <p>     4 - Broker option
         */
        tagData = new Tag378EnuExecRestatementReason(Enum378ExecRestatementReason.GT_CORPORATE_ACTION);
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag378EnuExecRestatementReason(Enum378ExecRestatementReason.GT_RENEWAL_RESTATEMENT);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag378EnuExecRestatementReason(Enum378ExecRestatementReason.VERBAL_CHANGE);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag378EnuExecRestatementReason(Enum378ExecRestatementReason.REPRICING_OF_ORDER);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag378EnuExecRestatementReason(Enum378ExecRestatementReason.BROKER_OPTION);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>     5 - Partial decline of OrderQty (e.g. exchange initiated partial cancel)
         *  <p>     6 - Cancel on Trading Halt
         *  <p>     7 - Cancel on System Failure
         *  <p>     8 - Market (Exchange) option
         *  <p>     9 - Canceled, not best
         */
        tagData = new Tag378EnuExecRestatementReason(Enum378ExecRestatementReason.PARTIAL_DECLINE_OF_ORDER_QTY);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag378EnuExecRestatementReason(Enum378ExecRestatementReason.CANCEL_ON_TRADING_HALT);
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag378EnuExecRestatementReason(Enum378ExecRestatementReason.CANCEL_ON_SYSTEM_FAILURE);
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag378EnuExecRestatementReason(Enum378ExecRestatementReason.MARKET_EXCHANGE_OPTION);
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag378EnuExecRestatementReason(Enum378ExecRestatementReason.CANCELED_NOT_BEST);
        assertEquals( "9", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>     10 - Warehouse Recap
         *  <p>     11 - Peg Refresh
         */
        tagData = new Tag378EnuExecRestatementReason(Enum378ExecRestatementReason.WAREHOUSE_RECAP);
        assertEquals( "10", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag378EnuExecRestatementReason(Enum378ExecRestatementReason.PEG_REFRESH);
        assertEquals( "11", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>     99 - Other
         *  <p>     or any value conforming to the data type Reserved100Plus
         */
        tagData = new Tag378EnuExecRestatementReason(Enum378ExecRestatementReason.OTHER);
        assertEquals( "99", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum378ExecRestatementReason oneEnum : Enum378ExecRestatementReason.values()) {
            tagData = new Tag378EnuExecRestatementReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum378ExecRestatementReason oneEnum : Enum378ExecRestatementReason.values()) {
            tagData = new Tag378EnuExecRestatementReason(oneEnum);
            assertEquals( "Tag378EnuExecRestatementReason\n" +
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