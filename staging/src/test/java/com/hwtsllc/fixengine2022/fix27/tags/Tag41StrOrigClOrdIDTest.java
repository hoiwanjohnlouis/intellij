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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  41
 *  OrigClOrdID
 *  String
 *  ClOrdID (11) of the previous order (NOT the initial order of the day)
 *  as assigned by the institution, used to identify the previous order in
 *  cancel and cancel/replace requests.
 */
class Tag41StrOrigClOrdIDTest {
    @Test
    void FIX0041Test() {
        FIX27 fixData = FIX27.FIX41_STR_ORIG_CL_ORD_ID;
        assertEquals( "ORIG_CL_ORD_ID", fixData.getName());
        assertEquals( "41", fixData.getID());
        assertEquals( "OrigClOrdID", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0041Test() {
        Tag41StrOrigClOrdID tagData;

        tagData = new Tag41StrOrigClOrdID(new MyStringType("ORD-12345") );
        assertEquals( "ORD-12345", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}