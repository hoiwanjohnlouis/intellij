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

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import com.hwtsllc.fixengine2022.datatypes.SeqNumType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag36SntNewSeqNoTest {

    @Test
    void FIX0036Test() {
        FIXType fixData = FIXType.FIX36_SNT_NEW_SEQ_NO;
        assertEquals( "NEW_SEQ_NO", fixData.getName());
        assertEquals( "36", fixData.getID());
        assertEquals( "NewSeqNo", fixData.getDescription());
        assertNotEquals( FIXType.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( FIXType.JUNK_NAME, fixData.getName());
        assertNotEquals( FIXType.JUNK_ID, fixData.getID());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0036Test() {
        Tag36SntNewSeqNo tagData;

        tagData = new Tag36SntNewSeqNo(new SeqNumType(23456) );
        assertEquals( 23456, tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_SNT_DATA_VALUE, tagData.getDataValue());
    }
}