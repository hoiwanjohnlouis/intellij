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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  234
 *  StipulationValue
 *  String
 *  <p></p>
 *  For Fixed Income.  Value of stipulation.
 *  <p>
 *  The expression can be an absolute single value or a combination of values and logical operators:
 *  <p></p>
 *  <p>     < value
 *  <p>     > value
 *  <p>     <= value
 *  <p>     >= value
 *  <p>     value
 *  <p>     value – value2
 *  <p>     value OR value2
 *  <p>     value AND value2
 *  <p>     YES
 *  <p>     NO
 *  <p></p>
 *  <p>     Bargain conditions recognized by the London Stock Exchange –
 *          to be used when StipulationType is "BGNCON".
 *  <p>     CD = Special cum Dividend
 *  <p>     XD = Special ex Dividend
 *  <p>     CC = Special cum Coupon
 *  <p>     XC = Special ex Coupon
 *  <p>     CB = Special cum Bonus
 *  <p>     XB = Special ex Bonus
 *  <p>     CR = Special cum Rights
 *  <p>     XR = Special ex Rights
 *  <p>     CP = Special cum Capital Repayments
 *  <p>     XP = Special ex Capital Repayments
 *  <p>     CS = Cash Settlement
 *  <p>     SP = Special Price
 *  <p>     TR = Report for European Equity Market Securities in accordance with Chapter 8 of the Rules.
 *  <p>     GD = Guaranteed Delivery
 *  <p></p>
 *  <p>     Values for StipulationType = "PXSOURCE":
 *  <p>     BB GENERIC
 *  <p>     BB FAIRVALUE
 *  <p>     BROKERTEC
 *  <p>     ESPEED
 *  <p>     GOVPX
 *  <p>     HILLIARD FARBER
 *  <p>     ICAP
 *  <p>     TRADEWEB
 *  <p>     TULLETT LIBERTY
 *          If a particular side of the market is wanted append /BID /OFFER or /MID.
 *  <p>     plus appropriate combinations of the above and other expressions
 *          by mutual agreement of the counterparties.
 *  <p></p>
 *  <p></p>
 *  <p>     Examples: ">=60", ".25", "ORANGE OR CONTRACOSTA", etc.
 *  <p></p>
 *  <p>     (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 */
class Tag234StrStipulationValueTest {
    @Test
    void PrintTest() {
        Tag234StrStipulationValue tagData;
        String oneElement;

        oneElement = Tag234StrStipulationValue.TESTA_STR_STIPULATION_VALUE;
        tagData = new Tag234StrStipulationValue( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag234StrStipulationValue.TESTB_STR_STIPULATION_VALUE;
        tagData = new Tag234StrStipulationValue( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTagTest() {
        Tag234StrStipulationValue tagData;
        String oneElement;

        oneElement = Tag234StrStipulationValue.TESTA_STR_STIPULATION_VALUE;
        tagData = new Tag234StrStipulationValue( new MyStringType( oneElement ) );
        verifyAll( tagData, oneElement );

        oneElement = Tag234StrStipulationValue.TESTB_STR_STIPULATION_VALUE;
        tagData = new Tag234StrStipulationValue( new MyStringType( oneElement ) );
        verifyAll( tagData, oneElement );
    }

    private void verifyAll( final Tag234StrStipulationValue tagData, final String oneElement ) {
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag234StrStipulationValue tagData ) {
        assertEquals( "FIX234_STR_STIPULATION_VALUE", tagData.toEnumLabelString());
        assertEquals( "234", tagData.toEnumIDString());
        assertEquals( "STIPULATION_VALUE", tagData.toEnumNameString());
        assertEquals( "StipulationValue", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag234StrStipulationValue tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }

    private void verifyValuePairString( final Tag234StrStipulationValue tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag234StrStipulationValue tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    private void verifyVerboseString( final Tag234StrStipulationValue tagData ) {
        assertEquals( "Tag234StrStipulationValue\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + tagData.getDataValue() + "]\n" +
                        "\tValuePair[" + tagData.toValuePairString() + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}