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
import com.hwtsllc.fixengine2022.fix50.enums.Enum1029CustDirectedOrder;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1029
 *  CustDirectedOrder
 *  Boolean
 *  <p>
 *  Indicates if the customer directed this order to a specific execution venue (Y) or not (N).
 *  <p>
 *  A default of N –
 *  <p>
 *  customer didn’t direct this order – should be used in the case
 *  where the information is both missing and essential.
 *  <p></p>
 *  <p> YES( "Y", "YES", "Y - Customer directed this order to a specific execution venue" ),
 *  <p> NO( "N", "NO", "N - Execution venue not specified" ),
 */
class Tag1029EnuCustDirectedOrderTest {
    @Test
    void FIX1029Test() {
        FIX50 fixData = FIX50.FIX1029_ENU_CUST_DIRECTED_ORDER;
        assertEquals( "1029", fixData.toFIXIDString());
        assertEquals( "CUST_DIRECTED_ORDER", fixData.toFIXNameString());
        assertEquals( "CustDirectedOrder", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag1029Test() {
        Tag1029EnuCustDirectedOrder tagData;

        tagData = new Tag1029EnuCustDirectedOrder( Enum1029CustDirectedOrder.NO );
        assertEquals( Enum1029CustDirectedOrder.NO.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1029EnuCustDirectedOrder( Enum1029CustDirectedOrder.YES );
        assertEquals( Enum1029CustDirectedOrder.YES.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag1029EnuCustDirectedOrder tagData;

        // loop around the ENUM and process
        for ( Enum1029CustDirectedOrder oneEnum : Enum1029CustDirectedOrder.values()) {
            tagData = new Tag1029EnuCustDirectedOrder(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag1029EnuCustDirectedOrder tagData;

        // loop around the ENUM and process
        for (Enum1029CustDirectedOrder oneEnum : Enum1029CustDirectedOrder.values()) {
            tagData = new Tag1029EnuCustDirectedOrder(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1029EnuCustDirectedOrder tagData;

        // loop around the ENUM and process
        for (Enum1029CustDirectedOrder oneEnum : Enum1029CustDirectedOrder.values()) {
            tagData = new Tag1029EnuCustDirectedOrder(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag1029EnuCustDirectedOrder tagData;

        // loop around the ENUM and process
        for (Enum1029CustDirectedOrder oneEnum : Enum1029CustDirectedOrder.values()) {
            tagData = new Tag1029EnuCustDirectedOrder(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1029EnuCustDirectedOrder tagData;

        // loop around the ENUM and process
        for (Enum1029CustDirectedOrder oneEnum : Enum1029CustDirectedOrder.values()) {
            tagData = new Tag1029EnuCustDirectedOrder(oneEnum);
            assertEquals( "Tag1029EnuCustDirectedOrder\n" +
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