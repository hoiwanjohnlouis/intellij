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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  55
 *  Symbol
 *  String
 *  Ticker symbol.
 *  Common, "human understood" representation of the security.
 *  SecurityID (48) value can be specified if no symbol exists.
 *  (e.g. non-exchange traded Collective Investment Vehicles)
 *  Use "[N/A]" for products which do not have a symbol.
 */
class Tag55StrSymbolTest {
    @Test
    void FIX0055Test() {
        FIX27 fixData = FIX27.FIX55_STR_SYMBOL;
        assertEquals( "SYMBOL", fixData.toFIXNameString());
        assertEquals( "55", fixData.toFIXIDString());
        assertEquals( "Symbol", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0055Test() {
        Tag55StrSymbol tagData;

        tagData = new Tag55StrSymbol(new MyStringType("INTC") );
        assertEquals( "INTC", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}