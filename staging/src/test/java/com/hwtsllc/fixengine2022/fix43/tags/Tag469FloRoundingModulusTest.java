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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  469
 *  RoundingModulus
 *  float
 *  <p>
 *  For CIV - a float value indicating the value to which rounding is required.
 *  <p>
 *  i.e. 0 means round to a multiple of 0 units/shares; 0.5 means round to a multiple of 0.5 units/shares.
 *  <p>
 *  The default, if RoundingDirection (468) is specified without RoundingModulus, is to round to a whole unit/share.
 */
class Tag469FloRoundingModulusTest {
    @Test
    void FIX0469Test() {
        FIX43 fixData = FIX43.FIX469_FLO_ROUNDING_MODULUS;
        assertEquals( "469", fixData.toFIXIDString());
        assertEquals( "ROUNDING_MODULUS", fixData.toFIXNameString());
        assertEquals( "RoundingModulus", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0469Test() {
        Tag469FloRoundingModulus tagData;

    }
}