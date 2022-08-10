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

/**
 *  1031 (same as 1031, 1035,)
 *  CustOrderHandlingInst
 *  MultipleStringValue
 *  <p>
 *  Codes that apply special information that the Broker / Dealer needs to report, as specified by the customer.
 *  <p>
 *  NOTE: This field and its values have no bearing on the ExecInst and TimeInForce fields.
 *  <p>
 *  These values should not be used instead of ExecInst or TimeInForce.
 *  <p>
 *  This field and its values are intended for compliance reporting only.
 *  <p>
 *  For DeskTypeSource (1034) = 1 (NASD OATS), valid values are (as of OATS Phase 3 as provided by NASD.
 *  <p>
 *  See also http://www.nasd.com/oats/PhaseIII for a complete list.
 *  <p></p>
 *  1035
 *  DeskOrderHandlingInst
 *  MultipleStringValue
 *  <p></p>
 *  Valid values:
 *  <p>    ADD - Add On Order
 *  <p>    AON - All Or None
 *  <p>    CNH - Cash Not Held
 *  <p>    DIR - Directed Order
 *  <p>    E.W - Exchange for Physical Transaction
 *  <p></p>
 *  <p>    FOK - Fill Or Kill
 *  <p>    IO - Imbalance Only
 *  <p>    IOC - Immediate Or Cancel
 *  <p>    LOO - Limit On Open
 *  <p>    LOC - Limit On Close
 *  <p></p>
 *  <p>    MAO - Market At Open
 *  <p>    MAC - Market At Close
 *  <p>    MOO - Market On Open
 *  <p>    MOC - Market On Close
 *  <p>    MQT - Minimum Quantity
 *  <p></p>
 *  <p>    NH - Not Held
 *  <p>    OVD - Over the Day
 *  <p>    PEG - Pegged
 *  <p>    RSV - Reserve Size Order
 *  <p>    S.W - Stop Stock Transaction
 *  <p></p>
 *  <p>    SCL - Scale
 *  <p>    TMO - Time Order
 *  <p>    TS - Trailing Stop
 *  <p>    WRK - Work
 */
