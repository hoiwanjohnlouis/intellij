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
import com.hwtsllc.fixengine2022.datatypes.FIX43Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyPercentageType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  516
 *  OrderPercent
 *  Percentage
 *  <p>
 *  For CIV specifies the approximate order quantity desired.
 *  <p>
 *  For a CIV Sale it specifies percentage of investor’s total holding to be sold.
 *  <p>
 *  For a CIV switch/exchange it specifies percentage of investor’s cash realised from sales to be re-invested.
 *  <p>
 *  The executing broker, intermediary or fund manager is responsible for converting and calculating OrderQty (38) in shares/units for subsequent messages.
 */
public class Tag516PctOrderPercent extends FIX43Abstract implements LogValuePairString, LogVerboseString {
    private final MyPercentageType dataValue;

    public final static double TESTA_PCT_ORDER_PERCENT = 0.0516D;
    public final static double TESTB_PCT_ORDER_PERCENT = 0.0615D;

    public Tag516PctOrderPercent(MyPercentageType dataValue) {
        setFixType(FIX43.FIX516_PCT_ORDER_PERCENT);
        this.dataValue = dataValue;
    }

    public double getDataValue() {
        return this.dataValue.getDataValue();
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
        return String.valueOf(getDataValue());
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag516PctOrderPercent tagData;

        tagData = new Tag516PctOrderPercent(new MyPercentageType(TESTA_PCT_ORDER_PERCENT) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag516PctOrderPercent(new MyPercentageType(TESTB_PCT_ORDER_PERCENT) );
        System.out.println(tagData.toVerboseString());
    }
}
