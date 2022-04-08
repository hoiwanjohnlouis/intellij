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
import com.hwtsllc.fixengine2022.fix27.enums.EnumBoolean;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag43EnuPossDupFlagTest {

    @Test
    void FIX0043Test() {
        FIX27 fixData = FIX27.FIX43_ENU_POSS_DUP_FLAG;
        assertEquals( "POSS_DUP_FLAG", fixData.getName());
        assertEquals( "43", fixData.getID());
        assertEquals( "PossDupFlag", fixData.getDescription());
        assertNotEquals( FIX27.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( FIX27.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX27.JUNK_ID, fixData.getID());
        assertNotEquals( FIX27.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0043Test() {
        Tag43EnuPossDupFlag tagData;

        tagData = new Tag43EnuPossDupFlag(EnumBoolean.NO);
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_ST_DATA_VALUE, tagData.getDataValue());
    }
}