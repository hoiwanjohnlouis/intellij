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
import com.hwtsllc.fixengine2022.datatypes.MyPercentageType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  245
 *  UnderlyingRepurchaseRate
 *  Percentage
 *  <p>
 *  Deprecated in FIX.4.4
 *  <p>
 *  Underlying security's RepurchaseRate.
 *  <p>
 *  See RepurchaseRate (227) field for description
 *  <p></p>
 *  (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 */
// @Deprecated
class Tag245PctUnderlyingRepurchaseRateTest {
    @Test
    void FIX0245Test() {
        FIX42 fixData = FIX42.FIX245_PCT_UNDERLYING_REPURCHASE_RATE;
        assertEquals( "245", fixData.toFIXIDString());
        assertEquals( "UNDERLYING_REPURCHASE_RATE", fixData.toFIXNameString());
        assertEquals( "UnderlyingRepurchaseRate (Deprecated)", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0245Test() {
        Tag245PctUnderlyingRepurchaseRate tagData;

        tagData = new Tag245PctUnderlyingRepurchaseRate(new MyPercentageType(
                Tag245PctUnderlyingRepurchaseRate.TESTA_PCT_UNDERLYING_REPURCHASE_RATE));
        assertEquals( Tag245PctUnderlyingRepurchaseRate.TESTA_PCT_UNDERLYING_REPURCHASE_RATE,
                tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag245PctUnderlyingRepurchaseRate(new MyPercentageType(
                Tag245PctUnderlyingRepurchaseRate.TESTB_PCT_UNDERLYING_REPURCHASE_RATE));
        assertEquals( Tag245PctUnderlyingRepurchaseRate.TESTB_PCT_UNDERLYING_REPURCHASE_RATE,
                tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue() );
    }
}