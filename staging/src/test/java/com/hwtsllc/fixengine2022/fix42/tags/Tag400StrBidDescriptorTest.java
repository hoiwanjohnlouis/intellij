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

import com.hwtsllc.fixengine2022.datatypes.FIX42;
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
    void FIX0400Test() {
        FIX42 fixData = FIX42.FIX400_STR_BID_DESCRIPTOR;
        assertEquals( "400", fixData.toFIXIDString());
        assertEquals( "BID_DESCRIPTOR", fixData.toFIXNameString());
        assertEquals( "BidDescriptor", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0400Test() {
        Tag400StrBidDescriptor tagData;
        String oneElement;

        oneElement = Tag400StrBidDescriptor.TESTA_STR_BID_DESCRIPTOR;
        tagData = new Tag400StrBidDescriptor( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag400StrBidDescriptor.TESTB_STR_BID_DESCRIPTOR;
        tagData = new Tag400StrBidDescriptor( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag400StrBidDescriptor tagData;
        String oneElement;

        oneElement = Tag400StrBidDescriptor.TESTB_STR_BID_DESCRIPTOR;
        tagData = new Tag400StrBidDescriptor( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag400StrBidDescriptor tagData;
        String oneElement;

        oneElement = Tag400StrBidDescriptor.TESTB_STR_BID_DESCRIPTOR;
        tagData = new Tag400StrBidDescriptor( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag400StrBidDescriptor tagData;
        String oneElement;

        oneElement = Tag400StrBidDescriptor.TESTB_STR_BID_DESCRIPTOR;
        tagData = new Tag400StrBidDescriptor( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag400StrBidDescriptor tagData;
        String oneElement;

        oneElement = Tag400StrBidDescriptor.TESTB_STR_BID_DESCRIPTOR;
        tagData = new Tag400StrBidDescriptor( new MyStringType(oneElement) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag400StrBidDescriptor tagData;
        String oneElement;

        oneElement = Tag400StrBidDescriptor.TESTA_STR_BID_DESCRIPTOR;
        tagData = new Tag400StrBidDescriptor( new MyStringType(oneElement) );
        assertEquals( "Tag400StrBidDescriptor\n" +
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