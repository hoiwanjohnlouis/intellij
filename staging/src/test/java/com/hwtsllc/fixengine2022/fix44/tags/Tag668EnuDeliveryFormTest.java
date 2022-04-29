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
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag668EnuDeliveryFormTest {
    @Test
    void FIX0668Test() {
        FIX44 fixData = FIX44.FIX668_ENU_DELIVERY_FORM;
        assertEquals( "", fixData.getID());
        assertEquals( "", fixData.getName());
        assertEquals( "", fixData.getDescription());
        assertNotEquals( FIX44.JUNK_ID, fixData.getID());
        assertNotEquals( FIX44.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  668
     *  DeliveryForm
     *  Identifies the form of delivery.
     *  Valid values:
     *      1 - Book Entry (default)
     *      2 - Bearer
     */
    @Test
    void Tag0668Test() {
        Tag668EnuDeliveryForm tagData;

        tagData = new Tag668EnuDeliveryForm(Enum668DeliveryForm.BOOK_ENTRY);
        assertEquals( Enum668DeliveryForm.BOOK_ENTRY.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag668EnuDeliveryForm(Enum668DeliveryForm.BEARER);
        assertEquals( Enum668DeliveryForm.BEARER.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}