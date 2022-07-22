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
 *  30
 *  LastMkt
 *  Exchange
 *  <p></p>
 *  Market of execution for last fill, or an indication of the market where an order was routed
 *  <p></p>
 *  See "Appendix 6-C"
 */
class Tag30StrLastMktTest {
    @Test
    void PrintFIXTagTest() {
        Tag30StrLastMkt tagData;
        String oneElement;

        oneElement = Tag30StrLastMkt.TESTA_STR_LAST_MKT;
        tagData = new Tag30StrLastMkt(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag30StrLastMkt.TESTB_STR_LAST_MKT;
        tagData = new Tag30StrLastMkt(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTest() {
        Tag30StrLastMkt tagData;
        String oneElement;

        oneElement = Tag30StrLastMkt.TESTA_STR_LAST_MKT;
        tagData = new Tag30StrLastMkt(new MyStringType( oneElement ) );
        verifyFIXData( tagData );

        oneElement = Tag30StrLastMkt.TESTB_STR_LAST_MKT;
        tagData = new Tag30StrLastMkt(new MyStringType( oneElement ) );
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag30StrLastMkt tagData ) {
        assertEquals( "FIX30_STR_LAST_MKT", tagData.toEnumLabelString());
        assertEquals( "LAST_MKT", tagData.toEnumNameString());
        assertEquals( "30", tagData.toEnumIDString());
        assertEquals( "LastMkt", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag30StrLastMkt tagData;
        String oneElement;

        oneElement = Tag30StrLastMkt.TESTA_STR_LAST_MKT;
        tagData = new Tag30StrLastMkt(new MyStringType( oneElement ) );
        verifyDataValue( tagData, oneElement );

        oneElement = Tag30StrLastMkt.TESTB_STR_LAST_MKT;
        tagData = new Tag30StrLastMkt(new MyStringType( oneElement ) );
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( Tag30StrLastMkt tagData, String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag30StrLastMkt tagData;
        String oneElement;

        oneElement = Tag30StrLastMkt.TESTA_STR_LAST_MKT;
        tagData = new Tag30StrLastMkt(new MyStringType( oneElement ) );
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag30StrLastMkt.TESTB_STR_LAST_MKT;
        tagData = new Tag30StrLastMkt(new MyStringType( oneElement ) );
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag30StrLastMkt tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag30StrLastMkt tagData;
        String oneElement;

        oneElement = Tag30StrLastMkt.TESTA_STR_LAST_MKT;
        tagData = new Tag30StrLastMkt(new MyStringType( oneElement ) );
        verifyToString( tagData, oneElement );

        oneElement = Tag30StrLastMkt.TESTB_STR_LAST_MKT;
        tagData = new Tag30StrLastMkt(new MyStringType( oneElement ) );
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag30StrLastMkt tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag30StrLastMkt tagData;
        String oneElement;

        oneElement = Tag30StrLastMkt.TESTA_STR_LAST_MKT;
        tagData = new Tag30StrLastMkt(new MyStringType( oneElement ) );
        verifyVerboseString( tagData, oneElement );

        oneElement = Tag30StrLastMkt.TESTB_STR_LAST_MKT;
        tagData = new Tag30StrLastMkt(new MyStringType( oneElement ) );
        verifyVerboseString( tagData, oneElement );
    }

    private void verifyVerboseString( final Tag30StrLastMkt tagData, final String oneElement ) {
        assertEquals( "Tag30StrLastMkt\n" +
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