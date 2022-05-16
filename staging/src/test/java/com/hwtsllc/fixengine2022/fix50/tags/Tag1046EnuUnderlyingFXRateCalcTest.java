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

import com.hwtsllc.fixengine2022.datatypes.MyEnumFXRateCalc;
import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  156 (same as 156, 1046,)
 *  SettlCurrFxRateCalc
 *  char
 *  <p>
 *  Specifies whether or not SettlCurrFxRate (55) should be multiplied or divided.
 *  <p></p>
 *  1046
 *  UnderlyingFXRateCalc
 *  char
 *  <p>
 *  Specifies whether the UnderlyingFxRate (1045) should be multiplied or divided.
 *  <p></p>
 *  Valid values:
 *  <p></p>
 *  <p>    M - Multiply
 *  <p>    D - Divide
 */
class Tag1046EnuUnderlyingFXRateCalcTest {
    @Test
    void FIX1046Test() {
        FIX50 fixData = FIX50.FIX1046_ENU_UNDERLYING_FX_RATE_CALC;
        assertEquals( "1046", fixData.toFIXIDString());
        assertEquals( "UNDERLYING_FX_RATE_CALC", fixData.toFIXNameString());
        assertEquals( "UnderlyingFXRateCalc", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag1046Test() {
        Tag1046EnuUnderlyingFXRateCalc tagData;

        tagData = new Tag1046EnuUnderlyingFXRateCalc(MyEnumFXRateCalc.MULTIPLY);
        assertEquals( MyEnumFXRateCalc.MULTIPLY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1046EnuUnderlyingFXRateCalc(MyEnumFXRateCalc.DIVIDE);
        assertEquals( MyEnumFXRateCalc.DIVIDE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}