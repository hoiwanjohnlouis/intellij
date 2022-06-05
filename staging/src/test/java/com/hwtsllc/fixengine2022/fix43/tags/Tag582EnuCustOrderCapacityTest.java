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
import com.hwtsllc.fixengine2022.fix42.tags.Tag582EnuCustOrderCapacity;
import com.hwtsllc.fixengine2022.fix43.enums.Enum582CustOrderCapacity;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  582
 *  CustOrderCapacity
 *  int
 *  <p></p>
 *  Capacity of customer placing the order
 *  <p>
 *  Primarily used by futures exchanges to indicate the CTICode (customer type indicator)
 *  as required by the US CFTC (Commodity Futures Trading Commission).
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Member trading for their own account
 *  <p>    2 - Clearing Firm trading for its proprietary account
 *  <p>    3 - Member trading for another member
 *  <p>    4 - All other
 */
class Tag582EnuCustOrderCapacityTest {
    @Test
    void FIX0582Test() {
        FIX43 fixData = FIX43.FIX582_ENU_CUST_ORDER_CAPACITY;
        assertEquals( "582", fixData.toFIXIDString());
        assertEquals( "CUST_ORDER_CAPACITY", fixData.toFIXNameString());
        assertEquals( "CustOrderCapacity", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0582Test() {
        Tag582EnuCustOrderCapacity tagData;

        /*
         *  1-4 types
         */
        tagData = new Tag582EnuCustOrderCapacity( Enum582CustOrderCapacity.MEMBER_TRADING_ACCOUNT );
        assertEquals( Enum582CustOrderCapacity.MEMBER_TRADING_ACCOUNT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag582EnuCustOrderCapacity( Enum582CustOrderCapacity.CLEARING_FIRM_PROPRIETARY );
        assertEquals( Enum582CustOrderCapacity.CLEARING_FIRM_PROPRIETARY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag582EnuCustOrderCapacity( Enum582CustOrderCapacity.MEMBER_TRADING_FOR_ANOTHER );
        assertEquals( Enum582CustOrderCapacity.MEMBER_TRADING_FOR_ANOTHER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag582EnuCustOrderCapacity( Enum582CustOrderCapacity.ALL_OTHER );
        assertEquals( Enum582CustOrderCapacity.ALL_OTHER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag582EnuCustOrderCapacity tagData;

        // loop around the ENUM and process
        for ( Enum216RoutingType oneEnum : Enum216RoutingType.values()) {
            tagData = new Tag582EnuCustOrderCapacity(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag582EnuCustOrderCapacity tagData;

        // loop around the ENUM and process
        for (Enum216RoutingType oneEnum : Enum216RoutingType.values()) {
            tagData = new Tag582EnuCustOrderCapacity(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag582EnuCustOrderCapacity tagData;

        // loop around the ENUM and process
        for (Enum216RoutingType oneEnum : Enum216RoutingType.values()) {
            tagData = new Tag582EnuCustOrderCapacity(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag582EnuCustOrderCapacity tagData;

        // loop around the ENUM and process
        for (Enum216RoutingType oneEnum : Enum216RoutingType.values()) {
            tagData = new Tag582EnuCustOrderCapacity(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag582EnuCustOrderCapacity tagData;

        // loop around the ENUM and process
        for (Enum216RoutingType oneEnum : Enum216RoutingType.values()) {
            tagData = new Tag582EnuCustOrderCapacity(oneEnum);
            assertEquals( "Tag582EnuCustOrderCapacity\n" +
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