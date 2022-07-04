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
 *  548
 *  CrossID
 *  String
 *  <p>
 *  Identifier for a cross order.
 *  <p>
 *  Must be unique during a given trading day.
 *  <p>
 *  Recommend that firms use the order date as part of the CrossID for Good Till Cancel (GT) orders.
 */
class Tag548StrCrossIDTest {
    @Test
    void FIX0548Test() {
        FIX43 fixData = FIX43.FIX548_STR_CROSS_ID;
        assertEquals( "548", fixData.toEnumIDString());
        assertEquals( "CROSS_ID", fixData.toEnumNameString());
        assertEquals( "CrossID", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0548Test() {
        Tag548StrCrossID tagData;
        String oneElement;

        oneElement = Tag548StrCrossID.TESTA_STR_CROSS_ID;
        tagData = new Tag548StrCrossID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag548StrCrossID.TESTB_STR_CROSS_ID;
        tagData = new Tag548StrCrossID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag548StrCrossID tagData;
        String oneElement;

        oneElement = Tag548StrCrossID.TESTA_STR_CROSS_ID;
        tagData = new Tag548StrCrossID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag548StrCrossID.TESTB_STR_CROSS_ID;
        tagData = new Tag548StrCrossID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag548StrCrossID tagData;
        String oneElement;

        oneElement = Tag548StrCrossID.TESTB_STR_CROSS_ID;
        tagData = new Tag548StrCrossID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag548StrCrossID tagData;
        String oneElement;

        oneElement = Tag548StrCrossID.TESTB_STR_CROSS_ID;
        tagData = new Tag548StrCrossID( new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag548StrCrossID tagData;
        String oneElement;

        oneElement = Tag548StrCrossID.TESTB_STR_CROSS_ID;
        tagData = new Tag548StrCrossID(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag548StrCrossID tagData;
        String oneElement;

        oneElement = Tag548StrCrossID.TESTA_STR_CROSS_ID;
        tagData = new Tag548StrCrossID( new MyStringType( oneElement ) );
        assertEquals( "Tag548StrCrossID\n" +
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