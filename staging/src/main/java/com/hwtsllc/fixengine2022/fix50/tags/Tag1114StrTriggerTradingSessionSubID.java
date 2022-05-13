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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.FIX50Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  1114
 *  TriggerTradingSessionSubID
 *  String
 *  <p>
 *  Defines the subordinate trading session at which the order will be activated.
 */
public class Tag1114StrTriggerTradingSessionSubID extends FIX50Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_TRIGGER_TRADING_SESSION_SUB_ID
            = "BilboBaggins-Tag1114StrTriggerTradingSessionSubID";
    public final static String TESTB_STR_TRIGGER_TRADING_SESSION_SUB_ID
            = "Gandalf-Tag1114StrTriggerTradingSessionSubID";

    public Tag1114StrTriggerTradingSessionSubID(MyStringType dataValue) {
        setFixType(FIX50.FIX1114_STR_TRIGGER_TRADING_SESSION_SUB_ID);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getDataValue();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return getID()
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
        Tag1114StrTriggerTradingSessionSubID tagData;

        tagData = new Tag1114StrTriggerTradingSessionSubID(new MyStringType(TESTA_STR_TRIGGER_TRADING_SESSION_SUB_ID) );
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Tag1114StrTriggerTradingSessionSubID(new MyStringType(TESTB_STR_TRIGGER_TRADING_SESSION_SUB_ID) );
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
