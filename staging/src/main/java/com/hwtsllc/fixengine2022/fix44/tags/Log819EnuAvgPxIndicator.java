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
import com.hwtsllc.fixengine2022.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine2022.fix44.enums.Enum819AvgPxIndicator;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  819
 *  AvgPxIndicator
 *  int
 *  Average Pricing Indicator
 *  Valid values:
 *      0 - No Average Pricing
 *      1 - Trade is part of an average price group identified by the TradeLinkID (820)
 *      2 - Last trade is the average price group identified by the TradeLinkID (820)
 */
public class Log819EnuAvgPxIndicator extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final Enum819AvgPxIndicator dataValue;

    public final static Enum819AvgPxIndicator TESTA_ENU_AVG_PX_INDICATOR
            = Enum819AvgPxIndicator.LAST_TRADE;
    public final static Enum819AvgPxIndicator TESTB_ENU_AVG_PX_INDICATOR
            = Enum819AvgPxIndicator.PART_OF_APG;

    public Log819EnuAvgPxIndicator(Enum819AvgPxIndicator dataValue) {
        setFixType(FIX44.FIX819_ENU_AVG_PX_INDICATOR);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return getID()
                .concat("=")
                .concat(getDataValue());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return super.toVerboseString()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]");
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
        Log819EnuAvgPxIndicator tagData;

        tagData = new Log819EnuAvgPxIndicator(TESTA_ENU_AVG_PX_INDICATOR);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Log819EnuAvgPxIndicator(TESTB_ENU_AVG_PX_INDICATOR);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}