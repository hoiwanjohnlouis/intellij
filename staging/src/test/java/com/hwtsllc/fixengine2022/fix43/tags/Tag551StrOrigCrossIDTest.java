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
        assertEquals( "551", fixData.toEnumIDString());
        assertEquals( "ORIG_CROSS_ID", fixData.toEnumNameString());
        assertEquals( "OrigCrossID", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0551Test() {
        Tag551StrOrigCrossID tagData;
        String oneElement;

        oneElement = Tag551StrOrigCrossID.TESTA_STR_ORIG_CROSS_ID;
        tagData = new Tag551StrOrigCrossID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag551StrOrigCrossID.TESTB_STR_ORIG_CROSS_ID;
        tagData = new Tag551StrOrigCrossID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag551StrOrigCrossID tagData;
        String oneElement;

        oneElement = Tag551StrOrigCrossID.TESTA_STR_ORIG_CROSS_ID;
        tagData = new Tag551StrOrigCrossID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag551StrOrigCrossID.TESTB_STR_ORIG_CROSS_ID;
        tagData = new Tag551StrOrigCrossID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag551StrOrigCrossID tagData;
        String oneElement;

        oneElement = Tag551StrOrigCrossID.TESTB_STR_ORIG_CROSS_ID;
        tagData = new Tag551StrOrigCrossID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag551StrOrigCrossID tagData;
        String oneElement;

        oneElement = Tag551StrOrigCrossID.TESTB_STR_ORIG_CROSS_ID;
        tagData = new Tag551StrOrigCrossID( new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag551StrOrigCrossID tagData;
        String oneElement;

        oneElement = Tag551StrOrigCrossID.TESTB_STR_ORIG_CROSS_ID;
        tagData = new Tag551StrOrigCrossID(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag551StrOrigCrossID tagData;
        String oneElement;

        oneElement = Tag551StrOrigCrossID.TESTA_STR_ORIG_CROSS_ID;
        tagData = new Tag551StrOrigCrossID( new MyStringType( oneElement ) );
        assertEquals( "Tag551StrOrigCrossID\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}