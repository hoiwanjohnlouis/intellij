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
 *  429
 *  ListStatusType
 *  int
 *  <p>
 *  Code to represent the status type.
 *  <p></p>
 *  Valid values:
 *  <p>    1-6 msg types
 *  <p>    1 - Ack
 *  <p>    2 - Response
 *  <p>    3 - Timed
 *  <p>    4 - Exec Started
 *  <p>    5 - All Done
 *  <p></p>
 *  <p>    6 - Alert
 */
class Enum429ListStatusTypeTest {
    @Test
    void Enum0429Test() {
        Enum429ListStatusType enumType;

        /*
         * 1-6 msg types
         */
        enumType = Enum429ListStatusType.ACK;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "ACK", enumType.toFIXNameString());
        assertEquals( "1 - Ack", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum429ListStatusType.RESPONSE;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "RESPONSE", enumType.toFIXNameString());
        assertEquals( "2 - Response", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum429ListStatusType.TIMED;
        assertEquals( "3", enumType.toFIXIDString());
        assertEquals( "TIMED", enumType.toFIXNameString());
        assertEquals( "3 - Timed", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum429ListStatusType.EXEC_STARTED;
        assertEquals( "4", enumType.toFIXIDString());
        assertEquals( "EXEC_STARTED", enumType.toFIXNameString());
        assertEquals( "4 - Exec Started", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum429ListStatusType.ALL_DONE;
        assertEquals( "5", enumType.toFIXIDString());
        assertEquals( "ALL_DONE", enumType.toFIXNameString());
        assertEquals( "5 - All Done", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum429ListStatusType.ALERT;
        assertEquals( "6", enumType.toFIXIDString());
        assertEquals( "ALERT", enumType.toFIXNameString());
        assertEquals( "6 - Alert", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}