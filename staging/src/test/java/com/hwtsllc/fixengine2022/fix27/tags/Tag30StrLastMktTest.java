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
 *  30
 *  LastMkt
 *  Exchange
 *  Market of execution for last fill, or an indication of the market where an order was routed
 *  See "Appendix 6-C"
 */
class Tag30StrLastMktTest {
    @Test
    void FIX0030Test() {
        FIX27 fixData = FIX27.FIX30_STR_LAST_MKT;
        assertEquals( "LAST_MKT", fixData.toFIXNameString());
        assertEquals( "30", fixData.toFIXIDString());
        assertEquals( "LastMkt", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0030Test() {
        Tag30StrLastMkt tagData;

        tagData = new Tag30StrLastMkt(new MyStringType("NYSE") );
        assertEquals( "NYSE", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag30StrLastMkt tagData;

        tagData = new Tag30StrLastMkt(new MyStringType(Tag30StrLastMkt.TESTB_STR_LAST_MKT));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag30StrLastMkt tagData;

        tagData = new Tag30StrLastMkt(new MyStringType(Tag30StrLastMkt.TESTB_STR_LAST_MKT));
        assertEquals( Tag30StrLastMkt.TESTB_STR_LAST_MKT, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag30StrLastMkt tagData;

        tagData = new Tag30StrLastMkt(new MyStringType(Tag30StrLastMkt.TESTB_STR_LAST_MKT));
        assertEquals( tagData.toFIXIDString() + "=" + Tag30StrLastMkt.TESTB_STR_LAST_MKT,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag30StrLastMkt tagData;

        tagData = new Tag30StrLastMkt(new MyStringType(Tag30StrLastMkt.TESTB_STR_LAST_MKT));
        assertEquals( Tag30StrLastMkt.TESTB_STR_LAST_MKT,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag30StrLastMkt tagData;

        tagData = new Tag30StrLastMkt(new MyStringType(Tag30StrLastMkt.TESTA_STR_LAST_MKT));
        assertEquals( "Tag30StrLastMkt\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag30StrLastMkt.TESTA_STR_LAST_MKT + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag30StrLastMkt.TESTA_STR_LAST_MKT + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}