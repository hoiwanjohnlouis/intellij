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
import com.hwtsllc.fixengine2022.datatypes.MyNumInGroupType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  454
 *  NoSecurityAltID
 *  NumInGroup
 *  <p>
 *  Number of SecurityAltID (455) entries.
 */
class Tag454NumNoSecurityAltIDTest {
    @Test
    void FIX0454Test() {
        FIX43 fixData = FIX43.FIX454_NUM_NO_SECURITY_ALT_ID;
        assertEquals( "454", fixData.toEnumIDString());
        assertEquals( "NO_SECURITY_ALT_ID", fixData.toEnumNameString());
        assertEquals( "NoSecurityAltID", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0454Test() {
        Tag454NumNoSecurityAltID tagData;
        int oneElement;

        oneElement = Tag454NumNoSecurityAltID.TESTA_NUM_NO_SECURITY_ALT_ID;
        tagData = new Tag454NumNoSecurityAltID( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag454NumNoSecurityAltID.TESTB_NUM_NO_SECURITY_ALT_ID;
        tagData = new Tag454NumNoSecurityAltID( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag454NumNoSecurityAltID tagData;
        int oneElement;

        oneElement = Tag454NumNoSecurityAltID.TESTA_NUM_NO_SECURITY_ALT_ID;
        tagData = new Tag454NumNoSecurityAltID( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag454NumNoSecurityAltID.TESTB_NUM_NO_SECURITY_ALT_ID;
        tagData = new Tag454NumNoSecurityAltID( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag454NumNoSecurityAltID tagData;
        int oneElement;

        oneElement = Tag454NumNoSecurityAltID.TESTB_NUM_NO_SECURITY_ALT_ID;
        tagData = new Tag454NumNoSecurityAltID( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag454NumNoSecurityAltID tagData;
        int oneElement;

        oneElement = Tag454NumNoSecurityAltID.TESTB_NUM_NO_SECURITY_ALT_ID;
        tagData = new Tag454NumNoSecurityAltID( new MyNumInGroupType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag454NumNoSecurityAltID tagData;
        int oneElement;

        oneElement = Tag454NumNoSecurityAltID.TESTB_NUM_NO_SECURITY_ALT_ID;
        tagData = new Tag454NumNoSecurityAltID( new MyNumInGroupType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag454NumNoSecurityAltID tagData;
        int oneElement;

        oneElement = Tag454NumNoSecurityAltID.TESTA_NUM_NO_SECURITY_ALT_ID;
        tagData = new Tag454NumNoSecurityAltID( new MyNumInGroupType( oneElement ) );
        assertEquals( "Tag454NumNoSecurityAltID\n" +
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