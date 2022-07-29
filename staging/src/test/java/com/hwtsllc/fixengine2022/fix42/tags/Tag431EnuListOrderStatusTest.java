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
    Tag431EnuListOrderStatus tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum431ListOrderStatus oneEnum : Enum431ListOrderStatus.values()) {
            tagData = new Tag431EnuListOrderStatus(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum431ListOrderStatus oneEnum : Enum431ListOrderStatus.values()) {
            tagData = new Tag431EnuListOrderStatus(oneEnum);
            assertEquals( "FIX431_ENU_LIST_ORDER_STATUS", tagData.toEnumLabelString());
            assertEquals( "431", tagData.toEnumIDString());
            assertEquals( "LIST_ORDER_STATUS", tagData.toEnumNameString());
            assertEquals( "ListOrderStatus", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         * 1-7 msg types
         */
        tagData = new Tag431EnuListOrderStatus(Enum431ListOrderStatus.IN_BIDDING_PROCESS);
        assertEquals( Enum431ListOrderStatus.IN_BIDDING_PROCESS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag431EnuListOrderStatus(Enum431ListOrderStatus.RECEIVED_FOR_EXECUTION);
        assertEquals( Enum431ListOrderStatus.RECEIVED_FOR_EXECUTION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag431EnuListOrderStatus(Enum431ListOrderStatus.EXECUTING);
        assertEquals( Enum431ListOrderStatus.EXECUTING.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag431EnuListOrderStatus(Enum431ListOrderStatus.CANCELLING);
        assertEquals( Enum431ListOrderStatus.CANCELLING.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag431EnuListOrderStatus(Enum431ListOrderStatus.ALERT);
        assertEquals( Enum431ListOrderStatus.ALERT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag431EnuListOrderStatus(Enum431ListOrderStatus.ALL_DONE);
        assertEquals( Enum431ListOrderStatus.ALL_DONE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag431EnuListOrderStatus(Enum431ListOrderStatus.REJECT);
        assertEquals( Enum431ListOrderStatus.REJECT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for ( Enum431ListOrderStatus oneEnum : Enum431ListOrderStatus.values()) {
            tagData = new Tag431EnuListOrderStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum431ListOrderStatus oneEnum : Enum431ListOrderStatus.values()) {
            tagData = new Tag431EnuListOrderStatus(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for ( Enum431ListOrderStatus oneEnum : Enum431ListOrderStatus.values()) {
            tagData = new Tag431EnuListOrderStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum431ListOrderStatus oneEnum : Enum431ListOrderStatus.values()) {
            tagData = new Tag431EnuListOrderStatus(oneEnum);
            assertEquals( "Tag431EnuListOrderStatus\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.getDataValue() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}