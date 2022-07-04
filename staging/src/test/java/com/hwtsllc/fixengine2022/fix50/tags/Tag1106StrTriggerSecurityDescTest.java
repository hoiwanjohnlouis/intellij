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
 *  1106
 *  TriggerSecurityDesc
 *  String
 *  <p>
 *  Defines the security description of the security whose prices will be tracked by the trigger logic.
 */
class Tag1106StrTriggerSecurityDescTest {
    @Test
    void FIX1106Test() {
        FIX50 fixData = FIX50.FIX1106_STR_TRIGGER_SECURITY_DESC;
        assertEquals( "1106", fixData.toEnumIDString());
        assertEquals( "TRIGGER_SECURITY_DESC", fixData.toEnumNameString());
        assertEquals( "TriggerSecurityDesc", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag1106Test() {
        Tag1106StrTriggerSecurityDesc tagData;
        String oneElement;

        oneElement = "Chloe Kim";
        tagData = new Tag1106StrTriggerSecurityDesc( new MyStringType(oneElement) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag1106StrTriggerSecurityDesc.TESTA_STR_TRIGGER_SECURITY_DESC;
        tagData = new Tag1106StrTriggerSecurityDesc( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag1106StrTriggerSecurityDesc.TESTB_STR_TRIGGER_SECURITY_DESC;
        tagData = new Tag1106StrTriggerSecurityDesc( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag1106StrTriggerSecurityDesc tagData;
        String oneElement;

        oneElement = Tag1106StrTriggerSecurityDesc.TESTA_STR_TRIGGER_SECURITY_DESC;
        tagData = new Tag1106StrTriggerSecurityDesc( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag1106StrTriggerSecurityDesc.TESTB_STR_TRIGGER_SECURITY_DESC;
        tagData = new Tag1106StrTriggerSecurityDesc( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag1106StrTriggerSecurityDesc tagData;
        String oneElement;

        oneElement = Tag1106StrTriggerSecurityDesc.TESTB_STR_TRIGGER_SECURITY_DESC;
        tagData = new Tag1106StrTriggerSecurityDesc( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1106StrTriggerSecurityDesc tagData;
        String oneElement;

        oneElement = Tag1106StrTriggerSecurityDesc.TESTB_STR_TRIGGER_SECURITY_DESC;
        tagData = new Tag1106StrTriggerSecurityDesc( new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag1106StrTriggerSecurityDesc tagData;
        String oneElement;

        oneElement = Tag1106StrTriggerSecurityDesc.TESTB_STR_TRIGGER_SECURITY_DESC;
        tagData = new Tag1106StrTriggerSecurityDesc( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1106StrTriggerSecurityDesc tagData;
        String oneElement;

        oneElement = Tag1106StrTriggerSecurityDesc.TESTA_STR_TRIGGER_SECURITY_DESC;
        tagData = new Tag1106StrTriggerSecurityDesc( new MyStringType( oneElement ) );
        assertEquals( "Tag1106StrTriggerSecurityDesc\n" +
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