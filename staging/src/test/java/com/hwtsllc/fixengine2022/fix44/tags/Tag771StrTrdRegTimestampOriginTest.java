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
 *  771
 *  TrdRegTimestampOrigin
 *  String
 */
class Tag771StrTrdRegTimestampOriginTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX771_STR_TRD_REG_TIMESTAMP_ORIGIN;
        assertEquals( "771", fixData.toEnumIDString());
        assertEquals( "TRD_REG_TIMESTAMP_ORIGIN", fixData.toEnumNameString());
        assertEquals( "TrdRegTimestampOrigin", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0771Test() {
        Tag771StrTrdRegTimestampOrigin tagData;
        String oneElement;

        oneElement = Tag771StrTrdRegTimestampOrigin.TESTA_STR_TRD_REG_TIMESTAMP_ORIGIN;
        tagData = new Tag771StrTrdRegTimestampOrigin( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "771", tagData.toEnumIDString());
        assertEquals( "TRD_REG_TIMESTAMP_ORIGIN", tagData.toEnumNameString());
        assertEquals( "TrdRegTimestampOrigin", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag771StrTrdRegTimestampOrigin.TESTB_STR_TRD_REG_TIMESTAMP_ORIGIN;
        tagData = new Tag771StrTrdRegTimestampOrigin( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag771StrTrdRegTimestampOrigin tagData;
        String oneElement;

        oneElement = Tag771StrTrdRegTimestampOrigin.TESTA_STR_TRD_REG_TIMESTAMP_ORIGIN;
        tagData = new Tag771StrTrdRegTimestampOrigin( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag771StrTrdRegTimestampOrigin.TESTB_STR_TRD_REG_TIMESTAMP_ORIGIN;
        tagData = new Tag771StrTrdRegTimestampOrigin( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag771StrTrdRegTimestampOrigin tagData;
        String oneElement;

        oneElement = Tag771StrTrdRegTimestampOrigin.TESTB_STR_TRD_REG_TIMESTAMP_ORIGIN;
        tagData = new Tag771StrTrdRegTimestampOrigin( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag771StrTrdRegTimestampOrigin tagData;
        String oneElement;

        oneElement = Tag771StrTrdRegTimestampOrigin.TESTB_STR_TRD_REG_TIMESTAMP_ORIGIN;
        tagData = new Tag771StrTrdRegTimestampOrigin( new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag771StrTrdRegTimestampOrigin tagData;
        String oneElement;

        oneElement = Tag771StrTrdRegTimestampOrigin.TESTB_STR_TRD_REG_TIMESTAMP_ORIGIN;
        tagData = new Tag771StrTrdRegTimestampOrigin(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag771StrTrdRegTimestampOrigin tagData;
        String oneElement;

        oneElement = Tag771StrTrdRegTimestampOrigin.TESTA_STR_TRD_REG_TIMESTAMP_ORIGIN;
        tagData = new Tag771StrTrdRegTimestampOrigin( new MyStringType( oneElement ) );
        assertEquals( "Tag771StrTrdRegTimestampOrigin\n" +
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