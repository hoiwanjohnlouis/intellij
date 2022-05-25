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

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  214
 *  SettlInstRefID
 *  String
 *  <p>
 *  Reference identifier for the SettlInstID (162) with
 *  Cancel and Replace SettlInstTransType (163) transaction types.
 */
class Tag214StrSettlInstRefIDTest {
    @Test
    void FIX0214Test() {
        FIX42 fixData = FIX42.FIX214_STR_SETTL_INST_REF_ID;
        assertEquals( "214", fixData.toFIXIDString());
        assertEquals( "SETTL_INST_REF_ID", fixData.toFIXNameString());
        assertEquals( "SettlInstRefID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0214Test() {
        Tag214StrSettlInstRefID tagData;

        tagData = new Tag214StrSettlInstRefID(
                new MyStringType(Tag214StrSettlInstRefID.TESTA_STR_SETTL_INST_REF_ID));
        assertEquals( Tag214StrSettlInstRefID.TESTA_STR_SETTL_INST_REF_ID, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag214StrSettlInstRefID(
                new MyStringType(Tag214StrSettlInstRefID.TESTB_STR_SETTL_INST_REF_ID));
        assertEquals( Tag214StrSettlInstRefID.TESTB_STR_SETTL_INST_REF_ID, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
}