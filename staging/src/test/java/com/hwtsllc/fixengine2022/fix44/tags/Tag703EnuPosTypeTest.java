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
import com.hwtsllc.fixengine2022.fix44.enums.Enum698YieldRedemptionPriceType;
import com.hwtsllc.fixengine2022.fix44.enums.Enum703PosType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag703EnuPosTypeTest {
    @Test
    void FIX0703Test() {
        FIX44 fixData = FIX44.FIX703_ENU_POS_TYPE;
        assertEquals( "", fixData.getID());
        assertEquals( "", fixData.getName());
        assertEquals( "", fixData.getDescription());
        assertNotEquals( FIX44.JUNK_ID, fixData.getID());
        assertNotEquals( FIX44.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, fixData.getDescription());
    }
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
    void Tag0703Test() {
        Tag703EnuPosType tagData;

        tagData = Enum703PosType.ALLOCATION_TRADE_QTY);
        tagData = Enum703PosType.OPTION_ASSIGNMENT);
        tagData = Enum703PosType.AS_OF_TRADE_QTY);
        tagData = Enum703PosType.DELIVERY_QTY);
        tagData = Enum703PosType.ELECTRONIC_TRADE_QTY);
        tagData = Enum703PosType.OPTION_EXERCISE_QTY);
        tagData = Enum703PosType.END_OF_DAY_QTY);
        tagData = Enum703PosType.INTRA_SPREAD_QTY);
        tagData = Enum703PosType.INTER_SPREAD_QTY);
        tagData = Enum703PosType.ADJUSTMENT_QTY);
        tagData = Enum703PosType.PIT_TRADE_QTY);
        tagData = Enum703PosType.START_OF_DAY_QTY);
        tagData = Enum703PosType.INTEGRAL_SPLIT);
        tagData = Enum703PosType.TRANSACTION_FROM_ASSIGNMENT);
        tagData = Enum703PosType.TOTAL_TRANSACTION_QTY);
        tagData = Enum703PosType.TRANSACTION_QUANTITY);
        tagData = Enum703PosType.TRANSFER_TRADE_QTY);
        tagData = Enum703PosType.TRANSACTION_FROM_EXERCISE);
        tagData = Enum703PosType.CROSS_MARGIN_QTY);
        tagData = Enum703PosType.RECEIVE_QUANTITY);
        tagData = Enum703PosType.CORPORATE_ACTION_ADJUSTMENT);
        tagData = Enum703PosType.DELIVERY_NOTICE_QTY);
        tagData = Enum703PosType.EXCHANGE_FOR_PHYSICAL_QTY);

        assertEquals( Enum703PosType.EXCHANGE_FOR_PHYSICAL_QTY.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}