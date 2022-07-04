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
class MyEnumOrderHandlingInstTest {
    @Test
    void EnumTest() {
        MyEnumOrderHandlingInst enumType;

        enumType = MyEnumOrderHandlingInst.ADD_ON_ORDER;
        assertEquals( "ADD", enumType.toEnumIDString() );
        assertEquals( "ADD_ON_ORDER", enumType.toEnumNameString() );
        assertEquals( "ADD - Add On Order", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString() );

        enumType = MyEnumOrderHandlingInst.ALL_OR_NONE;
        assertEquals( "AON", enumType.toEnumIDString() );
        assertEquals( "ALL_OR_NONE", enumType.toEnumNameString() );
        assertEquals( "AON - All Or None", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString() );

        enumType = MyEnumOrderHandlingInst.CASH_NOT_HELD;
        assertEquals( "CNH", enumType.toEnumIDString() );
        assertEquals( "CASH_NOT_HELD", enumType.toEnumNameString() );
        assertEquals( "CNH - Cash Not Held", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString() );

        enumType = MyEnumOrderHandlingInst.DIRECTED_ORDER;
        assertEquals( "DIR", enumType.toEnumIDString() );
        assertEquals( "DIRECTED_ORDER", enumType.toEnumNameString() );
        assertEquals( "DIR - Directed Order", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString() );

        enumType = MyEnumOrderHandlingInst.EXCHANGE_FOR_PHYSICAL;
        assertEquals( "E.W", enumType.toEnumIDString() );
        assertEquals( "EXCHANGE_FOR_PHYSICAL", enumType.toEnumNameString() );
        assertEquals( "E.W - Exchange for Physical Transaction", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString() );


        enumType = MyEnumOrderHandlingInst.FILL_OR_KILL;
        assertEquals( "FOK", enumType.toEnumIDString() );
        assertEquals( "FILL_OR_KILL", enumType.toEnumNameString() );
        assertEquals( "FOK - Fill Or Kill", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString() );

        enumType = MyEnumOrderHandlingInst.IMBALANCE_ONLY;
        assertEquals( "IO", enumType.toEnumIDString() );
        assertEquals( "IMBALANCE_ONLY", enumType.toEnumNameString() );
        assertEquals( "IO - Imbalance Only", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString() );

        enumType = MyEnumOrderHandlingInst.IMMEDIATE_OR_CANCEL;
        assertEquals( "IOC", enumType.toEnumIDString() );
        assertEquals( "IMMEDIATE_OR_CANCEL", enumType.toEnumNameString() );
        assertEquals( "IOC - Immediate Or Cancel", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString() );

        enumType = MyEnumOrderHandlingInst.LIMIT_ON_OPEN;
        assertEquals( "LOO", enumType.toEnumIDString() );
        assertEquals( "LIMIT_ON_OPEN", enumType.toEnumNameString() );
        assertEquals( "LOO - Limit On Open", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString() );

        enumType = MyEnumOrderHandlingInst.LIMIT_ON_CLOSE;
        assertEquals( "LOC", enumType.toEnumIDString() );
        assertEquals( "LIMIT_ON_CLOSE", enumType.toEnumNameString() );
        assertEquals( "LOC - Limit On Close", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString() );


        enumType = MyEnumOrderHandlingInst.MARKET_AT_OPEN;
        assertEquals( "MAO", enumType.toEnumIDString() );
        assertEquals( "MARKET_AT_OPEN", enumType.toEnumNameString() );
        assertEquals( "MAO - Market At Open", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString() );

        enumType = MyEnumOrderHandlingInst.MARKET_AT_CLOSE;
        assertEquals( "MAC", enumType.toEnumIDString() );
        assertEquals( "MARKET_AT_CLOSE", enumType.toEnumNameString() );
        assertEquals( "MAC - Market At Close", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString() );

        enumType = MyEnumOrderHandlingInst.MARKET_ON_OPEN;
        assertEquals( "MOO", enumType.toEnumIDString() );
        assertEquals( "MARKET_ON_OPEN", enumType.toEnumNameString() );
        assertEquals( "MOO - Market On Open", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString() );

        enumType = MyEnumOrderHandlingInst.MARKET_ON_CLOSE;
        assertEquals( "MOC", enumType.toEnumIDString() );
        assertEquals( "MARKET_ON_CLOSE", enumType.toEnumNameString() );
        assertEquals( "MOC - Market On Close", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString() );

        enumType = MyEnumOrderHandlingInst.MINIMUM_QUANTITY;
        assertEquals( "MQT", enumType.toEnumIDString() );
        assertEquals( "MINIMUM_QUANTITY", enumType.toEnumNameString() );
        assertEquals( "MQT - Minimum Quantity", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString() );


        enumType = MyEnumOrderHandlingInst.NOT_HELD;
        assertEquals( "NH", enumType.toEnumIDString() );
        assertEquals( "NOT_HELD", enumType.toEnumNameString() );
        assertEquals( "NH - Not Held", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString() );

        enumType = MyEnumOrderHandlingInst.OVER_THE_DAY;
        assertEquals( "OVD", enumType.toEnumIDString() );
        assertEquals( "OVER_THE_DAY", enumType.toEnumNameString() );
        assertEquals( "OVD - Over the Day", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString() );

        enumType = MyEnumOrderHandlingInst.PEGGED;
        assertEquals( "PEG", enumType.toEnumIDString() );
        assertEquals( "PEGGED", enumType.toEnumNameString() );
        assertEquals( "PEG - Pegged", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString() );

        enumType = MyEnumOrderHandlingInst.RESERVE_SIZE_ORDER;
        assertEquals( "RSV", enumType.toEnumIDString() );
        assertEquals( "RESERVE_SIZE_ORDER", enumType.toEnumNameString() );
        assertEquals( "RSV - Reserve Size Order", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString() );

        enumType = MyEnumOrderHandlingInst.STOP_STOCK_TRANSACTION;
        assertEquals( "S.W", enumType.toEnumIDString() );
        assertEquals( "STOP_STOCK_TRANSACTION", enumType.toEnumNameString() );
        assertEquals( "S.W - Stop Stock Transaction", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString() );


        enumType = MyEnumOrderHandlingInst.SCALE;
        assertEquals( "SCL", enumType.toEnumIDString() );
        assertEquals( "SCALE", enumType.toEnumNameString() );
        assertEquals( "SCL - Scale", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString() );

        enumType = MyEnumOrderHandlingInst.TIME_ORDER;
        assertEquals( "TMO", enumType.toEnumIDString() );
        assertEquals( "TIME_ORDER", enumType.toEnumNameString() );
        assertEquals( "TMO - Time Order", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString() );

        enumType = MyEnumOrderHandlingInst.TRAILING_STOP;
        assertEquals( "TS", enumType.toEnumIDString() );
        assertEquals( "TRAILING_STOP", enumType.toEnumNameString() );
        assertEquals( "TS - Trailing Stop", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString() );

        enumType = MyEnumOrderHandlingInst.WORK;
        assertEquals( "WRK", enumType.toEnumIDString() );
        assertEquals( "WORK", enumType.toEnumNameString() );
        assertEquals( "WRK - Work", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString() );
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString() );
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString() );
    }
}