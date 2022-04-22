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

package com.hwtsllc.fixengine2022.fix40.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX40;
import com.hwtsllc.fixengine2022.datatypes.MyBooleanType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag121BoolForexReqTest {

    @Test
    void FIX0121Test() {
        FIX40 fixData = FIX40.FIX121_BOOL_FOREX_REQ;
        assertEquals( "FOREX_REQ", fixData.getName());
        assertEquals( "121", fixData.getID());
        assertEquals( "ForexReq", fixData.getDescription());
        assertNotEquals( FIX40.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( FIX40.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX40.JUNK_ID, fixData.getID());
        assertNotEquals( FIX40.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0121Test() {
        Tag121BoolForexReq tagData;

        tagData = new Tag121BoolForexReq(MyBooleanType.NO);
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( FIX40.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag121BoolForexReq(MyBooleanType.YES);
        assertEquals( "Y", tagData.getDataValue());
        assertNotEquals( FIX40.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}