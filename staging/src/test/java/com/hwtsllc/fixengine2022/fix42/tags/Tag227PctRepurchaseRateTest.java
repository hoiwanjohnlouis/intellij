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

// @Deprecated
class Tag227PctRepurchaseRateTest {
    @Test
    void FIX0227Test() {
        FIX42 fixData = FIX42.FIX227_PCT_REPURCHASE_RATE;
        assertEquals( "227", fixData.getID());
        assertEquals( "REPURCHASE_RATE", fixData.getName());
        assertEquals( "RepurchaseRate (Deprecated)", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0227Test() {
        Tag227PctRepurchaseRate tagData;

        tagData = new Tag227PctRepurchaseRate(new MyPercentageType(
                Tag227PctRepurchaseRate.TESTA_PCT_REPURCHASE_RATE));
        assertEquals( Tag227PctRepurchaseRate.TESTA_PCT_REPURCHASE_RATE,
                tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag227PctRepurchaseRate(new MyPercentageType(
                Tag227PctRepurchaseRate.TESTB_PCT_REPURCHASE_RATE));
        assertEquals( Tag227PctRepurchaseRate.TESTB_PCT_REPURCHASE_RATE,
                tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue() );
    }
}