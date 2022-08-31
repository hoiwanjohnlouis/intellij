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

import com.hwtsllc.fixengine2022.fix43.enums.Enum529OrderRestrictions;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag529EnuOrderRestrictionsTest {
    Tag529EnuOrderRestrictions tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum529OrderRestrictions oneEnum : Enum529OrderRestrictions.values()) {
            tagData = new Tag529EnuOrderRestrictions(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum529OrderRestrictions oneEnum : Enum529OrderRestrictions.values()) {
            tagData = new Tag529EnuOrderRestrictions(oneEnum);
            assertEquals( "FIX529_ENU_ORDER_RESTRICTIONS", tagData.toEnumLabelString());
            assertEquals( "529", tagData.toEnumIDString());
            assertEquals( "ORDER_RESTRICTIONS", tagData.toEnumNameString());
            assertEquals( "OrderRestrictions", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum529OrderRestrictions oneEnum : Enum529OrderRestrictions.values()) {
            tagData = new Tag529EnuOrderRestrictions(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  529
         *  OrderRestrictions
         *  MultipleCharValue
         *  <p>    1 - Program Trade
         *  <p>    2 - Index Arbitrage
         *  <p>    3 - Non-Index Arbitrage
         *  <p>    4 - Competing Market Maker
         *  <p>    5 - Acting as Market Maker or Specialist in the security
         */
        tagData = new Tag529EnuOrderRestrictions( Enum529OrderRestrictions.PROGRAM_TRADE );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag529EnuOrderRestrictions( Enum529OrderRestrictions.INDEX_ARBITRAGE );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag529EnuOrderRestrictions( Enum529OrderRestrictions.NON_INDEX_ARBITRAGE );
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag529EnuOrderRestrictions( Enum529OrderRestrictions.COMPETING_MARKET_MAKER );
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag529EnuOrderRestrictions( Enum529OrderRestrictions.SPECIALIST_IN_SECURITY );
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    6 - Acting as Market Maker of Specialist in the
         *              underlying security of a derivative security
         *  <p>    7 - Foreign Entity (of foreign government or regulatory jurisdiction)
         *  <p>    8 - External Market Participant
         *  <p>    9 - External Inter-connected Market Linkage
         */
        tagData = new Tag529EnuOrderRestrictions( Enum529OrderRestrictions.SPECIALIST_IN_UNDERLYING_SECURITY );
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag529EnuOrderRestrictions( Enum529OrderRestrictions.FOREIGN_ENTITY );
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag529EnuOrderRestrictions( Enum529OrderRestrictions.EXTERNAL_MARKET_PARTICIPANT );
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag529EnuOrderRestrictions( Enum529OrderRestrictions.EXTERNAL_INTER_CONNECTED );
        assertEquals( "9", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    A - Riskless Arbitrage
         */
        tagData = new Tag529EnuOrderRestrictions( Enum529OrderRestrictions.RISKLESS_ARBITRAGE );
        assertEquals( "A", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (Enum529OrderRestrictions oneEnum : Enum529OrderRestrictions.values()) {
            tagData = new Tag529EnuOrderRestrictions(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum529OrderRestrictions oneEnum : Enum529OrderRestrictions.values()) {
            tagData = new Tag529EnuOrderRestrictions(oneEnum);
            assertEquals( "Tag529EnuOrderRestrictions\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}