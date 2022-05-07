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

package com.hwtsllc.fixengine2022.fix44.enums;

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

/**
 *  865
 *  EventType
 *  int
 *  Code to represent the type of event
 *  Valid values:
 *      1 - Put
 *      2 - Call
 *      3 - Tender
 *      4 - Sinking Fund Call
 *      5 - Activation
 *
 *      6 - Inactivation
 *      99 - Other
 *
 *      or any value conforming to the data type Reserved100Plus
 */
class Enum865EventTypeTest {
    @Test
    void EnumTest() {
        Enum865EventType enumType;

        enumType = Enum865EventType.PUT;
        assertEquals( "1", enumType.getID() );
        assertEquals( "PUT", enumType.getName() );
        assertEquals( "1 - Put", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum865EventType.CALL;
        assertEquals( "2", enumType.getID() );
        assertEquals( "CALL", enumType.getName() );
        assertEquals( "2 - Call", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum865EventType.TENDER;
        assertEquals( "3", enumType.getID() );
        assertEquals( "TENDER", enumType.getName() );
        assertEquals( "3 - Tender", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum865EventType.SINKING_FUND_CALL;
        assertEquals( "4", enumType.getID() );
        assertEquals( "SINKING_FUND_CALL", enumType.getName() );
        assertEquals( "4 - Sinking Fund Call", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum865EventType.ACTIVATION;
        assertEquals( "5", enumType.getID() );
        assertEquals( "ACTIVATION", enumType.getName() );
        assertEquals( "5 - Activation", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum865EventType.INACTIVATION;
        assertEquals( "6", enumType.getID() );
        assertEquals( "INACTIVATION", enumType.getName() );
        assertEquals( "6 - Inactivation", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum865EventType.OTHER;
        assertEquals( "99", enumType.getID() );
        assertEquals( "OTHER", enumType.getName() );
        assertEquals( "99 - Other", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}