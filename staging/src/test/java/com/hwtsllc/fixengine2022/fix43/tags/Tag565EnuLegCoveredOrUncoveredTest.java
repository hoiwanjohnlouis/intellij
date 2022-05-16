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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.MyEnumCoveredOrUncovered;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  203 (same as 203, 565,)
 *  CoveredOrUncovered
 *  int
 *  <p>
 *  Used for derivative products, such as options
 *  <p></p>
 *  565
 *  LegCoveredOrUncovered
 *  int
 *  <p>
 *  CoveredOrUncovered for leg of a multileg
 *  <p>
 *  See CoveredOrUncovered (203) field for description
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Covered
 *  <p>    1 - Uncovered
 */
class Tag565EnuLegCoveredOrUncoveredTest {
    @Test
    void FIX0565Test() {
        FIX43 fixData = FIX43.FIX565_ENU_LEG_COVERED_OR_UNCOVERED;
        assertEquals( "565", fixData.toFIXIDString());
        assertEquals( "LEG_COVERED_OR_UNCOVERED", fixData.toFIXNameString());
        assertEquals( "LegCoveredOrUncovered", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0565Test() {
        Tag565EnuLegCoveredOrUncovered tagData;

        tagData = new Tag565EnuLegCoveredOrUncovered(MyEnumCoveredOrUncovered.COVERED);
        assertEquals( MyEnumCoveredOrUncovered.COVERED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag565EnuLegCoveredOrUncovered(MyEnumCoveredOrUncovered.UNCOVERED);
        assertEquals( MyEnumCoveredOrUncovered.UNCOVERED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}