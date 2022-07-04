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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.fix44.enums.Enum703PosType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  703
 *  PosType
 *  String
 *  <p></p>
 *  Used to identify the type of quantity that is being returned.
 *  <p></p>
 *  Valid values:
 *  <p>    ALC - Allocation Trade Qty
 *  <p>    AS - Option Assignment
 *  <p>    ASF - As-of Trade Qty
 *  <p>    DLV - Delivery Qty
 *  <p>    ETR - Electronic Trade Qty
 *  <p></p>
 *  <p>    EX - Option Exercise Qty
 *  <p>    FIN - End-of-Day Qty
 *  <p>    IAS - Intra-spread Qty
 *  <p>    IES - Inter-spread Qty
 *  <p>    PA - Adjustment Qty
 *  <p></p>
 *  <p>    PIT - Pit Trade Qty
 *  <p>    SOD - Start-of-Day Qty
 *  <p>    SPL - Integral Split
 *  <p>    TA - Transaction from Assignment
 *  <p>    TOT - Total Transaction Qty
 *  <p></p>
 *  <p>    TQ - Transaction Quantity
 *  <p>    TRF - Transfer Trade Qty
 *  <p>    TX - Transaction from Exercise
 *  <p>    XM - Cross Margin Qty
 *  <p>    RCV - Receive Quantity
 *  <p></p>
 *  <p>    CAA - Corporate Action Adjustment
 *  <p>    DN - Delivery Notice Qty
 *  <p>    EP - Exchange for Physical Qty
 */
class Tag703EnuPosTypeTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX703_ENU_POS_TYPE;
        assertEquals( "703", fixData.toEnumIDString());
        assertEquals( "POS_TYPE", fixData.toEnumNameString());
        assertEquals( "PosType", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0703Test() {
        Tag703EnuPosType tagData;
        Enum703PosType oneElement;

        oneElement = Enum703PosType.ALLOCATION_TRADE_QTY;
        tagData = new Tag703EnuPosType( oneElement );
        assertEquals( oneElement.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "703", tagData.toEnumIDString());
        assertEquals( "POS_TYPE", tagData.toEnumNameString());
        assertEquals( "PosType", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag703EnuPosType(Enum703PosType.OPTION_ASSIGNMENT);
        assertEquals( Enum703PosType.OPTION_ASSIGNMENT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag703EnuPosType(Enum703PosType.AS_OF_TRADE_QTY);
        assertEquals( Enum703PosType.AS_OF_TRADE_QTY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag703EnuPosType(Enum703PosType.DELIVERY_QTY);
        assertEquals( Enum703PosType.DELIVERY_QTY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag703EnuPosType(Enum703PosType.ELECTRONIC_TRADE_QTY);
        assertEquals( Enum703PosType.ELECTRONIC_TRADE_QTY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag703EnuPosType(Enum703PosType.OPTION_EXERCISE_QTY);
        assertEquals( Enum703PosType.OPTION_EXERCISE_QTY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag703EnuPosType(Enum703PosType.END_OF_DAY_QTY);
        assertEquals( Enum703PosType.END_OF_DAY_QTY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag703EnuPosType(Enum703PosType.INTRA_SPREAD_QTY);
        assertEquals( Enum703PosType.INTRA_SPREAD_QTY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag703EnuPosType(Enum703PosType.INTER_SPREAD_QTY);
        assertEquals( Enum703PosType.INTER_SPREAD_QTY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag703EnuPosType(Enum703PosType.ADJUSTMENT_QTY);
        assertEquals( Enum703PosType.ADJUSTMENT_QTY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag703EnuPosType(Enum703PosType.PIT_TRADE_QTY);
        assertEquals( Enum703PosType.PIT_TRADE_QTY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag703EnuPosType(Enum703PosType.START_OF_DAY_QTY);
        assertEquals( Enum703PosType.START_OF_DAY_QTY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag703EnuPosType(Enum703PosType.INTEGRAL_SPLIT);
        assertEquals( Enum703PosType.INTEGRAL_SPLIT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag703EnuPosType(Enum703PosType.TRANSACTION_FROM_ASSIGNMENT);
        assertEquals( Enum703PosType.TRANSACTION_FROM_ASSIGNMENT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag703EnuPosType(Enum703PosType.TOTAL_TRANSACTION_QTY);
        assertEquals( Enum703PosType.TOTAL_TRANSACTION_QTY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag703EnuPosType(Enum703PosType.TRANSACTION_QUANTITY);
        assertEquals( Enum703PosType.TRANSACTION_QUANTITY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag703EnuPosType(Enum703PosType.TRANSFER_TRADE_QTY);
        assertEquals( Enum703PosType.TRANSFER_TRADE_QTY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag703EnuPosType(Enum703PosType.TRANSACTION_FROM_EXERCISE);
        assertEquals( Enum703PosType.TRANSACTION_FROM_EXERCISE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag703EnuPosType(Enum703PosType.CROSS_MARGIN_QTY);
        assertEquals( Enum703PosType.CROSS_MARGIN_QTY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag703EnuPosType(Enum703PosType.RECEIVE_QUANTITY);
        assertEquals( Enum703PosType.RECEIVE_QUANTITY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag703EnuPosType(Enum703PosType.CORPORATE_ACTION_ADJUSTMENT);
        assertEquals( Enum703PosType.CORPORATE_ACTION_ADJUSTMENT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag703EnuPosType(Enum703PosType.DELIVERY_NOTICE_QTY);
        assertEquals( Enum703PosType.DELIVERY_NOTICE_QTY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag703EnuPosType(Enum703PosType.EXCHANGE_FOR_PHYSICAL_QTY);
        assertEquals( Enum703PosType.EXCHANGE_FOR_PHYSICAL_QTY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag703EnuPosType tagData;

        // loop around the ENUM and process
        for ( Enum703PosType oneEnum : Enum703PosType.values()) {
            tagData = new Tag703EnuPosType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag703EnuPosType tagData;

        // loop around the ENUM and process
        for (Enum703PosType oneEnum : Enum703PosType.values()) {
            tagData = new Tag703EnuPosType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag703EnuPosType tagData;

        // loop around the ENUM and process
        for (Enum703PosType oneEnum : Enum703PosType.values()) {
            tagData = new Tag703EnuPosType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag703EnuPosType tagData;

        // loop around the ENUM and process
        for (Enum703PosType oneEnum : Enum703PosType.values()) {
            tagData = new Tag703EnuPosType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag703EnuPosType tagData;

        // loop around the ENUM and process
        for (Enum703PosType oneEnum : Enum703PosType.values()) {
            tagData = new Tag703EnuPosType(oneEnum);
            assertEquals( "Tag703EnuPosType\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toEnumIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}