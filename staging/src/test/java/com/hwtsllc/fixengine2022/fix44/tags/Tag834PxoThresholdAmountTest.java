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
import com.hwtsllc.fixengine2022.datatypes.MyPriceOffsetType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  834
 *  ThresholdAmount
 *  PriceOffset
 *  <p></p>
 *  Amount that a position has to be in the money before it is exercised.
 */
class Tag834PxoThresholdAmountTest {
    @Test
    void FIX0834Test() {
        FIX44 fixData = FIX44.FIX834_PXO_THRESHOLD_AMOUNT;
        assertEquals( "834", fixData.toFIXIDString());
        assertEquals( "THRESHOLD_AMOUNT", fixData.toFIXNameString());
        assertEquals( "ThresholdAmount", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0834Test() {
        Tag834PxoThresholdAmount tagData;
        double oneElement;

        oneElement = Tag834PxoThresholdAmount.TESTA_PXO_THRESHOLD_AMOUNT;
        tagData = new Tag834PxoThresholdAmount( new MyPriceOffsetType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag834PxoThresholdAmount.TESTB_PXO_THRESHOLD_AMOUNT;
        tagData = new Tag834PxoThresholdAmount( new MyPriceOffsetType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag834PxoThresholdAmount tagData;
        double oneElement;

        oneElement = Tag834PxoThresholdAmount.TESTA_PXO_THRESHOLD_AMOUNT;
        tagData = new Tag834PxoThresholdAmount( new MyPriceOffsetType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag834PxoThresholdAmount.TESTB_PXO_THRESHOLD_AMOUNT;
        tagData = new Tag834PxoThresholdAmount( new MyPriceOffsetType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag834PxoThresholdAmount tagData;
        double oneElement;

        oneElement = Tag834PxoThresholdAmount.TESTB_PXO_THRESHOLD_AMOUNT;
        tagData = new Tag834PxoThresholdAmount( new MyPriceOffsetType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag834PxoThresholdAmount tagData;
        double oneElement;

        oneElement = Tag834PxoThresholdAmount.TESTB_PXO_THRESHOLD_AMOUNT;
        tagData = new Tag834PxoThresholdAmount( new MyPriceOffsetType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag834PxoThresholdAmount tagData;
        double oneElement;

        oneElement = Tag834PxoThresholdAmount.TESTB_PXO_THRESHOLD_AMOUNT;
        tagData = new Tag834PxoThresholdAmount( new MyPriceOffsetType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag834PxoThresholdAmount tagData;
        double oneElement;

        oneElement = Tag834PxoThresholdAmount.TESTA_PXO_THRESHOLD_AMOUNT;
        tagData = new Tag834PxoThresholdAmount( new MyPriceOffsetType( oneElement ) );
        assertEquals( "Tag834PxoThresholdAmount\n" +
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