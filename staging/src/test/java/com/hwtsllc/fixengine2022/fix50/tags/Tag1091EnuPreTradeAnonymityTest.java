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
import com.hwtsllc.fixengine2022.fix50.enums.Enum1091PreTradeAnonymity;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1091
 *  PreTradeAnonymity
 *  Boolean
 *  <p>
 *  Allows trader to explicitly request anonymity or disclosure in pre-trade market data feeds.
 *  <p>
 *  Anonymity is relevant in markets where counterparties are regularly disclosed in order depth feeds.
 *  <p>
 *  Disclosure is relevant when counterparties are not normally visible.
 *  <p></p>
 *  <p> YES( "Y", "YES", "Y - Trader explicitly request anonymity" ),
 *  <p> NO( "N", "NO", "N - Anonymity not required" ),
 */
class Tag1091EnuPreTradeAnonymityTest {
    @Test
    void FIX1091Test() {
        FIX50 fixData = FIX50.FIX1091_ENU_PRE_TRADE_ANONYMITY;
        assertEquals( "1091", fixData.toFIXIDString());
        assertEquals( "PRE_TRADE_ANONYMITY", fixData.toFIXNameString());
        assertEquals( "PreTradeAnonymity", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag1091Test() {
        Tag1091EnuPreTradeAnonymity tagData;

        tagData = new Tag1091EnuPreTradeAnonymity( Enum1091PreTradeAnonymity.NO );
        assertEquals( Enum1091PreTradeAnonymity.NO.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1091EnuPreTradeAnonymity( Enum1091PreTradeAnonymity.YES );
        assertEquals( Enum1091PreTradeAnonymity.YES.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag1091EnuPreTradeAnonymity tagData;

        // loop around the ENUM and process
        for ( Enum1091PreTradeAnonymity oneEnum : Enum1091PreTradeAnonymity.values()) {
            tagData = new Tag1091EnuPreTradeAnonymity(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag1091EnuPreTradeAnonymity tagData;

        // loop around the ENUM and process
        for (Enum1091PreTradeAnonymity oneEnum : Enum1091PreTradeAnonymity.values()) {
            tagData = new Tag1091EnuPreTradeAnonymity(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1091EnuPreTradeAnonymity tagData;

        // loop around the ENUM and process
        for (Enum1091PreTradeAnonymity oneEnum : Enum1091PreTradeAnonymity.values()) {
            tagData = new Tag1091EnuPreTradeAnonymity(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag1091EnuPreTradeAnonymity tagData;

        // loop around the ENUM and process
        for (Enum1091PreTradeAnonymity oneEnum : Enum1091PreTradeAnonymity.values()) {
            tagData = new Tag1091EnuPreTradeAnonymity(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1091EnuPreTradeAnonymity tagData;

        // loop around the ENUM and process
        for (Enum1091PreTradeAnonymity oneEnum : Enum1091PreTradeAnonymity.values()) {
            tagData = new Tag1091EnuPreTradeAnonymity(oneEnum);
            assertEquals( "Tag1091EnuPreTradeAnonymity\n" +
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}