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
 *  604
 *  NoLegSecurityAltID
 *  String
 *  <p>
 *  Multileg instrument's individual  security’s NoSecurityAltID.
 *  <p>
 *  See NoSecurityAltID (454) field for description
 */
class Tag604StrNoLegSecurityAltIDTest {
    @Test
    void FIX0604Test() {
        FIX43 fixData = FIX43.FIX604_STR_NO_LEG_SECURITY_ALT_ID;
        assertEquals( "604", fixData.toEnumIDString());
        assertEquals( "NO_LEG_SECURITY_ALT_ID", fixData.toEnumNameString());
        assertEquals( "NoLegSecurityAltID", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0604Test() {
        Tag604StrNoLegSecurityAltID tagData;
        String oneElement;

        oneElement = Tag604StrNoLegSecurityAltID.TESTA_STR_NO_LEG_SECURITY_ALT_ID;
        tagData = new Tag604StrNoLegSecurityAltID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag604StrNoLegSecurityAltID.TESTB_STR_NO_LEG_SECURITY_ALT_ID;
        tagData = new Tag604StrNoLegSecurityAltID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag604StrNoLegSecurityAltID tagData;
        String oneElement;

        oneElement = Tag604StrNoLegSecurityAltID.TESTA_STR_NO_LEG_SECURITY_ALT_ID;
        tagData = new Tag604StrNoLegSecurityAltID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag604StrNoLegSecurityAltID.TESTB_STR_NO_LEG_SECURITY_ALT_ID;
        tagData = new Tag604StrNoLegSecurityAltID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag604StrNoLegSecurityAltID tagData;
        String oneElement;

        oneElement = Tag604StrNoLegSecurityAltID.TESTB_STR_NO_LEG_SECURITY_ALT_ID;
        tagData = new Tag604StrNoLegSecurityAltID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag604StrNoLegSecurityAltID tagData;
        String oneElement;

        oneElement = Tag604StrNoLegSecurityAltID.TESTB_STR_NO_LEG_SECURITY_ALT_ID;
        tagData = new Tag604StrNoLegSecurityAltID( new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag604StrNoLegSecurityAltID tagData;
        String oneElement;

        oneElement = Tag604StrNoLegSecurityAltID.TESTB_STR_NO_LEG_SECURITY_ALT_ID;
        tagData = new Tag604StrNoLegSecurityAltID(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag604StrNoLegSecurityAltID tagData;
        String oneElement;

        oneElement = Tag604StrNoLegSecurityAltID.TESTA_STR_NO_LEG_SECURITY_ALT_ID;
        tagData = new Tag604StrNoLegSecurityAltID( new MyStringType( oneElement ) );
        assertEquals( "Tag604StrNoLegSecurityAltID\n" +
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