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

package com.hwtsllc.fixengine.datatypes;

import com.hwtsllc.fixengine.interfaces.MyTestValues;
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
        assertEquals( "ADD", enumType.toFIXIDString() );
        assertEquals( "ADD_ON_ORDER", enumType.toFIXNameString() );
        assertEquals( "ADD - Add On Order", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString() );

        enumType = MyEnumOrderHandlingInst.ALL_OR_NONE;
        assertEquals( "AON", enumType.toFIXIDString() );
        assertEquals( "ALL_OR_NONE", enumType.toFIXNameString() );
        assertEquals( "AON - All Or None", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString() );

        enumType = MyEnumOrderHandlingInst.CASH_NOT_HELD;
        assertEquals( "CNH", enumType.toFIXIDString() );
        assertEquals( "CASH_NOT_HELD", enumType.toFIXNameString() );
        assertEquals( "CNH - Cash Not Held", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString() );

        enumType = MyEnumOrderHandlingInst.DIRECTED_ORDER;
        assertEquals( "DIR", enumType.toFIXIDString() );
        assertEquals( "DIRECTED_ORDER", enumType.toFIXNameString() );
        assertEquals( "DIR - Directed Order", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString() );

        enumType = MyEnumOrderHandlingInst.EXCHANGE_FOR_PHYSICAL;
        assertEquals( "E.W", enumType.toFIXIDString() );
        assertEquals( "EXCHANGE_FOR_PHYSICAL", enumType.toFIXNameString() );
        assertEquals( "E.W - Exchange for Physical Transaction", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString() );


        enumType = MyEnumOrderHandlingInst.FILL_OR_KILL;
        assertEquals( "FOK", enumType.toFIXIDString() );
        assertEquals( "FILL_OR_KILL", enumType.toFIXNameString() );
        assertEquals( "FOK - Fill Or Kill", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString() );

        enumType = MyEnumOrderHandlingInst.IMBALANCE_ONLY;
        assertEquals( "IO", enumType.toFIXIDString() );
        assertEquals( "IMBALANCE_ONLY", enumType.toFIXNameString() );
        assertEquals( "IO - Imbalance Only", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString() );

        enumType = MyEnumOrderHandlingInst.IMMEDIATE_OR_CANCEL;
        assertEquals( "IOC", enumType.toFIXIDString() );
        assertEquals( "IMMEDIATE_OR_CANCEL", enumType.toFIXNameString() );
        assertEquals( "IOC - Immediate Or Cancel", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString() );

        enumType = MyEnumOrderHandlingInst.LIMIT_ON_OPEN;
        assertEquals( "LOO", enumType.toFIXIDString() );
        assertEquals( "LIMIT_ON_OPEN", enumType.toFIXNameString() );
        assertEquals( "LOO - Limit On Open", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString() );

        enumType = MyEnumOrderHandlingInst.LIMIT_ON_CLOSE;
        assertEquals( "LOC", enumType.toFIXIDString() );
        assertEquals( "LIMIT_ON_CLOSE", enumType.toFIXNameString() );
        assertEquals( "LOC - Limit On Close", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString() );


        enumType = MyEnumOrderHandlingInst.MARKET_AT_OPEN;
        assertEquals( "MAO", enumType.toFIXIDString() );
        assertEquals( "MARKET_AT_OPEN", enumType.toFIXNameString() );
        assertEquals( "MAO - Market At Open", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString() );

        enumType = MyEnumOrderHandlingInst.MARKET_AT_CLOSE;
        assertEquals( "MAC", enumType.toFIXIDString() );
        assertEquals( "MARKET_AT_CLOSE", enumType.toFIXNameString() );
        assertEquals( "MAC - Market At Close", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString() );

        enumType = MyEnumOrderHandlingInst.MARKET_ON_OPEN;
        assertEquals( "MOO", enumType.toFIXIDString() );
        assertEquals( "MARKET_ON_OPEN", enumType.toFIXNameString() );
        assertEquals( "MOO - Market On Open", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString() );

        enumType = MyEnumOrderHandlingInst.MARKET_ON_CLOSE;
        assertEquals( "MOC", enumType.toFIXIDString() );
        assertEquals( "MARKET_ON_CLOSE", enumType.toFIXNameString() );
        assertEquals( "MOC - Market On Close", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString() );

        enumType = MyEnumOrderHandlingInst.MINIMUM_QUANTITY;
        assertEquals( "MQT", enumType.toFIXIDString() );
        assertEquals( "MINIMUM_QUANTITY", enumType.toFIXNameString() );
        assertEquals( "MQT - Minimum Quantity", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString() );


        enumType = MyEnumOrderHandlingInst.NOT_HELD;
        assertEquals( "NH", enumType.toFIXIDString() );
        assertEquals( "NOT_HELD", enumType.toFIXNameString() );
        assertEquals( "NH - Not Held", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString() );

        enumType = MyEnumOrderHandlingInst.OVER_THE_DAY;
        assertEquals( "OVD", enumType.toFIXIDString() );
        assertEquals( "OVER_THE_DAY", enumType.toFIXNameString() );
        assertEquals( "OVD - Over the Day", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString() );

        enumType = MyEnumOrderHandlingInst.PEGGED;
        assertEquals( "PEG", enumType.toFIXIDString() );
        assertEquals( "PEGGED", enumType.toFIXNameString() );
        assertEquals( "PEG - Pegged", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString() );

        enumType = MyEnumOrderHandlingInst.RESERVE_SIZE_ORDER;
        assertEquals( "RSV", enumType.toFIXIDString() );
        assertEquals( "RESERVE_SIZE_ORDER", enumType.toFIXNameString() );
        assertEquals( "RSV - Reserve Size Order", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString() );

        enumType = MyEnumOrderHandlingInst.STOP_STOCK_TRANSACTION;
        assertEquals( "S.W", enumType.toFIXIDString() );
        assertEquals( "STOP_STOCK_TRANSACTION", enumType.toFIXNameString() );
        assertEquals( "S.W - Stop Stock Transaction", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString() );


        enumType = MyEnumOrderHandlingInst.SCALE;
        assertEquals( "SCL", enumType.toFIXIDString() );
        assertEquals( "SCALE", enumType.toFIXNameString() );
        assertEquals( "SCL - Scale", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString() );

        enumType = MyEnumOrderHandlingInst.TIME_ORDER;
        assertEquals( "TMO", enumType.toFIXIDString() );
        assertEquals( "TIME_ORDER", enumType.toFIXNameString() );
        assertEquals( "TMO - Time Order", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString() );

        enumType = MyEnumOrderHandlingInst.TRAILING_STOP;
        assertEquals( "TS", enumType.toFIXIDString() );
        assertEquals( "TRAILING_STOP", enumType.toFIXNameString() );
        assertEquals( "TS - Trailing Stop", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString() );

        enumType = MyEnumOrderHandlingInst.WORK;
        assertEquals( "WRK", enumType.toFIXIDString() );
        assertEquals( "WORK", enumType.toFIXNameString() );
        assertEquals( "WRK - Work", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString() );
    }
}