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

package com.hwtsllc.fix.tags.fix43;

import com.hwtsllc.fix.enums.fix43.Enum582CustOrderCapacity;
import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag582EnuCustOrderCapacityTest {
    Tag582EnuCustOrderCapacity tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum582CustOrderCapacity oneEnum : Enum582CustOrderCapacity.values()) {
            tagData = new Tag582EnuCustOrderCapacity(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum582CustOrderCapacity oneEnum : Enum582CustOrderCapacity.values()) {
            tagData = new Tag582EnuCustOrderCapacity(oneEnum);
            assertEquals( "FIX582_ENU_CUST_ORDER_CAPACITY", tagData.toFIXLabelString());
            assertEquals( "582", tagData.toFIXIDString());
            assertEquals( "CUST_ORDER_CAPACITY", tagData.toFIXNameString());
            assertEquals( "CustOrderCapacity", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum582CustOrderCapacity oneEnum : Enum582CustOrderCapacity.values()) {
            tagData = new Tag582EnuCustOrderCapacity(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  582
         *  CustOrderCapacity
         *  int
         *  <p>    1 - Member trading for their own account
         *  <p>    2 - Clearing Firm trading for its proprietary account
         *  <p>    3 - Member trading for another member
         *  <p>    4 - All other
         */
        tagData = new Tag582EnuCustOrderCapacity( Enum582CustOrderCapacity.MEMBER_TRADING_ACCOUNT );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag582EnuCustOrderCapacity( Enum582CustOrderCapacity.CLEARING_FIRM_PROPRIETARY );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag582EnuCustOrderCapacity( Enum582CustOrderCapacity.MEMBER_TRADING_FOR_ANOTHER );
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag582EnuCustOrderCapacity( Enum582CustOrderCapacity.ALL_OTHER );
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (Enum582CustOrderCapacity oneEnum : Enum582CustOrderCapacity.values()) {
            tagData = new Tag582EnuCustOrderCapacity(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum582CustOrderCapacity oneEnum : Enum582CustOrderCapacity.values()) {
            tagData = new Tag582EnuCustOrderCapacity(oneEnum);
            assertEquals( "Tag582EnuCustOrderCapacity\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
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