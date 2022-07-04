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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  909
 *  CollInquiryID
 *  String
 *  <p></p>
 *  Collateral Inquiry Identifier
 */
class Tag909StrCollInquiryIDTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX909_STR_COLL_INQUIRY_ID;
        assertEquals( "909", fixData.toEnumIDString());
        assertEquals( "COLL_INQUIRY_ID", fixData.toEnumNameString());
        assertEquals( "CollInquiryID", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0909Test() {
        Tag909StrCollInquiryID tagData;
        String oneElement;

        oneElement = Tag909StrCollInquiryID.TESTA_STR_COLL_INQUIRY_ID;
        tagData = new Tag909StrCollInquiryID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "909", tagData.toEnumIDString());
        assertEquals( "COLL_INQUIRY_ID", tagData.toEnumNameString());
        assertEquals( "CollInquiryID", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag909StrCollInquiryID.TESTB_STR_COLL_INQUIRY_ID;
        tagData = new Tag909StrCollInquiryID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag909StrCollInquiryID tagData;
        String oneElement;

        oneElement = Tag909StrCollInquiryID.TESTA_STR_COLL_INQUIRY_ID;
        tagData = new Tag909StrCollInquiryID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag909StrCollInquiryID.TESTB_STR_COLL_INQUIRY_ID;
        tagData = new Tag909StrCollInquiryID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag909StrCollInquiryID tagData;
        String oneElement;

        oneElement = Tag909StrCollInquiryID.TESTB_STR_COLL_INQUIRY_ID;
        tagData = new Tag909StrCollInquiryID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag909StrCollInquiryID tagData;
        String oneElement;

        oneElement = Tag909StrCollInquiryID.TESTB_STR_COLL_INQUIRY_ID;
        tagData = new Tag909StrCollInquiryID( new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag909StrCollInquiryID tagData;
        String oneElement;

        oneElement = Tag909StrCollInquiryID.TESTB_STR_COLL_INQUIRY_ID;
        tagData = new Tag909StrCollInquiryID(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag909StrCollInquiryID tagData;
        String oneElement;

        oneElement = Tag909StrCollInquiryID.TESTA_STR_COLL_INQUIRY_ID;
        tagData = new Tag909StrCollInquiryID( new MyStringType( oneElement ) );
        assertEquals( "Tag909StrCollInquiryID\n" +
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