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

package com.hwtsllc.fixengine2022.fix44.enums;

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum703PosTypeTest {
    /**
     *  703
     *  PosType
     *  Used to identify the type of quantity that is being returned.
     *  Valid values:
     *      ALC - Allocation Trade Qty
     *      AS - Option Assignment
     *      ASF - As-of Trade Qty
     *      DLV - Delivery Qty
     *      ETR - Electronic Trade Qty
     *      EX - Option Exercise Qty
     *      FIN - End-of-Day Qty
     *      IAS - Intra-spread Qty
     *      IES - Inter-spread Qty
     *      PA - Adjustment Qty
     *      PIT - Pit Trade Qty
     *      SOD - Start-of-Day Qty
     *      SPL - Integral Split
     *      TA - Transaction from Assignment
     *      TOT - Total Transaction Qty
     *      TQ - Transaction Quantity
     *      TRF - Transfer Trade Qty
     *      TX - Transaction from Exercise
     *      XM - Cross Margin Qty
     *      RCV - Receive Quantity
     *      CAA - Corporate Action Adjustment
     *      DN - Delivery Notice Qty
     *      EP - Exchange for Physical Qty
     */
    @Test
    void EnumTest() {
        Enum703PosType enumType;

        enumType = Enum703PosType.ALLOCATION_TRADE_QTY;
        assertEquals( "ALC", enumType.getID());
        assertEquals( "ALLOCATION_TRADE_QTY", enumType.getName());
        assertEquals( "ALC - Allocation Trade Qty", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum703PosType.OPTION_ASSIGNMENT;
        assertEquals( "AS", enumType.getID());
        assertEquals( "OPTION_ASSIGNMENT", enumType.getName());
        assertEquals( "AS - Option Assignment", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum703PosType.AS_OF_TRADE_QTY;
        assertEquals( "ASF", enumType.getID());
        assertEquals( "AS_OF_TRADE_QTY", enumType.getName());
        assertEquals( "ASF - As-of Trade Qty", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum703PosType.DELIVERY_QTY;
        assertEquals( "DLV", enumType.getID());
        assertEquals( "DELIVERY_QTY", enumType.getName());
        assertEquals( "DLV - Delivery Qty", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum703PosType.ELECTRONIC_TRADE_QTY;
        assertEquals( "ETR", enumType.getID());
        assertEquals( "ELECTRONIC_TRADE_QTY", enumType.getName());
        assertEquals( "ETR - Electronic Trade Qty", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum703PosType.OPTION_EXERCISE_QTY;
        assertEquals( "EX", enumType.getID());
        assertEquals( "OPTION_EXERCISE_QTY", enumType.getName());
        assertEquals( "EX - Option Exercise Qty", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum703PosType.END_OF_DAY_QTY;
        assertEquals( "FIN", enumType.getID());
        assertEquals( "END_OF_DAY_QTY", enumType.getName());
        assertEquals( "FIN - End-of-Day Qty", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum703PosType.INTRA_SPREAD_QTY;
        assertEquals( "IAS", enumType.getID());
        assertEquals( "INTRA_SPREAD_QTY", enumType.getName());
        assertEquals( "IAS - Intra-spread Qty", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum703PosType.INTER_SPREAD_QTY;
        assertEquals( "IES", enumType.getID());
        assertEquals( "INTER_SPREAD_QTY", enumType.getName());
        assertEquals( "IES - Inter-spread Qty", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum703PosType.ADJUSTMENT_QTY;
        assertEquals( "PA", enumType.getID());
        assertEquals( "ADJUSTMENT_QTY", enumType.getName());
        assertEquals( "PA - Adjustment Qty", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum703PosType.PIT_TRADE_QTY;
        assertEquals( "PIT", enumType.getID());
        assertEquals( "PIT_TRADE_QTY", enumType.getName());
        assertEquals( "PIT - Pit Trade Qty", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum703PosType.START_OF_DAY_QTY;
        assertEquals( "SOD", enumType.getID());
        assertEquals( "START_OF_DAY_QTY", enumType.getName());
        assertEquals( "SOD - Start-of-Day Qty", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum703PosType.INTEGRAL_SPLIT;
        assertEquals( "SPL", enumType.getID());
        assertEquals( "INTEGRAL_SPLIT", enumType.getName());
        assertEquals( "SPL - Integral Split", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum703PosType.TRANSACTION_FROM_ASSIGNMENT;
        assertEquals( "TA", enumType.getID());
        assertEquals( "TRANSACTION_FROM_ASSIGNMENT", enumType.getName());
        assertEquals( "TA - Transaction from Assignment", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum703PosType.TOTAL_TRANSACTION_QTY;
        assertEquals( "TOT", enumType.getID());
        assertEquals( "TOTAL_TRANSACTION_QTY", enumType.getName());
        assertEquals( "TOT - Total Transaction Qty", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum703PosType.TRANSACTION_QUANTITY;
        assertEquals( "TQ", enumType.getID());
        assertEquals( "TRANSACTION_QUANTITY", enumType.getName());
        assertEquals( "TQ - Transaction Quantity", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum703PosType.TRANSFER_TRADE_QTY;
        assertEquals( "TRF", enumType.getID());
        assertEquals( "TRANSFER_TRADE_QTY", enumType.getName());
        assertEquals( "TRF - Transfer Trade Qty", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum703PosType.TRANSACTION_FROM_EXERCISE;
        assertEquals( "TX", enumType.getID());
        assertEquals( "TRANSACTION_FROM_EXERCISE", enumType.getName());
        assertEquals( "TX - Transaction from Exercise", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum703PosType.CROSS_MARGIN_QTY;
        assertEquals( "XM", enumType.getID());
        assertEquals( "CROSS_MARGIN_QTY", enumType.getName());
        assertEquals( "XM - Cross Margin Qty", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum703PosType.RECEIVE_QUANTITY;
        assertEquals( "RCV", enumType.getID());
        assertEquals( "RECEIVE_QUANTITY", enumType.getName());
        assertEquals( "RCV - Receive Quantity", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum703PosType.CORPORATE_ACTION_ADJUSTMENT;
        assertEquals( "CAA", enumType.getID());
        assertEquals( "CORPORATE_ACTION_ADJUSTMENT", enumType.getName());
        assertEquals( "CAA - Corporate Action Adjustment", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum703PosType.DELIVERY_NOTICE_QTY;
        assertEquals( "DN", enumType.getID());
        assertEquals( "DELIVERY_NOTICE_QTY", enumType.getName());
        assertEquals( "DN - Delivery Notice Qty", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum703PosType.EXCHANGE_FOR_PHYSICAL_QTY;
        assertEquals( "EP", enumType.getID());
        assertEquals( "EXCHANGE_FOR_PHYSICAL_QTY", enumType.getName());
        assertEquals( "EP - Exchange for Physical Qty", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}