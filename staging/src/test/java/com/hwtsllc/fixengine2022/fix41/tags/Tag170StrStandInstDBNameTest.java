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
 *  170
 *  StandInstDbName
 *  String
 *  <p>
 *  Name of the Standing Instruction database represented with StandInstDbType (169) (i.e. the Global Custodian’s name).
 */
class Tag170StrStandInstDBNameTest {
    @Test
    void FIX0170Test() {
        FIX41 fixData = FIX41.FIX170_STR_STAND_INST_DB_NAME;
        assertEquals( "170", fixData.toFIXIDString());
        assertEquals( "STAND_INST_DB_NAME", fixData.toFIXNameString());
        assertEquals( "StandInstDbName", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0170Test() {
        Tag170StrStandInstDBName tagData;

        tagData = new Tag170StrStandInstDBName(new MyStringType(Tag170StrStandInstDBName.TESTA_STR_STAND_INST_DB_NAME));
        assertEquals( Tag170StrStandInstDBName.TESTA_STR_STAND_INST_DB_NAME, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag170StrStandInstDBName(new MyStringType(Tag170StrStandInstDBName.TESTB_STR_STAND_INST_DB_NAME));
        assertEquals( Tag170StrStandInstDBName.TESTB_STR_STAND_INST_DB_NAME, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}