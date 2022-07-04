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

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  23
 *  IOIID
 *  String
 *  <p></p>
 *  Unique identifier of IOI message.
 *  <p></p>
 *  (Prior to FIX 4.1 this field was of type int)
 */
class Tag23StrIOIIDTest {
    @Test
    void FIX0023Test() {
        FIX27 fixData = FIX27.FIX23_STR_IOI_ID;
        assertEquals( "IOI_ID", fixData.toEnumNameString());
        assertEquals( "23", fixData.toEnumIDString());
        assertEquals( "IOIID", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0023Test() {
        Tag23StrIOIID tagData;
        String oneElement;

        oneElement = "A";
        tagData = new Tag23StrIOIID(new MyStringType( oneElement ) );
        verifyTagInformation( oneElement, tagData );

        oneElement = Tag23StrIOIID.TESTA_STR_IOI_ID;
        tagData = new Tag23StrIOIID(new MyStringType( oneElement ));
        verifyTagInformation( oneElement, tagData );

        oneElement = Tag23StrIOIID.TESTB_STR_IOI_ID;
        tagData = new Tag23StrIOIID(new MyStringType( oneElement ));
        verifyTagInformation( oneElement, tagData );
    }

    private void verifyTagInformation( String oneElement, Tag23StrIOIID tagData ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "IOI_ID", tagData.toEnumNameString());
        assertEquals( "23", tagData.toEnumIDString());
        assertEquals( "IOIID", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void PrintFIXTagTest() {
        Tag23StrIOIID tagData;
        String oneElement;

        oneElement = Tag23StrIOIID.TESTA_STR_IOI_ID;
        tagData = new Tag23StrIOIID(new MyStringType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag23StrIOIID.TESTB_STR_IOI_ID;
        tagData = new Tag23StrIOIID(new MyStringType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag23StrIOIID tagData;
        String oneElement;

        oneElement = Tag23StrIOIID.TESTB_STR_IOI_ID;
        tagData = new Tag23StrIOIID(new MyStringType( oneElement ));
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag23StrIOIID tagData;
        String oneElement;

        oneElement = Tag23StrIOIID.TESTB_STR_IOI_ID;
        tagData = new Tag23StrIOIID(new MyStringType( oneElement ));
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag23StrIOIID tagData;
        String oneElement;

        oneElement = Tag23StrIOIID.TESTB_STR_IOI_ID;
        tagData = new Tag23StrIOIID(new MyStringType( oneElement ));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag23StrIOIID tagData;
        String oneElement;

        oneElement = Tag23StrIOIID.TESTA_STR_IOI_ID;
        tagData = new Tag23StrIOIID(new MyStringType( oneElement ));
        assertEquals( "Tag23StrIOIID\n" +
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