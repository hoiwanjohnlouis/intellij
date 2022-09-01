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

import com.hwtsllc.fixengine2022.fix50.enums.Enum1029CustDirectedOrder;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag1029EnuCustDirectedOrderTest {
    Tag1029EnuCustDirectedOrder tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum1029CustDirectedOrder oneEnum : Enum1029CustDirectedOrder.values()) {
            tagData = new Tag1029EnuCustDirectedOrder(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum1029CustDirectedOrder oneEnum : Enum1029CustDirectedOrder.values()) {
            tagData = new Tag1029EnuCustDirectedOrder(oneEnum);
            assertEquals( "FIX1029_ENU_CUST_DIRECTED_ORDER", tagData.toFIXLabelString());
            assertEquals( "1029", tagData.toFIXIDString());
            assertEquals( "CUST_DIRECTED_ORDER", tagData.toFIXNameString());
            assertEquals( "CustDirectedOrder", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum1029CustDirectedOrder oneEnum : Enum1029CustDirectedOrder.values()) {
            tagData = new Tag1029EnuCustDirectedOrder(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  1029
         *  CustDirectedOrder
         *  Boolean
         *  <p> YES( "Y", "YES", "Y - Customer directed this order to a specific execution venue" ),
         *  <p> NO( "N", "NO", "N - Execution venue not specified" ),
         */
        tagData = new Tag1029EnuCustDirectedOrder( Enum1029CustDirectedOrder.NO );
        assertEquals( "N", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag1029EnuCustDirectedOrder( Enum1029CustDirectedOrder.YES );
        assertEquals( "Y", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );


        // loop around the ENUM and process
        for ( Enum1029CustDirectedOrder oneEnum : Enum1029CustDirectedOrder.values()) {
            tagData = new Tag1029EnuCustDirectedOrder(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum1029CustDirectedOrder oneEnum : Enum1029CustDirectedOrder.values()) {
            tagData = new Tag1029EnuCustDirectedOrder(oneEnum);
            assertEquals( "Tag1029EnuCustDirectedOrder\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
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