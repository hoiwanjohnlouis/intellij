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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.MyPercentageType;
import com.hwtsllc.fixengine2022.fix42.tags.Tag516PctOrderPercent;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  516
 *  OrderPercent
 *  Percentage
 *  <p>
 *  For CIV specifies the approximate order quantity desired.
 *  <p>
 *  For a CIV Sale it specifies percentage of investor’s total holding to be sold.
 *  <p>
 *  For a CIV switch/exchange it specifies percentage of investor’s cash realised from sales to be re-invested.
 *  <p>
 *  The executing broker, intermediary or fund manager is responsible for converting and calculating OrderQty (38) in shares/units for subsequent messages.
 */
class Tag516PctOrderPercentTest {
    @Test
    void FIX0516Test() {
        FIX43 fixData = FIX43.FIX516_PCT_ORDER_PERCENT;
        assertEquals( "516", fixData.toFIXIDString());
        assertEquals( "ORDER_PERCENT", fixData.toFIXNameString());
        assertEquals( "OrderPercent", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0516Test() {
        Tag516PctOrderPercent tagData;

    }
    @Test
    void PrintFIXTagTest() {
        Tag516PctOrderPercent tagData;
        double oneElement;

        oneElement = Tag516PctOrderPercent.TESTA_PCT_COUPON_RATE;
        tagData = new Tag516PctOrderPercent( new MyPercentageType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag516PctOrderPercent.TESTB_PCT_COUPON_RATE;
        tagData = new Tag516PctOrderPercent( new MyPercentageType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag516PctOrderPercent tagData;
        double oneElement;

        oneElement = Tag516PctOrderPercent.TESTB_PCT_COUPON_RATE;
        tagData = new Tag516PctOrderPercent( new MyPercentageType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag516PctOrderPercent tagData;
        double oneElement;

        oneElement = Tag516PctOrderPercent.TESTB_PCT_COUPON_RATE;
        tagData = new Tag516PctOrderPercent( new MyPercentageType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToStringTest() {
        Tag516PctOrderPercent tagData;
        double oneElement;

        oneElement = Tag516PctOrderPercent.TESTB_PCT_COUPON_RATE;
        tagData = new Tag516PctOrderPercent( new MyPercentageType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag516PctOrderPercent tagData;
        double oneElement;

        oneElement = Tag516PctOrderPercent.TESTA_PCT_COUPON_RATE;
        tagData = new Tag516PctOrderPercent( new MyPercentageType( oneElement ) );
        assertEquals( "Tag516PctOrderPercent\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}