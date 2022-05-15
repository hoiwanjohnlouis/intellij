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
import com.hwtsllc.fixengine2022.datatypes.MyIntType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  971
 *  NTPositionLimit
 *  int
 *  <p>
 *  Position Limit in the near-term contract for a given exchange-traded product.
 */
class Tag971IntNTPositionLimitTest {
    @Test
    void FIX0971Test() {
        FIX50 fixData = FIX50.FIX971_INT_NT_POSITION_LIMIT;
        assertEquals( "971", fixData.getID());
        assertEquals( "NT_POSITION_LIMIT", fixData.getName());
        assertEquals( "NTPositionLimit", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0971Test() {
        Tag971IntNTPositionLimit tagData;

        tagData = new Tag971IntNTPositionLimit(
                new MyIntType( Tag971IntNTPositionLimit.TESTA_INT_NT_POSITION_LIMIT ));
        assertEquals( Tag971IntNTPositionLimit.TESTA_INT_NT_POSITION_LIMIT,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag971IntNTPositionLimit(
                new MyIntType( Tag971IntNTPositionLimit.TESTB_INT_NT_POSITION_LIMIT ));
        assertEquals( Tag971IntNTPositionLimit.TESTB_INT_NT_POSITION_LIMIT,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
}