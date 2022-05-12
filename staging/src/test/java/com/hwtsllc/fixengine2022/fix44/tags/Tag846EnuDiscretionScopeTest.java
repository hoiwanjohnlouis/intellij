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
import com.hwtsllc.fixengine2022.datatypes.MyEnumPegDiscretionScope;
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
        assertEquals( "846", fixData.getID());
        assertEquals( "DISCRETION_SCOPE", fixData.getName());
        assertEquals( "DiscretionScope", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0846Test() {
        Log846EnuDiscretionScope tagData;

        tagData = new Log846EnuDiscretionScope(MyEnumPegDiscretionScope.LOCAL);
        assertEquals( MyEnumPegDiscretionScope.LOCAL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log846EnuDiscretionScope(MyEnumPegDiscretionScope.NATIONAL);
        assertEquals( MyEnumPegDiscretionScope.NATIONAL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log846EnuDiscretionScope(MyEnumPegDiscretionScope.GLOBAL);
        assertEquals( MyEnumPegDiscretionScope.GLOBAL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log846EnuDiscretionScope(MyEnumPegDiscretionScope.NATIONAL_EXCLUDING_LOCAL);
        assertEquals( MyEnumPegDiscretionScope.NATIONAL_EXCLUDING_LOCAL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}