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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  17
 *  ExecID
 *  String
 *  Unique identifier of execution message as assigned by sell-side (broker, exchange, ECN)
 *  (will be 0 (zero) for ExecType (50) =I (Order Status)).
 *
 *  Uniqueness must be guaranteed within a single trading day or the life of a multi-day order.
 *  Firms which accept multi-day orders should consider embedding a date within
 *  the ExecID field to assure uniqueness across days.
 *  (Prior to FIX 4.1 this field was of type int)
 */
class Tag17StrExecIDTest {
    @Test
    void FIX0017Test() {
        FIX27 fixData = FIX27.FIX17_STR_EXEC_ID;
        assertEquals( "EXEC_ID", fixData.toFIXNameString());
        assertEquals( "17", fixData.toFIXIDString());
        assertEquals( "ExecID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0017Test() {
        Tag17StrExecID tagData;

        tagData = new Tag17StrExecID(new MyStringType("BEST-1234") );
        assertEquals( "BEST-1234", tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag17StrExecID tagData;

        tagData = new Tag17StrExecID(new MyStringType(Tag17StrExecID.TESTB_STR_EXEC_ID));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag17StrExecID tagData;

        tagData = new Tag17StrExecID(new MyStringType(Tag17StrExecID.TESTB_STR_EXEC_ID));
        assertEquals( Tag17StrExecID.TESTB_STR_EXEC_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag17StrExecID tagData;

        tagData = new Tag17StrExecID(new MyStringType(Tag17StrExecID.TESTB_STR_EXEC_ID));
        assertEquals( tagData.toFIXIDString() + "=" + Tag17StrExecID.TESTB_STR_EXEC_ID,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag17StrExecID tagData;

        tagData = new Tag17StrExecID(new MyStringType(Tag17StrExecID.TESTB_STR_EXEC_ID));
        assertEquals( Tag17StrExecID.TESTB_STR_EXEC_ID,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag17StrExecID tagData;

        tagData = new Tag17StrExecID(new MyStringType(Tag17StrExecID.TESTA_STR_EXEC_ID));
        assertEquals( "Tag17StrExecID\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag17StrExecID.TESTA_STR_EXEC_ID + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag17StrExecID.TESTA_STR_EXEC_ID + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}