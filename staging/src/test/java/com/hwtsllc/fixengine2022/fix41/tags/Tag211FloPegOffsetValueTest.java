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
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  211
 *  PegOffsetValue
 *  float
 *  <p>
 *  Amount (signed) added to the peg for a pegged order in the context of the PegOffsetType (836)
 *  <p>
 *  (Prior to FIX 4.4 this field was of type PriceOffset)
 */
class Tag211FloPegOffsetValueTest {
    @Test
    void FIX0211Test() {
        FIX41 fixData = FIX41.FIX211_FLO_PEG_DIFFERENCE;
        assertEquals( "211", fixData.getID());
        assertEquals( "PEG_DIFFERENCE", fixData.getName());
        assertEquals( "PegDifference", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0211Test() {
        Tag211FloPegOffsetValue tagData;

        tagData = new Tag211FloPegOffsetValue(new MyFloatType(Tag211FloPegOffsetValue.TESTA_FLO_PEG_DIFFERENCE));
        assertEquals( Tag211FloPegOffsetValue.TESTA_FLO_PEG_DIFFERENCE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag211FloPegOffsetValue(new MyFloatType(Tag211FloPegOffsetValue.TESTB_FLO_PEG_DIFFERENCE));
        assertEquals( Tag211FloPegOffsetValue.TESTB_FLO_PEG_DIFFERENCE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue());
    }
}