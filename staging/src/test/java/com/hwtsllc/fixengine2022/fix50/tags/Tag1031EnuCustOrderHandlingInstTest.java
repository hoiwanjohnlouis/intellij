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

import com.hwtsllc.fixengine2022.datatypes.MyEnumOrderHandlingInst;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag1031EnuCustOrderHandlingInstTest {
    Tag1031EnuCustOrderHandlingInst tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( MyEnumOrderHandlingInst oneEnum : MyEnumOrderHandlingInst.values()) {
            tagData = new Tag1031EnuCustOrderHandlingInst(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( MyEnumOrderHandlingInst oneEnum : MyEnumOrderHandlingInst.values()) {
            tagData = new Tag1031EnuCustOrderHandlingInst(oneEnum);
            assertEquals( "FIX1031_ENU_CUST_ORDER_HANDLING_INST", tagData.toEnumLabelString());
            assertEquals( "1031", tagData.toEnumIDString());
            assertEquals( "CUST_ORDER_HANDLING_INST", tagData.toEnumNameString());
            assertEquals( "CustOrderHandlingInst", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( MyEnumOrderHandlingInst oneEnum : MyEnumOrderHandlingInst.values()) {
            tagData = new Tag1031EnuCustOrderHandlingInst(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  1031 (same as 1031, 1035,)
         *  CustOrderHandlingInst
         *  MultipleStringValue
         *  <p>    ADD - Add On Order
         *  <p>    AON - All Or None
         *  <p>    CNH - Cash Not Held
         *  <p>    DIR - Directed Order
         *  <p>    E.W - Exchange for Physical Transaction
         */
        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.ADD_ON_ORDER );
        assertEquals( "ADD", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.ALL_OR_NONE );
        assertEquals( "AON", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.CASH_NOT_HELD );
        assertEquals( "CNH", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.DIRECTED_ORDER );
        assertEquals( "DIR", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.EXCHANGE_FOR_PHYSICAL );
        assertEquals( "E.W", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        /*
         *  <p>    FOK - Fill Or Kill
         *  <p>    IO - Imbalance Only
         *  <p>    IOC - Immediate Or Cancel
         *  <p>    LOO - Limit On Open
         *  <p>    LOC - Limit On Close
         */
        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.FILL_OR_KILL );
        assertEquals( "FOK", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.IMBALANCE_ONLY );
        assertEquals( "IO", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.IMMEDIATE_OR_CANCEL );
        assertEquals( "IOC", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.LIMIT_ON_OPEN );
        assertEquals( "LOO", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.LIMIT_ON_CLOSE );
        assertEquals( "LOC", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        /*
         *  <p>    MAO - Market At Open
         *  <p>    MAC - Market At Close
         *  <p>    MOO - Market On Open
         *  <p>    MOC - Market On Close
         *  <p>    MQT - Minimum Quantity
         */
        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.MARKET_AT_OPEN );
        assertEquals( "MAO", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.MARKET_AT_CLOSE );
        assertEquals( "MAC", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.MARKET_ON_OPEN );
        assertEquals( "MOO", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.MARKET_ON_CLOSE );
        assertEquals( "MOC", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.MINIMUM_QUANTITY );
        assertEquals( "MQT", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        /*
         *  <p>    NH - Not Held
         *  <p>    OVD - Over the Day
         *  <p>    PEG - Pegged
         *  <p>    RSV - Reserve Size Order
         *  <p>    S.W - Stop Stock Transaction
         */
        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.NOT_HELD );
        assertEquals( "NH", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.OVER_THE_DAY );
        assertEquals( "OVD", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.PEGGED );
        assertEquals( "PEG", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.RESERVE_SIZE_ORDER );
        assertEquals( "RSV", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.STOP_STOCK_TRANSACTION );
        assertEquals( "S.W", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        /*
         *  <p>    SCL - Scale
         *  <p>    TMO - Time Order
         *  <p>    TS - Trailing Stop
         *  <p>    WRK - Work
         */
        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.SCALE );
        assertEquals( "SCL", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.TIME_ORDER );
        assertEquals( "TMO", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.TRAILING_STOP );
        assertEquals( "TS", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.WORK );
        assertEquals( "WRK", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );


        // loop around the ENUM and process
        for ( MyEnumOrderHandlingInst oneEnum : MyEnumOrderHandlingInst.values()) {
            tagData = new Tag1031EnuCustOrderHandlingInst(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( MyEnumOrderHandlingInst oneEnum : MyEnumOrderHandlingInst.values()) {
            tagData = new Tag1031EnuCustOrderHandlingInst(oneEnum);
            assertEquals( "Tag1031EnuCustOrderHandlingInst\n" +
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