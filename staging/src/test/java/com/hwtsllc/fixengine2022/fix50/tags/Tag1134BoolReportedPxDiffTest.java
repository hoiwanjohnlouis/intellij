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
import com.hwtsllc.fixengine2022.fix50.enums.Bool1134ReportedPxDiff;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1134
 *  ReportedPxDiff
 *  Boolean
 *  <p>
 *  Shows that the reported price that is different from the market price
 *  <p></p>
 *  <p> YES( "Y", "YES", "Y - Reported price is different from the market price" ),
 *  <p> NO( "N", "NO", "N - Reported price is equal to market price" ),
 */
class Tag1134BoolReportedPxDiffTest {
    @Test
    void FIX1134Test() {
        FIX50 fixData = FIX50.FIX1134_BOOL_REPORTED_PX_DIFF;
        assertEquals( "1134", fixData.getID());
        assertEquals( "REPORTED_PX_DIFF", fixData.getName());
        assertEquals( "ReportedPxDiff", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag1134Test() {
        Tag1134BoolReportedPxDiff tagData;

        tagData = new Tag1134BoolReportedPxDiff( Bool1134ReportedPxDiff.NO );
        assertEquals( Bool1134ReportedPxDiff.NO.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1134BoolReportedPxDiff( Bool1134ReportedPxDiff.YES );
        assertEquals( Bool1134ReportedPxDiff.YES.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
}