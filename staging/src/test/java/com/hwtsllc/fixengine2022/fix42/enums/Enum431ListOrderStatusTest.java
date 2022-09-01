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

package com.hwtsllc.fixengine2022.fix42.enums;

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
class Enum431ListOrderStatusTest {
    @Test
    void Enum0431Test() {
        Enum431ListOrderStatus enumType;

        /*
         * 1-7 msg types
         */
        enumType = Enum431ListOrderStatus.IN_BIDDING_PROCESS;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "IN_BIDDING_PROCESS", enumType.toFIXNameString());
        assertEquals( "1 - In Bidding Process", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum431ListOrderStatus.RECEIVED_FOR_EXECUTION;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "RECEIVED_FOR_EXECUTION", enumType.toFIXNameString());
        assertEquals( "2 - Received For Execution", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum431ListOrderStatus.EXECUTING;
        assertEquals( "3", enumType.toFIXIDString());
        assertEquals( "EXECUTING", enumType.toFIXNameString());
        assertEquals( "3 - Executing", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum431ListOrderStatus.CANCELLING;
        assertEquals( "4", enumType.toFIXIDString());
        assertEquals( "CANCELLING", enumType.toFIXNameString());
        assertEquals( "4 - Cancelling", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum431ListOrderStatus.ALERT;
        assertEquals( "5", enumType.toFIXIDString());
        assertEquals( "ALERT", enumType.toFIXNameString());
        assertEquals( "5 - Alert", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum431ListOrderStatus.ALL_DONE;
        assertEquals( "6", enumType.toFIXIDString());
        assertEquals( "ALL_DONE", enumType.toFIXNameString());
        assertEquals( "6 - All Done", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum431ListOrderStatus.REJECT;
        assertEquals( "7", enumType.toFIXIDString());
        assertEquals( "REJECT", enumType.toFIXNameString());
        assertEquals( "7 - Reject", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}