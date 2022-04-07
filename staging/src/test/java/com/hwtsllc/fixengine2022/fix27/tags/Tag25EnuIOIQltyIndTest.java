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
import com.hwtsllc.fixengine2022.datatypes.FIXType;
import com.hwtsllc.fixengine2022.fix27.enums.Enum25IOIQltyInd;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag25EnuIOIQltyIndTest {

    @Test
    void FIX0025Test() {
        FIX27 fixData = FIX27.FIX25_ENU_IOI_QLTY_IND;
        assertEquals( "IOI_QLTY_IND", fixData.getName());
        assertEquals( "25", fixData.getID());
        assertEquals( "IOIQltyInd", fixData.getDescription());
        assertNotEquals( FIXType.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( FIXType.JUNK_NAME, fixData.getName());
        assertNotEquals( FIXType.JUNK_ID, fixData.getID());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0025Test() {
        Tag25EnuIOIQltyInd tagData;

        tagData = new Tag25EnuIOIQltyInd(Enum25IOIQltyInd.HIGH);
        assertEquals( "H", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag25EnuIOIQltyInd(Enum25IOIQltyInd.MEDIUM);
        assertEquals( "M", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag25EnuIOIQltyInd(Enum25IOIQltyInd.LOW);
        assertEquals( "L", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
    }
}