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
import com.hwtsllc.fixengine2022.datatypes.MyEnumProduct;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  Information is the same for TAGS 460, 462, 607
 */
class Tag460EnuProductTest {
    @Test
    void FIX0460Test() {
        FIX43 fixData = FIX43.FIX460_ENU_PRODUCT;
        assertEquals( "460", fixData.getID());
        assertEquals( "PRODUCT", fixData.getName());
        assertEquals( "Product", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0460Test() {
        Tag460EnuProduct tagData;

        /**
         * 0-13 msg types
         */
        tagData = new Tag460EnuProduct(MyEnumProduct.AGENCY);
        assertEquals( MyEnumProduct.AGENCY.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag460EnuProduct(MyEnumProduct.COMMODITY);
        assertEquals( MyEnumProduct.COMMODITY.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag460EnuProduct(MyEnumProduct.CORPORATE);
        assertEquals( MyEnumProduct.CORPORATE.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag460EnuProduct(MyEnumProduct.CURRENCY);
        assertEquals( MyEnumProduct.CURRENCY.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag460EnuProduct(MyEnumProduct.EQUITY);
        assertEquals( MyEnumProduct.EQUITY.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag460EnuProduct(MyEnumProduct.GOVERNMENT);
        assertEquals( MyEnumProduct.GOVERNMENT.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag460EnuProduct(MyEnumProduct.INDEX);
        assertEquals( MyEnumProduct.INDEX.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag460EnuProduct(MyEnumProduct.LOAN);
        assertEquals( MyEnumProduct.LOAN.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag460EnuProduct(MyEnumProduct.MONEY_MARKET);
        assertEquals( MyEnumProduct.MONEY_MARKET.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag460EnuProduct(MyEnumProduct.MORTGAGE);
        assertEquals( MyEnumProduct.MORTGAGE.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag460EnuProduct(MyEnumProduct.MUNICIPAL);
        assertEquals( MyEnumProduct.MUNICIPAL.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag460EnuProduct(MyEnumProduct.OTHER);
        assertEquals( MyEnumProduct.OTHER.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag460EnuProduct(MyEnumProduct.FINANCING);
        assertEquals( MyEnumProduct.FINANCING.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
}