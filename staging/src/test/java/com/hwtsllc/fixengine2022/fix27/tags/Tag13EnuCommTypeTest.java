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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.fix27.enums.Enum13CommType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag13EnuCommTypeTest {

    @Test
    void FIX0013Test() {
        FIX27 fixData = FIX27.FIX13_ENU_COMM_TYPE;
        assertEquals( "COMM_TYPE", fixData.getName());
        assertEquals( "13", fixData.getID());
        assertEquals( "CommType", fixData.getDescription());
        assertNotEquals( FIX27.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( FIX27.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX27.JUNK_ID, fixData.getID());
        assertNotEquals( FIX27.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0013Test() {
        Tag13EnuCommType tagData;

        /*
         * 1-6 CommTypes
         */
        tagData = new Tag13EnuCommType(Enum13CommType.PER_UNIT);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_ST_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag13EnuCommType(Enum13CommType.PERCENT);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_ST_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag13EnuCommType(Enum13CommType.ABSOLUTE);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_ST_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag13EnuCommType(Enum13CommType.PERCENTAGE_WAIVED_CASH_DISCOUNT);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_ST_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag13EnuCommType(Enum13CommType.PERCENTAGE_WAIVED_ENHANCED_UNITS);
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_ST_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag13EnuCommType(Enum13CommType.POINTS_PER_BOND);
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_ST_DATA_VALUE, tagData.getDataValue());
    }
}