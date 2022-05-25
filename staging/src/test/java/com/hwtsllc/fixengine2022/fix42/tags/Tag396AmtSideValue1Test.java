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
 *  396
 *  SideValue1
 *  Amt
 *  <p>
 *  Amounts in currency
 */
class Tag396AmtSideValue1Test {
    @Test
    void FIX0396Test() {
        FIX42 fixData = FIX42.FIX396_AMT_SIDE_VALUE1;
        assertEquals( "396", fixData.toFIXIDString());
        assertEquals( "SIDE_VALUE1", fixData.toFIXNameString());
        assertEquals( "SideValue1", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0396Test() {
        Tag396AmtSideValue1 tagData;

        tagData = new Tag396AmtSideValue1(new MyAmtType(
                Tag396AmtSideValue1.TESTA_AMT_SIDE_VALUE1));
        assertEquals( Tag396AmtSideValue1.TESTA_AMT_SIDE_VALUE1,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag396AmtSideValue1(new MyAmtType(
                Tag396AmtSideValue1.TESTB_AMT_SIDE_VALUE1));
        assertEquals( Tag396AmtSideValue1.TESTB_AMT_SIDE_VALUE1,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue());
    }
}