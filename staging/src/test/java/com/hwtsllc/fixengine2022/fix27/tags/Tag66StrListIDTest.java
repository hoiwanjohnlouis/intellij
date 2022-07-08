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

import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  66
 *  ListID
 *  String
 *  <p></p>
 *  Unique identifier for list as assigned by institution,
 *  used to associate multiple individual orders.
 *  <p></p>
 *  Uniqueness must be guaranteed within a single trading day.
 *  <p></p>
 *  Firms which generate multi-day orders should consider embedding
 *  a date within the ListID field to assure uniqueness across days.
 */
class Tag66StrListIDTest {
    @Test
    void PrintFIXTagTest() {
        Tag66StrListID tagData;
        String oneElement;

        oneElement = Tag66StrListID.TESTA_STR_LIST_ID;
        tagData = new Tag66StrListID(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag66StrListID.TESTB_STR_LIST_ID;
        tagData = new Tag66StrListID(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTest() {
        Tag66StrListID tagData;
        String oneElement;

        oneElement = Tag66StrListID.TESTA_STR_LIST_ID;
        tagData = new Tag66StrListID(new MyStringType( oneElement ) );
        verifyFIXData( tagData );

        oneElement = Tag66StrListID.TESTB_STR_LIST_ID;
        tagData = new Tag66StrListID(new MyStringType( oneElement ) );
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag66StrListID tagData ) {
        assertEquals( "FIX66_STR_LIST_ID", tagData.toEnumLabelString());
        assertEquals( "LIST_ID", tagData.toEnumNameString());
        assertEquals( "66", tagData.toEnumIDString());
        assertEquals( "ListID", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag66StrListID tagData;
        String oneElement;

        oneElement = Tag66StrListID.TESTA_STR_LIST_ID;
        tagData = new Tag66StrListID(new MyStringType( oneElement ) );
        verifyDataValue( tagData, oneElement );

        oneElement = Tag66StrListID.TESTB_STR_LIST_ID;
        tagData = new Tag66StrListID(new MyStringType( oneElement ) );
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag66StrListID tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag66StrListID tagData;
        String oneElement;

        oneElement = Tag66StrListID.TESTA_STR_LIST_ID;
        tagData = new Tag66StrListID(new MyStringType( oneElement ) );
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag66StrListID.TESTB_STR_LIST_ID;
        tagData = new Tag66StrListID(new MyStringType( oneElement ) );
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag66StrListID tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag66StrListID tagData;
        String oneElement;

        oneElement = Tag66StrListID.TESTA_STR_LIST_ID;
        tagData = new Tag66StrListID(new MyStringType( oneElement ) );
        verifyToString( tagData, oneElement );

        oneElement = Tag66StrListID.TESTB_STR_LIST_ID;
        tagData = new Tag66StrListID(new MyStringType( oneElement ) );
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag66StrListID tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag66StrListID tagData;
        String oneElement;

        oneElement = Tag66StrListID.TESTA_STR_LIST_ID;
        tagData = new Tag66StrListID(new MyStringType( oneElement ) );
        verifyVerboseString( tagData, oneElement );

        oneElement = Tag66StrListID.TESTB_STR_LIST_ID;
        tagData = new Tag66StrListID(new MyStringType( oneElement ) );
        verifyVerboseString( tagData, oneElement );
    }

    private void verifyVerboseString( final Tag66StrListID tagData, final String oneElement ) {
        assertEquals( "Tag66StrListID\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + tagData.getDataValue() + "]\n" +
                        "\tValuePair[" + tagData.toValuePairString() + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}