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

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.FIX42Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyQtyType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  271
 *  MDEntrySize
 *  Qty
 *  <p></p>
 *  Quantity or volume represented by the Market Data Entry.
 */
public class Tag271QtyMDEntrySize extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MyQtyType dataValue;

    public final static int TESTA_QTY_MD_ENTRY_SIZE
            = 271;
    public final static int TESTB_QTY_MD_ENTRY_SIZE
            = 71;

    public Tag271QtyMDEntrySize(MyQtyType dataValue) {
        setFixType(FIX42.FIX271_QTY_MD_ENTRY_SIZE);
        this.dataValue = dataValue;
    }

    public int getDataValue() {
        return this.dataValue.getDataValue();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toEnumIDString()
                .concat("=")
                .concat(dataValue.toString());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return super.toVerboseString()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]")
                .concat("\n\tValuePair[")
                .concat(toValuePairString())
                .concat("]")
                ;
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return String.valueOf(getDataValue());
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag271QtyMDEntrySize tagData;

        tagData = new Tag271QtyMDEntrySize(new MyQtyType(TESTA_QTY_MD_ENTRY_SIZE) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag271QtyMDEntrySize(new MyQtyType(TESTB_QTY_MD_ENTRY_SIZE) );
        System.out.println(tagData.toVerboseString());
    }
}
