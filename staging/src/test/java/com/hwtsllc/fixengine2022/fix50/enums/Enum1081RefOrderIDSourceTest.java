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

package com.hwtsllc.fixengine2022.fix50.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1081
 *  RefOrderIDSource
 *  char
 *  <p>
 *  Used to specify what identifier, provided in order depth market data, to use when hitting (taking) a specific order.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - SecondaryOrdeID (198)
 *  <p>    1 - OrdeID (37)
 *  <p>    2 - MEntryID (278)
 *  <p>    3 - QuotEntryID (299)
 */
class Enum1081RefOrderIDSourceTest {
    @Test
    void EnumTest() {
        Enum1081RefOrderIDSource enumType;

        enumType = Enum1081RefOrderIDSource.SECONDARY_ORDE_ID;
        assertEquals( "0", enumType.toEnumIDString() );
        assertEquals( "SECONDARY_ORDE_ID", enumType.toEnumNameString() );
        assertEquals( "0 - SecondaryOrdeID (198)", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum1081RefOrderIDSource.ORDE_ID;
        assertEquals( "1", enumType.toEnumIDString() );
        assertEquals( "ORDE_ID", enumType.toEnumNameString() );
        assertEquals( "1 - OrdeID (37)", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum1081RefOrderIDSource.M_ENTRY_ID;
        assertEquals( "2", enumType.toEnumIDString() );
        assertEquals( "M_ENTRY_ID", enumType.toEnumNameString() );
        assertEquals( "2 - MEntryID (278)", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum1081RefOrderIDSource.QUOT_ENTRY_ID;
        assertEquals( "3", enumType.toEnumIDString() );
        assertEquals( "QUOT_ENTRY_ID", enumType.toEnumNameString() );
        assertEquals( "3 - QuotEntryID (299)", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}