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
            assertEquals( "FIX1029_ENU_CUST_DIRECTED_ORDER", tagData.toEnumLabelString());
            assertEquals( "1029", tagData.toEnumIDString());
            assertEquals( "CUST_DIRECTED_ORDER", tagData.toEnumNameString());
            assertEquals( "CustDirectedOrder", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         *  <p>    NO( "N", "NO", "N - Execution venue not specified" ),
         *  <p>    YES( "Y", "YES", "Y - Customer directed this order to a specific execution venue" ),
         */
        tagData = new Tag1029EnuCustDirectedOrder( Enum1029CustDirectedOrder.NO );
        assertEquals( "N", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1029EnuCustDirectedOrder( Enum1029CustDirectedOrder.YES );
        assertEquals( "Y", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        // loop around the ENUM and process
        for ( Enum1029CustDirectedOrder oneEnum : Enum1029CustDirectedOrder.values()) {
            tagData = new Tag1029EnuCustDirectedOrder(oneEnum);
            assertEquals( tagData.toString(), tagData.getDataValue());
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum1029CustDirectedOrder oneEnum : Enum1029CustDirectedOrder.values()) {
            tagData = new Tag1029EnuCustDirectedOrder(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
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
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.getDataValue() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}