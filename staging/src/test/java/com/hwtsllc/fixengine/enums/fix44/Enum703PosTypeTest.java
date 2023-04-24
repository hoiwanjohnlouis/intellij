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

package com.hwtsllc.fixengine.enums.fix44;

import com.hwtsllc.fixengine.interfaces.MyTestValues;
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
class Enum703PosTypeTest {
    @Test
    void EnumTest() {
        Enum703PosType enumType;

        enumType = Enum703PosType.ALLOCATION_TRADE_QTY;
        assertEquals( "ALC", enumType.toFIXIDString());
        assertEquals( "ALLOCATION_TRADE_QTY", enumType.toFIXNameString());
        assertEquals( "ALC - Allocation Trade Qty", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum703PosType.OPTION_ASSIGNMENT;
        assertEquals( "AS", enumType.toFIXIDString());
        assertEquals( "OPTION_ASSIGNMENT", enumType.toFIXNameString());
        assertEquals( "AS - Option Assignment", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum703PosType.AS_OF_TRADE_QTY;
        assertEquals( "ASF", enumType.toFIXIDString());
        assertEquals( "AS_OF_TRADE_QTY", enumType.toFIXNameString());
        assertEquals( "ASF - As-of Trade Qty", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum703PosType.DELIVERY_QTY;
        assertEquals( "DLV", enumType.toFIXIDString());
        assertEquals( "DELIVERY_QTY", enumType.toFIXNameString());
        assertEquals( "DLV - Delivery Qty", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum703PosType.ELECTRONIC_TRADE_QTY;
        assertEquals( "ETR", enumType.toFIXIDString());
        assertEquals( "ELECTRONIC_TRADE_QTY", enumType.toFIXNameString());
        assertEquals( "ETR - Electronic Trade Qty", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum703PosType.OPTION_EXERCISE_QTY;
        assertEquals( "EX", enumType.toFIXIDString());
        assertEquals( "OPTION_EXERCISE_QTY", enumType.toFIXNameString());
        assertEquals( "EX - Option Exercise Qty", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum703PosType.END_OF_DAY_QTY;
        assertEquals( "FIN", enumType.toFIXIDString());
        assertEquals( "END_OF_DAY_QTY", enumType.toFIXNameString());
        assertEquals( "FIN - End-of-Day Qty", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum703PosType.INTRA_SPREAD_QTY;
        assertEquals( "IAS", enumType.toFIXIDString());
        assertEquals( "INTRA_SPREAD_QTY", enumType.toFIXNameString());
        assertEquals( "IAS - Intra-spread Qty", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum703PosType.INTER_SPREAD_QTY;
        assertEquals( "IES", enumType.toFIXIDString());
        assertEquals( "INTER_SPREAD_QTY", enumType.toFIXNameString());
        assertEquals( "IES - Inter-spread Qty", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum703PosType.ADJUSTMENT_QTY;
        assertEquals( "PA", enumType.toFIXIDString());
        assertEquals( "ADJUSTMENT_QTY", enumType.toFIXNameString());
        assertEquals( "PA - Adjustment Qty", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum703PosType.PIT_TRADE_QTY;
        assertEquals( "PIT", enumType.toFIXIDString());
        assertEquals( "PIT_TRADE_QTY", enumType.toFIXNameString());
        assertEquals( "PIT - Pit Trade Qty", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum703PosType.START_OF_DAY_QTY;
        assertEquals( "SOD", enumType.toFIXIDString());
        assertEquals( "START_OF_DAY_QTY", enumType.toFIXNameString());
        assertEquals( "SOD - Start-of-Day Qty", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum703PosType.INTEGRAL_SPLIT;
        assertEquals( "SPL", enumType.toFIXIDString());
        assertEquals( "INTEGRAL_SPLIT", enumType.toFIXNameString());
        assertEquals( "SPL - Integral Split", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum703PosType.TRANSACTION_FROM_ASSIGNMENT;
        assertEquals( "TA", enumType.toFIXIDString());
        assertEquals( "TRANSACTION_FROM_ASSIGNMENT", enumType.toFIXNameString());
        assertEquals( "TA - Transaction from Assignment", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum703PosType.TOTAL_TRANSACTION_QTY;
        assertEquals( "TOT", enumType.toFIXIDString());
        assertEquals( "TOTAL_TRANSACTION_QTY", enumType.toFIXNameString());
        assertEquals( "TOT - Total Transaction Qty", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum703PosType.TRANSACTION_QUANTITY;
        assertEquals( "TQ", enumType.toFIXIDString());
        assertEquals( "TRANSACTION_QUANTITY", enumType.toFIXNameString());
        assertEquals( "TQ - Transaction Quantity", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum703PosType.TRANSFER_TRADE_QTY;
        assertEquals( "TRF", enumType.toFIXIDString());
        assertEquals( "TRANSFER_TRADE_QTY", enumType.toFIXNameString());
        assertEquals( "TRF - Transfer Trade Qty", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum703PosType.TRANSACTION_FROM_EXERCISE;
        assertEquals( "TX", enumType.toFIXIDString());
        assertEquals( "TRANSACTION_FROM_EXERCISE", enumType.toFIXNameString());
        assertEquals( "TX - Transaction from Exercise", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum703PosType.CROSS_MARGIN_QTY;
        assertEquals( "XM", enumType.toFIXIDString());
        assertEquals( "CROSS_MARGIN_QTY", enumType.toFIXNameString());
        assertEquals( "XM - Cross Margin Qty", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum703PosType.RECEIVE_QUANTITY;
        assertEquals( "RCV", enumType.toFIXIDString());
        assertEquals( "RECEIVE_QUANTITY", enumType.toFIXNameString());
        assertEquals( "RCV - Receive Quantity", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum703PosType.CORPORATE_ACTION_ADJUSTMENT;
        assertEquals( "CAA", enumType.toFIXIDString());
        assertEquals( "CORPORATE_ACTION_ADJUSTMENT", enumType.toFIXNameString());
        assertEquals( "CAA - Corporate Action Adjustment", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum703PosType.DELIVERY_NOTICE_QTY;
        assertEquals( "DN", enumType.toFIXIDString());
        assertEquals( "DELIVERY_NOTICE_QTY", enumType.toFIXNameString());
        assertEquals( "DN - Delivery Notice Qty", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum703PosType.EXCHANGE_FOR_PHYSICAL_QTY;
        assertEquals( "EP", enumType.toFIXIDString());
        assertEquals( "EXCHANGE_FOR_PHYSICAL_QTY", enumType.toFIXNameString());
        assertEquals( "EP - Exchange for Physical Qty", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}