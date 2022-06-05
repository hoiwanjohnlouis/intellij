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
import com.hwtsllc.fixengine2022.fix42.enums.Enum216RoutingType;
import com.hwtsllc.fixengine2022.fix42.tags.Tag529EnuOrderRestrictions;
import com.hwtsllc.fixengine2022.fix43.enums.Enum529OrderRestrictions;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  529
 *  OrderRestrictions
 *  MultipleCharValue
 *  <p></p>
 *  Restrictions associated with an order.
 *  <p>
 *  If more than one restriction is applicable to an order,
 *  this field can contain multiple instructions separated by space.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Program Trade
 *  <p>    2 - Index Arbitrage
 *  <p>    3 - Non-Index Arbitrage
 *  <p>    4 - Competing Market Maker
 *  <p>    5 - Acting as Market Maker or Specialist in the security
 *  <p></p>
 *  <p>    6 - Acting as Market Maker of Specialist in the
 *              underlying security of a derivative security
 *  <p>    7 - Foreign Entity (of foreign government or regulatory jurisdiction)
 *  <p>    8 - External Market Participant
 *  <p>    9 - External Inter-connected Market Linkage
 *  <p>    A - Riskless Arbitrage
 */
class Tag529EnuOrderRestrictionsTest {
    @Test
    void FIX0529Test() {
        FIX43 fixData = FIX43.FIX529_ENU_ORDER_RESTRICTIONS;
        assertEquals( "529", fixData.toFIXIDString());
        assertEquals( "ORDER_RESTRICTIONS", fixData.toFIXNameString());
        assertEquals( "OrderRestrictions", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0529Test() {
        Tag529EnuOrderRestrictions tagData;

        /*
         *  1-9, A, types
         */

        /*
         *  1-9, types
         */
        tagData = new Tag529EnuOrderRestrictions( Enum529OrderRestrictions.PROGRAM_TRADE );
        assertEquals( Enum529OrderRestrictions.PROGRAM_TRADE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag529EnuOrderRestrictions( Enum529OrderRestrictions.INDEX_ARBITRAGE );
        assertEquals( Enum529OrderRestrictions.INDEX_ARBITRAGE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag529EnuOrderRestrictions( Enum529OrderRestrictions.NON_INDEX_ARBITRAGE );
        assertEquals( Enum529OrderRestrictions.NON_INDEX_ARBITRAGE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag529EnuOrderRestrictions( Enum529OrderRestrictions.COMPETING_MARKET_MAKER );
        assertEquals( Enum529OrderRestrictions.COMPETING_MARKET_MAKER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag529EnuOrderRestrictions( Enum529OrderRestrictions.SPECIALIST_IN_SECURITY );
        assertEquals( Enum529OrderRestrictions.SPECIALIST_IN_SECURITY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag529EnuOrderRestrictions( Enum529OrderRestrictions.SPECIALIST_IN_UNDERLYING_SECURITY );
        assertEquals( Enum529OrderRestrictions.SPECIALIST_IN_UNDERLYING_SECURITY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag529EnuOrderRestrictions( Enum529OrderRestrictions.FOREIGN_ENTITY );
        assertEquals( Enum529OrderRestrictions.FOREIGN_ENTITY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag529EnuOrderRestrictions( Enum529OrderRestrictions.EXTERNAL_MARKET_PARTICIPANT );
        assertEquals( Enum529OrderRestrictions.EXTERNAL_MARKET_PARTICIPANT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag529EnuOrderRestrictions( Enum529OrderRestrictions.EXTERNAL_INTER_CONNECTED );
        assertEquals( Enum529OrderRestrictions.EXTERNAL_INTER_CONNECTED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         *  A type
         */
        tagData = new Tag529EnuOrderRestrictions( Enum529OrderRestrictions.RISKLESS_ARBITRAGE );
        assertEquals( Enum529OrderRestrictions.RISKLESS_ARBITRAGE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag529EnuOrderRestrictions tagData;

        // loop around the ENUM and process
        for ( Enum216RoutingType oneEnum : Enum216RoutingType.values()) {
            tagData = new Tag529EnuOrderRestrictions(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag529EnuOrderRestrictions tagData;

        // loop around the ENUM and process
        for (Enum216RoutingType oneEnum : Enum216RoutingType.values()) {
            tagData = new Tag529EnuOrderRestrictions(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag529EnuOrderRestrictions tagData;

        // loop around the ENUM and process
        for (Enum216RoutingType oneEnum : Enum216RoutingType.values()) {
            tagData = new Tag529EnuOrderRestrictions(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag529EnuOrderRestrictions tagData;

        // loop around the ENUM and process
        for (Enum216RoutingType oneEnum : Enum216RoutingType.values()) {
            tagData = new Tag529EnuOrderRestrictions(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag529EnuOrderRestrictions tagData;

        // loop around the ENUM and process
        for (Enum216RoutingType oneEnum : Enum216RoutingType.values()) {
            tagData = new Tag529EnuOrderRestrictions(oneEnum);
            assertEquals( "Tag529EnuOrderRestrictions\n" +
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