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
 *  762
 *  SecuritySubType
 *  String
 *  <p></p>
 *  Sub-type qualification/identification of the SecurityType
 *  (e.g. for SecurityType="REPO"),
 *  or the CFICode if SecurityType is not specified.
 *  <p></p>
 *  If specified, SecurityType or CFICode is required.
 *  <p>
 *  <p>    Example Values:
 *  <p>    General = General Collateral (for SecurityType=REPO)
 *  <p>    For SecurityType="MLEG" markets can provide the name of the option
 *  <p>    or futures strategy, such as Calendar, Vertical, Butterfly, etc.
 *  <p>    NOTE: Additional values may be used by mutual agreement of the counterparties
 */
class Tag762StrSecuritySubTypeTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX762_STR_SECURITY_SUB_TYPE;
        assertEquals( "762", fixData.toFIXIDString());
        assertEquals( "SECURITY_SUB_TYPE", fixData.toFIXNameString());
        assertEquals( "SecuritySubType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0762Test() {
        Tag762StrSecuritySubType tagData;
        String oneElement;

        oneElement = Tag762StrSecuritySubType.TESTA_STR_SECURITY_SUB_TYPE;
        tagData = new Tag762StrSecuritySubType( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "762", tagData.toFIXIDString());
        assertEquals( "SECURITY_SUB_TYPE", tagData.toFIXNameString());
        assertEquals( "SecuritySubType", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        oneElement = Tag762StrSecuritySubType.TESTB_STR_SECURITY_SUB_TYPE;
        tagData = new Tag762StrSecuritySubType( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag762StrSecuritySubType tagData;
        String oneElement;

        oneElement = Tag762StrSecuritySubType.TESTA_STR_SECURITY_SUB_TYPE;
        tagData = new Tag762StrSecuritySubType( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag762StrSecuritySubType.TESTB_STR_SECURITY_SUB_TYPE;
        tagData = new Tag762StrSecuritySubType( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag762StrSecuritySubType tagData;
        String oneElement;

        oneElement = Tag762StrSecuritySubType.TESTB_STR_SECURITY_SUB_TYPE;
        tagData = new Tag762StrSecuritySubType( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag762StrSecuritySubType tagData;
        String oneElement;

        oneElement = Tag762StrSecuritySubType.TESTB_STR_SECURITY_SUB_TYPE;
        tagData = new Tag762StrSecuritySubType( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag762StrSecuritySubType tagData;
        String oneElement;

        oneElement = Tag762StrSecuritySubType.TESTB_STR_SECURITY_SUB_TYPE;
        tagData = new Tag762StrSecuritySubType(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag762StrSecuritySubType tagData;
        String oneElement;

        oneElement = Tag762StrSecuritySubType.TESTA_STR_SECURITY_SUB_TYPE;
        tagData = new Tag762StrSecuritySubType( new MyStringType( oneElement ) );
        assertEquals( "Tag762StrSecuritySubType\n" +
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