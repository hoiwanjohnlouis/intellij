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

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.MyBooleanType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag377BoolSolicitedFlagTest {
    @Test
    void FIX0377Test() {
        FIX42 fixData = FIX42.FIX377_BOOL_SOLICITED_FLAG;
        assertEquals( "377", fixData.getID());
        assertEquals( "SOLICITED_FLAG", fixData.getName());
        assertEquals( "SolicitedFlag", fixData.getDescription());
        assertNotEquals( FIX42.JUNK_ID, fixData.getID());
        assertNotEquals( FIX42.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0377Test() {
        Tag377BoolSolicitedFlag tagData;

        tagData = new Tag377BoolSolicitedFlag(MyBooleanType.NO);
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag377BoolSolicitedFlag(MyBooleanType.YES);
        assertEquals( "Y", tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}