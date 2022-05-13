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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1014
 *  SideTrdRegTimestampSrc
 *  String
 *  <p>
 *  Same as TrdRegTimestampOrigin
 *  <p>
 *  Text which identifies the origin.
 *  <p>
 *  i.e. system which was used to generate the time stamp for the Traded Regulatory timestamp value
 */
class Tag1014StrSideTrdRegTimestampSrcTest {
    @Test
    void FIX1014Test() {
        FIX50 fixData = FIX50.FIX1014_STR_SIDE_TRD_REG_TIMESTAMP_SRC;
        assertEquals( "1014", fixData.getID());
        assertEquals( "SIDE_TRD_REG_TIMESTAMP_SRC", fixData.getName());
        assertEquals( "SideTrdRegTimestampSrc", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag1014Test() {
        Tag1014StrSideTrdRegTimestampSrc tagData;

        tagData = new Tag1014StrSideTrdRegTimestampSrc( new MyStringType("Chloe Kim") );
        assertEquals( "Chloe Kim", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
}