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

import com.hwtsllc.fixengine2022.datatypes.MyQtyType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  294
 *  DefOfferSize
 *  Qty
 *  <p></p>
 *  Default Offer Size.
 */
class Tag294QtyDefOfferSizeTest {
    @Test
    void PrintTest() {
        Tag294QtyDefOfferSize tagData;
        int oneElement;

        oneElement = Tag294QtyDefOfferSize.TESTA_QTY_DEF_OFFER_SIZE;
        tagData = new Tag294QtyDefOfferSize( new MyQtyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag294QtyDefOfferSize.TESTB_QTY_DEF_OFFER_SIZE;
        tagData = new Tag294QtyDefOfferSize( new MyQtyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTagTest() {
        Tag294QtyDefOfferSize tagData;
        int oneElement;

        oneElement = Tag294QtyDefOfferSize.TESTA_QTY_DEF_OFFER_SIZE;
        tagData = new Tag294QtyDefOfferSize( new MyQtyType( oneElement ) );
        verifyAll( tagData, oneElement );

        oneElement = Tag294QtyDefOfferSize.TESTB_QTY_DEF_OFFER_SIZE;
        tagData = new Tag294QtyDefOfferSize( new MyQtyType( oneElement ) );
        verifyAll( tagData, oneElement );
    }

    private void verifyAll( final Tag294QtyDefOfferSize tagData, final int oneElement ) {
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag294QtyDefOfferSize tagData ) {
        assertEquals( "FIX294_QTY_DEF_OFFER_SIZE", tagData.toEnumLabelString());
        assertEquals( "294", tagData.toEnumIDString());
        assertEquals( "DEF_OFFER_SIZE", tagData.toEnumNameString());
        assertEquals( "DefOfferSize", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag294QtyDefOfferSize tagData, final int oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }

    private void verifyValuePairString( final Tag294QtyDefOfferSize tagData, final int oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag294QtyDefOfferSize tagData, final int oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    private void verifyVerboseString( final Tag294QtyDefOfferSize tagData ) {
        assertEquals( "Tag294QtyDefOfferSize\n" +
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