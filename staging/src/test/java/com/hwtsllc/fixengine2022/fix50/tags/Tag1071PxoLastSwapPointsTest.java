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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.MyPriceOffsetType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1071
 *  LastSwapPoints
 *  PriceOffset
 *  <p>
 *  For FX Swap, this is used to express the last market event for the differential
 *  between the far leg's bid/offer and the near leg's bid/offer in a fill or partial fill.
 *  <p></p>
 *  Value can be negative. Expressed in decimal form.
 *  <p></p>
 *  For example, 61.99 points is expressed and sent as 0.006199
 */
class Tag1071PxoLastSwapPointsTest {
    Tag1071PxoLastSwapPoints tagData;
    double [] TestArray = {
            Tag1071PxoLastSwapPoints.TESTA_PXO_LAST_SWAP_POINTS,
            Tag1071PxoLastSwapPoints.TESTB_PXO_LAST_SWAP_POINTS
    };

    @Test
    void PrintTest() {
        // process array of tags
        for ( double oneElement : TestArray ) {
            tagData = new Tag1071PxoLastSwapPoints( new MyPriceOffsetType( oneElement ));
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // process array of tags
        for ( double oneElement : TestArray ) {
            tagData = new Tag1071PxoLastSwapPoints( new MyPriceOffsetType( oneElement ));
            assertEquals( "FIX1071_PXO_LAST_SWAP_POINTS", tagData.toEnumLabelString());
            assertEquals( "1071", tagData.toEnumIDString());
            assertEquals( "LAST_SWAP_POINTS", tagData.toEnumNameString());
            assertEquals( "LastSwapPoints", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        // process array of tags
        for ( double oneElement : TestArray ) {
            tagData = new Tag1071PxoLastSwapPoints( new MyPriceOffsetType( oneElement ));
            assertEquals( oneElement, tagData.getDataValue() );
            assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // process array of tags
        for ( double oneElement : TestArray ) {
            tagData = new Tag1071PxoLastSwapPoints( new MyPriceOffsetType( oneElement ));
            assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
        }
    }
    @Test
    void TagToStringTest() {
        // process array of tags
        for ( double oneElement : TestArray ) {
            tagData = new Tag1071PxoLastSwapPoints( new MyPriceOffsetType( oneElement ));
            assertEquals( String.valueOf( oneElement ), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // process array of tags
        for ( double oneElement : TestArray ) {
            tagData = new Tag1071PxoLastSwapPoints( new MyPriceOffsetType( oneElement ));
            assertEquals( "Tag1071PxoLastSwapPoints\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + oneElement + "]\n" +
                            "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
        }
    }
}