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
 *  303
 *  QuoteRequestType
 *  int
 *  <p>
 *  Indicates the type of Quote Request being generated
 *  <p></p>
 *  Valid values:
 *  <p>    1-2 msg types
 *  <p>    "1 - Manual"
 *  <p>    "2 - Automatic"
 */
class Enum303QuoteRequestTypeTest {
    @Test
    void Enum0303Test() {
        Enum303QuoteRequestType enumType;

        /*
         * 1-2 msg types
         */
        enumType = Enum303QuoteRequestType.MANUAL;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "MANUAL", enumType.toFIXNameString());
        assertEquals( "1 - Manual", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum303QuoteRequestType.AUTOMATIC;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "AUTOMATIC", enumType.toFIXNameString());
        assertEquals( "2 - Automatic", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
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