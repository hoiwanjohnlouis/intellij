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

package com.hwtsllc.fixengine2022.datatypes;

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
class MyEnumOrderHandlingInstTest {
    @Test
    void EnumTest() {
        MyEnumOrderHandlingInst enumType;

        enumType = MyEnumOrderHandlingInst.ADD_ON_ORDER;
        assertEquals( "ADD", enumType.getID() );
        assertEquals( "ADD_ON_ORDER", enumType.getName() );
        assertEquals( "ADD - Add On Order", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription() );

        enumType = MyEnumOrderHandlingInst.ALL_OR_NONE;
        assertEquals( "AON", enumType.getID() );
        assertEquals( "ALL_OR_NONE", enumType.getName() );
        assertEquals( "AON - All Or None", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription() );

        enumType = MyEnumOrderHandlingInst.CASH_NOT_HELD;
        assertEquals( "CNH", enumType.getID() );
        assertEquals( "CASH_NOT_HELD", enumType.getName() );
        assertEquals( "CNH - Cash Not Held", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription() );

        enumType = MyEnumOrderHandlingInst.DIRECTED_ORDER;
        assertEquals( "DIR", enumType.getID() );
        assertEquals( "DIRECTED_ORDER", enumType.getName() );
        assertEquals( "DIR - Directed Order", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription() );

        enumType = MyEnumOrderHandlingInst.EXCHANGE_FOR_PHYSICAL;
        assertEquals( "E.W", enumType.getID() );
        assertEquals( "EXCHANGE_FOR_PHYSICAL", enumType.getName() );
        assertEquals( "E.W - Exchange for Physical Transaction", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription() );


        enumType = MyEnumOrderHandlingInst.FILL_OR_KILL;
        assertEquals( "FOK", enumType.getID() );
        assertEquals( "FILL_OR_KILL", enumType.getName() );
        assertEquals( "FOK - Fill Or Kill", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription() );

        enumType = MyEnumOrderHandlingInst.IMBALANCE_ONLY;
        assertEquals( "IO", enumType.getID() );
        assertEquals( "IMBALANCE_ONLY", enumType.getName() );
        assertEquals( "IO - Imbalance Only", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription() );

        enumType = MyEnumOrderHandlingInst.IMMEDIATE_OR_CANCEL;
        assertEquals( "IOC", enumType.getID() );
        assertEquals( "IMMEDIATE_OR_CANCEL", enumType.getName() );
        assertEquals( "IOC - Immediate Or Cancel", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription() );

        enumType = MyEnumOrderHandlingInst.LIMIT_ON_OPEN;
        assertEquals( "LOO", enumType.getID() );
        assertEquals( "LIMIT_ON_OPEN", enumType.getName() );
        assertEquals( "LOO - Limit On Open", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription() );

        enumType = MyEnumOrderHandlingInst.LIMIT_ON_CLOSE;
        assertEquals( "LOC", enumType.getID() );
        assertEquals( "LIMIT_ON_CLOSE", enumType.getName() );
        assertEquals( "LOC - Limit On Close", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription() );


        enumType = MyEnumOrderHandlingInst.MARKET_AT_OPEN;
        assertEquals( "MAO", enumType.getID() );
        assertEquals( "MARKET_AT_OPEN", enumType.getName() );
        assertEquals( "MAO - Market At Open", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription() );

        enumType = MyEnumOrderHandlingInst.MARKET_AT_CLOSE;
        assertEquals( "MAC", enumType.getID() );
        assertEquals( "MARKET_AT_CLOSE", enumType.getName() );
        assertEquals( "MAC - Market At Close", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription() );

        enumType = MyEnumOrderHandlingInst.MARKET_ON_OPEN;
        assertEquals( "MOO", enumType.getID() );
        assertEquals( "MARKET_ON_OPEN", enumType.getName() );
        assertEquals( "MOO - Market On Open", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription() );

        enumType = MyEnumOrderHandlingInst.MARKET_ON_CLOSE;
        assertEquals( "MOC", enumType.getID() );
        assertEquals( "MARKET_ON_CLOSE", enumType.getName() );
        assertEquals( "MOC - Market On Close", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription() );

        enumType = MyEnumOrderHandlingInst.MINIMUM_QUANTITY;
        assertEquals( "MQT", enumType.getID() );
        assertEquals( "MINIMUM_QUANTITY", enumType.getName() );
        assertEquals( "MQT - Minimum Quantity", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription() );


        enumType = MyEnumOrderHandlingInst.NOT_HELD;
        assertEquals( "NH", enumType.getID() );
        assertEquals( "NOT_HELD", enumType.getName() );
        assertEquals( "NH - Not Held", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription() );

        enumType = MyEnumOrderHandlingInst.OVER_THE_DAY;
        assertEquals( "OVD", enumType.getID() );
        assertEquals( "OVER_THE_DAY", enumType.getName() );
        assertEquals( "OVD - Over the Day", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription() );

        enumType = MyEnumOrderHandlingInst.PEGGED;
        assertEquals( "PEG", enumType.getID() );
        assertEquals( "PEGGED", enumType.getName() );
        assertEquals( "PEG - Pegged", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription() );

        enumType = MyEnumOrderHandlingInst.RESERVE_SIZE_ORDER;
        assertEquals( "RSV", enumType.getID() );
        assertEquals( "RESERVE_SIZE_ORDER", enumType.getName() );
        assertEquals( "RSV - Reserve Size Order", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription() );

        enumType = MyEnumOrderHandlingInst.STOP_STOCK_TRANSACTION;
        assertEquals( "S.W", enumType.getID() );
        assertEquals( "STOP_STOCK_TRANSACTION", enumType.getName() );
        assertEquals( "S.W - Stop Stock Transaction", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription() );


        enumType = MyEnumOrderHandlingInst.SCALE;
        assertEquals( "SCL", enumType.getID() );
        assertEquals( "SCALE", enumType.getName() );
        assertEquals( "SCL - Scale", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription() );

        enumType = MyEnumOrderHandlingInst.TIME_ORDER;
        assertEquals( "TMO", enumType.getID() );
        assertEquals( "TIME_ORDER", enumType.getName() );
        assertEquals( "TMO - Time Order", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription() );

        enumType = MyEnumOrderHandlingInst.TRAILING_STOP;
        assertEquals( "TS", enumType.getID() );
        assertEquals( "TRAILING_STOP", enumType.getName() );
        assertEquals( "TS - Trailing Stop", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription() );

        enumType = MyEnumOrderHandlingInst.WORK;
        assertEquals( "WRK", enumType.getID() );
        assertEquals( "WORK", enumType.getName() );
        assertEquals( "WRK - Work", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription() );
    }
}