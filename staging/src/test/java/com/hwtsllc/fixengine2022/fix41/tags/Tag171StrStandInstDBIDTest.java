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
import com.hwtsllc.fixengine2022.fix40.tags.Tag171StrStandInstDBID;
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
        assertEquals( "171", fixData.toFIXIDString());
        assertEquals( "STAND_INST_DB_ID", fixData.toFIXNameString());
        assertEquals( "StandInstDbID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0171Test() {
        Tag171StrStandInstDBID tagData;

        tagData = new Tag171StrStandInstDBID(new MyStringType(Tag171StrStandInstDBID.TESTA_STR_STAND_INST_DB_ID));
        assertEquals( Tag171StrStandInstDBID.TESTA_STR_STAND_INST_DB_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag171StrStandInstDBID(new MyStringType(Tag171StrStandInstDBID.TESTB_STR_STAND_INST_DB_ID));
        assertEquals( Tag171StrStandInstDBID.TESTB_STR_STAND_INST_DB_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag171StrStandInstDBID tagData;

        tagData = new Tag171StrStandInstDBID(new MyStringType(Tag171StrStandInstDBID.TESTB_STR_QUOTE_REQ_ID));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag171StrStandInstDBID tagData;

        tagData = new Tag171StrStandInstDBID(new MyStringType(Tag171StrStandInstDBID.TESTB_STR_QUOTE_REQ_ID));
        assertEquals( Tag171StrStandInstDBID.TESTB_STR_QUOTE_REQ_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag171StrStandInstDBID tagData;

        tagData = new Tag171StrStandInstDBID(new MyStringType(Tag171StrStandInstDBID.TESTB_STR_QUOTE_REQ_ID));
        assertEquals( tagData.toFIXIDString() + "=" + Tag171StrStandInstDBID.TESTB_STR_QUOTE_REQ_ID,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag171StrStandInstDBID tagData;

        tagData = new Tag171StrStandInstDBID(new MyStringType(Tag171StrStandInstDBID.TESTB_STR_QUOTE_REQ_ID));
        assertEquals( Tag171StrStandInstDBID.TESTB_STR_QUOTE_REQ_ID,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag171StrStandInstDBID tagData;

        tagData = new Tag171StrStandInstDBID(new MyStringType(Tag171StrStandInstDBID.TESTA_STR_QUOTE_REQ_ID));
        assertEquals( "Tag171StrStandInstDBID\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag171StrStandInstDBID.TESTA_STR_QUOTE_REQ_ID + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag171StrStandInstDBID.TESTA_STR_QUOTE_REQ_ID + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}