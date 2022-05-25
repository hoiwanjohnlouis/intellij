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
 *  262
 *  MDReqID
 *  String
 *  <p>
 *  Unique identifier for Market Data Request
 */
class Tag262StrMDReqIDTest {
    @Test
    void FIX0262Test() {
        FIX42 fixData = FIX42.FIX262_STR_MD_REQ_ID;
        assertEquals( "262", fixData.toFIXIDString());
        assertEquals( "MD_REQ_ID", fixData.toFIXNameString());
        assertEquals( "MDReqID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0262Test() {
        Tag262StrMDReqID tagData;

        tagData = new Tag262StrMDReqID(
                new MyStringType(Tag262StrMDReqID.TESTA_STR_MD_REQ_ID));
        assertEquals( Tag262StrMDReqID.TESTA_STR_MD_REQ_ID, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag262StrMDReqID(
                new MyStringType(Tag262StrMDReqID.TESTB_STR_MD_REQ_ID));
        assertEquals( Tag262StrMDReqID.TESTB_STR_MD_REQ_ID, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
}