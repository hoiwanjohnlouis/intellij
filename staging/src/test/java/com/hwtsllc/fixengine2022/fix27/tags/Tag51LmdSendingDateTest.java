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
import com.hwtsllc.fixengine2022.datatypes.MyLocalMktDateType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  51
 *  SendingDate  (no longer used)
 *  LocalMktDate
 *  Deprecated in FIX.4.3
 */
// @Deprecated
class Tag51LmdSendingDateTest {
    @Test
    void FIX0051Test() {
        FIX27 fixData = FIX27.FIX51_LMD_SENDING_DATE;
        assertEquals( "SENDING_DATE", fixData.toEnumNameString());
        assertEquals( "51", fixData.toEnumIDString());
        assertEquals( "SendingDate (no longer used)", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0051Test() {
        Tag51LmdSendingDate tagData;

        tagData = new Tag51LmdSendingDate(new MyLocalMktDateType("20220319 141400") );
        assertEquals( "20220319 141400", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag51LmdSendingDate tagData;

        tagData = new Tag51LmdSendingDate(new MyLocalMktDateType(Tag51LmdSendingDate.TESTB_LMD_SENDING_DATE));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag51LmdSendingDate tagData;

        tagData = new Tag51LmdSendingDate(new MyLocalMktDateType(Tag51LmdSendingDate.TESTB_LMD_SENDING_DATE));
        assertEquals( Tag51LmdSendingDate.TESTB_LMD_SENDING_DATE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag51LmdSendingDate tagData;

        tagData = new Tag51LmdSendingDate(new MyLocalMktDateType(Tag51LmdSendingDate.TESTB_LMD_SENDING_DATE));
        assertEquals( tagData.toEnumIDString() + "=" + Tag51LmdSendingDate.TESTB_LMD_SENDING_DATE,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag51LmdSendingDate tagData;

        tagData = new Tag51LmdSendingDate(new MyLocalMktDateType(Tag51LmdSendingDate.TESTB_LMD_SENDING_DATE));
        assertEquals( Tag51LmdSendingDate.TESTB_LMD_SENDING_DATE,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag51LmdSendingDate tagData;

        tagData = new Tag51LmdSendingDate(new MyLocalMktDateType(Tag51LmdSendingDate.TESTA_LMD_SENDING_DATE));
        assertEquals( "Tag51LmdSendingDate\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag51LmdSendingDate.TESTA_LMD_SENDING_DATE + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + Tag51LmdSendingDate.TESTA_LMD_SENDING_DATE + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}