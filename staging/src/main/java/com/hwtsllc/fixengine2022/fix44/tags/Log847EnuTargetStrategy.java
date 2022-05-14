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
import com.hwtsllc.fixengine2022.fix44.enums.Enum847TargetStrategy;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  847
 *  TargetStrategy
 *  int
 *  The target strategy of the order
 *  1000+  = Reserved and available for bi-laterally agreed upon user defined values
 *  Valid values:
 *      1 - VWAP
 *      2 - Participate (i.e. aim to be x percent of the market volume)
 *      3 - Minimize market impact
 *
 *  or any value conforming to the data type Reserved1000Plus
 */
public class Log847EnuTargetStrategy extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final Enum847TargetStrategy dataValue;

    public final static Enum847TargetStrategy TESTA_ENU_TARGET_STRATEGY
            = Enum847TargetStrategy.MINIMIZE_MARKET_IMPACT;
    public final static Enum847TargetStrategy TESTB_ENU_TARGET_STRATEGY
            = Enum847TargetStrategy.PARTICIPATE;

    public Log847EnuTargetStrategy(Enum847TargetStrategy dataValue) {
        setFixType(FIX44.FIX847_ENU_TARGET_STRATEGY);
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
        Log847EnuTargetStrategy tagData;

        tagData = new Log847EnuTargetStrategy(TESTA_ENU_TARGET_STRATEGY);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Log847EnuTargetStrategy(TESTB_ENU_TARGET_STRATEGY);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}