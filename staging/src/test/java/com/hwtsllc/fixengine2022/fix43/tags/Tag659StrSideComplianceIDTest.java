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
 *  659
 *  SideComplianceID
 *  String
 *  <p>
 *  ID within repeating group of sides which is used to represent this transaction for compliance purposes
 *  <p>
 *  (e.g. OATS reporting).
 */
class Tag659StrSideComplianceIDTest {
    @Test
    void FIX0659Test() {
        FIX43 fixData = FIX43.FIX659_STR_SIDE_COMPLIANCE_ID;
        assertEquals( "659", fixData.toEnumIDString());
        assertEquals( "SIDE_COMPLIANCE_ID", fixData.toEnumNameString());
        assertEquals( "SideComplianceID", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0659Test() {
        Tag659StrSideComplianceID tagData;
        String oneElement;

        oneElement = Tag659StrSideComplianceID.TESTA_STR_SIDE_COMPLIANCE_ID;
        tagData = new Tag659StrSideComplianceID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag659StrSideComplianceID.TESTB_STR_SIDE_COMPLIANCE_ID;
        tagData = new Tag659StrSideComplianceID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag659StrSideComplianceID tagData;
        String oneElement;

        oneElement = Tag659StrSideComplianceID.TESTA_STR_SIDE_COMPLIANCE_ID;
        tagData = new Tag659StrSideComplianceID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag659StrSideComplianceID.TESTB_STR_SIDE_COMPLIANCE_ID;
        tagData = new Tag659StrSideComplianceID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag659StrSideComplianceID tagData;
        String oneElement;

        oneElement = Tag659StrSideComplianceID.TESTB_STR_SIDE_COMPLIANCE_ID;
        tagData = new Tag659StrSideComplianceID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag659StrSideComplianceID tagData;
        String oneElement;

        oneElement = Tag659StrSideComplianceID.TESTB_STR_SIDE_COMPLIANCE_ID;
        tagData = new Tag659StrSideComplianceID( new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag659StrSideComplianceID tagData;
        String oneElement;

        oneElement = Tag659StrSideComplianceID.TESTB_STR_SIDE_COMPLIANCE_ID;
        tagData = new Tag659StrSideComplianceID(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag659StrSideComplianceID tagData;
        String oneElement;

        oneElement = Tag659StrSideComplianceID.TESTA_STR_SIDE_COMPLIANCE_ID;
        tagData = new Tag659StrSideComplianceID( new MyStringType( oneElement ) );
        assertEquals( "Tag659StrSideComplianceID\n" +
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