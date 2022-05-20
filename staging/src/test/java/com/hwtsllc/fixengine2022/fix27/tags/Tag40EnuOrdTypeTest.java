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
import com.hwtsllc.fixengine2022.fix27.enums.Enum40OrdType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  40
 *  OrdType
 *  char
 *  Order type.
 *
 *  *** SOME VALUES ARE NO LONGER USED ***
 *  *** See Deprecated (Phased-out) Features and Supported Approach ***
 *      (see Volume : "Glossary" for value definitions)
 *
 *  Valid values:
 *      1 - Market
 *      2 - Limit
 *      3 - Stop / Stop Loss
 *      4 - Stop Limit
 *      5 - Market On Close (No longer used)
 *
 *      6 - With Or Without
 *      7 - Limit Or Better
 *      8 - Limit With Or Without
 *      9 - On Basis
 *
 *      A - On Close (No longer used)
 *      B - Limit On Close (No longer used)
 *      C - Forex Market (No longer used)
 *      D - Previously Quoted
 *      E - Previously Indicated
 *
 *      F - Forex Limit (No longer used)
 *      G - Forex Swap
 *      H - Forex Previously Quoted (No longer used)
 *      I - Funari
 *          (Limit day order with unexecuted portion handles as Market On Close.
 *           e.g. Japan)
 *      J - Market If Touched (MIT)
 *
 *      K - Market With Left Over as Limit
 *          (market order with unexecuted quantity becoming limit order at last price)
 *      L - Previous Fund Valuation Point (Historic pricing;  for CIV)
 *      M - Next Fund Valuation Point (Forward pricing;  for CIV)
 *      P - Pegged
 *      Q - Counter-order selection
 */
class Tag40EnuOrdTypeTest {
    @Test
    void FIX0040Test() {
        FIX27 fixData = FIX27.FIX40_ENU_ORD_TYPE;
        assertEquals( "ORD_TYPE", fixData.toFIXNameString());
        assertEquals( "40", fixData.toFIXIDString());
        assertEquals( "OrdType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0040Test() {
        Tag40EnuOrdType tagData;

        /*
         * 1-9 Order Type msg
         */
        tagData = new Tag40EnuOrdType(Enum40OrdType.MARKET);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag40EnuOrdType(Enum40OrdType.LIMIT);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag40EnuOrdType(Enum40OrdType.STOP_OR_STOP_LOSS);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag40EnuOrdType(Enum40OrdType.STOP_LIMIT);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag40EnuOrdType(Enum40OrdType.MARKET_ON_CLOSE);
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag40EnuOrdType(Enum40OrdType.WITH_OR_WITHOUT);
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag40EnuOrdType(Enum40OrdType.LIMIT_OR_BETTER);
        assertEquals( "7", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag40EnuOrdType(Enum40OrdType.LIMIT_WITH_OR_WITHOUT);
        assertEquals( "8", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag40EnuOrdType(Enum40OrdType.ON_BASIS);
        assertEquals( "9", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * A-Q Order Type msg
         */
        tagData = new Tag40EnuOrdType(Enum40OrdType.ON_CLOSE);
        assertEquals( "A", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag40EnuOrdType(Enum40OrdType.LIMIT_ON_CLOSE);
        assertEquals( "B", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag40EnuOrdType(Enum40OrdType.FOREX_MARKET);
        assertEquals( "C", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag40EnuOrdType(Enum40OrdType.PREVIOUSLY_QUOTED);
        assertEquals( "D", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag40EnuOrdType(Enum40OrdType.PREVIOUSLY_INDICATED);
        assertEquals( "E", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag40EnuOrdType(Enum40OrdType.FOREX_LIMIT);
        assertEquals( "F", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag40EnuOrdType(Enum40OrdType.FOREX_SWAP);
        assertEquals( "G", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag40EnuOrdType(Enum40OrdType.FOREX_PREVIOUSLY_QUOTED);
        assertEquals( "H", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag40EnuOrdType(Enum40OrdType.FUNARI);
        assertEquals( "I", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag40EnuOrdType(Enum40OrdType.MARKET_IF_TOUCHED);
        assertEquals( "J", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag40EnuOrdType(Enum40OrdType.MARKET_WITH_LEFT_OVER_AS_LIMIT);
        assertEquals( "K", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag40EnuOrdType(Enum40OrdType.PREVIOUS_FUND_VALUATION_POINT);
        assertEquals( "L", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag40EnuOrdType(Enum40OrdType.NEXT_FUND_VALUATION_POINT);
        assertEquals( "M", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag40EnuOrdType(Enum40OrdType.PEGGED);
        assertEquals( "P", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag40EnuOrdType(Enum40OrdType.COUNTER_ORDER_SELECTION);
        assertEquals( "Q", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag40EnuOrdType tagData;

        // loop around the ENUM and process
        for (Enum40OrdType oneEnum : Enum40OrdType.values()) {
            tagData = new Tag40EnuOrdType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag40EnuOrdType tagData;

        // loop around the ENUM and process
        for (Enum40OrdType oneEnum : Enum40OrdType.values()) {
            tagData = new Tag40EnuOrdType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag40EnuOrdType tagData;

        // loop around the ENUM and process
        for (Enum40OrdType oneEnum : Enum40OrdType.values()) {
            tagData = new Tag40EnuOrdType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag40EnuOrdType tagData;

        // loop around the ENUM and process
        for (Enum40OrdType oneEnum : Enum40OrdType.values()) {
            tagData = new Tag40EnuOrdType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag40EnuOrdType tagData;

        // loop around the ENUM and process
        for (Enum40OrdType oneEnum : Enum40OrdType.values()) {
            tagData = new Tag40EnuOrdType(oneEnum);
            assertEquals( "Tag40EnuOrdType\n" +
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