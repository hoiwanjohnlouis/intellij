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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  620
 *  LegSecurityDesc
 *  String
 *  <p>
 *  Multileg instrument's individual  security’s SecurityDesc.
 *  <p>
 *  See SecurityDesc (07) field for description
 */
class Tag620StrLegSecurityDescTest {
    @Test
    void FIX0620Test() {
        FIX43 fixData = FIX43.FIX620_STR_LEG_SECURITY_DESC;
        assertEquals( "620", fixData.toEnumIDString());
        assertEquals( "LEG_SECURITY_DESC", fixData.toEnumNameString());
        assertEquals( "LegSecurityDesc", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0620Test() {
        Tag620StrLegSecurityDesc tagData;
        String oneElement;

        oneElement = Tag620StrLegSecurityDesc.TESTA_STR_LEG_SECURITY_DESC;
        tagData = new Tag620StrLegSecurityDesc( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag620StrLegSecurityDesc.TESTB_STR_LEG_SECURITY_DESC;
        tagData = new Tag620StrLegSecurityDesc( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag620StrLegSecurityDesc tagData;
        String oneElement;

        oneElement = Tag620StrLegSecurityDesc.TESTA_STR_LEG_SECURITY_DESC;
        tagData = new Tag620StrLegSecurityDesc( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag620StrLegSecurityDesc.TESTB_STR_LEG_SECURITY_DESC;
        tagData = new Tag620StrLegSecurityDesc( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag620StrLegSecurityDesc tagData;
        String oneElement;

        oneElement = Tag620StrLegSecurityDesc.TESTB_STR_LEG_SECURITY_DESC;
        tagData = new Tag620StrLegSecurityDesc( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag620StrLegSecurityDesc tagData;
        String oneElement;

        oneElement = Tag620StrLegSecurityDesc.TESTB_STR_LEG_SECURITY_DESC;
        tagData = new Tag620StrLegSecurityDesc( new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag620StrLegSecurityDesc tagData;
        String oneElement;

        oneElement = Tag620StrLegSecurityDesc.TESTB_STR_LEG_SECURITY_DESC;
        tagData = new Tag620StrLegSecurityDesc(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag620StrLegSecurityDesc tagData;
        String oneElement;

        oneElement = Tag620StrLegSecurityDesc.TESTA_STR_LEG_SECURITY_DESC;
        tagData = new Tag620StrLegSecurityDesc( new MyStringType( oneElement ) );
        assertEquals( "Tag620StrLegSecurityDesc\n" +
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