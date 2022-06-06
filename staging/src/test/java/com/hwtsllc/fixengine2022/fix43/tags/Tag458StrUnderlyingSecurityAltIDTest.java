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
 *  458
 *  UnderlyingSecurityAltID
 *  String
 *  <p>
 *  Alternate Security identifier value for this underlying security of
 *  UnderlyingSecurityAltIDSource (459)
 *  <p>
 *  type (e.g. CUSIP, SEDOL, ISIN, etc).
 *  <p>
 *  Requires UnderlyingSecurityAltIDSource.
 */
class Tag458StrUnderlyingSecurityAltIDTest {
    @Test
    void FIX0458Test() {
        FIX43 fixData = FIX43.FIX458_STR_UNDERLYING_SECURITY_ALT_ID;
        assertEquals( "458", fixData.toFIXIDString());
        assertEquals( "UNDERLYING_SECURITY_ALT_ID", fixData.toFIXNameString());
        assertEquals( "UnderlyingSecurityAltID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0458Test() {
        Tag458StrUnderlyingSecurityAltID tagData;
        String oneElement;

        oneElement = Tag458StrUnderlyingSecurityAltID.TESTA_STR_UNDERLYING_SECURITY_ALT_ID;
        tagData = new Tag458StrUnderlyingSecurityAltID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag458StrUnderlyingSecurityAltID.TESTB_STR_UNDERLYING_SECURITY_ALT_ID;
        tagData = new Tag458StrUnderlyingSecurityAltID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag458StrUnderlyingSecurityAltID tagData;
        String oneElement;

        oneElement = Tag458StrUnderlyingSecurityAltID.TESTA_STR_UNDERLYING_SECURITY_ALT_ID;
        tagData = new Tag458StrUnderlyingSecurityAltID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag458StrUnderlyingSecurityAltID.TESTB_STR_UNDERLYING_SECURITY_ALT_ID;
        tagData = new Tag458StrUnderlyingSecurityAltID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag458StrUnderlyingSecurityAltID tagData;
        String oneElement;

        oneElement = Tag458StrUnderlyingSecurityAltID.TESTB_STR_UNDERLYING_SECURITY_ALT_ID;
        tagData = new Tag458StrUnderlyingSecurityAltID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag458StrUnderlyingSecurityAltID tagData;
        String oneElement;

        oneElement = Tag458StrUnderlyingSecurityAltID.TESTB_STR_UNDERLYING_SECURITY_ALT_ID;
        tagData = new Tag458StrUnderlyingSecurityAltID( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag458StrUnderlyingSecurityAltID tagData;
        String oneElement;

        oneElement = Tag458StrUnderlyingSecurityAltID.TESTB_STR_UNDERLYING_SECURITY_ALT_ID;
        tagData = new Tag458StrUnderlyingSecurityAltID(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag458StrUnderlyingSecurityAltID tagData;
        String oneElement;

        oneElement = Tag458StrUnderlyingSecurityAltID.TESTA_STR_UNDERLYING_SECURITY_ALT_ID;
        tagData = new Tag458StrUnderlyingSecurityAltID( new MyStringType( oneElement ) );
        assertEquals( "Tag458StrUnderlyingSecurityAltID\n" +
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