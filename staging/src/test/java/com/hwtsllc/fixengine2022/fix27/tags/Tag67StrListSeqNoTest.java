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
 *  67
 *  ListSeqNo
 *  int
 *  <p></p>
 *  Sequence of individual order within list
 *  <p></p>
 *  (i.e. ListSeqNo of TotNoOrders (68), 2 of 25, 3 of 25,   . . . )
 */
class Tag67StrListSeqNoTest {
    @Test
    void PrintFIXTagTest() {
        Tag67StrListSeqNo tagData;
        String oneElement;

        oneElement = Tag67StrListSeqNo.TESTA_STR_LIST_SEQ_NO;
        tagData = new Tag67StrListSeqNo(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag67StrListSeqNo.TESTB_STR_LIST_SEQ_NO;
        tagData = new Tag67StrListSeqNo(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTest() {
        Tag67StrListSeqNo tagData;
        String oneElement;

        oneElement = Tag67StrListSeqNo.TESTA_STR_LIST_SEQ_NO;
        tagData = new Tag67StrListSeqNo(new MyStringType( oneElement ) );
        verifyFIXData( tagData );

        oneElement = Tag67StrListSeqNo.TESTB_STR_LIST_SEQ_NO;
        tagData = new Tag67StrListSeqNo(new MyStringType( oneElement ) );
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag67StrListSeqNo tagData ) {
        assertEquals( "FIX67_STR_LIST_SEQ_NO", tagData.toEnumLabelString());
        assertEquals( "LIST_SEQ_NO", tagData.toEnumNameString());
        assertEquals( "67", tagData.toEnumIDString());
        assertEquals( "ListSeqNo", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag67StrListSeqNo tagData;
        String oneElement;

        oneElement = Tag67StrListSeqNo.TESTA_STR_LIST_SEQ_NO;
        tagData = new Tag67StrListSeqNo(new MyStringType( oneElement ) );
        verifyDataValue( tagData, oneElement );

        oneElement = Tag67StrListSeqNo.TESTB_STR_LIST_SEQ_NO;
        tagData = new Tag67StrListSeqNo(new MyStringType( oneElement ) );
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag67StrListSeqNo tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag67StrListSeqNo tagData;
        String oneElement;

        oneElement = Tag67StrListSeqNo.TESTA_STR_LIST_SEQ_NO;
        tagData = new Tag67StrListSeqNo(new MyStringType( oneElement ) );
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag67StrListSeqNo.TESTB_STR_LIST_SEQ_NO;
        tagData = new Tag67StrListSeqNo(new MyStringType( oneElement ) );
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag67StrListSeqNo tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag67StrListSeqNo tagData;
        String oneElement;

        oneElement = Tag67StrListSeqNo.TESTA_STR_LIST_SEQ_NO;
        tagData = new Tag67StrListSeqNo(new MyStringType( oneElement ) );
        verifyToString( tagData, oneElement );

        oneElement = Tag67StrListSeqNo.TESTB_STR_LIST_SEQ_NO;
        tagData = new Tag67StrListSeqNo(new MyStringType( oneElement ) );
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag67StrListSeqNo tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag67StrListSeqNo tagData;
        String oneElement;

        oneElement = Tag67StrListSeqNo.TESTA_STR_LIST_SEQ_NO;
        tagData = new Tag67StrListSeqNo(new MyStringType( oneElement ) );
        verifyVerboseString( tagData, oneElement );

        oneElement = Tag67StrListSeqNo.TESTB_STR_LIST_SEQ_NO;
        tagData = new Tag67StrListSeqNo(new MyStringType( oneElement ) );
        verifyVerboseString( tagData, oneElement );
    }

    private void verifyVerboseString( final Tag67StrListSeqNo tagData, final String oneElement ) {
        assertEquals( "Tag67StrListSeqNo\n" +
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