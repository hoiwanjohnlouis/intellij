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
import com.hwtsllc.fixengine2022.datatypes.MyNumInGroupType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1016
 *  NoSideTrdRegTS
 *  NumInGroup
 *  <p>
 *  Indicates number of  SideTimestamps contained in group
 */
class Tag1016NumNoSideTrdRegTSTest {
    @Test
    void FIX1016Test() {
        FIX50 fixData = FIX50.FIX1016_NUM_NO_SIDE_TRD_REG_TS;
        assertEquals( "1016", fixData.getID());
        assertEquals( "NO_SIDE_TRD_REG_TS", fixData.getName());
        assertEquals( "NoSideTrdRegTS", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag1016Test() {
        Tag1016NumNoSideTrdRegTS tagData;

        tagData = new Tag1016NumNoSideTrdRegTS(
                new MyNumInGroupType( Tag1016NumNoSideTrdRegTS.TESTA_NUM_NO_SIDE_TRD_REG_TS ));
        assertEquals( Tag1016NumNoSideTrdRegTS.TESTA_NUM_NO_SIDE_TRD_REG_TS, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1016NumNoSideTrdRegTS(
                new MyNumInGroupType( Tag1016NumNoSideTrdRegTS.TESTB_NUM_NO_SIDE_TRD_REG_TS ));
        assertEquals( Tag1016NumNoSideTrdRegTS.TESTB_NUM_NO_SIDE_TRD_REG_TS, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue());
    }
}