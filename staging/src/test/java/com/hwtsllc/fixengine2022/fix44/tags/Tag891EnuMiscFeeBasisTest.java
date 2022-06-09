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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix44.enums.Enum891MiscFeeBasis;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  891
 *  MiscFeeBasis
 *  int
 *  <p></p>
 *  Defines the unit for a miscellaneous fee.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Absolute
 *  <p>    1 - Per Unit
 *  <p>    2 - Percentage
 */
class Tag891EnuMiscFeeBasisTest {
    @Test
    void FIX0891Test() {
        FIX44 fixData = FIX44.FIX891_ENU_MISC_FEE_BASIS;
        assertEquals( "891", fixData.toFIXIDString());
        assertEquals( "MISC_FEE_BASIS", fixData.toFIXNameString());
        assertEquals( "MiscFeeBasis", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0891Test() {
        Tag891EnuMiscFeeBasis tagData;

        tagData = new Tag891EnuMiscFeeBasis( Enum891MiscFeeBasis.ABSOLUTE );
        assertEquals( Enum891MiscFeeBasis.ABSOLUTE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag891EnuMiscFeeBasis( Enum891MiscFeeBasis.PER_UNIT );
        assertEquals( Enum891MiscFeeBasis.PER_UNIT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag891EnuMiscFeeBasis( Enum891MiscFeeBasis.PERCENTAGE );
        assertEquals( Enum891MiscFeeBasis.PERCENTAGE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}