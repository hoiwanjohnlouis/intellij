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
import com.hwtsllc.fixengine2022.fix27.enums.Enum20ExecTransType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

// @Deprecated
class Tag20EnuExecTransTypeTest {

    @Test
    void FIX0020Test() {
        FIX27 fixData = FIX27.FIX20_ENU_EXEC_TRANS_TYPE;
        assertEquals( "EXEC_TRANS_TYPE", fixData.getName());
        assertEquals( "20", fixData.getID());
        assertEquals( "ExecTransType (replaced)", fixData.getDescription());
        assertNotEquals( FIX27.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( FIX27.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX27.JUNK_ID, fixData.getID());
        assertNotEquals( FIX27.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0020Test() {
        Tag20EnuExecTransType tagData;

        tagData = new Tag20EnuExecTransType(Enum20ExecTransType.NEW);
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag20EnuExecTransType(Enum20ExecTransType.CANCEL);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag20EnuExecTransType(Enum20ExecTransType.CORRECT);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag20EnuExecTransType(Enum20ExecTransType.STATUS);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}