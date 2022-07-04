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
 *  641
 *  LastForwardPoints2
 *  PriceOffset
 *  <p>
 *  Deprecated in FIX.5.0 F/X forward points of the future part of a F/X swap order added to LastSpotRate (94).   *  <p>
 *  May be a negative value.
 */
class Tag641PxoLastForwardPoints2Test {
    @Test
    void FIX0641Test() {
        FIX43 fixData = FIX43.FIX641_PXO_LAST_FORWARD_POINTS_2;
        assertEquals( "641", fixData.toEnumIDString());
        assertEquals( "LAST_FORWARD_POINTS_2", fixData.toEnumNameString());
        assertEquals( "LastForwardPoints2", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0641Test() {
        Tag641PxoLastForwardPoints2 tagData;
        double oneElement;

        oneElement = Tag641PxoLastForwardPoints2.TESTA_PXO_LAST_FORWARD_POINTS_2;
        tagData = new Tag641PxoLastForwardPoints2( new MyPriceOffsetType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag641PxoLastForwardPoints2.TESTB_PXO_LAST_FORWARD_POINTS_2;
        tagData = new Tag641PxoLastForwardPoints2( new MyPriceOffsetType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag641PxoLastForwardPoints2 tagData;
        double oneElement;

        oneElement = Tag641PxoLastForwardPoints2.TESTA_PXO_LAST_FORWARD_POINTS_2;
        tagData = new Tag641PxoLastForwardPoints2( new MyPriceOffsetType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag641PxoLastForwardPoints2.TESTB_PXO_LAST_FORWARD_POINTS_2;
        tagData = new Tag641PxoLastForwardPoints2( new MyPriceOffsetType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag641PxoLastForwardPoints2 tagData;
        double oneElement;

        oneElement = Tag641PxoLastForwardPoints2.TESTB_PXO_LAST_FORWARD_POINTS_2;
        tagData = new Tag641PxoLastForwardPoints2( new MyPriceOffsetType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag641PxoLastForwardPoints2 tagData;
        double oneElement;

        oneElement = Tag641PxoLastForwardPoints2.TESTB_PXO_LAST_FORWARD_POINTS_2;
        tagData = new Tag641PxoLastForwardPoints2( new MyPriceOffsetType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag641PxoLastForwardPoints2 tagData;
        double oneElement;

        oneElement = Tag641PxoLastForwardPoints2.TESTB_PXO_LAST_FORWARD_POINTS_2;
        tagData = new Tag641PxoLastForwardPoints2( new MyPriceOffsetType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag641PxoLastForwardPoints2 tagData;
        double oneElement;

        oneElement = Tag641PxoLastForwardPoints2.TESTA_PXO_LAST_FORWARD_POINTS_2;
        tagData = new Tag641PxoLastForwardPoints2( new MyPriceOffsetType( oneElement ) );
        assertEquals( "Tag641PxoLastForwardPoints2\n" +
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