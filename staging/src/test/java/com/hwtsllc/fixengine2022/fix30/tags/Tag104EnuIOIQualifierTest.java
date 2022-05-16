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

package com.hwtsllc.fixengine2022.fix30.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX30;
import com.hwtsllc.fixengine2022.datatypes.MyEnumQualifier;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  104 (same as 104, 695)
 *  IOIQualifier
 *  char
 *  <p>
 *  Code to qualify IOI use.
 *  <p>
 *  (see Volume : "Glossary" for value definitions)
 *  <p></p>
 *  695  (same as 104, 695)
 *  QuoteQualifier
 *  char
 *  <p>
 *  Code to qualify Quote use
 *  <p>
 *  See IOIQualifier (104) for description and valid values.
 *  <p></p>
 *  Valid values:
 *  <p>    A - All or None (AON)
 *  <p>    B - Market On Close (MOC) (held to close)
 *  <p>    C - At the close (around/not held to close)
 *  <p>    D - VWAP (Volume Weighted Average Price)
 *  <p>    I - In touch with
 *  <p></p>
 *  <p>    L - Limit
 *  <p>    M - More Behind
 *  <p>    O - At the Open
 *  <p>    P - Taking a Position
 *  <p>    Q - At the Market (previously called Current Quote)
 *  <p></p>
 *  <p>    R - Ready to Trade
 *  <p>    S - Portfolio Shown
 *  <p>    T - Through the Day
 *  <p>    V - Versus
 *  <p>    W - Indication -  Working Away
 *  <p></p>
 *  <p>    X - Crossing Opportunity
 *  <p>    Y - At the Midpoint
 *  <p>    Z - Pre-open
 */
class Tag104EnuIOIQualifierTest {

    @Test
    void FIX0104Test() {
        FIX30 fixData = FIX30.FIX104_ENU_IOI_QUALIFIER;
        assertEquals("IOI_QUALIFIER", fixData.toFIXNameString());
        assertEquals("104", fixData.toFIXIDString());
        assertEquals("IOIQualifier", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0104Test() {
        Tag104EnuIOIQualifier tagData;

        /*
         * A-Z IOI Qualifier types
         */
        tagData = new Tag104EnuIOIQualifier(MyEnumQualifier.ALL_OR_NONE);
        assertEquals( MyEnumQualifier.ALL_OR_NONE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(MyEnumQualifier.MARKET_ON_CLOSE);
        assertEquals( MyEnumQualifier.MARKET_ON_CLOSE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(MyEnumQualifier.AT_THE_CLOSE);
        assertEquals( MyEnumQualifier.AT_THE_CLOSE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(MyEnumQualifier.VWAP);
        assertEquals( MyEnumQualifier.VWAP.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(MyEnumQualifier.IN_TOUCH_WITH);
        assertEquals( MyEnumQualifier.IN_TOUCH_WITH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag104EnuIOIQualifier(MyEnumQualifier.LIMIT);
        assertEquals( MyEnumQualifier.LIMIT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(MyEnumQualifier.MORE_BEHIND);
        assertEquals( MyEnumQualifier.MORE_BEHIND.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(MyEnumQualifier.AT_THE_OPEN);
        assertEquals( MyEnumQualifier.AT_THE_OPEN.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(MyEnumQualifier.TAKING_A_POSITION);
        assertEquals( MyEnumQualifier.TAKING_A_POSITION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(MyEnumQualifier.AT_THE_MARKET);
        assertEquals( MyEnumQualifier.AT_THE_MARKET.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag104EnuIOIQualifier(MyEnumQualifier.READY_TO_TRADE);
        assertEquals( MyEnumQualifier.READY_TO_TRADE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(MyEnumQualifier.PORTFOLIO_SHOWN);
        assertEquals( MyEnumQualifier.PORTFOLIO_SHOWN.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(MyEnumQualifier.THROUGH_THE_DAY);
        assertEquals( MyEnumQualifier.THROUGH_THE_DAY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(MyEnumQualifier.VERSUS);
        assertEquals( MyEnumQualifier.VERSUS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(MyEnumQualifier.INDICATION_WORKING_AWAY);
        assertEquals( MyEnumQualifier.INDICATION_WORKING_AWAY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag104EnuIOIQualifier(MyEnumQualifier.CROSSING_OPPORTUNITY);
        assertEquals( MyEnumQualifier.CROSSING_OPPORTUNITY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(MyEnumQualifier.AT_THE_MIDPOINT);
        assertEquals( MyEnumQualifier.AT_THE_MIDPOINT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag104EnuIOIQualifier(MyEnumQualifier.PRE_OPEN);
        assertEquals( MyEnumQualifier.PRE_OPEN.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}