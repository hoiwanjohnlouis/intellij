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

package com.hwtsllc.fixengine.tags.fix42.tags;

import com.hwtsllc.fixengine.datatypes.FIX42;
import com.hwtsllc.fixengine.datatypes.FIX42Abstract;
import com.hwtsllc.fixengine.datatypes.MyQtyType;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  319
 *  RatioQty
 *  Qty
 *  <p></p>
 *  Deprecated in FIX.4.2 Quantity of a particular leg in the security.
 */
// @Deprecated
public class Tag319QtyRatioQty extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MyQtyType dataValue;

    public final static int TESTA_QTY_RATIO_QTY
            = 319;
    public final static int TESTB_QTY_RATIO_QTY
            = 19;

    public Tag319QtyRatioQty(MyQtyType dataValue) {
        setFixType(FIX42.FIX319_QTY_RATIO_QTY);
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
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
        return dataValue.toString();
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag319QtyRatioQty tagData;

        tagData = new Tag319QtyRatioQty(new MyQtyType(TESTA_QTY_RATIO_QTY) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag319QtyRatioQty(new MyQtyType(TESTB_QTY_RATIO_QTY) );
        System.out.println(tagData.toVerboseString());
    }
}
