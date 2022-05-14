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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.datatypes.MyEnumFXRateCalc;
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
class Tag156EnuSettlCurrFXRateCalcTest {
    @Test
    void FIX0156Test() {
        FIX41 fixData = FIX41.FIX156_SETTL_CURR_FX_RATE_CALC;
        assertEquals( "156", fixData.getID());
        assertEquals( "SETTL_CURR_FX_RATE_CALC", fixData.getName());
        assertEquals( "SettlCurrFxRateCalc", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0156Test() {
        Tag156EnuSettlCurrFXRateCalc tagData;

        tagData = new Tag156EnuSettlCurrFXRateCalc(MyEnumFXRateCalc.MULTIPLY);
        assertEquals( MyEnumFXRateCalc.MULTIPLY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag156EnuSettlCurrFXRateCalc(MyEnumFXRateCalc.DIVIDE);
        assertEquals( MyEnumFXRateCalc.DIVIDE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}