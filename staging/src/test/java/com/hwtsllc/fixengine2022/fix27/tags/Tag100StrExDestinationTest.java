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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  100
 *  ExDestination
 *  Exchange
 *  <p>
 *  Execution destination as defined by institution when order is entered.
 *  <p>
 *  Valid values:
 *      See "Appendix 6-C"
 */
class Tag100StrExDestinationTest {
    @Test
    void FIX0100Test() {
        FIX27 fixData = FIX27.FIX100_STR_EX_DESTINATION;
        assertEquals( "EX_DESTINATION", fixData.toFIXNameString());
        assertEquals( "100", fixData.toFIXIDString());
        assertEquals( "ExDestination", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0100Test() {
        Tag100StrExDestination tagData;

        tagData = new Tag100StrExDestination(new MyStringType("JPMC"));
        assertEquals( "JPMC", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag100StrExDestination tagData;

        tagData = new Tag100StrExDestination(new MyStringType(Tag100StrExDestination.TESTB_STR_EX_DESTINATION));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag100StrExDestination tagData;

        tagData = new Tag100StrExDestination(new MyStringType(Tag100StrExDestination.TESTB_STR_EX_DESTINATION));
        assertEquals( Tag100StrExDestination.TESTB_STR_EX_DESTINATION, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag100StrExDestination tagData;

        tagData = new Tag100StrExDestination(new MyStringType(Tag100StrExDestination.TESTB_STR_EX_DESTINATION));
        assertEquals( tagData.toFIXIDString() + "=" + Tag100StrExDestination.TESTB_STR_EX_DESTINATION,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag100StrExDestination tagData;

        tagData = new Tag100StrExDestination(new MyStringType(Tag100StrExDestination.TESTB_STR_EX_DESTINATION));
        assertEquals( Tag100StrExDestination.TESTB_STR_EX_DESTINATION,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag100StrExDestination tagData;

        tagData = new Tag100StrExDestination(new MyStringType(Tag100StrExDestination.TESTA_STR_EX_DESTINATION));
        assertEquals( "Tag100StrExDestination\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag100StrExDestination.TESTA_STR_EX_DESTINATION + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag100StrExDestination.TESTA_STR_EX_DESTINATION + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}