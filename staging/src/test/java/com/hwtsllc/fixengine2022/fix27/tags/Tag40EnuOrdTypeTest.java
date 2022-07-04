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

import com.hwtsllc.fixengine2022.fix27.enums.Enum40OrdType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  40
 *  OrdType
 *  char
 *  <p></p>
 *  Order type.
 *  <p></p>
 *  *** SOME VALUES ARE NO LONGER USED ***
 *  <p>
 *  *** See Deprecated (Phased-out) Features and Supported Approach ***
 *  <p>
 *      (see Volume : "Glossary" for value definitions)
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Market
 *  <p>    2 - Limit
 *  <p>    3 - Stop / Stop Loss
 *  <p>    4 - Stop Limit
 *  <p>    5 - Market On Close (No longer used)
 *  <p></p>
 *  <p>    6 - With Or Without
 *  <p>    7 - Limit Or Better
 *  <p>    8 - Limit With Or Without
 *  <p>    9 - On Basis
 *  <p></p>
 *  <p>    A - On Close (No longer used)
 *  <p>    B - Limit On Close (No longer used)
 *  <p>    C - Forex Market (No longer used)
 *  <p>    D - Previously Quoted
 *  <p>    E - Previously Indicated
 *  <p></p>
 *  <p>    F - Forex Limit (No longer used)
 *  <p>    G - Forex Swap
 *  <p>    H - Forex Previously Quoted (No longer used)
 *  <p>    I - Funari
 *          (Limit day order with unexecuted portion handles as Market On Close.
 *           e.g. Japan)
 *  <p>    J - Market If Touched (MIT)
 *  <p></p>
 *  <p>    K - Market With Left Over as Limit
 *          (market order with unexecuted quantity becoming limit order at last price)
 *  <p>    L - Previous Fund Valuation Point (Historic pricing;  for CIV)
 *  <p>    M - Next Fund Valuation Point (Forward pricing;  for CIV)
 *  <p>    P - Pegged
 *  <p>    Q - Counter-order selection
 */
class Tag40EnuOrdTypeTest {
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
    void FIXTest() {
        Tag40EnuOrdType tagData;

        // loop around the ENUM and process
        for (Enum40OrdType oneEnum : Enum40OrdType.values()) {
            tagData = new Tag40EnuOrdType(oneEnum);
            assertEquals( "FIX40_ENU_ORD_TYPE", tagData.toEnumLabelString());
            assertEquals( "ORD_TYPE", tagData.toEnumNameString());
            assertEquals( "40", tagData.toEnumIDString());
            assertEquals( "OrdType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
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
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag40EnuOrdType tagData;

        // loop around the ENUM and process
        for (Enum40OrdType oneEnum : Enum40OrdType.values()) {
            tagData = new Tag40EnuOrdType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
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
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toEnumIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}