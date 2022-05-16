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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix42.enums.Enum265MDUpdateType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  265
 *  MDUpdateType
 *  0-1 msg types
 *      "0 - Full refresh"
 *      "1 - Incremental refresh"
 */
class Tag265EnuMDUpdateTypeTest {
    @Test
    void FIX0265Test() {
        FIX42 fixData = FIX42.FIX265_ENU_MD_UPDATE_TYPE;
        assertEquals( "265", fixData.toFIXIDString());
        assertEquals( "MD_UPDATE_TYPE", fixData.toFIXNameString());
        assertEquals( "MDUpdateType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0265Test() {
        Tag265EnuMDUpdateType tagData;

        /*
         * 0-1 msg types
         */
        tagData = new Tag265EnuMDUpdateType(Enum265MDUpdateType.FULL_REFRESH);
        assertEquals( Enum265MDUpdateType.FULL_REFRESH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag265EnuMDUpdateType(Enum265MDUpdateType.INCREMENTAL_REFRESH);
        assertEquals( Enum265MDUpdateType.INCREMENTAL_REFRESH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}