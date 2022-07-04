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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  148
 *  Headline
 *  String
 *  <p>
 *  The headline of a News message
 */
class Tag148StrHeadlineTest {
    @Test
    void FIX0148Test() {
        FIX41 fixData = FIX41.FIX148_STR_HEADLINE;
        assertEquals( "148", fixData.toEnumIDString());
        assertEquals( "HEADLINE", fixData.toEnumNameString());
        assertEquals( "Headline", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0148Test() {
        Tag148StrHeadline tagData;

        tagData = new Tag148StrHeadline(new MyStringType(Tag148StrHeadline.TESTA_STR_HEADLINE));
        assertEquals( Tag148StrHeadline.TESTA_STR_HEADLINE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag148StrHeadline(new MyStringType(Tag148StrHeadline.TESTB_STR_HEADLINE));
        assertEquals( Tag148StrHeadline.TESTB_STR_HEADLINE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag148StrHeadline tagData;

        tagData = new Tag148StrHeadline(new MyStringType(Tag148StrHeadline.TESTB_STR_HEADLINE));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag148StrHeadline tagData;

        tagData = new Tag148StrHeadline(new MyStringType(Tag148StrHeadline.TESTB_STR_HEADLINE));
        assertEquals( Tag148StrHeadline.TESTB_STR_HEADLINE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag148StrHeadline tagData;

        tagData = new Tag148StrHeadline(new MyStringType(Tag148StrHeadline.TESTB_STR_HEADLINE));
        assertEquals( tagData.toEnumIDString() + "=" + Tag148StrHeadline.TESTB_STR_HEADLINE,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag148StrHeadline tagData;

        tagData = new Tag148StrHeadline(new MyStringType(Tag148StrHeadline.TESTB_STR_HEADLINE));
        assertEquals( Tag148StrHeadline.TESTB_STR_HEADLINE,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag148StrHeadline tagData;

        tagData = new Tag148StrHeadline(new MyStringType(Tag148StrHeadline.TESTA_STR_HEADLINE));
        assertEquals( "Tag148StrHeadline\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag148StrHeadline.TESTA_STR_HEADLINE + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + Tag148StrHeadline.TESTA_STR_HEADLINE + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}