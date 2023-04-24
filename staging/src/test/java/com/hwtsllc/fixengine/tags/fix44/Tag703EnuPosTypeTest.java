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

package com.hwtsllc.fixengine.tags.fix44;

import com.hwtsllc.fixengine.enums.fix44.Enum703PosType;
import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag703EnuPosTypeTest {
    Tag703EnuPosType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum703PosType oneEnum : Enum703PosType.values()) {
            tagData = new Tag703EnuPosType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum703PosType oneEnum : Enum703PosType.values()) {
            tagData = new Tag703EnuPosType(oneEnum);
            assertEquals( "FIX703_ENU_POS_TYPE", tagData.toFIXLabelString());
            assertEquals( "703", tagData.toFIXIDString());
            assertEquals( "POS_TYPE", tagData.toFIXNameString());
            assertEquals( "PosType", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum703PosType oneEnum : Enum703PosType.values()) {
            tagData = new Tag703EnuPosType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  703
         *  PosType
         *  String
         *  <p>    ALC - Allocation Trade Qty
         *  <p>    AS - Option Assignment
         *  <p>    ASF - As-of Trade Qty
         *  <p>    DLV - Delivery Qty
         *  <p>    ETR - Electronic Trade Qty
         */
        tagData = new Tag703EnuPosType( Enum703PosType.ALLOCATION_TRADE_QTY );
        assertEquals( "ALC", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag703EnuPosType(Enum703PosType.OPTION_ASSIGNMENT);
        assertEquals( "AS", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag703EnuPosType(Enum703PosType.AS_OF_TRADE_QTY);
        assertEquals( "ASF", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag703EnuPosType(Enum703PosType.DELIVERY_QTY);
        assertEquals( "DLV", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag703EnuPosType(Enum703PosType.ELECTRONIC_TRADE_QTY);
        assertEquals( "ETR", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    EX - Option Exercise Qty
         *  <p>    FIN - End-of-Day Qty
         *  <p>    IAS - Intra-spread Qty
         *  <p>    IES - Inter-spread Qty
         *  <p>    PA - Adjustment Qty
         */
        tagData = new Tag703EnuPosType(Enum703PosType.OPTION_EXERCISE_QTY);
        assertEquals( "EX", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag703EnuPosType(Enum703PosType.END_OF_DAY_QTY);
        assertEquals( "FIN", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag703EnuPosType(Enum703PosType.INTRA_SPREAD_QTY);
        assertEquals( "IAS", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag703EnuPosType(Enum703PosType.INTER_SPREAD_QTY);
        assertEquals( "IES", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag703EnuPosType(Enum703PosType.ADJUSTMENT_QTY);
        assertEquals( "PA", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    PIT - Pit Trade Qty
         *  <p>    SOD - Start-of-Day Qty
         *  <p>    SPL - Integral Split
         *  <p>    TA - Transaction from Assignment
         *  <p>    TOT - Total Transaction Qty
         */
        tagData = new Tag703EnuPosType(Enum703PosType.PIT_TRADE_QTY);
        assertEquals( "PIT", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag703EnuPosType(Enum703PosType.START_OF_DAY_QTY);
        assertEquals( "SOD", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag703EnuPosType(Enum703PosType.INTEGRAL_SPLIT);
        assertEquals( "SPL", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag703EnuPosType(Enum703PosType.TRANSACTION_FROM_ASSIGNMENT);
        assertEquals( "TA", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag703EnuPosType(Enum703PosType.TOTAL_TRANSACTION_QTY);
        assertEquals( "TOT", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    TQ - Transaction Quantity
         *  <p>    TRF - Transfer Trade Qty
         *  <p>    TX - Transaction from Exercise
         *  <p>    XM - Cross Margin Qty
         *  <p>    RCV - Receive Quantity
         */
        tagData = new Tag703EnuPosType(Enum703PosType.TRANSACTION_QUANTITY);
        assertEquals( "TQ", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag703EnuPosType(Enum703PosType.TRANSFER_TRADE_QTY);
        assertEquals( "TRF", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag703EnuPosType(Enum703PosType.TRANSACTION_FROM_EXERCISE);
        assertEquals( "TX", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag703EnuPosType(Enum703PosType.CROSS_MARGIN_QTY);
        assertEquals( "XM", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag703EnuPosType(Enum703PosType.RECEIVE_QUANTITY);
        assertEquals( "RCV", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    CAA - Corporate Action Adjustment
         *  <p>    DN - Delivery Notice Qty
         *  <p>    EP - Exchange for Physical Qty
         */
        tagData = new Tag703EnuPosType(Enum703PosType.CORPORATE_ACTION_ADJUSTMENT);
        assertEquals( "CAA", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag703EnuPosType(Enum703PosType.DELIVERY_NOTICE_QTY);
        assertEquals( "DN", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag703EnuPosType(Enum703PosType.EXCHANGE_FOR_PHYSICAL_QTY);
        assertEquals( "EP", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum703PosType oneEnum : Enum703PosType.values()) {
            tagData = new Tag703EnuPosType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum703PosType oneEnum : Enum703PosType.values()) {
            tagData = new Tag703EnuPosType(oneEnum);
            assertEquals( "Tag703EnuPosType\n" +
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