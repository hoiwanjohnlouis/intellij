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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix44.enums.Enum723PosMaintResult;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  723
 *  PosMaintResult
 *  Result of Position Maintenance Request.
 *  4000+ Reserved and available for bi-laterally agreed upon user-defined values
 *  Valid values:
 *      0 - Successful Completion - no warnings or errors
 *      1 - Rejected
 *      99 - Other
 *
 *      or any value conforming to the data type Reserved100Plus
 */
class Tag723EnuPosMaintResultTest {
    @Test
    void FIX0723Test() {
        FIX44 fixData = FIX44.FIX723_ENU_POS_MAINT_RESULT;
        assertEquals( "723", fixData.getID());
        assertEquals( "POS_MAINT_RESULT", fixData.getName());
        assertEquals( "PosMaintResult", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0723Test() {
        Tag723EnuPosMaintResult tagData;

        tagData = new Tag723EnuPosMaintResult(Enum723PosMaintResult.SUCCESSFUL);
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag723EnuPosMaintResult(Enum723PosMaintResult.REJECTED);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag723EnuPosMaintResult(Enum723PosMaintResult.OTHER);
        assertEquals( "99", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}