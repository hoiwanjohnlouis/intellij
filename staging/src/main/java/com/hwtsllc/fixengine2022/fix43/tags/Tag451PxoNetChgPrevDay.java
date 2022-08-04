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
import com.hwtsllc.fixengine2022.datatypes.MyPriceOffsetType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  451
 *  NetChgPrevDay
 *  PriceOffset
 *  <p></p>
 *  Net change from previous day’s closing price vs. last traded price.
 */
public class Tag451PxoNetChgPrevDay extends FIX43Abstract implements LogValuePairString, LogVerboseString {
    private final MyPriceOffsetType dataValue;

    public final static double TESTA_PXO_NET_CHG_PREV_DAY
            = 0.451D;
    public final static double TESTB_PXO_NET_CHG_PREV_DAY
            = 0.154D;

    public Tag451PxoNetChgPrevDay(MyPriceOffsetType dataValue) {
        setFixType(FIX43.FIX451_PXO_NET_CHG_PREV_DAY);
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
        Tag451PxoNetChgPrevDay tagData;

        tagData = new Tag451PxoNetChgPrevDay(new MyPriceOffsetType(TESTA_PXO_NET_CHG_PREV_DAY) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag451PxoNetChgPrevDay(new MyPriceOffsetType(TESTB_PXO_NET_CHG_PREV_DAY) );
        System.out.println(tagData.toVerboseString());
    }
}
