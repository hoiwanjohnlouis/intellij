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
        assertEquals( "639", fixData.toEnumIDString());
        assertEquals( "PRICE_IMPROVEMENT", fixData.toEnumNameString());
        assertEquals( "PriceImprovement", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0639Test() {
        Tag639PxoPriceImprovement tagData;
        double oneElement;

        oneElement = Tag639PxoPriceImprovement.TESTA_PXO_PRICE_IMPROVEMENT;
        tagData = new Tag639PxoPriceImprovement( new MyPriceOffsetType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag639PxoPriceImprovement.TESTB_PXO_PRICE_IMPROVEMENT;
        tagData = new Tag639PxoPriceImprovement( new MyPriceOffsetType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag639PxoPriceImprovement tagData;
        double oneElement;

        oneElement = Tag639PxoPriceImprovement.TESTA_PXO_PRICE_IMPROVEMENT;
        tagData = new Tag639PxoPriceImprovement( new MyPriceOffsetType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag639PxoPriceImprovement.TESTB_PXO_PRICE_IMPROVEMENT;
        tagData = new Tag639PxoPriceImprovement( new MyPriceOffsetType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag639PxoPriceImprovement tagData;
        double oneElement;

        oneElement = Tag639PxoPriceImprovement.TESTB_PXO_PRICE_IMPROVEMENT;
        tagData = new Tag639PxoPriceImprovement( new MyPriceOffsetType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag639PxoPriceImprovement tagData;
        double oneElement;

        oneElement = Tag639PxoPriceImprovement.TESTB_PXO_PRICE_IMPROVEMENT;
        tagData = new Tag639PxoPriceImprovement( new MyPriceOffsetType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag639PxoPriceImprovement tagData;
        double oneElement;

        oneElement = Tag639PxoPriceImprovement.TESTB_PXO_PRICE_IMPROVEMENT;
        tagData = new Tag639PxoPriceImprovement( new MyPriceOffsetType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag639PxoPriceImprovement tagData;
        double oneElement;

        oneElement = Tag639PxoPriceImprovement.TESTA_PXO_PRICE_IMPROVEMENT;
        tagData = new Tag639PxoPriceImprovement( new MyPriceOffsetType( oneElement ) );
        assertEquals( "Tag639PxoPriceImprovement\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}