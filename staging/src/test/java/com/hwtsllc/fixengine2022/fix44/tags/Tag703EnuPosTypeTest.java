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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix44.enums.Enum703PosType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
class Tag703EnuPosTypeTest {
    @Test
    void FIX0703Test() {
        FIX44 fixData = FIX44.FIX703_ENU_POS_TYPE;
        assertEquals( "703", fixData.getID());
        assertEquals( "POS_TYPE", fixData.getName());
        assertEquals( "PosType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0703Test() {
        Log703EnuPosType tagData;

        tagData = new Log703EnuPosType(Enum703PosType.ALLOCATION_TRADE_QTY);
        assertEquals( Enum703PosType.ALLOCATION_TRADE_QTY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log703EnuPosType(Enum703PosType.OPTION_ASSIGNMENT);
        assertEquals( Enum703PosType.OPTION_ASSIGNMENT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log703EnuPosType(Enum703PosType.AS_OF_TRADE_QTY);
        assertEquals( Enum703PosType.AS_OF_TRADE_QTY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log703EnuPosType(Enum703PosType.DELIVERY_QTY);
        assertEquals( Enum703PosType.DELIVERY_QTY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log703EnuPosType(Enum703PosType.ELECTRONIC_TRADE_QTY);
        assertEquals( Enum703PosType.ELECTRONIC_TRADE_QTY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log703EnuPosType(Enum703PosType.OPTION_EXERCISE_QTY);
        assertEquals( Enum703PosType.OPTION_EXERCISE_QTY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log703EnuPosType(Enum703PosType.END_OF_DAY_QTY);
        assertEquals( Enum703PosType.END_OF_DAY_QTY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log703EnuPosType(Enum703PosType.INTRA_SPREAD_QTY);
        assertEquals( Enum703PosType.INTRA_SPREAD_QTY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log703EnuPosType(Enum703PosType.INTER_SPREAD_QTY);
        assertEquals( Enum703PosType.INTER_SPREAD_QTY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log703EnuPosType(Enum703PosType.ADJUSTMENT_QTY);
        assertEquals( Enum703PosType.ADJUSTMENT_QTY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log703EnuPosType(Enum703PosType.PIT_TRADE_QTY);
        assertEquals( Enum703PosType.PIT_TRADE_QTY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log703EnuPosType(Enum703PosType.START_OF_DAY_QTY);
        assertEquals( Enum703PosType.START_OF_DAY_QTY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log703EnuPosType(Enum703PosType.INTEGRAL_SPLIT);
        assertEquals( Enum703PosType.INTEGRAL_SPLIT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log703EnuPosType(Enum703PosType.TRANSACTION_FROM_ASSIGNMENT);
        assertEquals( Enum703PosType.TRANSACTION_FROM_ASSIGNMENT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log703EnuPosType(Enum703PosType.TOTAL_TRANSACTION_QTY);
        assertEquals( Enum703PosType.TOTAL_TRANSACTION_QTY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log703EnuPosType(Enum703PosType.TRANSACTION_QUANTITY);
        assertEquals( Enum703PosType.TRANSACTION_QUANTITY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log703EnuPosType(Enum703PosType.TRANSFER_TRADE_QTY);
        assertEquals( Enum703PosType.TRANSFER_TRADE_QTY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log703EnuPosType(Enum703PosType.TRANSACTION_FROM_EXERCISE);
        assertEquals( Enum703PosType.TRANSACTION_FROM_EXERCISE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log703EnuPosType(Enum703PosType.CROSS_MARGIN_QTY);
        assertEquals( Enum703PosType.CROSS_MARGIN_QTY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log703EnuPosType(Enum703PosType.RECEIVE_QUANTITY);
        assertEquals( Enum703PosType.RECEIVE_QUANTITY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log703EnuPosType(Enum703PosType.CORPORATE_ACTION_ADJUSTMENT);
        assertEquals( Enum703PosType.CORPORATE_ACTION_ADJUSTMENT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log703EnuPosType(Enum703PosType.DELIVERY_NOTICE_QTY);
        assertEquals( Enum703PosType.DELIVERY_NOTICE_QTY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log703EnuPosType(Enum703PosType.EXCHANGE_FOR_PHYSICAL_QTY);
        assertEquals( Enum703PosType.EXCHANGE_FOR_PHYSICAL_QTY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}