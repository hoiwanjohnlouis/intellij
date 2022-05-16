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

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
        assertEquals( "1", enumType.toFIXIDString() );
        assertEquals( "PUT", enumType.toFIXNameString() );
        assertEquals( "1 - Put", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum865EventType.CALL;
        assertEquals( "2", enumType.toFIXIDString() );
        assertEquals( "CALL", enumType.toFIXNameString() );
        assertEquals( "2 - Call", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum865EventType.TENDER;
        assertEquals( "3", enumType.toFIXIDString() );
        assertEquals( "TENDER", enumType.toFIXNameString() );
        assertEquals( "3 - Tender", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum865EventType.SINKING_FUND_CALL;
        assertEquals( "4", enumType.toFIXIDString() );
        assertEquals( "SINKING_FUND_CALL", enumType.toFIXNameString() );
        assertEquals( "4 - Sinking Fund Call", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum865EventType.ACTIVATION;
        assertEquals( "5", enumType.toFIXIDString() );
        assertEquals( "ACTIVATION", enumType.toFIXNameString() );
        assertEquals( "5 - Activation", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum865EventType.INACTIVATION;
        assertEquals( "6", enumType.toFIXIDString() );
        assertEquals( "INACTIVATION", enumType.toFIXNameString() );
        assertEquals( "6 - Inactivation", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum865EventType.OTHER;
        assertEquals( "99", enumType.toFIXIDString() );
        assertEquals( "OTHER", enumType.toFIXNameString() );
        assertEquals( "99 - Other", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}