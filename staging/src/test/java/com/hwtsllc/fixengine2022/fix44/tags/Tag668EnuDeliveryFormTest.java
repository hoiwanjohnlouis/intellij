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
import com.hwtsllc.fixengine2022.fix44.enums.Enum665ConfirmStatus;
import com.hwtsllc.fixengine2022.fix44.enums.Enum668DeliveryForm;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  668
 *  DeliveryForm
 *  int
 *  <p></p>
 *  Identifies the form of delivery.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Book Entry (default)
 *  <p>    2 - Bearer
 */
class Tag668EnuDeliveryFormTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX668_ENU_DELIVERY_FORM;
        assertEquals( "668", fixData.toFIXIDString());
        assertEquals( "DELIVERY_FORM", fixData.toFIXNameString());
        assertEquals( "DeliveryForm", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0668Test() {
        Tag668EnuDeliveryForm tagData;
        Enum665ConfirmStatus oneElement;

        tagData = new Tag668EnuDeliveryForm(Enum668DeliveryForm.BOOK_ENTRY);
        assertEquals( Enum668DeliveryForm.BOOK_ENTRY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "668", fixData.toFIXIDString());
        assertEquals( "DELIVERY_FORM", fixData.toFIXNameString());
        assertEquals( "DeliveryForm", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());

        tagData = new Tag668EnuDeliveryForm(Enum668DeliveryForm.BEARER);
        assertEquals( Enum668DeliveryForm.BEARER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag668EnuDeliveryForm tagData;

        // loop around the ENUM and process
        for ( Enum668DeliveryForm oneEnum : Enum668DeliveryForm.values()) {
            tagData = new Tag668EnuDeliveryForm(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag668EnuDeliveryForm tagData;

        // loop around the ENUM and process
        for (Enum668DeliveryForm oneEnum : Enum668DeliveryForm.values()) {
            tagData = new Tag668EnuDeliveryForm(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag668EnuDeliveryForm tagData;

        // loop around the ENUM and process
        for (Enum668DeliveryForm oneEnum : Enum668DeliveryForm.values()) {
            tagData = new Tag668EnuDeliveryForm(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag668EnuDeliveryForm tagData;

        // loop around the ENUM and process
        for (Enum668DeliveryForm oneEnum : Enum668DeliveryForm.values()) {
            tagData = new Tag668EnuDeliveryForm(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag668EnuDeliveryForm tagData;

        // loop around the ENUM and process
        for (Enum668DeliveryForm oneEnum : Enum668DeliveryForm.values()) {
            tagData = new Tag668EnuDeliveryForm(oneEnum);
            assertEquals( "Tag668EnuDeliveryForm\n" +
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}