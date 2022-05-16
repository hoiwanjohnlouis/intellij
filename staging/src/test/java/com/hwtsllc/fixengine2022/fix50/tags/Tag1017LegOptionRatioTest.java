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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1017
 *  LegOptionRatio
 *  float
 *  <p>
 *  Expresses the risk of an option leg
 *  <p>
 *  Value must be between -1 and 1.
 *  <p>
 *  A Call Option will require a ratio value between 0 and 1
 *  <p>
 *  A Put Option will require a ratio value between -1 and 0
 */
class Tag1017LegOptionRatioTest {
    @Test
    void FIX1017Test() {
        FIX50 fixData = FIX50.FIX1017_LEG_OPTION_RATIO;
        assertEquals( "1017", fixData.toFIXIDString());
        assertEquals( "LEG_OPTION_RATIO", fixData.toFIXNameString());
        assertEquals( "LegOptionRatio", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag1017Test() {
        Tag1017LegOptionRatio tagData;

    }
}