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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  615
 *  LegCouponRate
 *  Percentage
 *  <p>
 *  Multileg instrument's individual  security’s CouponRate.
 *  <p>
 *  See CouponRate (223) field for description
 */
class Tag615PctLegCouponRateTest {
    @Test
    void FIX0615Test() {
        FIX43 fixData = FIX43.FIX615_PCT_LEG_COUPON_RATE;
        assertEquals( "615", fixData.toFIXIDString());
        assertEquals( "LEG_COUPON_RATE", fixData.toFIXNameString());
        assertEquals( "LegCouponRate", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0615Test() {
        Tag615PctLegCouponRate tagData;
        double oneElement;

        oneElement = Tag615PctLegCouponRate.TESTA_PCT_LEG_COUPON_RATE;
        tagData = new Tag615PctLegCouponRate( new MyPercentageType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag615PctLegCouponRate.TESTB_PCT_LEG_COUPON_RATE;
        tagData = new Tag615PctLegCouponRate( new MyPercentageType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag615PctLegCouponRate tagData;
        double oneElement;

        oneElement = Tag615PctLegCouponRate.TESTA_PCT_LEG_COUPON_RATE;
        tagData = new Tag615PctLegCouponRate( new MyPercentageType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag615PctLegCouponRate.TESTB_PCT_LEG_COUPON_RATE;
        tagData = new Tag615PctLegCouponRate( new MyPercentageType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag615PctLegCouponRate tagData;
        double oneElement;

        oneElement = Tag615PctLegCouponRate.TESTB_PCT_LEG_COUPON_RATE;
        tagData = new Tag615PctLegCouponRate( new MyPercentageType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag615PctLegCouponRate tagData;
        double oneElement;

        oneElement = Tag615PctLegCouponRate.TESTB_PCT_LEG_COUPON_RATE;
        tagData = new Tag615PctLegCouponRate( new MyPercentageType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToStringTest() {
        Tag615PctLegCouponRate tagData;
        double oneElement;

        oneElement = Tag615PctLegCouponRate.TESTB_PCT_LEG_COUPON_RATE;
        tagData = new Tag615PctLegCouponRate( new MyPercentageType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag615PctLegCouponRate tagData;
        double oneElement;

        oneElement = Tag615PctLegCouponRate.TESTA_PCT_LEG_COUPON_RATE;
        tagData = new Tag615PctLegCouponRate( new MyPercentageType( oneElement ) );
        assertEquals( "Tag615PctLegCouponRate\n" +
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