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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.MyEnumLimitType;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  837
 *  PegLimitType
 *  int
 *  Type of Peg Limit
 *  843
 *  DiscretionLimitType
 *  int
 *  Type of Discretion Limit
 *  Valid values:
 *      0 - Or better (default) - price improvement allowed
 *      1 - Strict - limit is a strict limit
 *      2 - Or worse - for a buy the peg limit is a minimum
 *                  and for a sell the peg limit is a maximum
 *                  (for use for orders which have a price range)
 */
class Tag837EnuPegLimitTypeTest {
    @Test
    void FIX0837Test() {
        FIX44 fixData = FIX44.FIX837_ENU_PEG_LIMIT_TYPE;
        assertEquals( "837", fixData.getID());
        assertEquals( "PEG_LIMIT_TYPE", fixData.getName());
        assertEquals( "PegLimitType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0837Test() {
        Tag837EnuPegLimitType tagData;

        tagData = new Tag837EnuPegLimitType(MyEnumLimitType.OR_BETTER);
        assertEquals( MyEnumLimitType.OR_BETTER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag837EnuPegLimitType(MyEnumLimitType.STRICT);
        assertEquals( MyEnumLimitType.STRICT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag837EnuPegLimitType(MyEnumLimitType.OR_WORSE);
        assertEquals( MyEnumLimitType.OR_WORSE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}