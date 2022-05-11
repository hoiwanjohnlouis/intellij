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

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.MyEnumOrderHandlingInst;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
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
class Tag1031EnuCustOrderHandlingInstTest {
    @Test
    void FIX1031Test() {
        FIX50 fixData = FIX50.FIX1031_ENU_CUST_ORDER_HANDLING_INST;
        assertEquals( "1031", fixData.getID());
        assertEquals( "CUST_ORDER_HANDLING_INST", fixData.getName());
        assertEquals( "CustOrderHandlingInst", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag1031Test() {
        Tag1031EnuCustOrderHandlingInst tagData;

        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.ADD_ON_ORDER );
        assertEquals( MyEnumOrderHandlingInst.ADD_ON_ORDER.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.ALL_OR_NONE );
        assertEquals( MyEnumOrderHandlingInst.ALL_OR_NONE.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.CASH_NOT_HELD );
        assertEquals( MyEnumOrderHandlingInst.CASH_NOT_HELD.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.DIRECTED_ORDER );
        assertEquals( MyEnumOrderHandlingInst.DIRECTED_ORDER.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.EXCHANGE_FOR_PHYSICAL );
        assertEquals( MyEnumOrderHandlingInst.EXCHANGE_FOR_PHYSICAL.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.FILL_OR_KILL );
        assertEquals( MyEnumOrderHandlingInst.FILL_OR_KILL.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.IMBALANCE_ONLY );
        assertEquals( MyEnumOrderHandlingInst.IMBALANCE_ONLY.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.IMMEDIATE_OR_CANCEL );
        assertEquals( MyEnumOrderHandlingInst.IMMEDIATE_OR_CANCEL.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.LIMIT_ON_OPEN );
        assertEquals( MyEnumOrderHandlingInst.LIMIT_ON_OPEN.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.LIMIT_ON_CLOSE );
        assertEquals( MyEnumOrderHandlingInst.LIMIT_ON_CLOSE.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.MARKET_AT_OPEN );
        assertEquals( MyEnumOrderHandlingInst.MARKET_AT_OPEN.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.MARKET_AT_CLOSE );
        assertEquals( MyEnumOrderHandlingInst.MARKET_AT_CLOSE.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.MARKET_ON_OPEN );
        assertEquals( MyEnumOrderHandlingInst.MARKET_ON_OPEN.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.MARKET_ON_CLOSE );
        assertEquals( MyEnumOrderHandlingInst.MARKET_ON_CLOSE.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.MINIMUM_QUANTITY );
        assertEquals( MyEnumOrderHandlingInst.MINIMUM_QUANTITY.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.NOT_HELD );
        assertEquals( MyEnumOrderHandlingInst.NOT_HELD.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.OVER_THE_DAY );
        assertEquals( MyEnumOrderHandlingInst.OVER_THE_DAY.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.PEGGED );
        assertEquals( MyEnumOrderHandlingInst.PEGGED.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.RESERVE_SIZE_ORDER );
        assertEquals( MyEnumOrderHandlingInst.RESERVE_SIZE_ORDER.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.STOP_STOCK_TRANSACTION );
        assertEquals( MyEnumOrderHandlingInst.STOP_STOCK_TRANSACTION.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.SCALE );
        assertEquals( MyEnumOrderHandlingInst.SCALE.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.TIME_ORDER );
        assertEquals( MyEnumOrderHandlingInst.TIME_ORDER.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.TRAILING_STOP );
        assertEquals( MyEnumOrderHandlingInst.TRAILING_STOP.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1031EnuCustOrderHandlingInst( MyEnumOrderHandlingInst.WORK );
        assertEquals( MyEnumOrderHandlingInst.WORK.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
}