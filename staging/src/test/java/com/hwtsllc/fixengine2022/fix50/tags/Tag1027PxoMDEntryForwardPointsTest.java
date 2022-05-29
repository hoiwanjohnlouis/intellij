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
 *  1027
 *  MDEntryForwardPoints
 *  PriceOffset
 *  <p>
 *  Used for an F/X entry.
 *  <p>
 *  The forward points to be added to or subtracted from the spot rate
 *  to get the "all-in" rate in MDEntryPx.  Expressed in decimal form.
 *  <p>
 *  For example, 61.99 points is expressed and sent as 0.006199
 */
class Tag1027PxoMDEntryForwardPointsTest {
    @Test
    void FIX1027Test() {
        FIX50 fixData = FIX50.FIX1027_PXO_MD_ENTRY_FORWARD_POINTS;
        assertEquals( "1027", fixData.toFIXIDString());
        assertEquals( "MD_ENTRY_FORWARD_POINTS", fixData.toFIXNameString());
        assertEquals( "MDEntryForwardPoints", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag1027Test() {
        Tag1027PxoMDEntryForwardPoints tagData;
        double oneElement;

        oneElement = Tag1027PxoMDEntryForwardPoints.TESTA_PXO_MD_ENTRY_FORWARD_POINTS;
        tagData = new Tag1027PxoMDEntryForwardPoints( new MyPriceOffsetType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag1027PxoMDEntryForwardPoints.TESTB_PXO_MD_ENTRY_FORWARD_POINTS;
        tagData = new Tag1027PxoMDEntryForwardPoints( new MyPriceOffsetType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag1027PxoMDEntryForwardPoints tagData;
        double oneElement;

        oneElement = Tag1027PxoMDEntryForwardPoints.TESTA_PXO_MD_ENTRY_FORWARD_POINTS;
        tagData = new Tag1027PxoMDEntryForwardPoints( new MyPriceOffsetType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag1027PxoMDEntryForwardPoints.TESTB_PXO_MD_ENTRY_FORWARD_POINTS;
        tagData = new Tag1027PxoMDEntryForwardPoints( new MyPriceOffsetType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag1027PxoMDEntryForwardPoints tagData;
        double oneElement;

        oneElement = Tag1027PxoMDEntryForwardPoints.TESTB_PXO_MD_ENTRY_FORWARD_POINTS;
        tagData = new Tag1027PxoMDEntryForwardPoints( new MyPriceOffsetType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1027PxoMDEntryForwardPoints tagData;
        double oneElement;

        oneElement = Tag1027PxoMDEntryForwardPoints.TESTB_PXO_MD_ENTRY_FORWARD_POINTS;
        tagData = new Tag1027PxoMDEntryForwardPoints( new MyPriceOffsetType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag1027PxoMDEntryForwardPoints tagData;
        double oneElement;

        oneElement = Tag1027PxoMDEntryForwardPoints.TESTB_PXO_MD_ENTRY_FORWARD_POINTS;
        tagData = new Tag1027PxoMDEntryForwardPoints( new MyPriceOffsetType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1027PxoMDEntryForwardPoints tagData;
        double oneElement;

        oneElement = Tag1027PxoMDEntryForwardPoints.TESTA_PXO_MD_ENTRY_FORWARD_POINTS;
        tagData = new Tag1027PxoMDEntryForwardPoints( new MyPriceOffsetType( oneElement ) );
        assertEquals( "Tag1027PxoMDEntryForwardPoints\n" +
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