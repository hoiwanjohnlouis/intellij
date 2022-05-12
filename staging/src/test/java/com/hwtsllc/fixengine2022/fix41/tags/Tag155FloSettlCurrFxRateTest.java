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
import com.hwtsllc.fixengine2022.datatypes.MyFloatType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  155
 *  SettlCurrFxRate
 *  float
 *  <p>
 *  Foreign exchange rate used to compute SettlCurrAmt (9) from Currency (5) to SettlCurrency (20)
 */
class Tag155FloSettlCurrFxRateTest {
    @Test
    void FIX0155Test() {
        FIX41 fixData = FIX41.FIX155_FLO_SETTL_CURR_FX_RATE;
        assertEquals( "155", fixData.getID());
        assertEquals( "SETTL_CURR_FX_RATE", fixData.getName());
        assertEquals( "SettlCurrFxRate", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0155Test() {
        Log155FloSettlCurrFxRate tagData;

        tagData = new Log155FloSettlCurrFxRate(new MyFloatType(Log155FloSettlCurrFxRate.TESTA_FLO_SETTL_CURR_FX_RATE));
        assertEquals( Log155FloSettlCurrFxRate.TESTA_FLO_SETTL_CURR_FX_RATE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue());

        tagData = new Log155FloSettlCurrFxRate(new MyFloatType(Log155FloSettlCurrFxRate.TESTB_FLO_SETTL_CURR_FX_RATE));
        assertEquals( Log155FloSettlCurrFxRate.TESTB_FLO_SETTL_CURR_FX_RATE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue());
    }
}