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
            assertEquals( "FIX431_ENU_LIST_ORDER_STATUS", tagData.toFIXLabelString());
            assertEquals( "431", tagData.toEnumIDString());
            assertEquals( "LIST_ORDER_STATUS", tagData.toEnumNameString());
            assertEquals( "ListOrderStatus", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum431ListOrderStatus oneEnum : Enum431ListOrderStatus.values()) {
            tagData = new Tag431EnuListOrderStatus(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  431
         *  ListOrderStatus
         *  int
         *  <p>    1-7 msg types
         *  <p>    1 - In bidding process
         *  <p>    2 - Received for execution
         *  <p>    3 - Executing
         *  <p>    4 - Cancelling
         *  <p>    5 - Alert
         */
        tagData = new Tag431EnuListOrderStatus(Enum431ListOrderStatus.IN_BIDDING_PROCESS);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag431EnuListOrderStatus(Enum431ListOrderStatus.RECEIVED_FOR_EXECUTION);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag431EnuListOrderStatus(Enum431ListOrderStatus.EXECUTING);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag431EnuListOrderStatus(Enum431ListOrderStatus.CANCELLING);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag431EnuListOrderStatus(Enum431ListOrderStatus.ALERT);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    6 - All Done
         *  <p>    7 - Reject
         */
        tagData = new Tag431EnuListOrderStatus(Enum431ListOrderStatus.ALL_DONE);
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag431EnuListOrderStatus(Enum431ListOrderStatus.REJECT);
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


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
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
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