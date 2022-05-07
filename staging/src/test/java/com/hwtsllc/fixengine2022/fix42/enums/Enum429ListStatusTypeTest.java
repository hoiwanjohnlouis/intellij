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

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  Tag429
 *  Enu
 *  ListStatusType
 *
 *      1-6 msg types
 *      ACK( "1", "ACK", "1 - Ack" ),
 *      RESPONSE( "2", "RESPONSE", "2 - Response" ),
 *      TIMED( "3", "TIMED", "3 - Timed" ),
 *      EXEC_STARTED( "4", "EXEC_STARTED", "4 - Exec Started" ),
 *      ALL_DONE( "5", "ALL_DONE", "5 - All Done" ),
 *      ALERT( "6", "ALERT", "6 - Alert" ),
 */
class Enum429ListStatusTypeTest {
    @Test
    void Enum0429Test() {
        Enum429ListStatusType enumType;

        /**
         * 1-6 msg types
         */
        enumType = Enum429ListStatusType.ACK;
        assertEquals( "1", enumType.getID());
        assertEquals( "ACK", enumType.getName());
        assertEquals( "1 - Ack", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum429ListStatusType.RESPONSE;
        assertEquals( "2", enumType.getID());
        assertEquals( "RESPONSE", enumType.getName());
        assertEquals( "2 - Response", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum429ListStatusType.TIMED;
        assertEquals( "3", enumType.getID());
        assertEquals( "TIMED", enumType.getName());
        assertEquals( "3 - Timed", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum429ListStatusType.EXEC_STARTED;
        assertEquals( "4", enumType.getID());
        assertEquals( "EXEC_STARTED", enumType.getName());
        assertEquals( "4 - Exec Started", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum429ListStatusType.ALL_DONE;
        assertEquals( "5", enumType.getID());
        assertEquals( "ALL_DONE", enumType.getName());
        assertEquals( "5 - All Done", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum429ListStatusType.ALERT;
        assertEquals( "6", enumType.getID());
        assertEquals( "ALERT", enumType.getName());
        assertEquals( "6 - Alert", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}