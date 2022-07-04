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
        assertEquals( "668", fixData.toEnumIDString());
        assertEquals( "DELIVERY_FORM", fixData.toEnumNameString());
        assertEquals( "DeliveryForm", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0668Test() {
        Tag668EnuDeliveryForm tagData;
        Enum668DeliveryForm oneElement;

        oneElement = Enum668DeliveryForm.BOOK_ENTRY;
        tagData = new Tag668EnuDeliveryForm( oneElement );
        assertEquals( oneElement.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "668", tagData.toEnumIDString());
        assertEquals( "DELIVERY_FORM", tagData.toEnumNameString());
        assertEquals( "DeliveryForm", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag668EnuDeliveryForm(Enum668DeliveryForm.BEARER);
        assertEquals( Enum668DeliveryForm.BEARER.toEnumIDString(), tagData.getDataValue());
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
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
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
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toEnumIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}