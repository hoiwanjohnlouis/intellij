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

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.MyPriceOffsetType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1048
 *  DealingCapacity
 *  PriceOffset
 *  <p>
 *  Identifies role of dealer; Agent, Principal, RisklessPrincipal
 */
class Tag1048PxoDealingCapacityTest {
    @Test
    void FIX1048Test() {
        FIX50 fixData = FIX50.FIX1048_PXO_DEALING_CAPACITY;
        assertEquals( "1048", fixData.toFIXIDString());
        assertEquals( "DEALING_CAPACITY", fixData.toFIXNameString());
        assertEquals( "DealingCapacity", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag1048Test() {
        Tag1048PxoDealingCapacity tagData;
        double oneElement;

        oneElement = Tag1048PxoDealingCapacity.TESTA_PXO_DEALING_CAPACITY;
        tagData = new Tag1048PxoDealingCapacity( new MyPriceOffsetType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag1048PxoDealingCapacity.TESTB_PXO_DEALING_CAPACITY;
        tagData = new Tag1048PxoDealingCapacity( new MyPriceOffsetType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag1048PxoDealingCapacity tagData;
        double oneElement;

        oneElement = Tag1048PxoDealingCapacity.TESTA_PXO_DEALING_CAPACITY;
        tagData = new Tag1048PxoDealingCapacity( new MyPriceOffsetType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag1048PxoDealingCapacity.TESTB_PXO_DEALING_CAPACITY;
        tagData = new Tag1048PxoDealingCapacity( new MyPriceOffsetType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag1048PxoDealingCapacity tagData;
        double oneElement;

        oneElement = Tag1048PxoDealingCapacity.TESTB_PXO_DEALING_CAPACITY;
        tagData = new Tag1048PxoDealingCapacity( new MyPriceOffsetType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1048PxoDealingCapacity tagData;
        double oneElement;

        oneElement = Tag1048PxoDealingCapacity.TESTB_PXO_DEALING_CAPACITY;
        tagData = new Tag1048PxoDealingCapacity( new MyPriceOffsetType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag1048PxoDealingCapacity tagData;
        double oneElement;

        oneElement = Tag1048PxoDealingCapacity.TESTB_PXO_DEALING_CAPACITY;
        tagData = new Tag1048PxoDealingCapacity( new MyPriceOffsetType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1048PxoDealingCapacity tagData;
        double oneElement;

        oneElement = Tag1048PxoDealingCapacity.TESTA_PXO_DEALING_CAPACITY;
        tagData = new Tag1048PxoDealingCapacity( new MyPriceOffsetType( oneElement ) );
        assertEquals( "Tag1048PxoDealingCapacity\n" +
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