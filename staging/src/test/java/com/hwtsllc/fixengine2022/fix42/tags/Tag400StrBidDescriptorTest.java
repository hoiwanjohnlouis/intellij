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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  400
 *  BidDescriptor
 *  String
 *  <p>
 *  BidDescriptor value.
 *  <p></p>
 *  Usage depends upon BidDescriptorTyp (399).
 *  <p>
 *  If BidDescriptorType = 1
 *  Industrials etc - Free text
 *  <p>
 *  If BidDescriptorType = 2
 *  "FR" etc - ISO Country Codes
 *  <p>
 *  If BidDescriptorType = 3
 *  FT00, FT250, STOX - Free text
 */
class Tag400StrBidDescriptorTest {
    @Test
    void PrintTest() {
        Tag400StrBidDescriptor tagData;
        String oneElement;

        oneElement = Tag400StrBidDescriptor.TESTA_STR_BID_DESCRIPTOR;
        tagData = new Tag400StrBidDescriptor( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag400StrBidDescriptor.TESTB_STR_BID_DESCRIPTOR;
        tagData = new Tag400StrBidDescriptor( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTagTest() {
        Tag400StrBidDescriptor tagData;
        String oneElement;

        oneElement = Tag400StrBidDescriptor.TESTA_STR_BID_DESCRIPTOR;
        tagData = new Tag400StrBidDescriptor( new MyStringType( oneElement ) );
        verifyAll( tagData, oneElement );

        oneElement = Tag400StrBidDescriptor.TESTB_STR_BID_DESCRIPTOR;
        tagData = new Tag400StrBidDescriptor( new MyStringType( oneElement ) );
        verifyAll( tagData, oneElement );
    }

    private void verifyAll( final Tag400StrBidDescriptor tagData, final String oneElement ) {
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag400StrBidDescriptor tagData ) {
        assertEquals( "FIX400_STR_BID_DESCRIPTOR", tagData.toEnumLabelString());
        assertEquals( "400", tagData.toEnumIDString());
        assertEquals( "BID_DESCRIPTOR", tagData.toEnumNameString());
        assertEquals( "BidDescriptor", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag400StrBidDescriptor tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }

    private void verifyValuePairString( final Tag400StrBidDescriptor tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag400StrBidDescriptor tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    private void verifyVerboseString( final Tag400StrBidDescriptor tagData ) {
        assertEquals( "Tag400StrBidDescriptor\n" +
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