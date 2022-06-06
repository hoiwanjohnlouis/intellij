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
 *  455
 *  SecurityAltID
 *  String
 *  <p>
 *  Alternate Security identifier value for this security of SecurityAltIDSource (456) type
 *  <p>
 *  (e.g. CUSIP, SEDOL, ISIN, etc).
 *  <p>
 *  Requires SecurityAltIDSource.
 */
class Tag455StrSecurityAltIDTest {
    @Test
    void FIX0455Test() {
        FIX43 fixData = FIX43.FIX455_STR_SECURITY_ALT_ID;
        assertEquals( "455", fixData.toFIXIDString());
        assertEquals( "SECURITY_ALT_ID", fixData.toFIXNameString());
        assertEquals( "SecurityAltID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0455Test() {
        Tag455StrSecurityAltID tagData;
        String oneElement;

        oneElement = Tag455StrSecurityAltID.TESTA_STR_SECURITY_ALT_ID;
        tagData = new Tag455StrSecurityAltID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag455StrSecurityAltID.TESTB_STR_SECURITY_ALT_ID;
        tagData = new Tag455StrSecurityAltID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag455StrSecurityAltID tagData;
        String oneElement;

        oneElement = Tag455StrSecurityAltID.TESTA_STR_SECURITY_ALT_ID;
        tagData = new Tag455StrSecurityAltID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag455StrSecurityAltID.TESTB_STR_SECURITY_ALT_ID;
        tagData = new Tag455StrSecurityAltID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag455StrSecurityAltID tagData;
        String oneElement;

        oneElement = Tag455StrSecurityAltID.TESTB_STR_SECURITY_ALT_ID;
        tagData = new Tag455StrSecurityAltID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag455StrSecurityAltID tagData;
        String oneElement;

        oneElement = Tag455StrSecurityAltID.TESTB_STR_SECURITY_ALT_ID;
        tagData = new Tag455StrSecurityAltID( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag455StrSecurityAltID tagData;
        String oneElement;

        oneElement = Tag455StrSecurityAltID.TESTB_STR_SECURITY_ALT_ID;
        tagData = new Tag455StrSecurityAltID(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag455StrSecurityAltID tagData;
        String oneElement;

        oneElement = Tag455StrSecurityAltID.TESTA_STR_SECURITY_ALT_ID;
        tagData = new Tag455StrSecurityAltID( new MyStringType( oneElement ) );
        assertEquals( "Tag455StrSecurityAltID\n" +
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