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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  171
 *  StandInstDbID
 *  String
 *  <p>
 *  Unique identifier used on the Standing Instructions database for the Standing Instructions to be referenced.
 */
class Tag171StrStandInstDBIDTest {
    @Test
    void FIX0171Test() {
        FIX41 fixData = FIX41.FIX171_STR_STAND_INST_DB_ID;
        assertEquals( "171", fixData.getID());
        assertEquals( "STAND_INST_DB_ID", fixData.getName());
        assertEquals( "StandInstDbId", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0171Test() {
        Log171StrStandInstDBID tagData;

        tagData = new Log171StrStandInstDBID(new MyStringType(Log171StrStandInstDBID.TESTA_STR_STAND_INST_DB_ID));
        assertEquals( Log171StrStandInstDBID.TESTA_STR_STAND_INST_DB_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log171StrStandInstDBID(new MyStringType(Log171StrStandInstDBID.TESTB_STR_STAND_INST_DB_ID));
        assertEquals( Log171StrStandInstDBID.TESTB_STR_STAND_INST_DB_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}