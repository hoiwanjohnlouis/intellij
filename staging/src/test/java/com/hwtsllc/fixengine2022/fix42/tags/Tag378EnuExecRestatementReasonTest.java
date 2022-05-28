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

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.fix42.enums.Enum378ExecRestatementReason;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  378
 *  ExecRestatementReason
 *  int
 *  <p>
 *  Code to identify reason for an ExecutionRpt message sent with
 *  ExecType=Restated or used when communicating an unsolicited cancel.
 *  <p></p>
 *  Valid values:
 *  <p>     0 - GT corporate action
 *  <p>     1 - GT renewal / restatement (no corporate action)
 *  <p>     2 - Verbal change
 *  <p>     3 - Repricing of order
 *  <p>     4 - Broker option
 *  <p></p>
 *  <p>     5 - Partial decline of OrderQty (e.g. exchange initiated partial cancel)
 *  <p>     6 - Cancel on Trading Halt
 *  <p>     7 - Cancel on System Failure
 *  <p>     8 - Market (Exchange) option
 *  <p>     9 - Canceled, not best
 *  <p></p>
 *  <p>     10 - Warehouse Recap
 *  <p>     11 - Peg Refresh
 *  <p>     99 - Other
 *  <p>     or any value conforming to the data type Reserved100Plus
 */
class Tag378EnuExecRestatementReasonTest {
    @Test
    void FIX0378Test() {
        FIX42 fixData = FIX42.FIX378_ENU_EXEC_RESTATEMENT_REASON;
        assertEquals( "378", fixData.toFIXIDString());
        assertEquals( "EXEC_RESTATEMENT_REASON", fixData.toFIXNameString());
        assertEquals( "ExecRestatementReason", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0378Test() {
        Tag378EnuExecRestatementReason tagData;

        /*
         * 0-11, 99 msg types
         */
        tagData = new Tag378EnuExecRestatementReason(Enum378ExecRestatementReason.GT_CORPORATE_ACTION);
        assertEquals( Enum378ExecRestatementReason.GT_CORPORATE_ACTION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag378EnuExecRestatementReason(Enum378ExecRestatementReason.GT_RENEWAL_RESTATEMENT);
        assertEquals( Enum378ExecRestatementReason.GT_RENEWAL_RESTATEMENT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag378EnuExecRestatementReason(Enum378ExecRestatementReason.VERBAL_CHANGE);
        assertEquals( Enum378ExecRestatementReason.VERBAL_CHANGE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag378EnuExecRestatementReason(Enum378ExecRestatementReason.REPRICING_OF_ORDER);
        assertEquals( Enum378ExecRestatementReason.REPRICING_OF_ORDER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag378EnuExecRestatementReason(Enum378ExecRestatementReason.BROKER_OPTION);
        assertEquals( Enum378ExecRestatementReason.BROKER_OPTION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag378EnuExecRestatementReason(Enum378ExecRestatementReason.PARTIAL_DECLINE_OF_ORDER_QTY);
        assertEquals( Enum378ExecRestatementReason.PARTIAL_DECLINE_OF_ORDER_QTY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag378EnuExecRestatementReason(Enum378ExecRestatementReason.CANCEL_ON_TRADING_HALT);
        assertEquals( Enum378ExecRestatementReason.CANCEL_ON_TRADING_HALT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag378EnuExecRestatementReason(Enum378ExecRestatementReason.CANCEL_ON_SYSTEM_FAILURE);
        assertEquals( Enum378ExecRestatementReason.CANCEL_ON_SYSTEM_FAILURE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag378EnuExecRestatementReason(Enum378ExecRestatementReason.MARKET_EXCHANGE_OPTION);
        assertEquals( Enum378ExecRestatementReason.MARKET_EXCHANGE_OPTION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag378EnuExecRestatementReason(Enum378ExecRestatementReason.CANCELED_NOT_BEST);
        assertEquals( Enum378ExecRestatementReason.CANCELED_NOT_BEST.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag378EnuExecRestatementReason(Enum378ExecRestatementReason.WAREHOUSE_RECAP);
        assertEquals( Enum378ExecRestatementReason.WAREHOUSE_RECAP.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag378EnuExecRestatementReason(Enum378ExecRestatementReason.PEG_REFRESH);
        assertEquals( Enum378ExecRestatementReason.PEG_REFRESH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag378EnuExecRestatementReason(Enum378ExecRestatementReason.OTHER);
        assertEquals( Enum378ExecRestatementReason.OTHER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag378EnuExecRestatementReason tagData;

        // loop around the ENUM and process
        for (Enum378ExecRestatementReason oneEnum : Enum378ExecRestatementReason.values()) {
            tagData = new Tag378EnuExecRestatementReason(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag378EnuExecRestatementReason tagData;

        // loop around the ENUM and process
        for (Enum378ExecRestatementReason oneEnum : Enum378ExecRestatementReason.values()) {
            tagData = new Tag378EnuExecRestatementReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag378EnuExecRestatementReason tagData;

        // loop around the ENUM and process
        for (Enum378ExecRestatementReason oneEnum : Enum378ExecRestatementReason.values()) {
            tagData = new Tag378EnuExecRestatementReason(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag378EnuExecRestatementReason tagData;

        // loop around the ENUM and process
        for (Enum378ExecRestatementReason oneEnum : Enum378ExecRestatementReason.values()) {
            tagData = new Tag378EnuExecRestatementReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag378EnuExecRestatementReason tagData;

        // loop around the ENUM and process
        for (Enum378ExecRestatementReason oneEnum : Enum378ExecRestatementReason.values()) {
            tagData = new Tag378EnuExecRestatementReason(oneEnum);
            assertEquals( "Tag378EnuExecRestatementReason\n" +
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