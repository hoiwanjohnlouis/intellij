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
import com.hwtsllc.fixengine2022.datatypes.MyPriceOffsetType;
import com.hwtsllc.fixengine2022.fix42.tags.Tag639PxoPriceImprovement;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  639
 *  PriceImprovement
 *  PriceOffset
 *  <p>
 *  Amount of price improvement.
 */
class Tag639PxoPriceImprovementTest {
    @Test
    void FIX0639Test() {
        FIX43 fixData = FIX43.FIX639_PXO_PRICE_IMPROVEMENT;
        assertEquals( "639", fixData.toFIXIDString());
        assertEquals( "PRICE_IMPROVEMENT", fixData.toFIXNameString());
        assertEquals( "PriceImprovement", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0639Test() {
        Tag639PxoPriceImprovement tagData;

    }
    @Test
    void PrintFIXTagTest() {
        Tag639PxoPriceImprovement tagData;
        double oneElement;

        oneElement = Tag639PxoPriceImprovement.TESTA_PXO_SPREAD;
        tagData = new Tag639PxoPriceImprovement( new MyPriceOffsetType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag639PxoPriceImprovement.TESTB_PXO_SPREAD;
        tagData = new Tag639PxoPriceImprovement( new MyPriceOffsetType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag639PxoPriceImprovement tagData;
        double oneElement;

        oneElement = Tag639PxoPriceImprovement.TESTB_PXO_SPREAD;
        tagData = new Tag639PxoPriceImprovement( new MyPriceOffsetType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag639PxoPriceImprovement tagData;
        double oneElement;

        oneElement = Tag639PxoPriceImprovement.TESTB_PXO_SPREAD;
        tagData = new Tag639PxoPriceImprovement( new MyPriceOffsetType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag639PxoPriceImprovement tagData;
        double oneElement;

        oneElement = Tag639PxoPriceImprovement.TESTB_PXO_SPREAD;
        tagData = new Tag639PxoPriceImprovement( new MyPriceOffsetType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag639PxoPriceImprovement tagData;
        double oneElement;

        oneElement = Tag639PxoPriceImprovement.TESTA_PXO_SPREAD;
        tagData = new Tag639PxoPriceImprovement( new MyPriceOffsetType( oneElement ) );
        assertEquals( "Tag639PxoPriceImprovement\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}