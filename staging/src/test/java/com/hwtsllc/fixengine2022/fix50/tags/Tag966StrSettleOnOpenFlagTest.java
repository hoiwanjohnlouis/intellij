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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  966
 *  SettleOnOpenFlag
 *  String
 *  <p>
 *  Indicator to determine if instrument is settle on open
 */
class Tag966StrSettleOnOpenFlagTest {
    @Test
    void FIX0966Test() {
        FIX50 fixData = FIX50.FIX966_STR_SETTLE_ON_OPEN_FLAG;
        assertEquals( "966", fixData.toEnumIDString());
        assertEquals( "SETTLE_ON_OPEN_FLAG", fixData.toEnumNameString());
        assertEquals( "SettleOnOpenFlag", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0966Test() {
        Tag966StrSettleOnOpenFlag tagData;
        String oneElement;

        oneElement = "Chloe Kim";
        tagData = new Tag966StrSettleOnOpenFlag( new MyStringType(oneElement) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag966StrSettleOnOpenFlag.TESTA_STR_SETTLE_ON_OPEN_FLAG;
        tagData = new Tag966StrSettleOnOpenFlag( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag966StrSettleOnOpenFlag.TESTB_STR_SETTLE_ON_OPEN_FLAG;
        tagData = new Tag966StrSettleOnOpenFlag( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag966StrSettleOnOpenFlag tagData;
        String oneElement;

        oneElement = Tag966StrSettleOnOpenFlag.TESTA_STR_SETTLE_ON_OPEN_FLAG;
        tagData = new Tag966StrSettleOnOpenFlag( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag966StrSettleOnOpenFlag.TESTB_STR_SETTLE_ON_OPEN_FLAG;
        tagData = new Tag966StrSettleOnOpenFlag( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag966StrSettleOnOpenFlag tagData;
        String oneElement;

        oneElement = Tag966StrSettleOnOpenFlag.TESTB_STR_SETTLE_ON_OPEN_FLAG;
        tagData = new Tag966StrSettleOnOpenFlag( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag966StrSettleOnOpenFlag tagData;
        String oneElement;

        oneElement = Tag966StrSettleOnOpenFlag.TESTB_STR_SETTLE_ON_OPEN_FLAG;
        tagData = new Tag966StrSettleOnOpenFlag( new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag966StrSettleOnOpenFlag tagData;
        String oneElement;

        oneElement = Tag966StrSettleOnOpenFlag.TESTB_STR_SETTLE_ON_OPEN_FLAG;
        tagData = new Tag966StrSettleOnOpenFlag( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag966StrSettleOnOpenFlag tagData;
        String oneElement;

        oneElement = Tag966StrSettleOnOpenFlag.TESTA_STR_SETTLE_ON_OPEN_FLAG;
        tagData = new Tag966StrSettleOnOpenFlag( new MyStringType( oneElement ) );
        assertEquals( "Tag966StrSettleOnOpenFlag\n" +
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