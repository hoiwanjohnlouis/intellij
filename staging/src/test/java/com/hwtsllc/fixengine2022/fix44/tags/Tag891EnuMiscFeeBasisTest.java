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
import com.hwtsllc.fixengine2022.fix44.enums.Enum891MiscFeeBasis;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  891
 *  MiscFeeBasis
 *  int
 *  Defines the unit for a miscellaneous fee.
 *  Valid values:
 *      0 - Absolute
 *      1 - Per Unit
 *      2 - Percentage
 */
class Tag891EnuMiscFeeBasisTest {
    @Test
    void FIX0891Test() {
        FIX44 fixData = FIX44.FIX891_ENU_MISC_FEE_BASIS;
        assertEquals( "891", fixData.getID());
        assertEquals( "MISC_FEE_BASIS", fixData.getName());
        assertEquals( "MiscFeeBasis", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0891Test() {
        Tag891EnuMiscFeeBasis tagData;

        tagData = new Tag891EnuMiscFeeBasis( Enum891MiscFeeBasis.ABSOLUTE );
        assertEquals( Enum891MiscFeeBasis.ABSOLUTE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag891EnuMiscFeeBasis( Enum891MiscFeeBasis.PER_UNIT );
        assertEquals( Enum891MiscFeeBasis.PER_UNIT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag891EnuMiscFeeBasis( Enum891MiscFeeBasis.PERCENTAGE );
        assertEquals( Enum891MiscFeeBasis.PERCENTAGE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}