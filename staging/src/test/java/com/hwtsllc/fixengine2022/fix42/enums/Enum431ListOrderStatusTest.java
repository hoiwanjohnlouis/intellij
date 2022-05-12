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
 *  Tag431
 *  Enu
 *  ListOrderStatus
 *
 *      1-7 msg types
 *      IN_BIDDING_PROCESS( "1", "IN_BIDDING_PROCESS", "1 - In Bidding Process" ),
 *      RECEIVED_FOR_EXECUTION( "2", "RECEIVED_FOR_EXECUTION", "2 - Received For Execution" ),
 *      EXECUTING( "3", "EXECUTING", "3 - Executing" ),
 *      CANCELLING( "4", "CANCELLING", "4 - Cancelling" ),
 *      ALERT( "5", "ALERT", "5 - Alert" ),
 *      ALL_DONE( "6", "ALL_DONE", "6 - All Done" ),
 *      REJECT( "7", "REJECT", "7 - Reject" ),
 */
class Enum431ListOrderStatusTest {
    @Test
    void Enum0431Test() {
        Enum431ListOrderStatus enumType;

        /**
         * 1-7 msg types
         */
        enumType = Enum431ListOrderStatus.IN_BIDDING_PROCESS;
        assertEquals( "1", enumType.getID());
        assertEquals( "IN_BIDDING_PROCESS", enumType.getName());
        assertEquals( "1 - In Bidding Process", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum431ListOrderStatus.RECEIVED_FOR_EXECUTION;
        assertEquals( "2", enumType.getID());
        assertEquals( "RECEIVED_FOR_EXECUTION", enumType.getName());
        assertEquals( "2 - Received For Execution", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum431ListOrderStatus.EXECUTING;
        assertEquals( "3", enumType.getID());
        assertEquals( "EXECUTING", enumType.getName());
        assertEquals( "3 - Executing", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum431ListOrderStatus.CANCELLING;
        assertEquals( "4", enumType.getID());
        assertEquals( "CANCELLING", enumType.getName());
        assertEquals( "4 - Cancelling", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum431ListOrderStatus.ALERT;
        assertEquals( "5", enumType.getID());
        assertEquals( "ALERT", enumType.getName());
        assertEquals( "5 - Alert", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum431ListOrderStatus.ALL_DONE;
        assertEquals( "6", enumType.getID());
        assertEquals( "ALL_DONE", enumType.getName());
        assertEquals( "6 - All Done", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum431ListOrderStatus.REJECT;
        assertEquals( "7", enumType.getID());
        assertEquals( "REJECT", enumType.getName());
        assertEquals( "7 - Reject", enumType.getDescription());
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