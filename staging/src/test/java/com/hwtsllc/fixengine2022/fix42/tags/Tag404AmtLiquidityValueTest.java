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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.MyAmtType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  404
 *  LiquidityValue
 *  Amt
 *  <p>
 *  Value between LiquidityPctLow (402) and LiquidityPctHigh (403) in Currency
 */
class Tag404AmtLiquidityValueTest {
    @Test
    void FIX0404Test() {
        FIX42 fixData = FIX42.FIX404_AMT_LIQUIDITY_VALUE;
        assertEquals( "404", fixData.toFIXIDString());
        assertEquals( "LIQUIDITY_VALUE", fixData.toFIXNameString());
        assertEquals( "LiquidityValue", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0404Test() {
        Tag404AmtLiquidityValue tagData;

        tagData = new Tag404AmtLiquidityValue(new MyAmtType(
                Tag404AmtLiquidityValue.TESTA_AMT_LIQUIDITY_VALUE));
        assertEquals( Tag404AmtLiquidityValue.TESTA_AMT_LIQUIDITY_VALUE,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag404AmtLiquidityValue(new MyAmtType(
                Tag404AmtLiquidityValue.TESTB_AMT_LIQUIDITY_VALUE));
        assertEquals( Tag404AmtLiquidityValue.TESTB_AMT_LIQUIDITY_VALUE,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue());
    }
}