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
import com.hwtsllc.fixengine2022.fix42.tags.Tag454NumNoSecurityAltID;
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
        assertEquals( "454", fixData.toFIXIDString());
        assertEquals( "NO_SECURITY_ALT_ID", fixData.toFIXNameString());
        assertEquals( "NoSecurityAltID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0454Test() {
        Tag454NumNoSecurityAltID tagData;

    }
    @Test
    void PrintFIXTagTest() {
        Tag454NumNoSecurityAltID tagData;
        int oneElement;

        oneElement = Tag454NumNoSecurityAltID.TESTA_NUM_NO_ROUTING_IDS;
        tagData = new Tag454NumNoSecurityAltID( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag454NumNoSecurityAltID.TESTB_NUM_NO_ROUTING_IDS;
        tagData = new Tag454NumNoSecurityAltID( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag454NumNoSecurityAltID tagData;
        int oneElement;

        oneElement = Tag454NumNoSecurityAltID.TESTB_NUM_NO_ROUTING_IDS;
        tagData = new Tag454NumNoSecurityAltID( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag454NumNoSecurityAltID tagData;
        int oneElement;

        oneElement = Tag454NumNoSecurityAltID.TESTB_NUM_NO_ROUTING_IDS;
        tagData = new Tag454NumNoSecurityAltID( new MyNumInGroupType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag454NumNoSecurityAltID tagData;
        int oneElement;

        oneElement = Tag454NumNoSecurityAltID.TESTB_NUM_NO_ROUTING_IDS;
        tagData = new Tag454NumNoSecurityAltID( new MyNumInGroupType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag454NumNoSecurityAltID tagData;
        int oneElement;

        oneElement = Tag454NumNoSecurityAltID.TESTA_NUM_NO_ROUTING_IDS;
        tagData = new Tag454NumNoSecurityAltID( new MyNumInGroupType( oneElement ) );
        assertEquals( "Tag454NumNoSecurityAltID\n" +
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