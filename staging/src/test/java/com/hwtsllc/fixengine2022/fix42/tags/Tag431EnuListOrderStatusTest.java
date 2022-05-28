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
import com.hwtsllc.fixengine2022.fix42.enums.Enum431ListOrderStatus;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  431
 *  ListOrderStatus
 *  int
 *  <p>
 *  Code to represent the status of a list order.
 *  <p></p>
 *  Valid values:
 *  <p>    1-7 msg types
 *  <p>    1 - In bidding process
 *  <p>    2 - Received for execution
 *  <p>    3 - Executing
 *  <p>    4 - Cancelling
 *  <p>    5 - Alert
 *  <p></p>
 *  <p>    6 - All Done
 *  <p>    7 - Reject
 */
class Tag431EnuListOrderStatusTest {
    @Test
    void FIX0431Test() {
        FIX42 fixData = FIX42.FIX431_ENU_LIST_ORDER_STATUS;
        assertEquals( "431", fixData.toFIXIDString());
        assertEquals( "LIST_ORDER_STATUS", fixData.toFIXNameString());
        assertEquals( "ListOrderStatus", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0431Test() {
        Tag431EnuListOrderStatus tagData;

        /*
         * 1-7 msg types
         */
        tagData = new Tag431EnuListOrderStatus(Enum431ListOrderStatus.IN_BIDDING_PROCESS);
        assertEquals( Enum431ListOrderStatus.IN_BIDDING_PROCESS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag431EnuListOrderStatus(Enum431ListOrderStatus.RECEIVED_FOR_EXECUTION);
        assertEquals( Enum431ListOrderStatus.RECEIVED_FOR_EXECUTION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag431EnuListOrderStatus(Enum431ListOrderStatus.EXECUTING);
        assertEquals( Enum431ListOrderStatus.EXECUTING.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag431EnuListOrderStatus(Enum431ListOrderStatus.CANCELLING);
        assertEquals( Enum431ListOrderStatus.CANCELLING.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag431EnuListOrderStatus(Enum431ListOrderStatus.ALERT);
        assertEquals( Enum431ListOrderStatus.ALERT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag431EnuListOrderStatus(Enum431ListOrderStatus.ALL_DONE);
        assertEquals( Enum431ListOrderStatus.ALL_DONE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag431EnuListOrderStatus(Enum431ListOrderStatus.REJECT);
        assertEquals( Enum431ListOrderStatus.REJECT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag431EnuListOrderStatus tagData;

        // loop around the ENUM and process
        for (Enum431ListOrderStatus oneEnum : Enum431ListOrderStatus.values()) {
            tagData = new Tag431EnuListOrderStatus(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag431EnuListOrderStatus tagData;

        // loop around the ENUM and process
        for (Enum431ListOrderStatus oneEnum : Enum431ListOrderStatus.values()) {
            tagData = new Tag431EnuListOrderStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag431EnuListOrderStatus tagData;

        // loop around the ENUM and process
        for (Enum431ListOrderStatus oneEnum : Enum431ListOrderStatus.values()) {
            tagData = new Tag431EnuListOrderStatus(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag431EnuListOrderStatus tagData;

        // loop around the ENUM and process
        for (Enum431ListOrderStatus oneEnum : Enum431ListOrderStatus.values()) {
            tagData = new Tag431EnuListOrderStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag431EnuListOrderStatus tagData;

        // loop around the ENUM and process
        for (Enum431ListOrderStatus oneEnum : Enum431ListOrderStatus.values()) {
            tagData = new Tag431EnuListOrderStatus(oneEnum);
            assertEquals( "Tag431EnuListOrderStatus\n" +
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