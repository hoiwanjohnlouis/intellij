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

class Tag114BoolLocateReqdTest {

    @Test
    void FIX0114Test() {
        FIX40 fixData = FIX40.FIX114_BOOL_LOCATE_REQD;
        assertEquals( "LOCATE_REQD", fixData.getName());
        assertEquals( "114", fixData.getID());
        assertEquals( "LocateReqd", fixData.getDescription());
        assertNotEquals( FIX40.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( FIX40.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX40.JUNK_ID, fixData.getID());
        assertNotEquals( FIX40.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0114Test() {
        Tag114BoolLocateReqd tagData;

        tagData = new Tag114BoolLocateReqd(MyBooleanType.NO);
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( FIX40.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag114BoolLocateReqd(MyBooleanType.YES);
        assertEquals( "Y", tagData.getDataValue());
        assertNotEquals( FIX40.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}