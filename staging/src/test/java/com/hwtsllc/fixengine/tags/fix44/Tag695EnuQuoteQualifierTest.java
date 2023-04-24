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

package com.hwtsllc.fixengine.tags.fix44;

import com.hwtsllc.fixengine.datatypes.MyEnumQualifier;
import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag695EnuQuoteQualifierTest {
    Tag695EnuQuoteQualifier tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( MyEnumQualifier oneEnum : MyEnumQualifier.values()) {
            tagData = new Tag695EnuQuoteQualifier(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( MyEnumQualifier oneEnum : MyEnumQualifier.values()) {
            tagData = new Tag695EnuQuoteQualifier(oneEnum);
            assertEquals( "FIX695_ENU_QUOTE_QUALIFIER", tagData.toFIXLabelString());
            assertEquals( "695", tagData.toFIXIDString());
            assertEquals( "QUOTE_QUALIFIER", tagData.toFIXNameString());
            assertEquals( "QuoteQualifier", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( MyEnumQualifier oneEnum : MyEnumQualifier.values()) {
            tagData = new Tag695EnuQuoteQualifier(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  695 (same as 104, 695)
         *  IOIQualifier
         *  char
         *  <p>    A - All or None (AON)
         *  <p>    B - Market On Close (MOC) (held to close)
         *  <p>    C - At the close (around/not held to close)
         *  <p>    D - VWAP (Volume Weighted Average Price)
         *  <p>    I - In touch with
         */
        tagData = new Tag695EnuQuoteQualifier(MyEnumQualifier.ALL_OR_NONE);
        assertEquals( "A", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag695EnuQuoteQualifier(MyEnumQualifier.MARKET_ON_CLOSE);
        assertEquals( "B", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag695EnuQuoteQualifier(MyEnumQualifier.AT_THE_CLOSE);
        assertEquals( "C", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag695EnuQuoteQualifier(MyEnumQualifier.VWAP);
        assertEquals( "D", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag695EnuQuoteQualifier(MyEnumQualifier.IN_TOUCH_WITH);
        assertEquals( "I", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    L - Limit
         *  <p>    M - More Behind
         *  <p>    O - At the Open
         *  <p>    P - Taking a Position
         *  <p>    Q - At the Market (previously called Current Quote)
         */
        tagData = new Tag695EnuQuoteQualifier(MyEnumQualifier.LIMIT);
        assertEquals( "L", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag695EnuQuoteQualifier(MyEnumQualifier.MORE_BEHIND);
        assertEquals( "M", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag695EnuQuoteQualifier(MyEnumQualifier.AT_THE_OPEN);
        assertEquals( "O", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag695EnuQuoteQualifier(MyEnumQualifier.TAKING_A_POSITION);
        assertEquals( "P", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag695EnuQuoteQualifier(MyEnumQualifier.AT_THE_MARKET);
        assertEquals( "Q", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    R - Ready to Trade
         *  <p>    S - Portfolio Shown
         *  <p>    T - Through the Day
         *  <p>    V - Versus
         *  <p>    W - Indication -  Working Away
         */
        tagData = new Tag695EnuQuoteQualifier(MyEnumQualifier.READY_TO_TRADE);
        assertEquals( "R", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag695EnuQuoteQualifier(MyEnumQualifier.PORTFOLIO_SHOWN);
        assertEquals( "S", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag695EnuQuoteQualifier(MyEnumQualifier.THROUGH_THE_DAY);
        assertEquals( "T", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag695EnuQuoteQualifier(MyEnumQualifier.VERSUS);
        assertEquals( "V", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag695EnuQuoteQualifier(MyEnumQualifier.INDICATION_WORKING_AWAY);
        assertEquals( "W", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    X - Crossing Opportunity
         *  <p>    Y - At the Midpoint
         *  <p>    Z - Pre-open
         */
        tagData = new Tag695EnuQuoteQualifier(MyEnumQualifier.CROSSING_OPPORTUNITY);
        assertEquals( "X", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag695EnuQuoteQualifier(MyEnumQualifier.AT_THE_MIDPOINT);
        assertEquals( "Y", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag695EnuQuoteQualifier(MyEnumQualifier.PRE_OPEN);
        assertEquals( "Z", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( MyEnumQualifier oneEnum : MyEnumQualifier.values()) {
            tagData = new Tag695EnuQuoteQualifier(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( MyEnumQualifier oneEnum : MyEnumQualifier.values()) {
            tagData = new Tag695EnuQuoteQualifier(oneEnum);
            assertEquals( "Tag695EnuQuoteQualifier\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}