class Tag1035EnuDeskOrderHandlingInstTest {
    Tag1035EnuDeskOrderHandlingInst tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( MyEnumOrderHandlingInst oneEnum : MyEnumOrderHandlingInst.values()) {
            tagData = new Tag1035EnuDeskOrderHandlingInst(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( MyEnumOrderHandlingInst oneEnum : MyEnumOrderHandlingInst.values()) {
            tagData = new Tag1035EnuDeskOrderHandlingInst(oneEnum);
            assertEquals( "FIX1035_ENU_DESK_ORDER_HANDLING_INST", tagData.toEnumLabelString());
            assertEquals( "1035", tagData.toEnumIDString());
            assertEquals( "DESK_ORDER_HANDLING_INST", tagData.toEnumNameString());
            assertEquals( "DeskOrderHandlingInst", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         *  <p>    ADD - Add On Order
         *  <p>    AON - All Or None
         *  <p>    CNH - Cash Not Held
         *  <p>    DIR - Directed Order
         *  <p>    E.W - Exchange for Physical Transaction
         */
        tagData = new Tag1035EnuDeskOrderHandlingInst( MyEnumOrderHandlingInst.ADD_ON_ORDER );
        assertEquals( "ADD", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1035EnuDeskOrderHandlingInst( MyEnumOrderHandlingInst.ALL_OR_NONE );
        assertEquals( "AON", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1035EnuDeskOrderHandlingInst( MyEnumOrderHandlingInst.CASH_NOT_HELD );
        assertEquals( "CNH", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1035EnuDeskOrderHandlingInst( MyEnumOrderHandlingInst.DIRECTED_ORDER );
        assertEquals( "DIR", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1035EnuDeskOrderHandlingInst( MyEnumOrderHandlingInst.EXCHANGE_FOR_PHYSICAL );
        assertEquals( "E.W", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        /*
         *  <p>    FOK - Fill Or Kill
         *  <p>    IO - Imbalance Only
         *  <p>    IOC - Immediate Or Cancel
         *  <p>    LOO - Limit On Open
         *  <p>    LOC - Limit On Close
         */
        tagData = new Tag1035EnuDeskOrderHandlingInst( MyEnumOrderHandlingInst.FILL_OR_KILL );
        assertEquals( "FOK", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1035EnuDeskOrderHandlingInst( MyEnumOrderHandlingInst.IMBALANCE_ONLY );
        assertEquals( "IO", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1035EnuDeskOrderHandlingInst( MyEnumOrderHandlingInst.IMMEDIATE_OR_CANCEL );
        assertEquals( "IOC", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1035EnuDeskOrderHandlingInst( MyEnumOrderHandlingInst.LIMIT_ON_OPEN );
        assertEquals( "LOO", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1035EnuDeskOrderHandlingInst( MyEnumOrderHandlingInst.LIMIT_ON_CLOSE );
        assertEquals( "LOC", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        /*
         *  <p>    MAO - Market At Open
         *  <p>    MAC - Market At Close
         *  <p>    MOO - Market On Open
         *  <p>    MOC - Market On Close
         *  <p>    MQT - Minimum Quantity
         */
        tagData = new Tag1035EnuDeskOrderHandlingInst( MyEnumOrderHandlingInst.MARKET_AT_OPEN );
        assertEquals( "MAO", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1035EnuDeskOrderHandlingInst( MyEnumOrderHandlingInst.MARKET_AT_CLOSE );
        assertEquals( "MAC", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1035EnuDeskOrderHandlingInst( MyEnumOrderHandlingInst.MARKET_ON_OPEN );
        assertEquals( "MOO", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1035EnuDeskOrderHandlingInst( MyEnumOrderHandlingInst.MARKET_ON_CLOSE );
        assertEquals( "MOC", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1035EnuDeskOrderHandlingInst( MyEnumOrderHandlingInst.MINIMUM_QUANTITY );
        assertEquals( "MQT", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        /*
         *  <p>    NH - Not Held
         *  <p>    OVD - Over the Day
         *  <p>    PEG - Pegged
         *  <p>    RSV - Reserve Size Order
         *  <p>    S.W - Stop Stock Transaction
         */
        tagData = new Tag1035EnuDeskOrderHandlingInst( MyEnumOrderHandlingInst.NOT_HELD );
        assertEquals( "NH", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1035EnuDeskOrderHandlingInst( MyEnumOrderHandlingInst.OVER_THE_DAY );
        assertEquals( "OVD", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1035EnuDeskOrderHandlingInst( MyEnumOrderHandlingInst.PEGGED );
        assertEquals( "PEG", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1035EnuDeskOrderHandlingInst( MyEnumOrderHandlingInst.RESERVE_SIZE_ORDER );
        assertEquals( "RSV", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1035EnuDeskOrderHandlingInst( MyEnumOrderHandlingInst.STOP_STOCK_TRANSACTION );
        assertEquals( "S.W", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        /*
         *  <p>    SCL - Scale
         *  <p>    TMO - Time Order
         *  <p>    TS - Trailing Stop
         *  <p>    WRK - Work
         */
        tagData = new Tag1035EnuDeskOrderHandlingInst( MyEnumOrderHandlingInst.SCALE );
        assertEquals( "SCL", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1035EnuDeskOrderHandlingInst( MyEnumOrderHandlingInst.TIME_ORDER );
        assertEquals( "TMO", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1035EnuDeskOrderHandlingInst( MyEnumOrderHandlingInst.TRAILING_STOP );
        assertEquals( "TS", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1035EnuDeskOrderHandlingInst( MyEnumOrderHandlingInst.WORK );
        assertEquals( "WRK", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        // loop around the ENUM and process
        for ( MyEnumOrderHandlingInst oneEnum : MyEnumOrderHandlingInst.values()) {
            tagData = new Tag1035EnuDeskOrderHandlingInst(oneEnum);
            assertEquals( tagData.toString(), tagData.getDataValue());
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( MyEnumOrderHandlingInst oneEnum : MyEnumOrderHandlingInst.values()) {
            tagData = new Tag1035EnuDeskOrderHandlingInst(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for ( MyEnumOrderHandlingInst oneEnum : MyEnumOrderHandlingInst.values()) {
            tagData = new Tag1035EnuDeskOrderHandlingInst(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( MyEnumOrderHandlingInst oneEnum : MyEnumOrderHandlingInst.values()) {
            tagData = new Tag1035EnuDeskOrderHandlingInst(oneEnum);
            assertEquals( "Tag1035EnuDeskOrderHandlingInst\n" +
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