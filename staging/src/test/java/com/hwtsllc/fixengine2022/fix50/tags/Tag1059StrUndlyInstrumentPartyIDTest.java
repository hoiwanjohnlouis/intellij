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
 *  1059
 *  UndlyInstrumentPartyID
 *  String
 *  <p>
 *  PartyID value within an underlying instrument party repeating group.
 *  <p>
 *  Same values as  PartyID (448)
 */
class Tag1059StrUndlyInstrumentPartyIDTest {
    @Test
    void FIX1059Test() {
        FIX50 fixData = FIX50.FIX1059_STR_UNDLY_INSTRUMENT_PARTY_ID;
        assertEquals( "1059", fixData.toFIXIDString());
        assertEquals( "UNDLY_INSTRUMENT_PARTY_ID", fixData.toFIXNameString());
        assertEquals( "UndlyInstrumentPartyID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag1059Test() {
        Tag1059StrUndlyInstrumentPartyID tagData;
        String oneElement;

        oneElement = "Chloe Kim";
        tagData = new Tag1059StrUndlyInstrumentPartyID( new MyStringType(oneElement) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag1059StrUndlyInstrumentPartyID.TESTA_STR_UNDLY_INSTRUMENT_PARTY_ID;
        tagData = new Tag1059StrUndlyInstrumentPartyID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag1059StrUndlyInstrumentPartyID.TESTB_STR_UNDLY_INSTRUMENT_PARTY_ID;
        tagData = new Tag1059StrUndlyInstrumentPartyID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag1059StrUndlyInstrumentPartyID tagData;
        String oneElement;

        oneElement = Tag1059StrUndlyInstrumentPartyID.TESTA_STR_UNDLY_INSTRUMENT_PARTY_ID;
        tagData = new Tag1059StrUndlyInstrumentPartyID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag1059StrUndlyInstrumentPartyID.TESTB_STR_UNDLY_INSTRUMENT_PARTY_ID;
        tagData = new Tag1059StrUndlyInstrumentPartyID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag1059StrUndlyInstrumentPartyID tagData;
        String oneElement;

        oneElement = Tag1059StrUndlyInstrumentPartyID.TESTB_STR_UNDLY_INSTRUMENT_PARTY_ID;
        tagData = new Tag1059StrUndlyInstrumentPartyID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1059StrUndlyInstrumentPartyID tagData;
        String oneElement;

        oneElement = Tag1059StrUndlyInstrumentPartyID.TESTB_STR_UNDLY_INSTRUMENT_PARTY_ID;
        tagData = new Tag1059StrUndlyInstrumentPartyID( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag1059StrUndlyInstrumentPartyID tagData;
        String oneElement;

        oneElement = Tag1059StrUndlyInstrumentPartyID.TESTB_STR_UNDLY_INSTRUMENT_PARTY_ID;
        tagData = new Tag1059StrUndlyInstrumentPartyID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1059StrUndlyInstrumentPartyID tagData;
        String oneElement;

        oneElement = Tag1059StrUndlyInstrumentPartyID.TESTA_STR_UNDLY_INSTRUMENT_PARTY_ID;
        tagData = new Tag1059StrUndlyInstrumentPartyID( new MyStringType( oneElement ) );
        assertEquals( "Tag1059StrUndlyInstrumentPartyID\n" +
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