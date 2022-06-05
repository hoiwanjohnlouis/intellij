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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.fix42.tags.Tag551StrOrigCrossID;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  551
 *  OrigCrossID
 *  String
 *  <p>
 *  CrossID of the previous cross order (NOT the initial cross order of the day) as assigned by the institution.
 *  <p>
 *  Used to identify the previous cross order in Cross Cancel and Cross Cancel/Replace Requests.
 */
class Tag551StrOrigCrossIDTest {
    @Test
    void FIX0551Test() {
        FIX43 fixData = FIX43.FIX551_STR_ORIG_CROSS_ID;
        assertEquals( "551", fixData.toFIXIDString());
        assertEquals( "ORIG_CROSS_ID", fixData.toFIXNameString());
        assertEquals( "OrigCrossID", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0551Test() {
        Tag551StrOrigCrossID tagData;

    }
    @Test
    void PrintFIXTagTest() {
        Tag551StrOrigCrossID tagData;
        String oneElement;

        oneElement = Tag551StrOrigCrossID.TESTB_STR_SETTL_INST_REF_ID;
        tagData = new Tag551StrOrigCrossID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag551StrOrigCrossID tagData;
        String oneElement;

        oneElement = Tag551StrOrigCrossID.TESTB_STR_SETTL_INST_REF_ID;
        tagData = new Tag551StrOrigCrossID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag551StrOrigCrossID tagData;
        String oneElement;

        oneElement = Tag551StrOrigCrossID.TESTB_STR_SETTL_INST_REF_ID;
        tagData = new Tag551StrOrigCrossID( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag551StrOrigCrossID tagData;
        String oneElement;

        oneElement = Tag551StrOrigCrossID.TESTB_STR_SETTL_INST_REF_ID;
        tagData = new Tag551StrOrigCrossID(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag551StrOrigCrossID tagData;
        String oneElement;

        oneElement = Tag551StrOrigCrossID.TESTA_STR_SETTL_INST_REF_ID;
        tagData = new Tag551StrOrigCrossID( new MyStringType( oneElement ) );
        assertEquals( "Tag551StrOrigCrossID\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}