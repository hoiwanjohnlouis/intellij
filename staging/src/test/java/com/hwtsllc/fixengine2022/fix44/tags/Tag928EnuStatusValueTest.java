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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import com.hwtsllc.fixengine2022.fix44.enums.Enum928StatusValue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  928
 *  StatusValue
 *  int
 *  Indicates the status of a network connection
 *  Valid values:
 *      1 - Connected
 *      2 - Not Connected - down expected up
 *      3 - Not Connected - down expected down
 *      4 - In Process
 */
class Tag928EnuStatusValueTest {
    @Test
    void FIX0928Test() {
        FIX44 fixData = FIX44.FIX928_ENU_STATUS_VALUE;
        assertEquals( "928", fixData.getID());
        assertEquals( "STATUS_VALUE", fixData.getName());
        assertEquals( "StatusValue", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0928Test() {
        Tag928EnuStatusValue tagData;

        tagData = new Tag928EnuStatusValue( Enum928StatusValue.CONNECTED );
        assertEquals( Enum928StatusValue.CONNECTED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag928EnuStatusValue( Enum928StatusValue.DOWN_EXPECTED_UP );
        assertEquals( Enum928StatusValue.DOWN_EXPECTED_UP.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag928EnuStatusValue( Enum928StatusValue.DOWN_EXPECTED_DOWN );
        assertEquals( Enum928StatusValue.DOWN_EXPECTED_DOWN.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag928EnuStatusValue( Enum928StatusValue.IN_PROCESS );
        assertEquals( Enum928StatusValue.IN_PROCESS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}