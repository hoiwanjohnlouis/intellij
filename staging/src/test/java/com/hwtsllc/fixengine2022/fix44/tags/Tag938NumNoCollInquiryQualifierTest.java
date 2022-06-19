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
import com.hwtsllc.fixengine2022.datatypes.MyNumInGroupType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  938
 *  NoCollInquiryQualifier
 *  NumInGroup
 *  <p></p>
 *  Number of CollInquiryQualifier entries in a repeating group.
 */
class Tag938NumNoCollInquiryQualifierTest {
    @Test
    void FIX0938Test() {
        FIX44 fixData = FIX44.FIX938_NUM_NO_COLL_INQUIRY_QUALIFIER;
        assertEquals( "938", fixData.toFIXIDString());
        assertEquals( "NO_COLL_INQUIRY_QUALIFIER", fixData.toFIXNameString());
        assertEquals( "NoCollInquiryQualifier", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0938Test() {
        Tag938NumNoCollInquiryQualifier tagData;
        int oneElement;

        oneElement = Tag938NumNoCollInquiryQualifier.TESTA_NUM_NO_COLL_INQUIRY_QUALIFIER;
        tagData = new Tag938NumNoCollInquiryQualifier( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "938", tagData.toFIXIDString());
        assertEquals( "NO_COLL_INQUIRY_QUALIFIER", tagData.toFIXNameString());
        assertEquals( "NoCollInquiryQualifier", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        oneElement = Tag938NumNoCollInquiryQualifier.TESTB_NUM_NO_COLL_INQUIRY_QUALIFIER;
        tagData = new Tag938NumNoCollInquiryQualifier( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag938NumNoCollInquiryQualifier tagData;
        int oneElement;

        oneElement = Tag938NumNoCollInquiryQualifier.TESTA_NUM_NO_COLL_INQUIRY_QUALIFIER;
        tagData = new Tag938NumNoCollInquiryQualifier( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag938NumNoCollInquiryQualifier.TESTB_NUM_NO_COLL_INQUIRY_QUALIFIER;
        tagData = new Tag938NumNoCollInquiryQualifier( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag938NumNoCollInquiryQualifier tagData;
        int oneElement;

        oneElement = Tag938NumNoCollInquiryQualifier.TESTB_NUM_NO_COLL_INQUIRY_QUALIFIER;
        tagData = new Tag938NumNoCollInquiryQualifier( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag938NumNoCollInquiryQualifier tagData;
        int oneElement;

        oneElement = Tag938NumNoCollInquiryQualifier.TESTB_NUM_NO_COLL_INQUIRY_QUALIFIER;
        tagData = new Tag938NumNoCollInquiryQualifier( new MyNumInGroupType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag938NumNoCollInquiryQualifier tagData;
        int oneElement;

        oneElement = Tag938NumNoCollInquiryQualifier.TESTB_NUM_NO_COLL_INQUIRY_QUALIFIER;
        tagData = new Tag938NumNoCollInquiryQualifier( new MyNumInGroupType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag938NumNoCollInquiryQualifier tagData;
        int oneElement;

        oneElement = Tag938NumNoCollInquiryQualifier.TESTA_NUM_NO_COLL_INQUIRY_QUALIFIER;
        tagData = new Tag938NumNoCollInquiryQualifier( new MyNumInGroupType( oneElement ) );
        assertEquals( "Tag938NumNoCollInquiryQualifier\n" +
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