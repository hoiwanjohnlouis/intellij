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
 *  <p></p>
 *  Code to represent the type of event
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Put
 *  <p>    2 - Call
 *  <p>    3 - Tender
 *  <p>    4 - Sinking Fund Call
 *  <p>    5 - Activation
 *  <p></p>
 *  <p>    6 - Inactivation
 *  <p>    99 - Other
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
class Enum865EventTypeTest {
    @Test
    void EnumTest() {
        Enum865EventType enumType;

        enumType = Enum865EventType.PUT;
        assertEquals( "1", enumType.toEnumIDString() );
        assertEquals( "PUT", enumType.toEnumNameString() );
        assertEquals( "1 - Put", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum865EventType.CALL;
        assertEquals( "2", enumType.toEnumIDString() );
        assertEquals( "CALL", enumType.toEnumNameString() );
        assertEquals( "2 - Call", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum865EventType.TENDER;
        assertEquals( "3", enumType.toEnumIDString() );
        assertEquals( "TENDER", enumType.toEnumNameString() );
        assertEquals( "3 - Tender", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum865EventType.SINKING_FUND_CALL;
        assertEquals( "4", enumType.toEnumIDString() );
        assertEquals( "SINKING_FUND_CALL", enumType.toEnumNameString() );
        assertEquals( "4 - Sinking Fund Call", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum865EventType.ACTIVATION;
        assertEquals( "5", enumType.toEnumIDString() );
        assertEquals( "ACTIVATION", enumType.toEnumNameString() );
        assertEquals( "5 - Activation", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum865EventType.INACTIVATION;
        assertEquals( "6", enumType.toEnumIDString() );
        assertEquals( "INACTIVATION", enumType.toEnumNameString() );
        assertEquals( "6 - Inactivation", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum865EventType.OTHER;
        assertEquals( "99", enumType.toEnumIDString() );
        assertEquals( "OTHER", enumType.toEnumNameString() );
        assertEquals( "99 - Other", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}