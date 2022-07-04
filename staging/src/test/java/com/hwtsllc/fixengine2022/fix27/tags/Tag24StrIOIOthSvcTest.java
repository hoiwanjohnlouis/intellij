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
 *  24
 *  IOIOthSvc  (no longer used)
 *  char
 *  <p></p>
 *  Deprecated in FIX.4.1
 */
// @Deprecated
class Tag24StrIOIOthSvcTest {
    @Test
    void FIXTest() {
        FIX27 fixData = FIX27.FIX24_STR_IOI_OTH_SVC;
        assertEquals( "IOI_OTH_SVC", fixData.toEnumNameString());
        assertEquals( "24", fixData.toEnumIDString());
        assertEquals( "IOIOthSvc (no longer used)", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0024Test() {
        Tag24StrIOIOthSvc tagData;
        String oneElement;

        oneElement = "A";
        tagData = new Tag24StrIOIOthSvc(new MyStringType( oneElement ) );
        verifyTagInformation( oneElement, tagData );

        oneElement = Tag24StrIOIOthSvc.TESTA_STR_IOI_OTH_SVC;
        tagData = new Tag24StrIOIOthSvc(new MyStringType( oneElement ) );
        verifyTagInformation( oneElement, tagData );

        oneElement = Tag24StrIOIOthSvc.TESTB_STR_IOI_OTH_SVC;
        tagData = new Tag24StrIOIOthSvc(new MyStringType( oneElement ) );
        verifyTagInformation( oneElement, tagData );
    }

    private void verifyTagInformation( String oneElement, Tag24StrIOIOthSvc tagData ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "IOI_OTH_SVC", tagData.toEnumNameString());
        assertEquals( "24", tagData.toEnumIDString());
        assertEquals( "IOIOthSvc (no longer used)", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void PrintFIXTagTest() {
        Tag24StrIOIOthSvc tagData;
        String oneElement;

        oneElement = Tag24StrIOIOthSvc.TESTA_STR_IOI_OTH_SVC;
        tagData = new Tag24StrIOIOthSvc(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag24StrIOIOthSvc.TESTB_STR_IOI_OTH_SVC;
        tagData = new Tag24StrIOIOthSvc(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag24StrIOIOthSvc tagData;
        String oneElement;

        oneElement = Tag24StrIOIOthSvc.TESTB_STR_IOI_OTH_SVC;
        tagData = new Tag24StrIOIOthSvc(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag24StrIOIOthSvc tagData;
        String oneElement;

        oneElement = Tag24StrIOIOthSvc.TESTB_STR_IOI_OTH_SVC;
        tagData = new Tag24StrIOIOthSvc(new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag24StrIOIOthSvc tagData;
        String oneElement;

        oneElement = Tag24StrIOIOthSvc.TESTB_STR_IOI_OTH_SVC;
        tagData = new Tag24StrIOIOthSvc(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag24StrIOIOthSvc tagData;
        String oneElement;

        oneElement = Tag24StrIOIOthSvc.TESTA_STR_IOI_OTH_SVC;
        tagData = new Tag24StrIOIOthSvc(new MyStringType( oneElement ) );
        assertEquals( "Tag24StrIOIOthSvc\n" +
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