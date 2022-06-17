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
 *  949
 *  Nested3PartyID
 *  String
 *  <p></p>
 *  PartyID value within a "third instance" Nested repeating group.
 *  <p></p>
 *  Same values as  PartyID (448)
 */
class Tag949StrNested3PartyIDTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX949_STR_NESTED_3_PARTY_ID;
        assertEquals( "949", fixData.toFIXIDString());
        assertEquals( "NESTED_3_PARTY_ID", fixData.toFIXNameString());
        assertEquals( "Nested3PartyID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0949Test() {
        Tag949StrNested3PartyID tagData;
        String oneElement;

        oneElement = Tag949StrNested3PartyID.TESTA_STR_NESTED_3_PARTY_ID;
        tagData = new Tag949StrNested3PartyID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "949", tagData.toFIXIDString());
        assertEquals( "NESTED_3_PARTY_ID", tagData.toFIXNameString());
        assertEquals( "Nested3PartyID", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        oneElement = Tag949StrNested3PartyID.TESTB_STR_NESTED_3_PARTY_ID;
        tagData = new Tag949StrNested3PartyID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag949StrNested3PartyID tagData;
        String oneElement;

        oneElement = Tag949StrNested3PartyID.TESTA_STR_NESTED_3_PARTY_ID;
        tagData = new Tag949StrNested3PartyID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag949StrNested3PartyID.TESTB_STR_NESTED_3_PARTY_ID;
        tagData = new Tag949StrNested3PartyID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag949StrNested3PartyID tagData;
        String oneElement;

        oneElement = Tag949StrNested3PartyID.TESTB_STR_NESTED_3_PARTY_ID;
        tagData = new Tag949StrNested3PartyID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag949StrNested3PartyID tagData;
        String oneElement;

        oneElement = Tag949StrNested3PartyID.TESTB_STR_NESTED_3_PARTY_ID;
        tagData = new Tag949StrNested3PartyID( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag949StrNested3PartyID tagData;
        String oneElement;

        oneElement = Tag949StrNested3PartyID.TESTB_STR_NESTED_3_PARTY_ID;
        tagData = new Tag949StrNested3PartyID(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag949StrNested3PartyID tagData;
        String oneElement;

        oneElement = Tag949StrNested3PartyID.TESTA_STR_NESTED_3_PARTY_ID;
        tagData = new Tag949StrNested3PartyID( new MyStringType( oneElement ) );
        assertEquals( "Tag949StrNested3PartyID\n" +
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