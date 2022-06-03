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
import com.hwtsllc.fixengine2022.fix43.enums.Enum544CashMargin;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  544
 *  CashMargin
 *  char
 *  <p></p>
 *  Identifies whether an order is a margin order or a non-margin order.
 *  <p></p>
 *  This is primarily used when sending orders to Japanese exchanges to
 *  indicate sell margin or buy to cover.
 *  <p></p>
 *  The same tag could be assigned also by buy-side to indicate the intent
 *  to sell or buy margin and the sell-side to accept or reject
 *  <p></p>
 *  (base on some validation criteria) the margin request.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Cash
 *  <p>    2 - Margin Open
 *  <p>    3 - Margin Close
 */
class Tag544EnuCashMarginTest {
    @Test
    void FIX0544Test() {
        FIX43 fixData = FIX43.FIX544_ENU_CASH_MARGIN;
        assertEquals( "544", fixData.toFIXIDString());
        assertEquals( "CASH_MARGIN", fixData.toFIXNameString());
        assertEquals( "CashMargin", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0544Test() {
        Tag544EnuCashMargin tagData;

        /*
         *  1-3 types
         */
        tagData = new Tag544EnuCashMargin( Enum544CashMargin.CASH );
        assertEquals( Enum544CashMargin.CASH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag544EnuCashMargin( Enum544CashMargin.MARGIN_OPEN );
        assertEquals( Enum544CashMargin.MARGIN_OPEN.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag544EnuCashMargin( Enum544CashMargin.MARGIN_CLOSE );
        assertEquals( Enum544CashMargin.MARGIN_CLOSE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}