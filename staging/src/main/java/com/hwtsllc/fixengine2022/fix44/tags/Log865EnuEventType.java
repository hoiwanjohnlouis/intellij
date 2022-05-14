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
import com.hwtsllc.fixengine2022.fix44.enums.Enum865EventType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  865
 *  EventType
 *  int
 *  Code to represent the type of event
 *  Valid values:
 *      1 - Put
 *      2 - Call
 *      3 - Tender
 *      4 - Sinking Fund Call
 *      5 - Activation
 *
 *      6 - Inactivation
 *      99 - Other
 *
 *      or any value conforming to the data type Reserved100Plus
 */
public class Log865EnuEventType extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final Enum865EventType dataValue;

    public final static Enum865EventType TESTA_ENU_EVENT_TYPE
            = Enum865EventType.ACTIVATION;
    public final static Enum865EventType TESTB_ENU_EVENT_TYPE
            = Enum865EventType.SINKING_FUND_CALL;

    public Log865EnuEventType(Enum865EventType dataValue) {
        setFixType(FIX44.FIX865_ENU_EVENT_TYPE);
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
        Log865EnuEventType tagData;

        tagData = new Log865EnuEventType(TESTA_ENU_EVENT_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Log865EnuEventType(TESTB_ENU_EVENT_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}