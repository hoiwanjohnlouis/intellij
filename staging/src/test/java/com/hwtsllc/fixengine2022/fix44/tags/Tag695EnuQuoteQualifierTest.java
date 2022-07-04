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
class Tag695EnuQuoteQualifierTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX695_ENU_QUOTE_QUALIFIER;
        assertEquals( "695", fixData.toEnumIDString());
        assertEquals( "QUOTE_QUALIFIER", fixData.toEnumNameString());
        assertEquals( "QuoteQualifier", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0695Test() {
        Tag695EnuQuoteQualifier tagData;
        MyEnumQualifier oneElement;

        oneElement = MyEnumQualifier.ALL_OR_NONE;
        tagData = new Tag695EnuQuoteQualifier( oneElement );
        assertEquals( oneElement.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "695", tagData.toEnumIDString());
        assertEquals( "QUOTE_QUALIFIER", tagData.toEnumNameString());
        assertEquals( "QuoteQualifier", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag695EnuQuoteQualifier(MyEnumQualifier.MARKET_ON_CLOSE);
        assertEquals( MyEnumQualifier.MARKET_ON_CLOSE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag695EnuQuoteQualifier(MyEnumQualifier.AT_THE_CLOSE);
        assertEquals( MyEnumQualifier.AT_THE_CLOSE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag695EnuQuoteQualifier(MyEnumQualifier.VWAP);
        assertEquals( MyEnumQualifier.VWAP.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag695EnuQuoteQualifier(MyEnumQualifier.IN_TOUCH_WITH);
        assertEquals( MyEnumQualifier.IN_TOUCH_WITH.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag695EnuQuoteQualifier(MyEnumQualifier.LIMIT);
        assertEquals( MyEnumQualifier.LIMIT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag695EnuQuoteQualifier(MyEnumQualifier.MORE_BEHIND);
        assertEquals( MyEnumQualifier.MORE_BEHIND.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag695EnuQuoteQualifier(MyEnumQualifier.AT_THE_OPEN);
        assertEquals( MyEnumQualifier.AT_THE_OPEN.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag695EnuQuoteQualifier(MyEnumQualifier.TAKING_A_POSITION);
        assertEquals( MyEnumQualifier.TAKING_A_POSITION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag695EnuQuoteQualifier(MyEnumQualifier.AT_THE_MARKET);
        assertEquals( MyEnumQualifier.AT_THE_MARKET.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag695EnuQuoteQualifier(MyEnumQualifier.READY_TO_TRADE);
        assertEquals( MyEnumQualifier.READY_TO_TRADE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag695EnuQuoteQualifier(MyEnumQualifier.PORTFOLIO_SHOWN);
        assertEquals( MyEnumQualifier.PORTFOLIO_SHOWN.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag695EnuQuoteQualifier(MyEnumQualifier.THROUGH_THE_DAY);
        assertEquals( MyEnumQualifier.THROUGH_THE_DAY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag695EnuQuoteQualifier(MyEnumQualifier.VERSUS);
        assertEquals( MyEnumQualifier.VERSUS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag695EnuQuoteQualifier(MyEnumQualifier.INDICATION_WORKING_AWAY);
        assertEquals( MyEnumQualifier.INDICATION_WORKING_AWAY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag695EnuQuoteQualifier(MyEnumQualifier.CROSSING_OPPORTUNITY);
        assertEquals( MyEnumQualifier.CROSSING_OPPORTUNITY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag695EnuQuoteQualifier(MyEnumQualifier.AT_THE_MIDPOINT);
        assertEquals( MyEnumQualifier.AT_THE_MIDPOINT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag695EnuQuoteQualifier(MyEnumQualifier.PRE_OPEN);
        assertEquals( MyEnumQualifier.PRE_OPEN.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag695EnuQuoteQualifier tagData;

        // loop around the ENUM and process
        for ( MyEnumQualifier oneEnum : MyEnumQualifier.values()) {
            tagData = new Tag695EnuQuoteQualifier(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag695EnuQuoteQualifier tagData;

        // loop around the ENUM and process
        for (MyEnumQualifier oneEnum : MyEnumQualifier.values()) {
            tagData = new Tag695EnuQuoteQualifier(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag695EnuQuoteQualifier tagData;

        // loop around the ENUM and process
        for (MyEnumQualifier oneEnum : MyEnumQualifier.values()) {
            tagData = new Tag695EnuQuoteQualifier(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag695EnuQuoteQualifier tagData;

        // loop around the ENUM and process
        for (MyEnumQualifier oneEnum : MyEnumQualifier.values()) {
            tagData = new Tag695EnuQuoteQualifier(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag695EnuQuoteQualifier tagData;

        // loop around the ENUM and process
        for (MyEnumQualifier oneEnum : MyEnumQualifier.values()) {
            tagData = new Tag695EnuQuoteQualifier(oneEnum);
            assertEquals( "Tag695EnuQuoteQualifier\n" +
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