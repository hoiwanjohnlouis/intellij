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
        assertEquals( "170", fixData.toEnumIDString());
        assertEquals( "STAND_INST_DB_NAME", fixData.toEnumNameString());
        assertEquals( "StandInstDbName", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
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
    @Test
    void PrintFIXTagTest() {
        Tag170StrStandInstDBName tagData;

        tagData = new Tag170StrStandInstDBName(new MyStringType(Tag170StrStandInstDBName.TESTB_STR_STAND_INST_DB_NAME));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag170StrStandInstDBName tagData;

        tagData = new Tag170StrStandInstDBName(new MyStringType(Tag170StrStandInstDBName.TESTB_STR_STAND_INST_DB_NAME));
        assertEquals( Tag170StrStandInstDBName.TESTB_STR_STAND_INST_DB_NAME, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag170StrStandInstDBName tagData;

        tagData = new Tag170StrStandInstDBName(new MyStringType(Tag170StrStandInstDBName.TESTB_STR_STAND_INST_DB_NAME));
        assertEquals( tagData.toEnumIDString() + "=" + Tag170StrStandInstDBName.TESTB_STR_STAND_INST_DB_NAME,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag170StrStandInstDBName tagData;

        tagData = new Tag170StrStandInstDBName(new MyStringType(Tag170StrStandInstDBName.TESTB_STR_STAND_INST_DB_NAME));
        assertEquals( Tag170StrStandInstDBName.TESTB_STR_STAND_INST_DB_NAME,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag170StrStandInstDBName tagData;

        tagData = new Tag170StrStandInstDBName(new MyStringType(Tag170StrStandInstDBName.TESTA_STR_STAND_INST_DB_NAME));
        assertEquals( "Tag170StrStandInstDBName\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag170StrStandInstDBName.TESTA_STR_STAND_INST_DB_NAME + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + Tag170StrStandInstDBName.TESTA_STR_STAND_INST_DB_NAME + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}