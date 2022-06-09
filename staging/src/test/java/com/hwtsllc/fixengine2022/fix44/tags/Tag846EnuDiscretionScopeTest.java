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
import com.hwtsllc.fixengine2022.datatypes.MyEnumDiscretionOrPegScope;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  840 (same as 840, 846,)
 *  PegScope
 *  int
 *  <p>
 *  The scope of the peg
 *  <p></p>
 *  846
 *  DiscretionScope
 *  int
 *  <p>
 *  The scope of the discretion
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Local (Exchange, ECN, ATS)
 *  <p>    2 - National
 *  <p>    3 - Global
 *  <p>    4 - National excluding local
 */
class Tag846EnuDiscretionScopeTest {
    @Test
    void FIX0846Test() {
        FIX44 fixData = FIX44.FIX846_ENU_DISCRETION_SCOPE;
        assertEquals( "846", fixData.toFIXIDString());
        assertEquals( "DISCRETION_SCOPE", fixData.toFIXNameString());
        assertEquals( "DiscretionScope", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0846Test() {
        Tag846EnuDiscretionScope tagData;

        tagData = new Tag846EnuDiscretionScope( MyEnumDiscretionOrPegScope.LOCAL);
        assertEquals( MyEnumDiscretionOrPegScope.LOCAL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag846EnuDiscretionScope( MyEnumDiscretionOrPegScope.NATIONAL);
        assertEquals( MyEnumDiscretionOrPegScope.NATIONAL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag846EnuDiscretionScope( MyEnumDiscretionOrPegScope.GLOBAL);
        assertEquals( MyEnumDiscretionOrPegScope.GLOBAL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag846EnuDiscretionScope( MyEnumDiscretionOrPegScope.NATIONAL_EXCLUDING_LOCAL);
        assertEquals( MyEnumDiscretionOrPegScope.NATIONAL_EXCLUDING_LOCAL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}