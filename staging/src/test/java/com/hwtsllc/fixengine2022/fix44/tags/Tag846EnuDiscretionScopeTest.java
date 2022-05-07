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
import com.hwtsllc.fixengine2022.datatypes.MyEnumScope;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  840
 *  PegScope
 *  int
 *  The scope of the peg
 *  846
 *  DiscretionScope
 *  int
 *  The scope of the discretion
 *  Valid values:
 *      1 - Local (Exchange, ECN, ATS)
 *      2 - National
 *      3 - Global
 *      4 - National excluding local
 */
class Tag846EnuDiscretionScopeTest {
    @Test
    void FIX0846Test() {
        FIX44 fixData = FIX44.FIX846_ENU_DISCRETION_SCOPE;
        assertEquals( "846", fixData.getID());
        assertEquals( "DISCRETION_SCOPE", fixData.getName());
        assertEquals( "DiscretionScope", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0846Test() {
        Tag846EnuDiscretionScope tagData;

        tagData = new Tag846EnuDiscretionScope(MyEnumScope.LOCAL);
        assertEquals( MyEnumScope.LOCAL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag846EnuDiscretionScope(MyEnumScope.NATIONAL);
        assertEquals( MyEnumScope.NATIONAL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag846EnuDiscretionScope(MyEnumScope.GLOBAL);
        assertEquals( MyEnumScope.GLOBAL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag846EnuDiscretionScope(MyEnumScope.NATIONAL_EXCLUDING_LOCAL);
        assertEquals( MyEnumScope.NATIONAL_EXCLUDING_LOCAL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}