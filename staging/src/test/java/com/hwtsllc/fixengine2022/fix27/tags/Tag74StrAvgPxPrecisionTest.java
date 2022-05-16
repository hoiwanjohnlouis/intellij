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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  74
 *  AvgPxPrecision
 *  int
 *  <p>
 *  Indicates number of decimal places to be used for average pricing.
 *  <p>
 *  Absence of this field indicates that default precision arranged
 *  by the broker or institution is to be used.
 */
class Tag74StrAvgPxPrecisionTest {
    @Test
    void FIX0074Test() {
        FIX27 fixData = FIX27.FIX74_STR_AVG_PX_PRECISION;
        assertEquals( "AVG_PX_PRECISION", fixData.toFIXNameString());
        assertEquals( "74", fixData.toFIXIDString());
        assertEquals( "AvgPxPrecision", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0074Test() {
        Tag74StrAvgPxPrecision tagData;

        tagData = new Tag74StrAvgPxPrecision(new MyStringType("Saruman-74AvgPxPrecision") );
        assertEquals( "Saruman-74AvgPxPrecision", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}