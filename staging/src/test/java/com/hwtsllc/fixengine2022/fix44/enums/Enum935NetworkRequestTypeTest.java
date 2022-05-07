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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  935
 *  NetworkRequestType
 *  int
 *  Indicates the type and level of details required for a Network Status Request Message Boolean logic applies
 *  e.g. If you want to subscribe for changes to certain id’s then UserRequestType = 0 (8+2), Snapshot for certain ID’s = 9 (8+1)
 *  Valid values:
 *      1 - Snapshot
 *      2 - Subscribe
 *      4 - Stop Subscribing
 *      8 - Level of Detail, then NoCompID's becomes required
 */
class Enum935NetworkRequestTypeTest {
    @Test
    void EnumTest() {
        Enum935NetworkRequestType enumType;

        enumType = Enum935NetworkRequestType.SNAPSHOT;
        assertEquals( "1", enumType.getID() );
        assertEquals( "SNAPSHOT", enumType.getName() );
        assertEquals( "1 - Snapshot", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum935NetworkRequestType.SUBSCRIBE;
        assertEquals( "2", enumType.getID() );
        assertEquals( "SUBSCRIBE", enumType.getName() );
        assertEquals( "2 - Subscribe", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum935NetworkRequestType.STOP_SUBSCRIBING;
        assertEquals( "4", enumType.getID() );
        assertEquals( "STOP_SUBSCRIBING", enumType.getName() );
        assertEquals( "4 - Stop Subscribing", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum935NetworkRequestType.LEVEL_OF_DETAIL;
        assertEquals( "8", enumType.getID() );
        assertEquals( "LEVEL_OF_DETAIL", enumType.getName() );
        assertEquals( "8 - Level of Detail, then NoCompID's becomes required", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}