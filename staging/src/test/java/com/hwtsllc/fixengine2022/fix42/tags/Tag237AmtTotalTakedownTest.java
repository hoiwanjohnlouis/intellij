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
 *  237
 *  TotalTakedown
 *  Amt
 *  <p>
 *  The price at which the securities are distributed to the different members of an
 *  underwriting group for the primary market in Municipals, total gross underwriter's spread.
 *  <p></p>
 *  (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 */
class Tag237AmtTotalTakedownTest {
    @Test
    void FIX0237Test() {
        FIX42 fixData = FIX42.FIX237_AMT_TOTAL_TAKEDOWN;
        assertEquals( "237", fixData.toFIXIDString());
        assertEquals( "TOTAL_TAKEDOWN", fixData.toFIXNameString());
        assertEquals( "TotalTakedown", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0237Test() {
        Tag237AmtTotalTakedown tagData;

        tagData = new Tag237AmtTotalTakedown(new MyAmtType(
                Tag237AmtTotalTakedown.TESTA_AMT_TOTAL_TAKEDOWN));
        assertEquals( Tag237AmtTotalTakedown.TESTA_AMT_TOTAL_TAKEDOWN,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag237AmtTotalTakedown(new MyAmtType(
                Tag237AmtTotalTakedown.TESTB_AMT_TOTAL_TAKEDOWN));
        assertEquals( Tag237AmtTotalTakedown.TESTB_AMT_TOTAL_TAKEDOWN,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue());
    }
}