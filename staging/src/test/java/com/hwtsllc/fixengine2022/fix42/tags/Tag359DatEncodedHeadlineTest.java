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
import com.hwtsllc.fixengine2022.datatypes.MyDataType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  359
 *  EncodedHeadline
 *  data
 *  <p>
 *  Encoded (non-ASCII characters) representation of the Headline (148) field
 *  in the encoded format specified via the MessageEncoding (347) field.
 *  <p></p>
 *  If used, the ASCII (English) representation should also be specified in the Headline field.
 */
class Tag359DatEncodedHeadlineTest {
    @Test
    void FIX0359Test() {
        FIX42 fixData = FIX42.FIX359_DAT_ENCODED_HEADLINE;
        assertEquals( "359", fixData.toEnumIDString());
        assertEquals( "ENCODED_HEADLINE", fixData.toEnumNameString());
        assertEquals( "EncodedHeadline", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0359Test() {
        Tag359DatEncodedHeadline tagData;
        String oneElement;

        oneElement = Tag359DatEncodedHeadline.TESTA_DAT_ENCODED_HEADLINE;
        tagData = new Tag359DatEncodedHeadline( new MyDataType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_DAT_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag359DatEncodedHeadline.TESTB_DAT_ENCODED_HEADLINE;
        tagData = new Tag359DatEncodedHeadline( new MyDataType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_DAT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag359DatEncodedHeadline tagData;
        String oneElement;

        oneElement = Tag359DatEncodedHeadline.TESTA_DAT_ENCODED_HEADLINE;
        tagData = new Tag359DatEncodedHeadline( new MyDataType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag359DatEncodedHeadline.TESTB_DAT_ENCODED_HEADLINE;
        tagData = new Tag359DatEncodedHeadline( new MyDataType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag359DatEncodedHeadline tagData;
        String oneElement;

        oneElement = Tag359DatEncodedHeadline.TESTB_DAT_ENCODED_HEADLINE;
        tagData = new Tag359DatEncodedHeadline( new MyDataType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag359DatEncodedHeadline tagData;
        String oneElement;

        oneElement = Tag359DatEncodedHeadline.TESTB_DAT_ENCODED_HEADLINE;
        tagData = new Tag359DatEncodedHeadline( new MyDataType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag359DatEncodedHeadline tagData;
        String oneElement;

        oneElement = Tag359DatEncodedHeadline.TESTB_DAT_ENCODED_HEADLINE;
        tagData = new Tag359DatEncodedHeadline( new MyDataType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag359DatEncodedHeadline tagData;
        String oneElement;

        oneElement = Tag359DatEncodedHeadline.TESTA_DAT_ENCODED_HEADLINE;
        tagData = new Tag359DatEncodedHeadline( new MyDataType( oneElement ) );
        assertEquals( "Tag359DatEncodedHeadline\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString() );
    }
}